package Arrays;

public class Dqueue {
    static int size=5;
        static int arr[] = new int [size];
        static int front=-1;
        static int rear=0;

    static boolean isFull()
        {
            return ((front == 0 && rear == size-1)||
                    front == rear+1);
        }
    static boolean isEmpty ()
        {
            return (front == -1);
        }
    static void insertfront(int key)
        {
            if (isFull())
            {
                System.out.println("Overflow");
                return;
            }
            if (front == -1)
            {
                front = 0;
                rear = 0;
            }
            else if (front == 0)
                front = size - 1 ;
            else
                front = front-1;
            arr[front] = key ;
        }

    static void insertrear(int key)
        {
            if (isFull())
            {
                System.out.println(" Overflow ");
                return;
            }
            if (front == -1)
            {
                front = 0;
                rear = 0;
            }
            else if (rear == size-1)
                rear = 0;
            else
                rear = rear+1;
            arr[rear] = key ;
        }

    static void deletefront()
        {
            if (isEmpty())
            {
                System.out.println("Queue Underflow\n");
                return ;
            }
            if (front == rear)
            {
                front = -1;
                rear = -1;
            }
            else
                if (front == size -1)
                    front = 0;
                else
                    front = front+1;
        }

    static void deleterear()
        {
            if (isEmpty())
            {
                System.out.println(" Underflow");
                return ;
            }

            if (front == rear)
            {
                front = -1;
                rear = -1;
            }
            else if (rear == 0)
                rear = size-1;
            else
                rear = rear-1;
        }

    static int getFront()
        {
            if (isEmpty())
            {
                System.out.println(" Underflow");
                return -1 ;
            }
            return arr[front];
        }

    static int getRear()
        {
            if(isEmpty() || rear < 0)
            {
                System.out.println(" Underflow\n");
                return -1 ;
            }
            return arr[rear];
        }

        public static void main(String[] args)
        {

            insertrear(5);
            insertrear(10);
            insertrear(15);
            insertrear(20);

            System.out.println("get rear element : "+ getRear());

            deleterear();
            System.out.println("After delete rear element new rear become : " +
                    getRear());
/*
            System.out.println("inserting element at front end");
            insertfront(15);

            System.out.println("get front element: " +getFront());

            deletefront();

            System.out.println("After delete front element new front become : " +
                    + getFront());
*/
        }
    }