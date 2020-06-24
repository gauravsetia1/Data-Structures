package DoubleLinkedList;

import java.util.Scanner;

public class DLL {
    Node head;
    Node tail;
    static class Node
    {
        int data;
        Node next;
        Node prev;
    }

    static void insert_beg(DLL l,int d)
    {
        Node node = new Node();
        node.data = d;
        node.next = null;
        node.prev = null;
        if(l.head==null)
        {
            l.head = node;
            l.tail = node;
        }
        else
        {
            node.next = l.head;
            node.prev = null;
            l.head.prev = node;
        }
        l.head = node;
    }

    static void print(DLL l)
    {
        System.out.println("\nThe Double Linked List :-");
        Node n = l.head;
        while(n.next!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    static void insert_last(DLL l,int d)
    {
        Node node = new Node();
        node.data = d;
        node.next = null;
        node.prev = null;
        if(l.head==null)
        {
            l.head = node;
            l.tail = node;
        }
        else
        {
            l.tail.next = node;
            node.prev = l.tail;
            l.tail = node;
            l.tail.next = null;
        }
    }

    static void del_begin(DLL l)
    {
        if(l.head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            l.head = l.head.next;
            l.head.prev = null;
        }
    }

    static void del_last(DLL l)
    {
        if(l.head==null||l.head==l.tail)
        {
            System.out.println("List is empty");
        }
        else
        {
            l.tail = l.tail.prev;
            l.tail.next = null;
        }
    }

    static void del_index(DLL l, int index)
    {
        if(l.head==null)
        {
            System.out.println("List is empty");
        }
        else if(index==0)
        {
            del_begin(l);
        }
        else
        {
            Node n = l.head;
            Node n1 = null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1 = n.next;
            n1.prev = n;
            n.next = n1.next;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DLL list = new DLL();
        while(true)
        {
            System.out.println("\nPress 1 for insertion at begining");
            System.out.println("Press 2 for insertion at last");
            System.out.println("Press 3 for deletion at begining");
            System.out.println("Press 4 for deletion at last");
            System.out.println("Press 5 for deletion at given Index");

            System.out.println("Press 7 to exit\n");

            int n = scanner.nextInt();
            switch (n)
            {
                case 1 :
                    System.out.println("Enter value:-");
                    insert_beg(list,scanner.nextInt());
                    print(list);
                    break;
                case 2:
                    System.out.println("Enter value:-");
                    insert_last(list,scanner.nextInt());
                    print(list);
                    break;
                case 3:
                    del_begin(list);
                    print(list);
                    break;
                case 4:
                    del_last(list);
                    print(list);
                    break;
                case 5:
                    del_index(list,scanner.nextInt());
                    print(list);
                    break;
                case 7:
                    System.exit(1);
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
    }
}
