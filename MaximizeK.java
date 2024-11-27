public class MaximizeK {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int x = 18;
        int i = BS(0,arr.length, arr,x);
        System.out.println(i);
    }
    public static int BS(int low, int high,int[] arr,int x){
        int mid;
        while(low <= high){
            mid = low + (high-low)/2;
            if(SubArrSum(mid,arr,x)){
                if(mid == arr.length || !SubArrSum(mid+1,arr,x) )
                return mid;
                else low = mid +1;
            }
            else high = mid -1;
        }
        return -1;
    }
    public static boolean SubArrSum(int m, int[] arr,int x){
        int i,sum=0;
        for(i = 0; i <m; i++)
            sum += arr[i];
        if(sum > x)
            return false;
        for(i = m ; i < arr.length; i++){
            sum+=arr[i];
            sum-=arr[i-m];
            if(sum > x)
                return false;
        }
        return true;
    }

}
