import java.util.ArrayList;
import java.util.List;

public class BTReconstruction {
    public class Node{
        int val;
        Node right,left;
        Node (int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Node> list = new ArrayList<>();
        list = allPossibleBt(arr,0,arr.length);
    }
    public static List<Node> allPossibleBt(int[] arr, int start, int end){
        List<Node> ansList = new ArrayList<>();
        if(start > end)
            return ansList;
        int n = end - start;
        for (int  i = 1; i < n; i++ ){
            for (int j = 0 ;j < n - i -1; j++){
//                List<Node> LST = allPossibleBt(arr,start+1, );
            }
        }

        return ansList;
    }
}
