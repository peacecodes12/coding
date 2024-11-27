import java.util.Scanner;

public class SpecialContest {
    /* package codechef; // don't place package name! */
    /* Name of the class has to be "Main" only if the class is public. */
        public static void main (String[] args)
        {

            Scanner scn=new Scanner(System.in);
            int T= scn.nextInt();
            while(T>0){
                long N= scn.nextLong();
                long A= scn.nextLong();
                long B= scn.nextLong();
                long K= scn.nextLong();
                if(A==0){
                    long count = (N/B);
                    if(count>=K)
                        System.out.println("Win");
                    else System.out.println("Lose");
                }
                else if(B==0){
                    long count =  (N/A);
                    if(count>=K)
                        System.out.println("Win");
                    else System.out.println("Lose");
                }
                else{
                    long dividend= Math.max(A,B);
                    long divisor= Math.min(A,B);
                    while(dividend % divisor !=0){
                        long rem =dividend % divisor;
                        dividend= divisor;
                        divisor=rem;
                    }
                    long LCM= A *B/divisor;
                    long count = (N/A)  + (N/B) - (N/LCM);
                    if(count>=K)
                        System.out.println("Win");
                    else System.out.println("Lose");
                }
                T--;
            }
        }
    }

