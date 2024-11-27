import java.util.HashMap;
import java.util.Scanner;

public class ProcessingQueries {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        int i;
        for (i = 0; i < N; i++)
            arr[i] = scn.nextInt();
        HashMap <Integer,Integer> hash = new HashMap<>();
        for(i = 0; i < N; i++)
            hash.put(arr[i],arr[i]);
        int x = scn.nextInt();
        while(x!=-1){
            System.out.println(hash.containsKey(x));
            x = scn.nextInt();
        }

    }
}
