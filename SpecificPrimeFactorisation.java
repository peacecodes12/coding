import java.util.Scanner;

public class SpecificPrimeFactorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N +1 ];
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();
        int P1 = 1;
        int P2 = 1;
        int P3 = 1;
        arr[1] =1;
        for (int i = 2; i < N+1; i++){
            int curP1 = arr[P1] * n1;
            int curP2 = arr[P2] * n2;
            int curP3 = arr[P3] * n3;
            arr[i] = Math.min(Math.min(curP1,curP2), curP3);
            if(arr[i] == curP1)
                P1++;
            if(arr[i] == curP2)
                P2++;
            if(arr[i] == curP3)
                P3++;
        }
        System.out.println(arr[N]);
    }
}
