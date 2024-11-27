import java.util.Stack;

public class PushBottom {
    public static class StackClass{
        int[] arr;
        int size;
        int top1;



        // constructor
        public  StackClass(int i){
            this.top1=-1;
            this.arr = new int[i];
            this.size = i;
        }
        // empty
        public boolean Empty(){
            return this.top1 == -1;
        }
        // full
        public boolean Full(){
            return this.top1 == this.size-1;
        }
        // push
        public void push(int i){
            if(!Full()){
                this.top1++;
                this.arr[top1] = i;
            }
            else {
                System.out.println("Stack full cannot push value: "+i);
            }
        }

        public void pop(){
            if(!Empty()){
                this.top1--;
            }
            else System.out.println("Stack Empty, cannot perform pop");
        }

        public int top(){
            if(!Empty()){
                return this.arr[top1];
            }
            else {
                System.out.println("Stack empty, cannot give top element");
                return -1;
            }
        }

        public void pushBottom(int i){
            StackClass s = new StackClass(this.size);
            while(this.top1 != -1){
                int x = this.top();
                s.push(x);
                this.pop();
            }
            this.push(i);
            while(s.top1 != -1){
                int x = s.top();
                this.push(x);
                s.pop();
            }
        }

        public void pushBack(int i){ // stack = [1,2,3] i = 4
            if(this.Empty())        //
            {
                push(i);
                return;
            }
            else{
                int cur = this.top();
                this.pop();
                this.pushBack(i);
                this.push(cur);
            }
        }

        public void printStack(){
            int i = this.top1;
            while(i != -1){
                System.out.println(this.arr[i]);
                i--;
            }
        }
    }

    public static void main(String[] args){
        StackClass stack1 = new StackClass(6);
//        stack1.pop();
//        stack1.top();
        stack1.push(2); // 3 12 4 2 3 7
        stack1.push(3);
        stack1.pushBack(4);
        stack1.pushBack(12);
        stack1.pushBack(3);
        stack1.push(7);
        stack1.printStack();
    }
}
