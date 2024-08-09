public class assign7 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java assign7 <place1> <place2>");
            System.exit(1);
        }

        try {
            String place1=args[0];
            String place2=args[1];

            System.out.println(place1+" , "+place2);



        } catch (NumberFormatException e) {
            System.out.println("No value");
            System.exit(1);
        }
    }
}