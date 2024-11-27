import java.util.Arrays;

public class RotatinBox1861 {
    public static void main(String[] args) {
        // plan  = for each row iterate to all indices and move the stones till they meet the end or other stone or an obstical
        // start from the end of the row
        // if a stone is present move it to the right as much as possible
        // if cant be moved further right
        // move on to the next index

        char[][] arr = {{'#','#','*','.','*','.'},
                {'#','#','#','*','.','.'},
                {'#','#','#','.','#','.'}};
        for (int i = 0; i < arr.length; i++){
            for (int  j = arr[i].length-1 ; j >= 0 ;j--){
                if(arr[i][j] == '#'){
                    int k = j;
                    while (k + 1 < arr[i].length) {
                        if (arr[i][k + 1] == '#' || arr[i][k + 1] == '*')
                            break;
                        else {
                            arr[i][k] = '.';
                            arr[i][k + 1] = '#';
                        }
                        k++;
                    }
                }
            }
        }
        char [][] arr1 = new char[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
                arr1[j][arr.length-1-i] = arr[i][j];
//            System.out.println(Arrays.toString(arr1[i]));
        }

        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}
