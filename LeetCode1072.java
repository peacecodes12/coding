import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1072 {
    public static void main(String[] args) {
        int[][] matrix = {{1,0,0,0,1,1,1,0,1,1,1},{1,0,0,0,1,0,0,0,1,0,0},{1,0,0,0,1,1,1,0,1,1,1},{1,0,0,0,1,0,0,0,1,0,0},{1,1,1,0,1,1,1,0,1,1,1}};
        //[[0,0,0],[0,0,1],[1,1,0]]
        System.out.println(maxEqualRowsAfterFlips(matrix));
    }

    public static int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String, Integer> hash = new HashMap<>();
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int j =0;
            if (matrix[i][j] != 0) {
                for (j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == 1)
                        matrix[i][j] = 0;
                    else matrix[i][j] = 1;
                }
            }
                hash.put(Arrays.toString(matrix[i]), hash.getOrDefault(Arrays.toString(matrix[i]), 0) + 1);
                if (hash.get(Arrays.toString(matrix[i])) > max)
                    max = hash.get(Arrays.toString(matrix[i]));

        }
        return max;
    }
}
