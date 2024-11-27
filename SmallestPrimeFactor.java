import java.util.Scanner;

public class SmallestPrimeFactor {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        n++;
        int[] Prime=new int[n],SPF= new int[n];
        int i,j;
        Prime[1]=0;
        for (i=2;i<n;i++){
            Prime[i]=i;
            SPF[i]=0;
        }

        for (i=2;i*i<n;i++){
            if(Prime[i]!=0){
            for (j=i;j*i<n;j++){
                Prime[i*j]=0;
                if(SPF[i*j]==0)
                SPF[i*j]=i;
            }
            }
        }
//        for(i=2;i<n;i++){
//            if(Prime[i]!=0)
//                System.out.println(Prime[i]);
//        }
        for(i=2;i<n;i++){
                System.out.println(i+" "+SPF[i]);
        }
    }
}
