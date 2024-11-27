import java.util.ArrayList;

public class Queue {
    public static class queue{
        int[] arr;
        int front;
        int back;
        int size;

        public boolean isFull(){
            return this.back == this.size-1;
        }

        public boolean isEmpty(){
            return this.front > this.back;
        }

        public queue(int i){
            this.arr = new int[i];
            this.size = -i;
            this.front = 0;
            this.back= -1;
        }

        public void push(int i){
            if(!isFull()){
                this.back++;
                this.arr[this.back] = i;
            }
            else System.out.println("Cannot push, Queue full");
        }
        public int pop(){
            if(!isEmpty()){
                this.front++;
                return this.arr[this.front-1];
            }
            return -1;
        }

//        public
    }
    public static void main(String[] args){
        queue obj = new queue(5);
        System.out.println(obj.pop());
        obj.push(45);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(41);
        list.add(0,43);
        System.out.println(list);
        list.remove((Integer) 43);
        System.out.println(list);
    }
}
