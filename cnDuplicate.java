public class cnDuplicate {
    static boolean findDuplicate(int[] arr){
        boolean d=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                d=true;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        int [] arr = {10,3,43,12,43,4231,4};
        System.out.println(findDuplicate(arr));

    }
}
