
import java.util.LinkedList;
import java.util.Queue;

    class Node {
        int data;
        Node left, right;

        // Constructor to create a new node
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    class BinaryTreee {
        Node root;

        // Constructor to create an empty tree
        public BinaryTreee() {
            root = null;
        }

        // Method to build the binary tree from a list of values
        public void buildTree(Integer[] values) {
            if (values == null || values.length == 0) return;

            root = new Node(values[0]);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            int index = 1;
            while (index < values.length) {
                Node currentNode = queue.poll();

                // Add the left child
                if (values[index] != null) {
                    currentNode.left = new Node(values[index]);
                    queue.add(currentNode.left);
                }
                index++;

                // Add the right child
                if (index < values.length && values[index] != null) {
                    currentNode.right = new Node(values[index]);
                    queue.add(currentNode.right);
                }
                index++;
            }
        }

        // Function for in-order traversal (Left, Root, Right)
        void inOrderTraversal(Node node) {
            if (node == null) return;
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }

        // Function for pre-order traversal (Root, Left, Right)
        void preOrderTraversal(Node node) {
            if (node == null) return;
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

        // Function for post-order traversal (Left, Right, Root)
        void postOrderTraversal(Node node) {
            if (node == null) return;
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }

        // A utility method to call traversals easily on the root
        void traverseTree() {
            System.out.println("In-order Traversal: ");
            inOrderTraversal(root);
            System.out.println();

            System.out.println("Pre-order Traversal: ");
            preOrderTraversal(root);
            System.out.println();

            System.out.println("Post-order Traversal: ");
            postOrderTraversal(root);
            System.out.println();
        }

    public static class Pair{
        Node head;
        Node tail;
        Pair(Node head, Node Tail){
            this.head = head;
            this.tail = Tail;
        }
    }
     void flatten(Node root) {
        Pair pair = linkedlist(root);
        root = pair.head;
    }

    public static Pair linkedlist(Node root){
        if(root == null) return new Pair(null,null);
        if(root.left == null && root.right == null)
            return new Pair(root,root);
        Pair LST = linkedlist(root.left);
        Pair RST = linkedlist(root.right);
        if(LST.head != null ){
            LST.tail.right = RST.head;
            root.right = LST.head;
            root.left = null;
        }
        if(RST.head == null)
            return new Pair(root,LST.tail);
        return new Pair(root,RST.tail);

    }
}

    public class BinaryTreeDemo {
        public static void main(String[] args) {
            BinaryTreee tree = new BinaryTreee();

            // Build tree from the array [1, 2, 5, 3, 4, null, 6]
            Integer[] values = {1, 2, 5, 3, 4, null, 6};
            tree.buildTree(values);

            // Perform tree traversal
//            tree.traverseTree();
            tree.flatten(tree.root);
            tree.preOrderTraversal(tree.root);
        }

    }


