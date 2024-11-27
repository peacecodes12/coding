import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Linkedlistdemo {
    public static class Node{
        int data;
        Node next;
        Node random;
    }

    public static class linkedListdemo{
        Node head;

        public void insert(int i){
            Node cur = new Node();
            Node temp = head;
            cur.data = i;
            cur.next = null;
            if(head == null){
                head = cur;
                return;
            }
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = cur;
        }

        public void show(){
            Node cur = head;
            while (cur.next != null){
                System.out.print(cur.data +" ");
                cur =  cur.next;
            }
            System.out.println(cur.data);
        }

        public boolean search(int i){
            Node cur = head;
            while (cur != null){
                if(cur.data == i)
                    return true;
                cur = cur.next;
            }
            return false;
        }

        public void insertAt(int position, int data){
            Node n = new Node();
            n.data = data;
            n.next = null;
            int i = 1;
            Node temp = head;
            if(position == 1){
                n.next = temp;
                head = n;
                return;
            }

            while(i < position -1 ){
                temp = temp.next;
                    i++;
            }
            n.next = temp.next;
            temp.next = n;

        }

        public void deleteNode(int position){
            Node temp = head;
            int i = 1;
            while (i < position-1){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            temp = temp.next;
            temp = null;
        }

        public void reverse (){
            Node prev = null;
            Node cur = head;
            Node next;
            while(cur != null){
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            this.head = prev;
//            this.show();
        }

        public Node clone(Node head){
            HashMap<Node,Node> hash = new HashMap<>(); // HashMap Key: Original Linked List nodes , Value: Cloned Linked list nodes
            Node cur = head;
            Node prev = null;
            Node cloneHead = null; // ptr to head of cloned Linked list
            while(cur != null){        // creating the linked list and also creating the hashmap
                Node temp = new Node();
                temp.data = cur.data;
                if(cloneHead == null){
                    cloneHead = temp;
                    prev = temp;
                    hash.put(cur,temp);
                }
                else {
                    prev.next = temp;
                    prev = prev.next;
                    hash.put(cur,temp);
                }
                cur = cur.next;
            }
            cur = head;
            Node curClone;
            Node curRandom;
            while (cur != null){   // using the hashmap to assign the random pointers of the nodes in cloned Linked list
                curClone = hash.get(cur);
                curRandom = hash.get(cur.random);
                curClone.random = curRandom;
                cur = cur.next;
            }
            return cloneHead;
        }

        public Node clone2(Node head){
            Node cur = head;
            Node cloneHead = null;
            while (cur != null){
                Node temp = new Node();
                temp.data = cur.data;
                if(cloneHead == null)
                    cloneHead = temp;
                temp.next = cur.next;
                cur.next = temp;
                cur = temp.next;
            }
            cur = head;

            while (cur != null){
                if(cur.random == null)
                    cur.next.random =null;
                else
                    cur.next.random = cur.random.next;
                cur = cur.next.next;
            }

            cur = head;
            Node curClone = head.next;
            while (cur != null){
                cur.next = curClone.next;
                cur = cur.next;
                if(cur!=null)
                {
                    curClone.next = cur.next;
                    curClone = curClone.next;
                }

            }
            curClone.next = cur;
            return cloneHead;
        }


    }
    public static void main(String [] args){
        linkedListdemo ll = new linkedListdemo();
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.show();
        System.out.println(ll.search(6));
        ll.insertAt(1,0);
        ll.insertAt(3,12);
        ll.insertAt(1,122);
        ll.show();
        ll.deleteNode(3);
        ll.show();
        ll.reverse();
        System.out.print("Reverse : ");
        ll.show();
        linkedListdemo L1 = new linkedListdemo();
        linkedListdemo L2 = new linkedListdemo();
        L1.insert(1);
        L1.insert(5);
        L1.insert(7);
        L1.insert(18);
        L2.insert(2);
        L2.insert(9);
        L2.insert(19);
//        System.out.println("L1 head:" + L1.head.data + " "+ L2.head.data);
        System.out.println("L1: ");
        L1.show();
        System.out.println("L2: ");
        L2.show();
        L1.head = merge(L1,L2);
        System.out.println("Merged: " );
        L1.show();
        linkedListdemo listClone = new linkedListdemo();
        listClone.head = listClone.clone2(L1.head);
        System.out.println("Cloned :");
        listClone.show();
    }
    public static Node merge(linkedListdemo L1, linkedListdemo L2){
        Node mergeHead;
        Node prev;
        if(L1.head.data <= L2.head.data)
        {
            mergeHead = L1.head;
            prev = L1.head;
            L1.head = L1.head.next;
        }
        else {
            mergeHead = L2.head;
            prev = L2.head;
            L2.head = L2.head.next;
        }
        while (L1.head != null && L2.head != null){
            if(L1.head.data <= L2.head.data){
                prev.next = L1.head;
                prev = prev.next;
                L1.head = L1.head.next;
            }else {
                prev.next = L2.head;
                prev = prev.next;
                L2.head = L2.head.next;
            }
        }
        if(L1.head != null){
            prev.next = L1.head;

        }
        if(L2.head != null){
            prev.next = L2.head;
        }
        return mergeHead;
    }

    public static Node oddeven(Node head){
        Node oddHead = null,prevOdd = null;
        Node evenHead= null,prevEven = null;
        Node cur = head;
        while(cur != null){
            if(cur.data % 2  ==0 ){
                if(evenHead == null){
                    evenHead = cur;
                    prevEven = cur;
                }
                else {
                    prevEven.next = cur;
                    prevEven = prevEven.next;
                }
            }
            else{
                if(oddHead == null){
                    oddHead = cur;
                    prevOdd = cur;
                }
                else {
                    prevOdd.next = cur;
                    prevOdd = prevOdd.next;
                }
            }
            cur = cur.next;
        }
        prevOdd.next =  null;
        prevEven.next = oddHead;
        return evenHead;
    }


}
