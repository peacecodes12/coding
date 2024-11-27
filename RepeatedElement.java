public class RepeatedElement {
    public static void main(String [] args){
        int[] arr= {1,2,3,4,5,6,7,7};
        System.out.println(FIndElement(arr));
    }

    public static int FIndElement(int[] arr){
        int low = 0, high = arr.length-1,mid;
        while(low <= high){
            mid = low + (high - low)/2;
            if(arr[mid] == mid+1){
                if(arr[mid] == arr[mid+1])
                    return arr[mid];
                else low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
}
