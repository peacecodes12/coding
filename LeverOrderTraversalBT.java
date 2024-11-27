import java.util.*;

public class LeverOrderTraversalBT {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    static class Cordinate{
        int val;
        int x,y;
        Cordinate (int val, int x, int y){
            this.val = val;
            this.x = x;
            this.y = y;
        }
    }
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList<Integer> verticalOrder(Node root)
    {
        Comparator <Cordinate> cmp = new Comparator<Cordinate>() {
            public int compare (Cordinate first, Cordinate second){
                if(first.y < second.y)
                    return -1;
                else if(first.y > second.y)
                    return 1;
                else{
                    if(first.x < second.x)
                        return -1;
                    else if(first.x > second.x)
                        return 1;
                    else return 0;
                }
            }
        };
        List<Cordinate> list = new LinkedList<>();
        makeCordinates(root,0,0,list);
        Collections.sort(list,cmp);
        ArrayList <Integer> ansList = new ArrayList<>();
        for(int i = 0 ;i < list.size(); i++){
            ansList.add(list.get(i).val);
        }
        return ansList;
    }


    static void makeCordinates(Node root, int level, int horizontalDistance,List<Cordinate> list){
        if(root == null)
            return;
        list.add(new Cordinate(root.data,level,horizontalDistance));
        makeCordinates(root.left,level+1,horizontalDistance-1,list);
        makeCordinates(root.right,level+1,horizontalDistance+1,list);
    }

    //Function to find the vertical order traversal of Binary Tree.

}
