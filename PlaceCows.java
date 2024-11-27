import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PlaceCows {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int N = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++)
        {
            arr[i] = Integer.parseInt(str[i]);
            if(arr[i] < min)
                min = arr[i];
            if(max < arr[i])
                max = arr[i];
        }
        int T = Integer.parseInt(bf.readLine());
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        while(T-- > 0){
            int Cows = Integer.parseInt(bf.readLine());
            System.out.println(placeCows(arr,Cows,min,max));
        }
    }

    public static int placeCows(int[] arr, int Cows, int low, int high){
        if(Cows > arr.length)
            return 0;
        int mid;
        while(low <= high){
            mid = low + (high- low)/2;
            boolean x = canPlace(arr,Cows,mid);
            if(!x)
                high = mid-1;
            else{
                if(!canPlace(arr, Cows, mid+1))
                    return mid;
                else low = mid+1;
            }
        }
        return 0;
    }

    public static boolean canPlace(int[] arr, int Cows, int gap){
        Cows--;
        int cur = 0;
        for (int i = 1; i < arr.length && Cows!=0; i++){
            if(arr[i] - arr[cur] >= gap)
            {
                Cows--;
                cur = i;
            }
        }
        return Cows == 0;
    }
}
