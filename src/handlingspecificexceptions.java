import java.util.Scanner;

public class handlingspecificexceptions {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=23;
        marks[1]=2;
        marks[2]=45;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of the number");
        int ind=sc.nextInt();
        System.out.println("Enter the index you want to divide with.");
        int number=sc.nextInt();
        try {
            System.out.println("The number of the index is "+marks[ind]);
            System.out.println("The array-value/number "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
        }
        catch (Exception e){
            System.out.println("Some other exception occured");
        }
    }
}
