class suii{
    private int id;
    private String name;
    public suii(String myname){
        id=45;
        name=myname;
    }
    public int getId(){
        return id;
    }
    public String getname(){
        return name;
    }
}
public class mymainemployee {
    public static void main(String[] args) {
        suii reet=new suii("Reet");
        System.out.println(reet.getId());
        System.out.println(reet.getname());
    }
}
