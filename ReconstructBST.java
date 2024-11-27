import java.util.Arrays;
import java.util.Stack;

public class ReconstructBST {
    //     * Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        int[] preorder ={ 8,5,1,7,10,12};
        TreeNode root = bstFromPreorder(preorder);

    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        int[] nge = new int[preorder.length];
        nge = nextGreatedElement(preorder);
        System.out.println("NGE : "+ Arrays.toString(nge));
        return construct(preorder,nge,0,preorder.length-1);
    }
    public static int[] nextGreatedElement(int[] arr){
        int i = 0;
        int[] nge = new int[arr.length];
        Stack <Integer> stack = new Stack<>();
        stack.push(0);
        for (i = 1; i < arr.length; i++){
            while(!stack.empty() && arr[stack.peek()] < arr[i]){
                nge[stack.lastElement()] = i;
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.empty()){
            nge[stack.peek()] = arr.length;
            stack.pop();
        }
        return nge;
    }

    public static TreeNode construct(int[] preOrder, int[] nge, int i, int j){
        if(i > j){
            return null;
        }
        // [8,5,1,7,10,12]
        //  0,1,2,3, 4, 5
        TreeNode root = new TreeNode(preOrder[i]);
        root.left = construct(preOrder,nge,i+1,nge[i]-1);
        root.right = construct(preOrder,nge,nge[i],j);
        return root;
    }

}
