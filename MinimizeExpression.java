public class MinimizeExpression {
    public static void main(String[] args){
        int[] A ={1,4,5,8,10};
        int[] B  = {6,9,15};
        int[] C = {2,3,6,6};
        int i = 0, j = 0, k = 0;
        int ans = Integer.MAX_VALUE,max,min,cur;
        while (i < A.length && j < B.length && k < C.length){
            max = Math.max(Math.max(A[i],B[j]),C[k]);
            min = Math.min(Math.min(A[i],B[j]),C[k]);
            cur = max - min;
            ans = Math.min(ans,cur);
            if(min == A[i])
                i++;
            else if (min == B[j]) {
                j++;
            }
            else k++;
        }
        System.out.println(ans);
    }
}
