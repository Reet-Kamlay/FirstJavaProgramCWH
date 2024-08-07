class base_class{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Reet Kamlay");
    }
}
class derived_class extends base_class{
    public void swagat(){
        System.out.println("Aapka swagat he");
    }
    public void name(){
        System.out.println("My name is Suii");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        base_class s=new derived_class();
        s.greet();
        s.name();
//        s.swagat();
    }
}
