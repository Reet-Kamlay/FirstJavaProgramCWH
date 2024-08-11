class th_class extends Thread{
    public th_class(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=45;
        System.out.println("Thank You");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class threadconstructor {
    public static void main(String[] args) {
        th_class th=new th_class("Reet");
        th.start();
        System.out.println("The id of the thread "+th.getId());
        System.out.println("The name of the thread "+th.getName());
    }
}
