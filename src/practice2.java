public class practice2 {
    public static void main(String[] args) {
        String name="Reet kamlay";
        name=name.toLowerCase();
        System.out.println(name);
        String name1="to my     friend";
        name1=name1.replace("    ","-");
        System.out.println(name1);
        String name2="My name is <|name|> ";
        name2=name2.replace("<|name|>","Reet");
        System.out.println(name2);
        String mystring="My name is       Reet Kamlay";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
    }
}
