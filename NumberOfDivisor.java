import java.util.Scanner;

public class NumberOfDivisor {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i,count=2;
        for(i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i*i==n)
                    count++;
                else count+=2;
            }

        }
        System.out.println(count);

    }
}
