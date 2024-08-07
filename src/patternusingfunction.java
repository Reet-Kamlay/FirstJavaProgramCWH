public class patternusingfunction {
    static void pattern(int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int n=4;
        pattern(n);
    }
}
