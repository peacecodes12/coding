import java.util.Arrays;

public class CountUnguarded {
    public static void main(String[] args) {
        int m = 4, n =6;
        int[][] guards = {{0,0},{1,1},{2,3}};
        int[][] walls = {{0,1}, {2,2}, {1,4}};
//        System.out.println(guards.length);
        int ans = countUnguarded(m,n,guards,walls);
        System.out.println(ans);
    }
    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        // guard = 1 , walls = 2 , guardable = 4
        int[][] grid = new int[m][n];
        int count=0;
        int i,j,k;
        for (i = 0 ; i < guards.length; i++){
            j = guards[i][0];
            k = guards[i][1];
            grid[j][k] = 1;
        }
        for (i = 0 ; i < walls.length; i++){
            j = walls[i][0];
            k = walls[i][1];
            grid[j][k] = 2;
        }
        for (i = 0; i < guards.length;i++){
            markGuarded(guards[i][0],guards[i][1],grid,m,n);
        }
        for (i = 0; i < m; i++)
        {
            for (j = 0; j < n; j++){
                if(grid[i][j] == 0)
                    count++;
        }
        }

        return count;
    }
    public static void markGuarded(int i, int j,int[][] grid,int m, int n){
        for (int k = i +1; k < m; k++){
            if(grid[k][j] == 1 || grid[k][j] == 2 )
                break;
            grid[k][j] = 4;
        }
        for (int k = i-1; k >= 0; k--){
            if(grid[k][j] == 1 || grid[k][j] == 2 )
                break;
            grid[k][j] = 4;
        }
        for (int k = j +1; k < n; k++){
            if(grid[i][k] == 1 || grid[i][k] == 2 )
                break;
            grid[i][k] = 4;
        }
        for (int k = j-1; k >= 0; k--){
            if(grid[i][k] == 1 || grid[i][k] == 2 )
                break;
            grid[k][j] = 4;
        }
    }
}
