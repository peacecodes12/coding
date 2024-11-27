import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        long[] arr = {10,7,4,2,9,10,11,3,2};
        Stack<Long> stack = new Stack<>();
        long[] NGE = new long[arr.length];
        int i;
        stack.push(0L);
        for (i = 1; i < arr.length; i++){
            long top = (stack.lastElement());
            while((arr[i] > arr[(int) top])){
                NGE[(int) top] = arr[i];
                stack.pop();
                if(!stack.empty())
                    top = stack.lastElement();
                else break;
            }
            stack.push((long) i);
        }
        while(!stack.empty()){
            long top = stack.lastElement();
            NGE[(int) top] = -1;
            stack.pop();
        }
        System.out.println(Arrays.toString(NGE));
    }

}
