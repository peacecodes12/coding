import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbsDifference {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        int N = arr.length;
        List<Integer> list = new ArrayList<>();
        int[] Result = new int[arr.length];
        int i=0,sum=0;
        for (; i< arr.length; i++){
            sum+=arr[i];
            list.add(sum);
        }
        for(i = 0; i < arr.length; i++){
            Result[i] = (i * arr[i]) - (list.get(i) - arr[i]) + (list.get(N-1) - list.get(i)) - (N -1 -i) * arr[i] ;
            System.out.println(Result[i]);
        }

    }
}
