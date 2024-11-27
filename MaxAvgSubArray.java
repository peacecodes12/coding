public class MaxAvgSubArray {
    public static void main(String[] args){
        int[] nums = {1,12,-5,-6,50,3};
        int k= 4;
        double ans = findMaxAverage(nums, k);
        System.out.println(ans);
    }
    public static  double findMaxAverage(int[] nums, int k) {
        double avg , max , sum=0;
        int i;
        for(i=0;i<k;i++){
            sum += nums[i];
        }
        avg = (sum*1.0)/k;
        max = avg;
        for(i=k ; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i-k];
            avg = (sum*1.0)/k;
            max = Math.max(max,avg);
        }
        return max;
    }
}
