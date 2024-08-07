class base{
    public base() {
        System.out.println("This is constructor without any argument.");
    }
    public base(int value){
        System.out.printf("This is constructor with argument %d\n",value);
    }
    public base(int x,int y){
        System.out.printf("This is %d and %d in derived class\n",x,y);
    }
}
class derived extends base{

    public derived() {
        super(0);
        System.out.println("This is a constructor in base class");
    }
    public derived(int x,int y){
        super(x,y);
        System.out.printf("This is %d and %d\n",x,y);
    }
}
public class superkeyword {
    public static void main(String[] args) {
        derived base1=new derived(2,3);

    }
}
