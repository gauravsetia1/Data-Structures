package LinkedList;

public class Sample {
    static int count = 1;
        static Node head;
        static class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
            }
        }

        public static void insert(int d)
        {
            Node newnode = new Node(d);
            newnode.next= null;
            if(head==null)
            {
                head = newnode;
            }
            else
            {
                Node ptr = head;
                while(ptr.next != null)
                {
                    ptr = ptr.next;
                }
                ptr.next = newnode;
            }
        }

    public static void printLinkedList(){
        Node node=head;
        while (node.next!=null){
            System.out.print(node.data+ " ");
            node=node.next;
        }
        System.out.println(node.data);
    }

    public static void countNode()
    {
        Node node=head;
        while (node.next!=null){
            node=node.next;
            count++;
        }
        System.out.println("count = " + count);
    }

    public static void mid()
    {
        Node ptr = head;
        Node ptr2 = head;
        while (ptr2.next!=null&&ptr2.next.next!=null)
        {
            ptr = ptr.next;
            ptr2 = ptr2.next.next;
        }
        System.out.println("mid value " + ptr.data);
    }

        public static void main(String[] args)
        {
            insert(10);
            insert(20);
            insert(30);
            insert(5);
           //insert(6);
            printLinkedList();
           // countNode();

            mid();
        }
}
