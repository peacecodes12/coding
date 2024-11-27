public class MaxDivideConquer {
    public static void main(String[] args){
        int [] arr={0,-12,-5};
        int max=FindMax(arr,0,arr.length-1);
        System.out.println(max);
    }
    public static int FindMax(int[] arr, int i,int j){
        if(i==j)
            return arr[i];
        int mid= i +(j-i)/2;
        int m1=FindMax(arr,i,mid);
        int m2=FindMax(arr,mid+1,j);
        return Math.max(m1,m2);
    }
}
