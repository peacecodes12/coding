import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IndexExtraElement {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int N = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        String[] arr1 = bf.readLine().split(" ");
        int[] array = new int[arr.length];
        int[] array1 = new int[arr1.length];
        for (int i = 0; i < arr.length; i++)
            array[i] = Integer.parseInt(arr[i]);
        for (int i = 0; i < arr1.length; i++)
            array1[i] = Integer.parseInt(arr1[i]);
        System.out.println(Arrays
                .toString(array));
        System.out.println(Arrays.toString(array1));
        System.out.println(BSExtraElement(array,array1));
    }
    public static int BSExtraElement(int[] arr1, int[] arr2){
        int low = 0, high = arr2.length-1,mid;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr1[mid] == arr2[mid])
                low = mid+1;
            else if(arr1[mid] != arr2[mid]){
                if(arr1[mid+1] == arr2[mid])
                    high = mid-1;
                else return mid ;
            }
        }
        return low;
    }
}
