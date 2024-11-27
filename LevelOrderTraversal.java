import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Queue <Integer> levelQueue = new LinkedList<>();
        levelQueue.add(0);
//        System.out.println(levelQueue.poll());
//        System.out.println(levelQueue);
        int i = 0;
        while ( i < 10){
            int front = levelQueue.poll();
            if(front != 0 ) {
                System.out.println(front);
                i++;
            }
            levelQueue.add(front * 10 + 1);
            levelQueue.add(front * 10 + 2);
            levelQueue.add(front * 10 + 3);
        }
        System.out.println("##############################");
        System.out.println(levelQueue);
    }
}
