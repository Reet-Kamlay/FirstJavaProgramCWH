class my_thread1 extends Thread{
    public my_thread1(String name){
        super(name);
    }
    public void run(){
        int i=0;
//        while(true){
//            System.out.println("I am "+this.getName());
//            try {
//                Thread.sleep(455);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            i++;
//        }
    }
}
class my_thread2 extends Thread{
    public my_thread2(String name){
        super(name);
    }
    public void run(){

//        while(true){
//            System.out.println("I am "+this.getName());
//        }
    }
}
public class threadmethod {
    public static void main(String[] args) {
        my_thread1 th1=new my_thread1("Harry");
        my_thread2 th2=new my_thread2("Reet");
        th1.start();
//        try {
//            th1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//
//        }
        th2.start();
        System.out.println(Thread.currentThread().getState());
    }

}
