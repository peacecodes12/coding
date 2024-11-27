import java.util.Arrays;

// smallest subarray with sum >=k
public class SmallestSubArray {
    public static void main(String[] args){
        int[] arr = {1,4,4};
        int k =4,min = Integer.MAX_VALUE;
        int[] PrefixSum = new int[arr.length];
        PrefixSum[0] = arr[0];
        // prefix sum array
        for(int i= 1 ; i < arr.length;i++){
            PrefixSum[i] = PrefixSum[i-1] + arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            int j = BS(PrefixSum,k-arr[i],i); // searching for the element
            min = Math.min(min, j-i+1);
        }
        System.out.println(min);
    }
    public static int BS(int[] arr, int target, int i){
        int high = arr.length -1, low = i;
        int mid;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] - arr[i] >= target){
                if(mid == 0 || arr[mid-1] - arr[i] < target)
                    return mid;
                else high = mid-1;
            }
            else low = mid +1;
        }
        return Integer.MAX_VALUE-1;
    }
}
