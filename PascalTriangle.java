import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args){
        int n=30;
        int i,j;
        int [][] arr=new int[n+1][n+1];
        arr[0][0]=1;
        arr[1][0]=1;
        arr[1][1]=1;
        for(i=2;i<n+1;i++){
            arr[i][0]=1;
            for(j=1;j<=i/2;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                arr[i][i-j]=arr[i][j];
            }
            arr[i][i]=1;
        }
        for (i=0;i<n+1;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
