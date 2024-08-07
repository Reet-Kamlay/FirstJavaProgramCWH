class employ{
    private int id;
    private String name;
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
public class getterandsetter {
    public static void main(String[] args) {
        employ reet=new employ();
        reet.setId(23);
        reet.setName("Reet");
        System.out.println(reet.getId());
        System.out.println(reet.getName());

    }
}
