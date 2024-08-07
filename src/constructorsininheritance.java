class parent1{
    public parent1() {
        System.out.println("Hello This is a parent1 constructor");
    }
}
class child1 extends parent1{
    public child1() {
        System.out.println("Hello This is a child1 constructor");
    }
}
public class constructorsininheritance {
    public static void main(String[] args) {
        parent1 par=new parent1();
        child1 par2=new child1();

    }
}
