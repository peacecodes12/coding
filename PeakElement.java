import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args){
        int[] arr={1,2};
        System.out.println(Peak(arr));

    }
    public static int Peak(int[] arr){
        int low = 0, high = arr.length-1, mid;
        if(arr.length == 1)
            return arr[0];
        while(low <= high){
            mid = low + (high - low)/2;
            if(mid == 0){
                if(arr[mid] > arr[mid+1])
                    return arr[mid];
            }
            else if(mid == arr.length-1){
                if(arr[mid] > arr[mid-1])
                    return arr[mid];
            }
            else
                {
                    if(arr[mid] >= arr[mid+1] && arr[mid] >= arr[mid-1])
                        return arr[mid];
                    else if (arr[mid] < arr[mid+1])
                        low = mid + 1;
                    else
                            high = mid -1;
                }
        }
        return 0;
    }
}
