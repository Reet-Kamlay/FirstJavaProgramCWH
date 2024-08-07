class Employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println(id);
        System.out.println(name);
    }
    public int salary(){
        return salary;
    }
}
public class newclass {

    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Harry=new Employee();
        Employee John=new Employee();
        John.id=14;
        John.name="Sui2";
        John.printdetails();
        Harry.id=12;
        Harry.name="Sui";
        Harry.printdetails();
//        System.out.println(Harry.id);
//        System.out.println(Harry.name);
        Harry.salary=34;
        int salary=Harry.salary();
        System.out.println(salary);
    }
}
