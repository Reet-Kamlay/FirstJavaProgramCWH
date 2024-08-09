class Mythread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thread 1 is running");
            System.out.println("I am Happy");
        }
    }
}
class Mythread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thread 2 is running");
            System.out.println("I am sad");
        }
    }
}
public class thread {
    public static void main(String[] args) {
        Mythread1 th=new Mythread1();
        Mythread2 th2=new Mythread2();
        th.start();
        th2.start();
    }

}
