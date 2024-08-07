class baseclass{
    int a;
    public void func(int x){
        System.out.printf("A The value is %d\n",x);
    }
}
class derivedclass extends baseclass{
    @Override
    public void func(int y){
        System.out.printf("B The value is %d\n",y);
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        derivedclass a=new derivedclass();
        a.func(34);
        baseclass b=new baseclass();
        b.func(23);
    }
}
