import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt(),i,k=scn.nextInt();
        int temp;
        int [] nums=new int[n];
        for(i=0;i<n;i++){
            nums[i]=scn.nextInt();
        }
        for(i=0;i<(n-k)/2;i++){
            temp=nums[i];
            nums[i]=nums[n-k-i-1];
            nums[n-k-i-1]=temp;
        }
        int j;
        for(i=n-k,j=0;j<k/2;i++,j++){
            temp=nums[i];
            nums[i]=nums[n-j-1];
            nums[n-j-1]=temp;
        }
        for(i=0;i<n/2;i++){
            temp=nums[i];
            nums[i]=nums[n-i-1];
            nums[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
