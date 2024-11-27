import java.util.Scanner;

public class Codeorce855B {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int P=scn.nextInt();
        int Q=scn.nextInt();
        int R=scn.nextInt();
        int[] arr=new int[n];
        int i;
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
        for(i=0;i<n;i++){
            ans=Pmax[i]+Q*arr[i]+Smax[i];
            max=Math.max(ans,max);
        }

        System.out.println(max);

    }
}
