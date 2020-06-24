package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static void bubbleSort(int a[]) {
        int temp = 0;
        for (int i = 0; i < a.length-1; i++)
        {
            for (int j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int a[],int key,int start,int end)
    {
        if(end>=start)
        {
            int mid = (start+end)/2;
            if(a[mid]==key)
                return mid;
            if(a[mid]>key)
                return binarySearch(a,key,start,mid-1);
            return binarySearch(a,key,mid+1,end);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements :-");
        for(int i=0;i<10;i++)
        {
            a[i]  = sc.nextInt();
        }
        bubbleSort(a);

        System.out.println("Enter key");
        int key=sc.nextInt();

        System.out.println(binarySearch(a,key,0,a.length-1));
    }
}
