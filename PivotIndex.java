public class PivotIndex {
    public static void main(String[] args){
        int[] arr={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int n= nums.length;
        int[] prefixSum = new int [n];
        int[] suffixSum = new int[n];
        prefixSum[0] = nums[0];
        int i;
        for(i = 1; i< n; i++){
            prefixSum[i]= prefixSum[i-1] + nums[i];
        }
        suffixSum[n-1] = nums[n-1];
        for(i = n-2; i >= 0 ; i--){
            suffixSum[i]= suffixSum[i+1] + nums[i];
        }

        for(i=0;i<n;i++){
            if((prefixSum[i]-nums[i]) == (suffixSum[i]-nums[i]))
                return i;
        }
        return -1;
    }
}
