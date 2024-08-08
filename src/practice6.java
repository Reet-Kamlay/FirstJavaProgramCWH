abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpain extends pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("refill");
    }
    void changenib(){
        System.out.println("changenib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping.....");
    }
    void bite(){
        System.out.println("Biting......");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}
class human extends Monkey implements basicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class smartphone extends Telephone{

    @Override
    void ring() {
        System.out.println("Ringing");
    }

    @Override
    void lift() {
        System.out.println("Lifting");
    }

    @Override
    void disconnect() {
        System.out.println("disconnecting");
    }
}
public class practice6 {
    public static void main(String[] args) {
        Telephone p=new smartphone();
        p.ring();
    }
}
