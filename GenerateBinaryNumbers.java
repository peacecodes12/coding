import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        ArrayList <String> string = new ArrayList<>();
        int n = 3;
        string = generateBinary(n);
        System.out.println(string);
    }
    public static ArrayList<String > generateBinary (int n){
        int i = 0;
        ArrayList <String> string = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while ( !queue.isEmpty() && i < n){
            int cur = queue.remove();
            string.add(Integer.toString(cur));
            queue.add(cur *10);
            queue.add(cur * 10 +1);
            i++;
        }
        return string;
    }
}
