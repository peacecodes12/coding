public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
    }
    public static class doublylinkedlist{
        Node head;
        Node tail;
        public void insert(int i){
            Node cur = new Node();
            cur.data = i;
            if(head == null) {
                head = cur;
                cur.prev = null;
            }
            else{
                tail.next = cur;
                cur.prev = tail;
            }
            tail = cur;
        }

        public void insert(int i, int position){// first position = head
            Node cur = new Node();
            Node temp = head;
            int count=1;
            cur.data = i;
            if(position == 1){
                head.prev = cur;
                cur.next = head;
                head = cur;
            }
            else{
                while(count < position-1){
                    temp = temp.next;
                    count++;
                }
                if(temp == tail){ // perform normal insertion
                    insert(i);
                }
                else {
                    cur.next = temp.next;
                    cur.next.prev = cur;
                    temp.next = cur;
                    cur.prev = temp;
                }
            }
        }
        public void show(Node root){
            while(root.next != null){
                System.out.println(root.data);
                root = root.next;
            }
            System.out.println(root.data);
        }
        public void showBackwards(Node root){
            while (root.prev != null){
                System.out.println(root.data);
                root = root.prev;
            }
            System.out.println(root.data);
        }

    }
    public static void main(String[] args) {
        doublylinkedlist list = new doublylinkedlist();
        list.insert(2);
        list.insert(3);
        list.insert(12,3);
        list.show(list.head);
        list.showBackwards(list.tail);
    }
}
