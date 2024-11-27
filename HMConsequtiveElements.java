import java.util.HashMap;

public class HMConsequtiveElements {
    public static void main(String[] args){
        int[] arr = {1,2,2,4};
        HashMap<Integer,Integer> hash = new HashMap<>();
        int i = 0,max = arr[0], min = arr[0];
        for (i = 0; i < arr.length; i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
            hash.put(arr[i],i);
        }
        for ( i = min; i <= max; i++)
        {
            if(!hash.containsKey(i)){
                System.out.println(false);
                break;
            }
        }
    }
}
