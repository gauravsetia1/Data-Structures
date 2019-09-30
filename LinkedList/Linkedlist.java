package LinkedList;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Linkedlist {
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

    public static void insertStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public static void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;

        if(index==0)
        {
            insertStart(data);
        }
        else
        {
            Node n = head;
            for(int i=0;i<index-1;i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public static void print()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else {
            Node n = head;
            while (n.next != null) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.println(n.data);
        }
    }

    public static void deleteAt(int index)
    {
        if(index==0)
        {
            head = head.next;
        }
        else
        {
            Node node = head;
            Node n = null;
            for(int i=0;i<index-1;i++)
            {
                node = node.next;
            }
            n = node.next;
            node.next = n.next;
        }
    }

    public static void deleteVal(int data)
    {
        if(head.data==data)
        {
            head = head.next;
        }
        else
        {
            Node node = head;
            Node n = null;
            while (node.next != null)
            {
                if(node.data==data)
                {
                    n = node;
                    node.next = n.next;
                }
                node = node.next;
            }
        }
    }

    public static void reverse(){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        for(int i=0;i>=0;i++){
            System.out.println("\n\nChoose Any Option");
            System.out.println("1.To insert Element At Start at Linked List");
            System.out.println("2.To insert Element At End of the Linked List");
            System.out.println("3.To insert Element on any Index of the Linked  List");
            System.out.println("4.To delete any Element of the Linked List");
            System.out.println("5.To delete any Element with Index of the Linked List");
            System.out.println("6.To View The Linked List");
            System.out.println("7.Exit the Program");
            System.out.println("8.To reverse");
            int n=s.nextInt();
            switch (n){
                case 1 :
                    System.out.println("Enter Element");
                    insertStart(s.nextInt());
                    break;
                case 2 :
                    System.out.println("Enter Element");
                    insert(s.nextInt());
                    break;
                case 3 :
                    System.out.println("\nEnter Index at which you want to insert");
                    int x=s.nextInt();
                    System.out.println("Enter Element");
                    int y=s.nextInt();
                    insertAt(x,y);
                    break;
                case 4 :
                    System.out.println("\nEnter index no. which is to be deleted");
                    deleteAt(s.nextInt());
                    break;
                case 5:
                    System.out.println("\nEnter Value to be deleted");
                    deleteVal(s.nextInt());
                    break;
                case 6:
                    print();
                    break;
                case 7:
                    System.exit(1);
                    break;
                case 8:
                    reverse();
                    break;
                default :
                    System.out.println("Invalid Input");
            }
        }
    }
}
