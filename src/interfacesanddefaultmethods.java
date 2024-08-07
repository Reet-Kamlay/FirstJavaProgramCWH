interface mywifi{
    String[] getnetworks();
    void connecttonetwork(String network);
}
interface mycamera{
    void takesnap();
    void recordvideo();
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

}
public class interfacesanddefaultmethods {
    public static void main(String[] args) {
        mysmartphone sm=new mysmartphone();
        String[] ar=sm.getnetworks();
        for(String item:ar){
            System.out.println(item);
        }
    }
}
