import java.util.Scanner;

public class GCDinArray {
    public static void main(String [] args){
        int [] arr= {2,4,6,12,1};
        int i;
        int gcd=GCD(arr[0],arr[1]);
        for(i=2;i<arr.length;i++){
            gcd=GCD(gcd,arr[i]);
        }
        if(gcd==1)
            System.out.println("1");
        else
            System.out.println("0");

    }

    public static int GCD(int i, int j){
        int dividend=Math.max(i,j);
        int divisor=Math.min(i,j);
        while(dividend%divisor!=0){
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        return divisor;
    }

}
