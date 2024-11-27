import java.util.Scanner;

public class CodeForce235A {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        long n= scn.nextLong();
        if(n==0)
            System.out.println(0);
        else if (n-1 == 0) {
            System.out.println(n);
        } else if (n-2 == 0) {
            System.out.println(n*(n-1));
        }else System.out.println(n*(n-1)*(n-2));
    }
}
