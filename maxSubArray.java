public class maxSubArray {
    static int subArray(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];

            if(currSum>maxSum){
                maxSum=currSum;
            }

            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] arr = {-10,-3,-43,-12,-43,4231,-5};
       System.out.println(subArray(arr));

    }
}
