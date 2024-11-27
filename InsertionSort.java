import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {12,4,5,1,71,8,900};
        int i,j;
        for(i = 1; i < arr.length; i++){
            for(j=i;j>0;j--){
                if(arr[j-1] > arr[j])
                    swap(arr,j-1,j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int i , int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
