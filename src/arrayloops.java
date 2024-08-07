public class arrayloops {
    public static void main(String[] args) {
        int [] number={11,22,33,44,55};
        System.out.println("Printing using for loop");
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
        System.out.println("Printing using for loop in reverse order");
        for(int j=number.length-1;j>=0;j--){
            System.out.println(number[j]);
        }
        for (int element :number){
            System.out.println(element);
        }
    }
}
