import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class CountNodesRange {

    // Binary Tree Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

        // Method to build the binary tree from input string
        public static Node buildTree(String str) {
            if (str.length() == 0 || str.charAt(0) == 'N') {
                return null;
            }

            String[] ip = str.split(" ");
            // Create the root of the tree
            Node root = new Node(Integer.parseInt(ip[0]));
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            int i = 1;
            while (queue.size() > 0 && i < ip.length) {
                // Get and remove the front of the queue
                Node currNode = queue.peek();
                queue.remove();

                String currVal = ip[i];

                // If the left child is not null
                if (!currVal.equals("N")) {
                    currNode.left = new Node(Integer.parseInt(currVal));
                    queue.add(currNode.left);
                }

                // For the right child
                i++;
                if (i >= ip.length) break;

                currVal = ip[i];
                if (!currVal.equals("N")) {
                    currNode.right = new Node(Integer.parseInt(currVal));
                    queue.add(currNode.right);
                }
                i++;
            }

            return root;
        }
    }

    // Function to count nodes in the given range
    static int getCount(Node root, int l, int h) {
        if (root == null) {
            return 0;
        }

        int count = 0;

        // If the current node is in the range
        if (root.data >= l && root.data <= h) {
            count = 1;
        }

        // Count nodes in the left subtree and right subtree
        count += getCount(root.left, l, h);
        count += getCount(root.right, l, h);

        return count;
    }

    // Main driver function
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            // Build the tree using the input string
            Node root = Node.buildTree(s);

            // Get the count of nodes in the range [a, b]
            System.out.println(getCount(root, a, b));
            t--;

            System.out.println("~");
        }
    }
}
