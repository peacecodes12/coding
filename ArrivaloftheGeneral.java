import java.util.Scanner;

public class ArrivaloftheGeneral {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr=new int[n];

        arr[0]=scn.nextInt();
        // finding minimum and maximum
        int min=arr[0],max=arr[0],i,minIndex=0,maxIndex=0;
        for (i=1;i<n;i++){
            arr[i]=scn.nextInt();
            if(arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
            if(arr[i]<=min){
                min=arr[i];
                minIndex=i;
            }
        }
        int swaps=0;
        if(minIndex==n-1 && maxIndex==0){
            System.out.println(0);
        }
        else{
            if(maxIndex>minIndex){
                swaps+=maxIndex-1;
            }
            else {
                swaps+=maxIndex;
            }
            swaps+=(n-1-minIndex);
            System.out.println(swaps);
        }

    }
}
