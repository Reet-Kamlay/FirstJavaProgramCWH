interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface hornbicycle{
    void blowhornk3g();
    void blowhornmhn();
}
class avoncycle implements Bicycle,hornbicycle{
     void blowhorn(){
        System.out.println("sui sui");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUP");
    }
    public void blowhornk3g(){
        System.out.println("suii");
    };
    public void blowhornmhn(){
        System.out.println("suii siuuu");
    };
}
public class interfaces {
    public static void main(String[] args) {
        avoncycle cycle=new avoncycle();
        cycle.applyBrake(5);
        System.out.println(cycle.a);
//        cycle.a=34;

    }
}
