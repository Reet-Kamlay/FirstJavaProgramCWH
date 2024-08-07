import java.util.Random;
import java.util.Scanner;

class guess{
    public int number;
    public int inputnumber;
    public int noofguess;
    public int getNoofguess() {
        return noofguess;
    }

    public void setNoofguess(int noofguess) {
        this.noofguess = noofguess;
    }
    guess(){
        Random rand=new Random();
        this.number=rand.nextInt(50);
    }


    public void setinputnumber() {
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    public void iscorrectnum(){
            if(inputnumber==number){
                System.out.println("The number you guessed is correct");

            }
            else if(inputnumber<number){
                System.out.println("Too low...");
            }
            else if(inputnumber>number){
                System.out.println("Too high...");
            }
            else{
                System.out.println("The number you guessed is incorrect");
            }

    }

}
public class guessgame {
    public static void main(String[] args) {
        guess g=new guess();
        g.setinputnumber();
        g.iscorrectnum();
    }
}
