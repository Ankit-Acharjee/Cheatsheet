import java.util.Arrays;

public class arrReverse {
    static void reverse(int [] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;          
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {10,3,43,12,43,4231,5};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
