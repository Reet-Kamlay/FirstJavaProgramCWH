public class varargs {
    static int add(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.printf("The addition of 2 and 3 is: %d",add(2,3));
        System.out.printf("The addition of 3, 5 and 7 is: %d",add(3,5,7));
        System.out.printf("The addition of 2,3,4 and 7 is: %d",add(2,3,4,7));
    }
}
