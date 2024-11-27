import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

//    public static class binaryTree{
//        Node root;
//        public void insert(int i){
//            Node cur = new Node();
//            cur.val = i;
//            if(root == null)
//                root = cur;
//        }
//
//    }

    public static class binaryTree {
        Node root;

        // Insert method to add a new node to the binary tree
        public void insert(int val) {
            root = insertRec(root, val);
        }

        // Helper method for recursive insertion
        private Node insertRec(Node root, int val) {
            // If the tree is empty, create a new node and return it
            if (root == null) {
                root = new Node(val);
                return root;
            }

            // Otherwise, recur down the tree
            if (val < root.val) {
                root.left = insertRec(root.left, val);
            } else if (val > root.val) {
                root.right = insertRec(root.right, val);
            }

            // Return the unchanged root node
            return root;
        }

        // Inorder traversal to display the tree contents
        public void inorder() {
            inorderRec(root);
        }

        // Helper method for inorder traversal
        private void inorderRec(Node root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.print(root.val + " ");
                inorderRec(root.right);
            }
        }
    }
    public static void allPaths(Node root, List<Integer> list, int i){
        if(root.left == null && root.right == null){
            list.add(i,root.val);
            System.out.println(list);
            return;
        }
        list.add(i, root.val);
        allPaths(root.left,list,i+1);
        allPaths(root.right,list,i+1);
    }

    public static int maxHeight(Node root){
        if(root == null)
            return 0;
        if(root.right == null && root.left == null)
            return 1;
        return 1 + Math.max(maxHeight(root.right), maxHeight(root.left));
    }

    public static int diameter(Node root , int ans){
        if(root == null)
            return 0;
        ans = Math.max(1+maxHeight(root.left)+maxHeight(root.right),ans);
        int leftAns = diameter(root.left,ans);
        ans = Math.max(ans,leftAns);
        int rightAns = diameter(root.right,ans);
        ans = Math.max(ans,rightAns);
        return ans;
    }

    public static boolean heightBalanced(Node root){
        if(root == null)
            return true;
        return Math.abs(maxHeight(root.left) - maxHeight(root.right)) <= 1 && heightBalanced(root.right) && heightBalanced(root.left);
    }


    public static void main(String[] args){
        binaryTree tree = new binaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        System.out.println("Inorder traversal of binary tree:");
        tree.inorder();
        List <Integer> list = new ArrayList<>();
        allPaths(tree.root, list,0 );
        System.out.println(maxHeight(tree.root));
        System.out.println(diameter(tree.root,0));
    }
}
