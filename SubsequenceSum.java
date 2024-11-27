import java.util.Arrays;

public class SubsequenceSum {
    public static void main(String[] args){
        int[] arr = {2};
        int[] temp =new int[arr.length];
        int sum = 0;
        System.out.println(Subsequence(arr,arr.length,0,temp,0, sum));
    }

    public static int Subsequence(int[] arr, int N, int index, int[] temp,int size, int sum){
        if( index == N){
            int min = temp[0];
            int max = temp[0];
            for(int i = 0; i <  size; i++)
            {
                min = Math.min(min,temp[i]);
                max = Math.max(max, temp[i]);
            }
            sum = sum +(max-min);
            return sum;
        }
        temp[size] = arr[index];    // temp : 1
        int x=Subsequence(arr,N,index+1,temp,size+1,sum);
        int y=Subsequence(arr,N,index+1,temp,size,sum);
        return x+y;
    }
}
