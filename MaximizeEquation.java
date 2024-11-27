import java.util.Scanner;

//Given Expression: P*A[i]+Q*A[j]+R*A[k];
//such that i<j<k
public class MaximizeEquation {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr=new int[n];
        int i,P=1,Q=2,R=3;
        int[] Pmax=new int[n],Smax=new int[n];
        for(i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        Pmax[0]=P*arr[0];
        Smax[n-1]=R*arr[n-1];
        for(i=1;i<n;i++){
            if(P*arr[i]>Pmax[i-1])
                Pmax[i]=P*arr[i];
            else
                Pmax[i]=Pmax[i-1];
        }

        for(i=n-2;i>=0;i--){
            if(R*arr[i]>Smax[i+1])
                Smax[i]=R*arr[i];
            else
                Pmax[i]=Pmax[i+1];
        }
        int ans,max=Integer.MIN_VALUE;
        for(i=1;i<n-1;i++){
            ans=Pmax[i-1]+Q*arr[i]+Smax[i+1];
            max=Math.max(ans,max);
        }
        System.out.println(max);

    }

}
