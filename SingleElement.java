public class SingleElement {
    public static void main(String[] args){
        int[] arr = {7,7,1,1,5,5,8,8,9,0,0};
        System.out.println(FindElement(arr));
    }

    public static int FindElement(int[] arr){
        int low = 0, high = arr.length-1,mid;
        if(low == high)
            return arr[low];
        else{
            while(low <= high){
                mid = low +(high - low)/2;
                if(mid == arr.length-1 && arr[mid] != arr[mid-1])
                    return arr[mid];
                else if(mid == 0 && arr[mid+1] != arr[mid])
                    return arr[mid];
                if(arr[mid] == arr[mid+1]){
                    if(mid % 2 == 0)
                        low = mid + 1;
                    else
                        high = mid -1;
                }
                else if(arr[mid] == arr[mid-1]){

                    if((mid -1) % 2 == 0)
                        low = mid + 1;
                    else
                        high = mid -1;
                }
                else
                    return arr[mid];
            }
        }

        return 0;
    }
}
