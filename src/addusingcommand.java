public class addusingcommand {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java SumArgs <num1> <num2>");
            System.exit(1);
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);


            int sum = num1 + num2;


            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Both arguments must be integers.");
            System.exit(1);
        }
    }
}

