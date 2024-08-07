public class strings {
    public static void main(String[] args) {
        String name=new String("Reet Kamlay");
        System.out.println(name);
        int a=89;
        float b=45.66f;
        System.out.printf("The value of a is %d and the value of b is %f. ",a,b);
        String nam="Harry";
        System.out.println(nam);
        int length=nam.length();
        System.out.println(length);
        String naming="REET KAMLAY";
        String naming1=naming.toLowerCase();
        System.out.println(naming1);
        String nontrimstring="     Reet     ";
        System.out.println(nontrimstring);
        System.out.println(nontrimstring.trim());
        String myname="ReetKamlay";
        System.out.println(name.substring(5));
        System.out.println(name.substring(5,8));
        System.out.println(name.replace('R','p'));
        System.out.println(name.replace("lay","luy"));
        System.out.println(name.startsWith("y"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("eet"));
        System.out.println(name.lastIndexOf('e'));
        System.out.println(name.equals("Reet Kamlay"));
        System.out.println(name.equals("reet Kamlay"));
        System.out.println(name.equalsIgnoreCase("reet kamlay"));

    }
}
