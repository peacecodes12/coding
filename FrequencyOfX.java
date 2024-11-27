import java.util.Scanner;

public class FrequencyOfX {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int [] arr=new int[n];
        int x=scn.nextInt();
        int k=scn.nextInt();
        int i,count=0;
        for(i=0;i<n;i++){
            arr[i]= scn.nextInt();
        }
        for(i=0;i<k;i++){
            if(arr[i]==x)
                count++;
        }
        for(i=k;i<n;i++){
            System.out.println(count);
            if(arr[i]==x)
                count++;
            if(arr[i-k]==x)
                count--;
        }
        System.out.println(count);
    }
}
