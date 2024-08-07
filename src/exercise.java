import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        float total=0;
        System.out.println("Enter the marks of the different subjects.");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks obtained in maths:");
        float a=input.nextFloat();
        System.out.println("Enter the marks obtained in physics:");
        float b=input.nextFloat();
        System.out.println("Enter the marks obtained in chemistry:");
        float c=input.nextFloat();
        System.out.println("Enter the marks obtained in computer science:");
        float d=input.nextFloat();
        System.out.println("Enter the marks obtained in biology:");
        float e=input.nextFloat();
        total=a+b+c+d+e;
        float percentage=(total/5);
        System.out.println("The percentage is: "+percentage+" %");
    }
}
