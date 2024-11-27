import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        n++;
        int[] Prime=new int[n];
        int i,j;
        for(i=2;i<n;i++){
            Prime[i]=i;
        }
        Prime[1]=0;
        for(i=2;i*i<n;i++){
            if(Prime[i]!=0){
            for (j=i;j*i<n;j++){
                Prime[i*j]=0;
            }
            }
        }
        for (i=2;i<n;i++){
            if (Prime[i]!=0)
                System.out.println(Prime[i]);
        }
    }
}
