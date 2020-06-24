package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements :-");
        for(int i=0;i<5;i++)
        {
            a[i]  = sc.nextInt();
        }

        System.out.println("Enter key");
        int key=sc.nextInt();

        System.out.println("index = " + linearSearch(a,key) );
    }

    public static int linearSearch(int a[],int key)
    {
        /*for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }*/
        int c=0;
        for(int i : a)
        {
            c++;
            if(i==key)
            {
                return c-1;
            }
        }
        return -1;

    }
}
