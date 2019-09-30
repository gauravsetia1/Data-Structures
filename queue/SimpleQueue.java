package queue;

import java.util.Scanner;

//queue with arrays
public class SimpleQueue {
        private static int front, rear, capacity;
        private static int queue[];

        SimpleQueue(int c)
        {
            front = rear = -1;
            capacity = c;
            queue = new int[capacity];
        }

        static void insert(int data)
        {
            if (capacity-1 == rear) {
                System.out.printf("\nQueue is full\n");
            }
            else if(front==-1)
            {
                front++;
                rear++;
                queue[rear] = data;
            }
            else {
                rear++;
                queue[rear] = data;
            }
        }

        static void delete()
        {
            if (front == -1 && rear ==-1) {
                System.out.printf("\nQueue is empty\n");
            }
            else {
                for (int i = 0; i < rear - 1; i++) {
                    queue[i] = queue[i + 1];
                }
                if (rear < capacity)
                    queue[rear] = 0;
                rear--;
            }
        }

        static void print()
        {
            int i;
            if (front == rear) {
                System.out.printf("\nQueue is Empty\n");
            }

            for (i = front; i < rear; i++) {
                System.out.print(queue[i]);
            }
        }

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the queue capacity:-");
            SimpleQueue q = new SimpleQueue(scanner.nextInt());
            while(true) {
                System.out.println("press 1 for adding");
                System.out.println("press 2 for deleting");
                System.out.println("press 3 for printing");
                System.out.println("press 4 for EXIT");
                switch (scanner.nextInt()) {
                    case 1:
                        q.insert(scanner.nextInt());
                        break;
                    case 2:
                        q.delete();
                        break;
                    case 3:
                        q.print();
                        break;
                    case 4:
                        System.exit(1);
                        break;
                }
            }

        }
}
