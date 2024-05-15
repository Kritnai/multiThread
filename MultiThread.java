// method for thread lifecycle

// currentThread return the currently executing thread.

// join ::: allows one thread to wait for the completion of another.

// interupt ::: method is used to interrupt a thread that is in a sleeping or waiting state
//              เป็นการขัด thread ที่ทำลังอยู่ใน waiting state

// isAlive ::: method checks if a thread is still running


/*
 Summary of Methods:
    start(): Begins the execution of a thread.
    sleep(milliseconds): Pauses the execution for a specified time.
    join(): Waits for the thread to die.
    interrupt(): Interrupts a thread in sleep or waiting state.
    isAlive(): Checks if the thread is still running.
 */

public class MultiThread extends Thread {
    String name;
    long tick;

    public MultiThread(String name, long tick) {
        this.name = name;
        this.tick = tick;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("#" + this.threadId() + " name: " + name);
            try {
                sleep(tick);
            } catch (InterruptedException e) {
                System.out.println("sleep errord");
            }
        }
    }
}
