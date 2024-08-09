import java.util.Scanner;

public class assign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        Scanner sc2=new Scanner(System.in);
        int num2=sc2.nextInt();
        if(num1%10 == num2%10){
            System.out.println("The last digit is same");
        }
        else{
            System.out.println("The last digit is not same");
        }
    }
}
