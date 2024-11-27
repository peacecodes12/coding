import java.util.HashMap;

public class HMConsequtiveElements2 {
    public static void main(String[] args){
        int[] arr = {5,11,3,2,6,5,4,1};
        HashMap<Integer,Integer> hash = new HashMap<>();
        int i,ans=0;
        for (i = 0; i < arr.length; i++){
            if(!hash.containsKey(arr[i])) {
                int leftStreak = 0, rightStreak = 0;
                if (hash.containsKey(arr[i] - 1)) {
                    leftStreak = hash.get(arr[i] - 1);
                }
                if (hash.containsKey(arr[i] + 1)) {
                    rightStreak = hash.get(arr[i] + 1);
                }
                int val = leftStreak + rightStreak + 1;
                hash.put(arr[i] - leftStreak, val);
                hash.put(arr[i] + rightStreak, val);
                hash.put(arr[i], val);
                ans = Math.max(ans, val);
            }
        }
        System.out.println(ans);
    }
}
