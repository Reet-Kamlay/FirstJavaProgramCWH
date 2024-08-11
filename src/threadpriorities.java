class my_thread extends Thread{
    public my_thread(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=45;
        while(true){
            System.out.println("I am "+this.getName());
        }
    }
}
public class threadpriorities {
    public static void main(String[] args) {
        my_thread th1=new my_thread("Harry");
        my_thread th2=new my_thread("Reet");
        my_thread th3=new my_thread("Sourik");
        my_thread th4=new my_thread("Sujay");
        my_thread th5=new my_thread("Sagnik");
        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th3.setPriority(Thread.MIN_PRIORITY);
        th4.setPriority(Thread.MIN_PRIORITY);
        th5.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
