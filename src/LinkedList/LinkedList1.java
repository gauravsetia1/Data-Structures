package LinkedList;

import java.util.Scanner;

public class LinkedList1 {
        static Node head;
        static class Node {
            int data;
            Node next;
        }

        public static void insert(int data)
        {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if(head==null)
            {
                head = node;
            }
            else
            {
                Node n = head;
                while(n.next!=null)
                {
                    n = n.next;
                }
                n.next = node;
            }
        }

        public static void print(LinkedList1 l)
        {
            if(l.head==null)
            {
                System.out.println("List is empty");
            }
            else {
                Node n = l.head;
                while (n.next != null) {
                    System.out.print(n.data + " ");
                    n = n.next;
                }
                System.out.println(n.data);
            }
        }

        public static LinkedList1 reverse(LinkedList1 l){
            Node curr=l.head;
            Node prev=null;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            l.head=prev;
            print(l);
            return l;
        }

        public static void pallindrome(LinkedList1 l) {
            LinkedList1 list = reverse(l);

            Node ptr1, ptr2;
            ptr1 = l.head;
            ptr2 = list.head;
            while (ptr1!=null) {
                if (ptr1.data != ptr2.data)
                    break;
                ptr1=ptr1.next;
                ptr2=ptr2.next;
            }
            if(ptr1!=null)
                System.out.println("not");
            else
                System.out.println("Yes");
        }
        public static void main(String[] args) {
            LinkedList1 list = new LinkedList1();
            list.insert(5);
            list.insert(80);
            list.insert(20);
            list.insert(10);
            list.insert(50);

            print(list);

            pallindrome(list);
        }

}
