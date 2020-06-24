package queue;

public class QueueUsingArray {
    public static int front = -1;
    public static int rear = -1;
    public static int size,capacity;
    public static int arr[];

    QueueUsingArray(int n) {
        this.size = 0;
        capacity = n;
        arr = new int [n];
    }

    static boolean overflow() {
        if(size>=capacity)
            return true;
        else
            return false;
    }

    static boolean underflow() {
        if(size==0)
            return true;
        else
            return false;
    }

    static void insert(int x) {
        if(overflow())
            System.out.println("full");
        else
        {
            rear++;
            arr[rear] = x;
            size++;
        }
    }

    static void delete() {
        if(underflow())
            System.out.println("empty");
        else
        {
            front++;
            size--;
        }
    }

    static void print() {
        if (underflow()) {
            System.out.println("Queue is Empty");
        }
        for(int i=front+1;i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[])
    {
        QueueUsingArray q = new QueueUsingArray(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.print();


        /*q.delete();

        q.delete();

        q.delete();

        q.print();*/
    }
}
