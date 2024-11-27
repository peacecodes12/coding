import java.util.Arrays;
import java.util.Stack;

public class RemoveDuplicates {
    public static class duplicateStack{
        char[] arr;
        int size;
        int top;
        public duplicateStack(int i)
        {
            this.arr = new char[i];
            this.size = i;
            this.top = -1;
        }

        public boolean isEmpty(){
            return this.top == -1;
        }

        public boolean isFull(){
            return this.top == this.size-1;
        }

        public void push(char c){
            if(!isFull()){
                this.top++;
                this.arr[this.top] = c;
            }
            else System.out.print("Stack Full");
        }

        public void pop(){
            if(!isEmpty()){
                this.top--;
            }
            else System.out.println("Stack Empty cant pop");
        }

        public char top(){
            if(!isEmpty()){
                return this.arr[this.top];
            }
            else{
                System.out.println("Stack Empty. NO top element");
            }
            return 'z';
        }
        public String print(){
            String s1 = "";
            for (int i = 0; i <= this.top; i++){
                s1 = new String(s1+ this.arr[i]);
            }
            return s1;
        }

    }
    public static void main(String[] args){
        String s = "bbcaac";
        duplicateStack stack = new duplicateStack(s.length());
        int[] present = new int[26];
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++)
        {
            int cur = s.charAt(i);
            frequency[cur - 'a']++;
        }
        stack.push(s.charAt(0));
        frequency[s.charAt(0) - 'a']--;
        present[s.charAt(0) - 'a'] =1;
        for (int i = 1; i < s.length(); i++ ){
            char cur = s.charAt(i);
            if(present[cur - 'a'] == 0){
                while(!stack.isEmpty() && cur < stack.top()){
                    if(frequency[stack.top() - 'a'] > 0){
                        present[stack.top() - 'a']=0;
                        stack.pop();
                    }
                    else {
                        break;
                    }
                }
                stack.push(cur);
                present[cur - 'a']++;
                frequency[cur  - 'a']--;
            }
            else frequency[cur-'a']--;
        }

        String s1= stack.print();
        System.out.println(s1);
    }
}
