package Sorting;

import java.util.Scanner;

public class Selection
{
        void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
            {
                int index = i;
                for (int j = i+1; j < n; j++)
                    if (arr[j] < arr[index])
                        index = j;

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }

        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();
        }

        public static void main(String args[])
        {
            Selection ob = new Selection();
            System.out.println("Enter array");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            ob.printArray(arr);
            ob.sort(arr);
            System.out.println("Sorted array");
            ob.printArray(arr);
        }
}
