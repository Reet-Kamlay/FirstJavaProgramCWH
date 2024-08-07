class parent{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class child extends parent{
    int roll;

    public child(int roll) {
        this.roll = roll;
    }

    public int getRoll(){
        return roll;
    }
}
public class inheritance {
    public static void main(String[] args) {
        child suii=new child(34);
        suii.setId(23);
        suii.setName("Reet");
        System.out.println(suii.getId());
        System.out.println(suii.getName());
        System.out.println(suii.getRoll());
    }
}
