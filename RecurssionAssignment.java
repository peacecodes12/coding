import java.util.Scanner;

// Recurssion to print 5 4 3 2 1 2 3 4 5
public class RecurssionAssignment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        print(N);
//        printRev(N,2);
    }
    public static void print(int N){
        if(N == 1)
        {
            System.out.print(N+" ");
            return;
        }
        System.out.print(N+" ");
        print(N-1);
        System.out.print(N+" ");
    }
    public static void printRev(int N,int i){
        if(i > N)
            return;
        System.out.print(i+" ");
        printRev(N,++i);
    }
}

