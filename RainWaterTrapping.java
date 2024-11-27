
/* package codechef; // don't place package name! */
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class RainWaterTrapping
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr= new int[n];
        int i,collection=0,lmax,rmax;
        for(i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int[] Pmax=new int[n], Smax=new int[n];
        Pmax[0]=arr[0];
        Smax[n-1]=arr[n-1];
        for(i=1;i<n;i++){
            if(arr[i]>Pmax[i-1])
                Pmax[i]=arr[i];
            else
                Pmax[i]=Pmax[i-1];
        }

        for(i=n-2;i>=0;i--){
            if(arr[i]>Smax[i+1])
                Smax[i]=arr[i];
            else
                Smax[i]=Smax[i+1];
        }

        for(i=1;i<n-1;i++){
            lmax=Pmax[i-1];
            rmax=Smax[i+1];
            if(lmax>arr[i] && rmax>arr[i]){
                int net=Math.min(lmax,rmax);
                collection=collection+net-arr[i];
            }

        }

        System.out.println(collection);
    }
}