import java.util.Stack;
public class MinStack {
    public static class Pair{
        int first;
        int second;
        public Pair(int a , int b){
            this.first = a;
            this.second = b;
        }
    }


    public static void main(String[] args) {
        Stack <Pair> pair = new Stack<Pair>();
        pair.push(new Pair(12,13));


    }
}
