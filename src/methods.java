public class methods {
    static void change(int a[]){
        a[0]=98;
    }
    int logic(int a,int b){
        int z;
        if(a>b){
            z=a+b;
        }
        else{
            z=(a+b)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=6;
        int b=4;
//        int z=logic(a,b);
        methods obj=new methods();
        int z=obj.logic(a,b);
        System.out.println(z);
        int [] arr={1,2,3,4,5};
        change(arr);
        System.out.println(arr[0]);
    }
}
