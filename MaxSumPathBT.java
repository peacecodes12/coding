import java.util.LinkedList;

public class MaxSumPathBT {
    public static class Pair{
        int first;
        int second;
        Pair(int a, int b){
            this.first = a;
            this.second = b;
        }
    }


      public class TreeNode {
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
        LinkedList<Integer> ll = new LinkedList<>();
//        Pair pair = getMaxPath();
    }
    public static Pair getMaxPath(TreeNode root){
        if(root == null)
            return new Pair(Integer.MIN_VALUE,0);
        Pair LST = getMaxPath(root.left);
        Pair RST = getMaxPath(root.right);
        int maxSum = Math.max( root.val + Math.max(0,LST.first) + Math.max(0,RST.first) , Math.max(LST.first, RST.first));
        int maxUnipath = root.val + Math.max(LST.second,Math.max(RST.second,0));
        return new Pair(maxSum,maxUnipath);
    }

}
