public class StackFuncitons {
    public static class stack{
        int[] arr;
        int top;
        int size;
        public  stack(int size){
            this.size = size;
            this.arr = new int[size];
            this.top=-1;
        }
         private boolean isEmpty(){
            return this.top == -1;
        }
        private boolean isFull(){
            return this.top == this.size-1;
        }

        public void pop(){
            if(!isEmpty())
                this.top--;
            else System.out.println("Stack empty");
        }

        public void push(int i){
            if(!isFull()){
                this.top++;
                this.arr[this.top] = i;
            }
            else System.out.println("Stack full ");
        }

        public int top(){
            if(!isEmpty())
                return this.arr[this.top];
            else {
                System.out.println("Stack Empty");
                return -1;
            }
        }
    }
    public  static void main(String[] args){
        stack s = new stack(5);
        s.pop();
        s.push(4);
        int i = s.top();
        System.out.print(i);


    }
}
