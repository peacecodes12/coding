import java.util.Scanner;

public  class ReverseStack {
    public static class stack{
        int[] arr;
        int top;
        int size;

        public stack(int i){
            this.arr = new int[i];
            this.top = -1;
            this.size = i;
        }
        public boolean Empty(){
            return this.top ==- 1;
        }
        public boolean Full(){
            return this.top == this.size-1;
        }

        public void push(int i){
            if(!Full()){
                this.top++;
                this.arr[this.top] = i;
            }
        }
        public void pop(){
            if(!Empty()){
                this.top--;
            }
        }
        public int top(){
            if(!Empty()){
                return this.arr[this.top];
            }
            return -1;
        }
        public void reverse(){
            if(this.Empty()){
                return;
            }
            else {
                int cur = this.top();
                this.pop();
                this.reverse();
                this.pushBottom(cur);
            }
        }

        public void pushBottom(int i){
            if(this.Empty())
            {
                push(i);
                return;
            }
            else{
                int cur = this.top();
                this.pop();
                this.pushBottom(i);
                this.push(cur);
            }
        }

        public void printStack(){
            int i = this.top;
            while(i != -1){
                System.out.print(this.arr[i] + " ");
                i--;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        stack s = new stack(N);

        for (int i =0; i < N; i++)
        {
            int x= scn.nextInt();
            s.push(x);
        }
        s.printStack();
        System.out.println();
        s.reverse();
        s.printStack();
    }
}
