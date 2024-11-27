
import java.util.*;
import java.lang.*;
import java.io.*;
public class FourFactors {


        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner scn= new Scanner(System.in);
            // number of test cases
            int T=scn.nextInt();
            while(T!=0){
                // number of  array elements
                int N=scn.nextInt();
                int[] arr=new int[N];
                int i=0,factors,count,sum,finalSum=0;
                // taking input for the array
                for(;i<N;i++){
                    arr[i]=scn.nextInt();
                    // checking if arr[i] is a perfect as perfect square have odd number of factors
                   int sq=(int) Math.sqrt(arr[i]);
                   // taking count of factors for each element
                    count=0;
                    // storing sum of factors of a particular element
                    sum=0;

                    if(sq*sq!=arr[i]){
                        // checking for factors and storing the sum of factors along with count of factors
                        for(factors=1;factors*factors<=arr[i];factors++){
                            if(arr[i]%factors==0){
                                count+=2;
                            sum+=(factors+arr[i]/factors);}
                        }
                    }
                    if(count==4)
                        finalSum+=sum;
                }
                System.out.println(finalSum);
                T--;
            }

        }
    }
