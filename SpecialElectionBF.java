import java.util.Arrays;

public class SpecialElectionBF {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        int[] votes = new int[arr.length];
        int i,j,sum;
        for(i = 0; i < arr.length; i++){
            sum = 0;
            if(i != 0){
                for (j = i-1; j>= 0; j--){
                    if(sum <= arr[j])
                        votes[i]++;
                    sum+=arr[j];
                }
            }
            sum = 0;
            for(j = i+1; j < arr.length; j++){
                if(sum <= arr[j])
                    votes[i]++;
                sum+=arr[j];
            }
        }
        System.out.println(Arrays.toString(votes));
    }
}
