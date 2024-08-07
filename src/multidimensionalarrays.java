public class multidimensionalarrays {
    public static void main(String[] args) {
//        int [] marks;
//        int [][] number;
//        number=new int[2][3];
//        number[0][0]=11;
//        number[0][1]=12;
//        number[0][2]=13;
//        number[1][0]=14;
//        number[1][1]=15;
//        number[1][2]=16;
//        for(int i=0;i<number.length;i++){
//            for(int j=0;j<number[i].length;j++){
//                System.out.print(number[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("\n");
//        }
//        float [] sui={2.3f,3.4f,6.5f,7.2f,4.5f};
//        float num=2.f;
//        boolean isPresent=false;
//        for(float element:sui){
//            if(num==element){
//                isPresent=true;
//            }
//        }
//        if(isPresent){
//            System.out.println("the element is present in the array");
//        }
//        else{
//            System.out.println("The element is not present in the array");
//        }
//        int [][] mat1={{1,2,3},{4,5,6}};
//        int [][] mat2={{2,6,13},{3,7,1}};
//        int [][] mat3={{0,0,0},{0,0,0}};
//        for(int i=0;i<mat1.length;i++){
//            for(int j=0;j<mat1[i].length;j++){
//                System.out.format("Setting values for i=%d and j=%d\n",i,j);
//                mat3[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//        int [] arr={1,2,3,4,5,6};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        int temp;
//        for(int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for(int element:arr){
//            System.out.println(element);
//        }
//        int [] arr={1,56,23,578,23};
//        int max=0;
//        for(int element:arr){
//            if(element>max){
//                max=element;
//            }
//        }
//        System.out.printf("The value of the maximum element is: %d",max);
        int [] arr={1,2,3,4,5,67};
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}
