// import java.util.*;
public class rotatedSrh {
    static int search(int[] arr, int target) {
        int n = arr.length;

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = end - (end - start) / 2;
            if (arr[mid] == target)
                return mid;

            if (arr[mid] >= arr[start]) {
                if (target >= arr[start] && target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target >= arr[mid] && target < arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 1, 3 };
        System.out.println(search(arr, 1));
    }
}
