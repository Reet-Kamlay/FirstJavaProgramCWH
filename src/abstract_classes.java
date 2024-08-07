abstract class parent2{
    public void suii(){
        System.out.println("Suii");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}
abstract class child3 extends parent2{

}
public class abstract_classes {
    public static void main(String[] args) {
        parent2 p1=new parent1();
        child2 c1=new child2();
        child3 c2=new child3();
    }
}
