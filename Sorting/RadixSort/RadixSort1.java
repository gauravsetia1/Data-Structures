package Sorting.RadixSort;

import java.util.Scanner;

public class RadixSort1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:-");
        int n = sc.nextInt();
        System.out.println("Enter elements:-");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }


    }
}
