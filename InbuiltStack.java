import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        if(!stack.empty())
            System.out.println( stack.pop());
        else System.out.println("Stack is empty cant pop");

    }
}
