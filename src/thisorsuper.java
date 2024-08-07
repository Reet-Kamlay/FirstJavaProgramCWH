class Ekclass{
    int a;
    public int getA(){
        return a;
    }

    public Ekclass(int a) {
        this.a = a;
    }
}
class secclass extends Ekclass{
    public secclass(int x,int y) {
        super(x);
        System.out.printf("This is %d and %d\n",x,y);
    }
}
public class thisorsuper {
    public static void main(String[] args) {
        Ekclass e=new Ekclass(65);
        System.out.println(e.getA());
        secclass f=new secclass(2,3);
    }
}
