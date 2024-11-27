import java.util.Arrays;
import java.util.Scanner;

public class Subsets {
    public static void main(String[] args){
        int[] arr={1,2};
        int n=arr.length;
        int[] temp=new int[n];
        PASS(arr,arr.length,0,temp,0);
    }
    public static void PASS(int[] arr, int N, int i, int[] temp, int size){
        if(i==N){
            for(int j=0;j<size;j++){
                System.out.print(temp[j]);
            }
            System.out.println();
            return;
        }
        temp[size]=arr[i];
        PASS(arr,N,i+1,temp,size+1);
        PASS(arr,N,i+1,temp,size);
    }
}
