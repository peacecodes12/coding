import java.util.*;

public class KWeakRow {
    public static class Pair<A, B> {
        int first;
        int second;

        public Pair(int countSoldier, int i) {
            this.second = i;
            this.first = countSoldier;
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        int[][] arr = new int[N][M];
        List<Pair<Integer, Integer>> pair = new ArrayList<>();
        int countSoldier;
        int i, j;

        // Read the matrix input
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++)
                arr[i][j] = scn.nextInt();
        }

        // Compute the number of soldiers for each row
        for (i = 0; i < N; i++) {
            countSoldier = findSoldierCount(arr[i]);
            pair.add(new Pair<>(countSoldier, i));
        }

        // Sort the list based on the number of soldiers (ascending order)
        Collections.sort(pair, (a, b) -> Integer.compare(a.first, b.first));

        // Print the sorted list
        for (Pair<Integer, Integer> p : pair) {
            System.out.print(p.second + " ");
        }
    }

    public static int findSoldierCount(int[] arr) {
        int low = 0, high = arr.length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == 0)
                high = mid - 1;
            else if (arr[mid] == 1) {
                if (mid == arr.length - 1 || arr[mid + 1] != 1)
                    return mid + 1;
                else
                    low = mid + 1;
            }
        }
        return 0;
    }
}
