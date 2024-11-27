import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int i,temp=n;
        for(i=2;i*i<=n;i++){
            while(temp%i==0) {
                System.out.println(i);
                temp /= i;
            }
        }
        if(temp!=1)
            System.out.println(temp);
    }
}
