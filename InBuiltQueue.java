import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> obj = new LinkedList<>();
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(7);

        System.out.println(obj.contains(4));

    }
}
