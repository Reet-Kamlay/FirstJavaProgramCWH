public class fibonacciseries {
    static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int result=fibonacci(5);
        System.out.println(result);
    }
}
