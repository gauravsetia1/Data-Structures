package Arrays;

public class CircularQueue
{
    static int size=5;
    static int queue[] = new int[size];
    static int first=-1,last=-1;

    static void insert(int x)
    {
        if(overflow())
        {
            System.out.println("Queue is full");
        }
        else
        {
            if(first==-1)
            {
                first=0;
                last =0;
                queue[last] = x;
            }
            if(last == size-1 && first != 0)
            {
                last=0;
                queue[last] = x;
            }
            else
            {
                last++;
                queue[last] = x;
            }
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
            if(first==last)
            {
                first=last=-1;
            }
            if(first==size-1)
            {
                first=0;
            }
            else
            {
                first++;
            }
        }
    }

    static boolean overflow()
    {
        if((first == 0 && last == size-1) || (last == (first-1)%(size-1)))
        {
            return true;
        }
        else
            return false;
    }

    static boolean underflow()
    {
        if(first==-1)
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
            System.out.println("\nThe queue is :- ");
            for(int i=first;i<last;i++)
            {
                System.out.print(queue[i]+" ");
            }
        }
    }

    public static void main(String[] args)
    {

        insert(40);
        insert(50);
        insert(60);
        insert(70);
        insert(80);


        print();
    }
}
