import java.util.Scanner;

public class CodeForce451B {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr= new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = scn.nextInt();
        }
        int p1= 0,p2= 0,flag = 0;
        for (int i = 0;i < N -1; i++){ // 3 2 1
            while((i < N-1) && arr[i] - arr[i+1] > 0 ){  // i: 0 N = 2
                if(p1 == 0 && flag ==0 ){
                    p1= i;
                    flag=1;
                }
                p2 = i+1;
                i++;
            }
        }
        int P1 = p1 +1 , P2= p2+1;
        for (; p1 < p2; p1++, p2--){
            int temp= arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
        }
        boolean bool = isSorted(arr);
        if(bool)
        {
            System.out.println("yes");
            System.out.println(P1 +" "+P2  );
        }
        else System.out.println("no");

    }
    public static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1] )
                return false;
        }
        return true;
    }
}
