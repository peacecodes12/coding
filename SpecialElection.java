import java.util.Arrays;

public class SpecialElection {
    public static void main(String[] args) {
        int[] influence = {1,2,2,3,1};
        int[] votes = new int[influence.length];
        int[] prefixSum = new int[influence.length];
        prefixSum[0] = influence[0];
        for(int i = 1; i < influence.length; i++){
            prefixSum[i] = prefixSum[i-1] + influence[i];
        }
        for(int i=0; i < influence.length; i++){
            int rightLimit = BSRight(influence[i], prefixSum,i,influence.length-1,i);
            votes[rightLimit]++;
            votes[i]--;
            int leftLimit = BSLeft(influence[i], prefixSum,i,0,i);
            votes[leftLimit]++;
            votes[i]--;
        }
        System.out.println(Arrays.toString(votes));
    }

    public static int BSRight(int influence, int[] prefixSum,int low,int high,int i){
        int mid;
        while (low <= high){
            mid = low +(high - low)/2;
            if((prefixSum[mid] - prefixSum[i+1] < influence))
            {
                if(prefixSum[mid] - prefixSum[i] > influence)
                    return mid;
                else low = mid+1;
            }
            high = mid -1;
        }
        return 0;
    }
    public static int BSLeft(int influence, int[] prefixSum,int low,int high,int i){
        int mid;
        while (low <= high){
            mid = low +(high - low)/2;
            if(i==0 || prefixSum[i-1] - prefixSum[mid] < influence)
            {
                if(i == 0 || prefixSum[i-1] - prefixSum[mid-1] > influence)
                    return mid;
                else high = mid-1;
            }
            low = mid +1 ;
        }
        return 0;
    }
}
