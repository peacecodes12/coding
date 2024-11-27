import java.util.HashMap;
// longest subaray with sum = 0
// can be changed to longest subaray with sum = k
public class HMLongestSubarray {
    public static void main(String[] args){
//        int[] arr = {2,1,4,-3,-2,3,-1,-2,6};
        int[] arr = {1,2,2,-5};
        HashMap<Integer,Integer> hash = new HashMap<>();
        int max = 0,prefixSum = 0;
        hash.put(prefixSum,-1);
        for(int i = 0; i < arr.length; i++){
            prefixSum += arr[i];
            if(hash.containsKey(prefixSum)){
                int j = hash.get(prefixSum);
                int cur = Math.abs(i - j );
                max = Math.max(max, cur);
            }
            else
                hash.put(prefixSum,i);
        }
        System.out.println(max);
    }
}
