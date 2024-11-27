import java.util.HashMap;

//https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/?envType=daily-question&envId=2024-11-19
public class DistinctMaxSum {
    public static void main(String[] args) {
        int[] arr = {1,1,2,4,5,9,9};

        System.out.println(maximumSubarraySum(arr,3));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        long sum = 0;
        long max = 0;
        int i,j;
        for ( i = 0 ; i < k; i++){
            hash.put(nums[i], hash.getOrDefault(nums[i],0)+1);
            sum += nums[i];
        }
        if(hash.size() == k)
        {
            if(max < sum) max = sum;
        }
        for (j = 1; j <= nums.length-k; j++){
            sum -= nums[j-1];
            int count = hash.get(nums[j-1]);
            if(count > 1){
                hash.put(nums[j-1],count-1);
            }
            else{
                hash.remove(nums[j-1]);
            }
            hash.put(nums[j+k-1], hash.getOrDefault(nums[j+k-1],0)+1);
            sum += nums[j+k-1];
            if(hash.size() == k){
                if(sum > max)
                    max = sum;
            }

        }
        return max;
    }
}
