import java.util.Arrays;

public class arrRotate {
    static void rotate(int [] arr, int r){
        int n= arr.length;
        int temp;
        for(int i=0;i<r;i++){
             temp=arr[0];

            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;

        }
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
