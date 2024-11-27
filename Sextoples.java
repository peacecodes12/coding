import java.util.Arrays;

public class Sextoples {
    public static void main(String[] args) {
        int[] arr = {-1,1};
        int n = arr.length;
        int[] LHS = new int[n*n*n];
        int[] RHS = new int [n*n*n];
        int i,j,k,l=0;
        int totalTouples =0;
        //
        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                for (k = 0 ;k < n; k++){
                    LHS[l] = arr[i] * arr[j] + arr[k];
                    l++;
                }
            }
        }
        l = 0;
        for (i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                for (k = 0 ;k < n; k++){
                    if(arr[i] != 0 ){
                        RHS[l] = arr[i] *( arr[j] + arr[k] );
                        l++;
                    }
                }
            }
        }
        sort(LHS);
        sort(RHS);
        // finding the solution for the given equation
        for( i = 0; i < LHS.length; i++){
            int first = BSFirst(RHS,LHS[i]);
            if(first != -1){
                int last = BSLast(RHS,LHS[i]);
                totalTouples+= last - first +1;
            }

        }
        System.out.println(totalTouples);
    }

    // binary search to find the first occurance of a target
    public static int BSFirst(int[] arr, int target){
        int low = 0, high = arr.length,mid;
        while(low <= high){
            mid  = low + (high - low)/2;
            if(arr[mid] < target)
                low = mid +1;
            else if (arr[mid] > target) {
                high = mid -1;
            }
            else {
                if(mid == 0 || arr[mid-1] !=  target)
                    return mid;
                else high = mid -1;
            }
        }
        return -1;
    }
    public static int BSLast(int[] arr, int target){
        int low = 0, high = arr.length,mid;
        while( low <= high){
            mid = low + (high-low)/2;
            if(arr[mid] < target)
                low = mid+1;
            else if (arr[mid] > target) {
                high = mid -1;
            }
            else{
                if( mid == arr.length -1 || arr[mid+1] != target)
                    return mid;
                else low = mid+1;
            }
        }
        return 0;
    }

    // sorting LHS and RHS arrays
    public static void sort(int[] arr){
        int i,j;
        for(i = 1; i < arr.length; i++) {
            for (j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j])
                    swap(arr, j - 1, j);
            }
        }
    }
    public static void swap(int[] arr, int i , int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    }

