public class TwoSum {
}
class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n = arr.length;
        int[] temp = new int[arr.length];
        mergesort(temp,arr,0,n-1);
        int p1 = 0;
        int p2 = n-1;
        while(p1 < p2){
            if(arr[p1] + arr[p2] == target)
                return new int[] {p1,p2};
            else if(arr[p1] + arr[p2] > target)
                p2--;
            else
                p1--;
        }
        return new int[2];
    }
    public static void mergesort(int[] temp, int[] arr, int low,int high){
        if(low == high)
            return;
        int mid = low + (high-low)/2;
        mergesort(temp,arr,low,mid);
        mergesort(temp,arr,mid+1,high);
        merge(temp,arr,low,mid,mid+1,high);
    }
    public static void merge(int[] temp, int[] arr, int start1,int end1,int start2, int end2){
        int i = start1;
        int j = start2;
        int k = start1;
        while(i <= end1 && j <= end2 ){
            if(arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }
        if(i <= end1){
            for (;i<=end1;)
                temp[k++]=arr[i++];
        }
        else if(j <= end2){
            for (;j<=end2;)
                temp[k++]=arr[j++];
        }
        for(i = start1; i <= end2; i++)
            arr[i] = temp[i];
    }
}