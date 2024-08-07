public class practice4 {
    public static void main(String[] args) {
//        int n=4;
//        for(int i=n;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }
//        int n=5;
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d * %d = %d",n,i,n*i);
//        }
//          int n=5;
//          for(int i=10;i>=1;i--){
//              System.out.printf("%d * %d = %d",n,i,n*i);
//          }
//            int n=5;
//            int i=1;
//            int factorial =1;
//            while(i<=n){
//                factorial*=i;
//                i++;
//            }
//        System.out.println(factorial);
        int n=8;
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+(n*i);
        }
        System.out.printf("The sum of the first ten multiples of 8 is: %d",sum);
    }
}
