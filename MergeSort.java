import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,1,-3};
        int[] temp = new int[arr.length];
        merge(temp,arr,0,arr.length-1);
        System.out.println(Arrays.toString(temp));
    }
    public static void merge(int[] temp,int[] arr,int i, int j){
        if(i == j){
            return;
        }
        int mid = (i + j)/2;
        merge(temp,arr,i,mid);
        merge(temp,arr,mid+1,j);
        sortmerge(temp,arr,i,mid,mid+1,j);
    }
    public static void sortmerge(int[] temp, int[] arr, int start1, int end1, int start2, int end2){
        int i = start1, j = start2, c=start1;
        for (;i<=end1 & j <=end2;){
            if(arr[i] <= arr[j])
                temp[c++] = arr[i++];
            else temp[c++]= arr[j++];
        }
        if(i <= end1){
            for (;i<=end1;)
                temp[c++]=arr[i++];
        }
        else if(j <= end2){
            for (;j<=end2;)
                temp[c++]=arr[j++];
        }
        for(i=start1;i<=end2;i++)
            arr[i] = temp[i];
    }
}
