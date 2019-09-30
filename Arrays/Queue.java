package Arrays;

public class Queue
{
    static int queue[] = new int[5];
    static int first=-1,last=-1;

    static void insert(int x)
    {
        if(overflow())
        {
            System.out.println("Queue is full");
        }
        else
        {
            last++;
            queue[last] = x;
        }
    }

    static void delete()
    {
        if(underflow())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            first++;
        }
    }

    static boolean overflow()
    {
        if(last>=5)
        {
            return true;
        }
        else
            return false;
    }

    static boolean underflow()
    {
        if(first==last)
        {
            return true;
        }
        else
            return false;
    }

    static void print()
    {
        if(underflow())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("The queue is :- ");
            for(int i=first+1;i<5;i++)
            {
                System.out.print(queue[i]+" ");
            }
        }
    }

    public static void main(String[] args)
    {

        insert(12);
        insert(45);
        insert(0);
        insert(13);
        insert(23);

        delete();
        delete();

        print();
    }
}
