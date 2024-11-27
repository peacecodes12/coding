public class CircularQueue {
    public static class circularQueue{
        int[] arr;
        int front,back;
        int maxSize;
        int count;
        public circularQueue(int i){
            this.maxSize = i;
            this.arr = new int[i];
            this.front = 0;
            this.back = -1;
            count = 0;
        }
        public boolean isEmpty(){
            return this.count == 0;
        }

        public boolean isFull(){
            return this.count == maxSize-1;
        }

        public void push(int i){
            if(!isFull()){
                this.back = (this.back + 1) % maxSize;
                this.arr[this.back] = i;
                this.count++;
            }
            else System.out.println("Queue full");
        }
        public void pop(){
            if(!isEmpty()){
                this.front = (this.front+1) % maxSize;
                this.count--;
            }
        }

        public int front(){
            if(!isEmpty()){
                return this.arr[this.front];
            }
            return -1;
        }

        public int back(){
            if(!isEmpty()){
                return this.arr[this.back];
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        circularQueue obj = new circularQueue(6);
        System.out.println(obj.front());
        System.out.println(obj.count);

        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.push(5);
        System.out.println(obj.count);
        obj.pop();
        System.out.println(obj.count);
        obj.push(6);
    }
}
