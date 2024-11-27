import java.util.Arrays;

public class NextGreaterPerm {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,0};
        int i,j,temp;
        // finding first element that can be replaced to form a greater permutation
        for(i = arr.length-1; i >=0 ; i-- )
            if (i != 0 && arr[i] > arr[i-1])
                break;
        // i points to the element that is being swapped
        i-=1;
        // finding the next greater element then arr[i] that is present after ith position
        for(j = arr.length-1; j>i;j--){
            if(arr[j] > arr[i])
                break;
        }
        // swapping arr[i] and arr[j]
        temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;

        i+=1;
        j = arr.length-1;
        // swapping elements to form get lexicography order
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
