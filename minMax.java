import java.util.*;
public class minMax {
    static void minmax(int[] arr){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<arr.length-1;i++){
            if(arr[i]< min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The minimum element is " + min);
        System.out.println("The maximum element is " + max);
    }

    public static void main(String[] args) {
        int [] arr = {10,3,43,12,43,4231,5};
        minmax(arr);
    }
}