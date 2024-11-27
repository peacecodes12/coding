import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RemoveHalfNodes {
    public class Node{
        int val;
        Node right,left;
    }
    public Node RemoveHalfNodes(Node root) {
        // Code Here
        if(root == null)
            return null;
        Node rightHead;
        Node leftHead;
        Node curHead;
        if(root.left == null && root.right == null || root.left != null && root.right != null)
            curHead = root;
        else{
            if(root.left == null)
                curHead = root.right;
            else curHead = root.left;
        }
        leftHead = RemoveHalfNodes(curHead.left);
        rightHead = RemoveHalfNodes(curHead.left);
        curHead.left = leftHead;
        curHead.right = rightHead;
        return curHead;
    }

//    public static void main(String[] args) {
//        Queue<Integer> queue = new LinkedList<>();
//        Stack<Integer> stack = new Stack<>();
//    }
}
