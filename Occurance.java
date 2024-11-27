import java.util.*;
import java.lang.*;
import java.io.*;
public class Occurance {
    /* package codechef; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scn = new Scanner(System.in);
            int N = scn.nextInt();
            long[] arr = new long[N];
            int i;
            for(i = 0; i < N; i++)
                arr[i] = scn.nextLong();
            int T = scn.nextInt();
            long target;
            while (T-- > 0){
                target = scn.nextLong();
                int firstOccurance = FBS(arr,target) +1;
                int lastOccurance;
                if(firstOccurance  != 0){
                    lastOccurance = LBS(arr,target) +1;
                    System.out.println(firstOccurance+" "+lastOccurance);
                }
                else
                    System.out.println(firstOccurance - 1);
            }
        }

        public static int FBS(long[] arr, long target){
            int low = 0, high = arr.length, mid;
            while(low <= high){
                mid = low + (high - low)/2;
                if(arr[mid] == target)
                {
                    if(arr[mid-1] != target)
                        return mid;
                    else high = mid -1;
                }
                else if(arr[mid] < target)
                    low = mid+1;
                else high = mid-1;
            }
            return -1;
        }

        public static int LBS(long[] arr, long target){
            int low = 0, high = arr.length, mid;
            while(low <= high){
                mid = low + (high - low)/2;
                if(arr[mid] == target)
                {
                    if(arr[mid+1] != target)
                        return mid;
                    else low = mid +1;
                }
                else if(arr[mid] < target)
                    low = mid+1;
                else high = mid-1;
            }
            return -1;
        }
    }

