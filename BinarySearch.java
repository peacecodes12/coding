import java.util.Scanner;

public class BinarySearch {
    public  static  void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        Long[] arr = new Long[N];
        Long target;
        int i=0;
        for (;i < N ; i++ ){
            arr[i] = scn.nextLong();
        }
        int T = scn.nextInt();
        while (T-- > 0){
            target = scn.nextLong();
            System.out.println(BS(arr,target));
    }
    }

    public static int BS(Long[] arr, Long target){
        int low = 0, high = arr.length-1;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(arr[mid] > target)
                    high = mid-1;
                else if (arr[mid] < target)
                    low = mid+1;
                else return mid;
            }
            return -1;
        }
    }

