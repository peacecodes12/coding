import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KSmallest {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int N = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        int i=0;
        int[] array = new int[N];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(i = 0; i < N; i++){
            array[i] = Integer.parseInt(arr[i]);
            if(array[i] < min)
                min = array[i];
            if(array[i] > max)
                max = array[i];
        }

        int K = Integer.parseInt(bf.readLine());
        K = KSmallest(array,K,min,max);
        System.out.println(K);
    }

    public static int KSmallest(int[] array,int k, int low,int high){
        int mid,smallerEq , smaller;
        while (low <= high){
            smallerEq = 0; smaller =0;
            mid = low +(high-low)/2;
            for(int i = 0; i < array.length; i++){
                if(array[i] <= mid)
                    smallerEq++;
                if(array[i] < mid)
                    smaller++;
            }
            if(smallerEq < k)
                low = mid+1;
            else{
                if(smaller < k)
                    return mid;
                else high = mid-1;
            }
        }
        return 0;
    }

    public static int smallerCount(int[] arr, int val){
        int count= 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < val)
                count++;
        }
        return count;
    }
}
