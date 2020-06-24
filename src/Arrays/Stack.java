package Arrays;

public class Stack
{
    static int top = -1;
    static final int MAX = 10;
    static int arr[] = new int[MAX];

    public static void push(int x)
    {
        if(overflow())
        {
            System.out.println("Stack is full");
        }
        else
        {
            top++;
            arr[top] = x;
        }
    }

    static int pop()
    {
        if(underflow())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else
        {
            int temp  = arr[top];
            top--;
            return temp;

        }
    }

    static boolean overflow()
    {
        if(top>=MAX)
        {
            return true;
        }
        else
            return false;
    }

    static boolean underflow()
    {
        if(top<0)
        {
            return true;
        }
        else
            return false;
    }

    static int peak()
    {
        return arr[top];
    }

    public static void main(String[] args)
    {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();


        System.out.println(pop());
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println();

        System.out.println(peak());

        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
