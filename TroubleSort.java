import java.util.Arrays;
import java.util.Scanner;

public class TroubleSort {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while (T-- > 0){
            solution(scn);
        }
    }
    public static void solution(Scanner scn){
        int N = scn.nextInt();
        int[] arr = new int[N];
        int[] b = new int[N];
        int i , j =0 ;
        for ( i = 0; i < N; i++)
            arr[i] = scn.nextInt();
        for ( i = 0; i < N; i++)
            b[i] = scn.nextInt();
        i = 0;
        int a = 0;
        int isSwapped;
        while(i < N) {
            j = i + 1;
            isSwapped = 0;
            a = i;
            for (; i < N - 1 && j < N; ) {
                if (arr[i] > arr[j] && b[i] != b[j]) {
                    swap(arr, i, j,b);
                    i = j;
                    j = i + 1;
                    isSwapped = 1;
                }
                else j++;
            }
            if (isSwapped == 1) {
                i = 0;
            } else i = a + 1;
        }
        boolean sorted = isSorted(arr);
        if(sorted)  System.out.println("Yes");
        else System.out.println("No");
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int i, int j,int[] b){
            int temp = arr[i] , temp1 = b[i];
            arr[i] = arr[j];
            arr[j] = temp;
            b[i] = b[j];
            b[j] = temp1;
    }

    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length -1 ; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

}


//        10
//        4
//        61984 85101 45152 74839
//        1 0 0 1
//        4
//        4214 35436 84747 99946
//        0 0 1 1
//        3
//        79565 44828 8501
//        1 0 1
//        1
//        38344
//        0
//        2
//        34421 26750
//        1 0
//        3
//        16298 12276 30423
//        0 1 1
//        5
//        54423 7612 48964 84655 21084
//        0 0 1 1 0
//        4
//        3815 47682 5788 98926
//        0 1 0 0
//        1
//        89288
//        1
//        7
//        45399 99669 77314 13900 19409 12543 79739
//        0 0 1 1 1 1 1
