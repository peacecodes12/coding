import java.util.Scanner;

public class EuclidsGCD {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
        int dividend=Math.max(a,b);
        int divisor=Math.min(a,b);
        int rem=1;
        while (divisor!=0){
            rem=dividend % divisor;
            if(rem==0)
                break;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(divisor);
    }
}
