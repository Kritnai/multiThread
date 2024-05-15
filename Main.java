public class Main{
    public static void main(String[] args){
        MultiThread t1 = new MultiThread("jack", 500);
        MultiThread t2 = new MultiThread("koi", 20);
        MultiThread t3 = new MultiThread("a", 30);

        t1.start();
        t2.start();
    }
    
}
