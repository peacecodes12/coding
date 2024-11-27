import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        int k= scn.nextInt();
        int i,sum=0;
        for(i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        for(i=0;i<k;i++){
            sum+=arr[i];
        }
        for(i=k;i<=n-1;i++){
            System.out.println(sum);
            sum+=arr[i];
            sum-=arr[i-k];
        }
        System.out.println(sum);
    }
}
