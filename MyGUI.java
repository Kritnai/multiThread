import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
 */

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;

public class MyGUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JLabel labelHI;
    private JTextField textField;

    public MyGUI() {
        frame = new JFrame();
        frame.setTitle("haloooo");
        frame.setSize(600, 400);

        // UI
        panel = new JPanel();
        button = new JButton("click me");
        label = new JLabel("Name: ");
        labelHI = new JLabel("");
        textField = new JTextField(15);

        Color c = new Color(52, 76, 100, 255);
        Color fc = new Color(255, 255, 255, 255);
        button.setForeground(fc);
        button.setBackground(c);

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(labelHI);
        frame.add(panel);


        // handler
        button.addActionListener(this);

        // Close program when user closes window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MyGUI();

        /*
        // get screen dimention 1
        GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = environment.getDefaultScreFenDevice();
        GraphicsConfiguration config = device.getDefaultConfiguration();
        System.out.println("Screen Size = " + config.getBounds());
        */

        // get screen dimention 2
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("dimention: " + screenSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String name = textField.getText();
            String textHi = "Hi! " + name;
            labelHI.setText(textHi);
            textField.setText("");
        }
    }
}
