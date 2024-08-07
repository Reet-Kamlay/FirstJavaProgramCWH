class dummy{
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class constructor {
    public static void main(String[] args) {
        dummy dummy1=new dummy();
        dummy1.setName("Reet");
        dummy1.setId(23);
        System.out.println(dummy1.getName());
        System.out.println(dummy1.getId());
    }


}
