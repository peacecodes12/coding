import java.util.ArrayList;
import java.util.List;

public class IntersectionNodesBST {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node() {}
        Node(int val) { this.data = val; }
        Node(int val, Node left, Node right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        List<Node> list1 = new ArrayList<>();
        List<Node> list2 = new ArrayList<>();
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++){
            if(binaySearch(list2,list1.get(i).data,0,list2.size()-1))
                ansList.add(list1.get(i).data);
        }
    }
    public static void inOrder(Node root, List<Node> list){
        if(root == null)
            return ;
        inOrder(root.left,list);
        list.add(root);
        inOrder(root.right,list);
    }
    public static boolean binaySearch(List<Node> list, int target, int low, int high){
        while(low <= high){
            int mid = low + (high-low)/2;
            if(list.get(mid).data == target)
                return true;
            else if(list.get(mid).data > target){
                high = mid-1;
            }
            else low = mid+1;
        }
        return false;
    }
}
