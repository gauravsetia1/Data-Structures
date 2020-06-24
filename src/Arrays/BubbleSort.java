package Arrays;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[])
    {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements :-");
        for(int i=0;i<5;i++)
        {
            a[i]  = sc.nextInt();
        }

        bubbleSort(a);
    }

    public static void bubbleSort(int a[])
    {
        int temp =0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
