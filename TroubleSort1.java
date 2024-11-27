import java.util.Scanner;

public class TroubleSort1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T -- > 0){
            solution(scn);
        }
    }

    public static void solution(Scanner scn ){
        int N = scn.nextInt();
        int[] arr = new int[N];
        int[] b = new int[N];
        int count1=0,count0 = 0;
        for(int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i < N; i++){
            b[i] = scn.nextInt();
            if(b[i] == 1)
                count1++;
            else count0++;
        }
        if(count0 >= 1 && count1 >= 1)
            System.out.println("Yes");
        else
        {
            boolean bool = isSorted(arr);
            if(bool)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
    public static boolean isSorted(int[] arr){
        for(int  i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}
