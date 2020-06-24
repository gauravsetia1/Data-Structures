package queue;

public class CircularQueue {
    public static int front=-1,rear=-1,size;
    public static int arr[];

    CircularQueue(int n) {
        size = n;
        arr = new int [n];
    }

    static boolean overflow() {
        if((front == 0 && rear == size-1) || (rear == (front-1)%(size-1)))
            return true;
        else
            return false;
    }

    static boolean underflow() {
        if(front==-1)
            return true;
        else
            return false;
    }

    static void insert(int x) {
        if(overflow())
        {
            System.out.println("full");
        }
        else if(front == -1)
        {
            front = rear = 0;
            arr[rear] = x;
        }
        else if(rear == size-1 && front != 0) {
            rear = 0;
            arr[rear] = x;
        }
        else
        {
            rear++;
            arr[rear] = x;
        }
    }

    static void delete() {
        if (underflow())
        {
            System.out.println("\nQueue is Empty");
        }
        else if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else if (front == size-1)
            front = 0;
        else
            front++;
    }

    static void print() {
        if (front == -1)
        {
            System.out.println("\nQueue is Empty");
        }
        System.out.println("\nElements in Circular Queue are: ");
        if (rear >= front)
        {
            for (int i = front; i <= rear; i++)
                System.out.println(arr[i]);
        }
        else
        {
            for (int i = front; i < size; i++)
                System.out.println(arr[i]);

            for (int i = 0; i <= rear; i++)
                System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        CircularQueue q = new CircularQueue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.insert(60);
        q.print();
    }

}
