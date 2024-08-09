class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Runnable 1 is running");
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Runnable 2 is running");
        }
    }
}
public class runnable {
    public static void main(String[] args) {
        MyRunnable1 run1=new MyRunnable1();
        Thread th1=new Thread(run1);
        MyRunnable2 run2=new MyRunnable2();
        Thread th2=new Thread(run2);
        th1.start();
        th2.start();
    }
}
