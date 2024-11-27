import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeEqualPart {
    public static void main(String[] args){
        int[] arr={0,0,0};
        System.out.println(canThreePartsEqualSum(arr));
    }
    public static boolean canThreePartsEqualSum(int[] arr) {
        int i=0,totalsum=0,partition=0,currentSum=0;
        for(;i<arr.length;i++)
            totalsum+=arr[i];
        if(totalsum % 3 != 0)
            return false;
        else{
            for(i=0;i<arr.length;i++){
                currentSum+=arr[i];
                if(currentSum == totalsum/3){
                    partition++;
                    currentSum=0;
                }
            }
        }
        if(partition >= 3)
            return true;
        return false;
    }
}
