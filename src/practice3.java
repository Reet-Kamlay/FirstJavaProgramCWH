import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
//        Scanner marks=new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        float a=marks.nextFloat();
//        System.out.println("Enter your marks in mathematics");
//        float b=marks.nextFloat();
//        System.out.println("Enter your marks in chemistry");
//        float c=marks.nextFloat();
//        float avg=(a+b+c)/3;
//        if(avg>40 && a>33 && b>33 && c>33){
//            System.out.println("You have been promoted");
//        }
//        else{
//            System.out.println("You have not been promoted");
//        }
//        System.out.println("Please enter your income:");
//        Scanner sc=new Scanner(System.in);
//        float tax=0;
//        float income=sc.nextFloat();
//        if(income<=2.5){
//            tax=tax+0;
//        }
//        else if(income>2.5f && income<=5f){
//            tax=tax+0.05f*(income-2.5f);
//        }
//        else if(income>5f && income<=10.0f){
//            tax=tax+0.05f*(5.0f-2.5f);
//            tax=tax+0.05f*(10.0f-5f);
//            tax=tax+0.3f*(income-10.0f);
//        }
//        System.out.println("The total paid by the employee is: "+tax);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int day=sc.nextInt();
//        switch(day){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thrusday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the website");
        String website=sc.next();
        if(website.endsWith(".org")){
            System.out.println("Then it is a organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("Then it is a commercial website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("Then it is a indian website");
        }
    }
}
