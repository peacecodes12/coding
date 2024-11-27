public class linkedlistDown {
    public static class Node{
        int val;
        Node next;
        Node down;
    }

    public static class linklist{
        Node head;


        public  void insert(int i){
            Node cur = new Node();
            cur.val = i;
            Node temp = head;
            if(head == null)
                head = cur;
            else {
                while (temp.next != null){
                    temp=temp.next;
                }
                temp.next = cur;
            }
        }

        public void flatenList(Node head){
            Node cur, temp;
            cur = head;
            temp = head;
            while (cur.next != null){
                if(cur.down != null) {
                    temp = cur.next;
                    cur.next = cur.down;
                    Node join = cur;
                    while (join.next != null) {
                        join = join.next;
                    }
                    join.next = temp;
                }
                cur = cur.next;
            }
        }

    }
}
