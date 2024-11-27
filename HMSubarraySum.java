import java.util.HashMap;

public class HMSubarraySum {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int prefixSum=0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        for (int i = 0; i < arr.length; i++){
            prefixSum+=arr[i];
            if(hash.containsKey(prefixSum)) {
                System.out.println(true);
                break;
            }
            else hash.put(prefixSum,1);
        }
        System.out.println(sumCount(arr,3));
    }
    public static int sumCount(int[] arr,int k){
        int count = 0;
        int sum = 0;
        int value;
        HashMap<Integer,Integer> hash = new HashMap<>();
        hash.put(0,1);
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            value = 1;
            if(hash.containsKey(sum - k)){
                count += hash.get(sum - k);
                }


            hash.put(sum, hash.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
