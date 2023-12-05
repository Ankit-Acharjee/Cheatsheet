import java.util.Arrays;

public class chocolateDs {
    static int minDs(int[] arr, int m){
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int end=arr.length-m+1;
        for(int i=0;i<end;i++){
            if(min>arr[i+m-1]-arr[i])
            min=arr[i+m-1]-arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = { 10, 3, 43, 12, 43, 4231, 4 };
        
        System.out.println(minDs(arr,3)); 
    }
}
