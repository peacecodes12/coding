import java.util.Arrays;

public class PrefixMax {
    public static void main(String[] args){
        int p,q,r;
        p=1;q=2;r=-3;
        int[] arr={1,2,3,4,-5};
        int n=arr.length;
        int[] PrefixMax=new int[n];
        int[] SuffixMax=new int[n];
        SuffixMax[n-1]=arr[n-1];
        PrefixMax[0]=arr[0];

        int i;
        for(i=1;i<arr.length;i++){
            if(arr[i]>PrefixMax[i-1]){
                PrefixMax[i]=arr[i];
            }
            else
                PrefixMax[i]=PrefixMax[i-1];
        }

        for(i=n-2;i>=0;i--){
            if(arr[i]>SuffixMax[i+1]){
                SuffixMax[i]=arr[i];
            }
            else
                SuffixMax[i]= SuffixMax[i+1];
        }

        int ans,max=Integer.MIN_VALUE;
        for(i=1;i<n-1;i++){
            ans=(p*PrefixMax[i-1])+(q*arr[i])+(r*SuffixMax[i+1]);
            if(max<ans){
                max=ans;
            }
        }

        System.out.println(max);
    }
}
