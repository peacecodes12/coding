
/* package codechef; // don't place package name! */
import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Search2DArr
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt(),m=scn.nextInt();
        int [][] arr=new int [n][m];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int target=scn.nextInt();
        int flag=0;
        i=0;
        j=m-1;
        while(i<n && j>=0 ){
            if(arr[i][j]<target)
                i++;
            else if(arr[i][j]>target)
                j--;
            else if(arr[i][j]==target)
            {
                flag++;
                break;
            }
        }
        if(flag==1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}