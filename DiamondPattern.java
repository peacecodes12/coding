import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < N - i; j++)
                System.out.print("  ");

            for (int k = 0; k <= i; k++) {
                System.out.print(k);
                if (k < i) {
                    System.out.print(" ");
                }
            }

            for (int k = i - 1; k >= 0; k--) {
                System.out.print(" " + k);
            }

            System.out.println();
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N - i; j++)
                System.out.print("  ");

            for (int k = 0; k <= i; k++) {
                System.out.print(k);
                if (k < i) {
                    System.out.print(" ");
                }
            }

            for (int k = i - 1; k >= 0; k--) {
                System.out.print(" " + k);
            }

            System.out.println();
        }
    }
}
