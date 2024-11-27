import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllBT {
    public static class Node {
        int val ;
        Node left;
        Node right;
        Node (int i){
            this.val = i;
        }
        Node (int i , Node left, Node right){
            this.val = i;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args){
        List <Node> list = new ArrayList<>();
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(6);
        root2.left = new Node(7);
        root2.right = new Node(8);
        root2.left.left = new Node(9);

        Node root3 = new Node(10);
        int N = 4;
        list = allBt(N);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Tree " + (i + 1) + ":");
            printTree(list.get(i));
            System.out.println();
        }
//        Stack<Node> stack = new Stack<>();
//        stack.push(null);
//        System.out.println(stack.empty());
    }
    public static List<Node> allBt (int N){
        if(N == 0)
        {
            List<Node> list = new ArrayList<>();
            list.add(null);
            return list;
        }
        List<Node> list = new ArrayList<>();
        List <Node> LST = new ArrayList<>();
        List <Node> RST = new ArrayList<>();
        for (int i =0; i < N; i++) {
            LST = allBt(i);
            RST = allBt(N - i - 1);

            for (int j = 0; j < LST.size(); j++) {
                for (int k = 0; k < RST.size(); k++) {

                    Node root = new Node(0);
                    root.left = LST.get(j);
                    root.right = RST.get(k);
                    list.add(root);
                }
            }
        }
        return list;
    }
    public static void printTree(Node root) {
        printTreeHelper(root, "", true);
    }

    // Helper method to print a tree with structure
    private static void printTreeHelper(Node node, String indent, boolean isLeft) {
        if (node != null) {
            System.out.println(indent + (isLeft ? "L--- " : "R--- ") + node.val);
            printTreeHelper(node.left, indent + (isLeft ? "|   " : "    "), true);
            printTreeHelper(node.right, indent + (isLeft ? "|   " : "    "), false);
        }

    }
}
