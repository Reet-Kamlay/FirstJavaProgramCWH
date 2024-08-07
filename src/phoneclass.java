class phone{
    public void vibrate(){
        System.out.println("Vibrating.....");
    }
    public void ring(){
        System.out.println("Ringing.......");
    }
    public void call(){
        System.out.println("Calling........");
    }
}
public class phoneclass {
    public static void main(String[] args) {
        phone apple=new phone();
        apple.call();
        apple.ring();
        apple.vibrate();
    }


}
