class sui{
    int salary;
    String name;
    public void setSalary(int  n){
        salary=n;
    }
    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
public class practiceclass {
    public static void main(String[] args) {
        sui harry=new sui();
        harry.setName("Reet");
        harry.setSalary(243);
        System.out.println(harry.getName());
        System.out.println(harry.getsalary());
    }
}
