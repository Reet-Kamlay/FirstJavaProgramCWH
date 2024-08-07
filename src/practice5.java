import static java.lang.Math.*;

class circle{
    public int radius;
    circle(int r){
        System.out.println("This is constructor of circle class");
        this.radius=r;
    }


    public double area(){
        return PI*this.radius*this.radius;
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        super(r);
        System.out.println("This is constructor of cylinder class");
        this.height=h;
    }

    public double volume(){
        return PI*this.radius*this.radius*this.height;
    }
}
public class practice5 {
    public static void main(String[] args) {
        cylinder obj=new cylinder(3,4);
    }
}
