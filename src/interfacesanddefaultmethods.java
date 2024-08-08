interface mywifi{
    String[] getnetworks();
    void connecttonetwork(String network);
}
interface mycamera{
    void takesnap();
    void recordvideo();
    default void record4Kvideo(){
        System.out.println("Record 4K video");
    };
}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("Calling "+phonenumber);
    }
    void pickCall(){
        System.out.println("connecting....");
    }
}
class mysmartphone extends mycellphone implements mywifi,mycamera{
    @Override
    public String[] getnetworks() {
        System.out.println("Getting list of networks");
        String[] networklist={"Harry","Prasanth","Anjali5G"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Recording video");
    }
    public void samplemeth(){
        System.out.println("meth");
    }
}
public class interfacesanddefaultmethods {
    public static void main(String[] args) {
        mysmartphone sm=new mysmartphone();
        String[] ar=sm.getnetworks();
        for(String item:ar){
            System.out.println(item);
        }
        mycamera cam1=new mysmartphone();
//        cam1.getnetworks();
        cam1.record4Kvideo();
//        cam1.samplemeth();
        sm.getnetworks();
        sm.recordvideo();
        sm.takesnap();
        sm.pickCall();
    }
}
