import java.util.Arrays;

public class AllSubsequences {
    public static void main(String[] args){
         int[] arr = {1,2,3};
         int[] temp =new int[arr.length];
         Subsequence(arr,arr.length,0,temp,0);
    }

    public static void Subsequence(int[] arr, int N, int index, int[] temp,int size){
        if( index == N){
            for(int i = 0; i < size; i++)
            System.out.print(temp[i] + " ");
            System.out.println();
            return;
        }
        temp[size] = arr[index];
        Subsequence(arr,N,index+1,temp,size+1);
        Subsequence(arr,N,index+1,temp,size);
    }
}
