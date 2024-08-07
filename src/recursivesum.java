public class recursivesum {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }

    public static void main(String[] args) {
        int a=sum(5);
        System.out.println(a);
    }
}
