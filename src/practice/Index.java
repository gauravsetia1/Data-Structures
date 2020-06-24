package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Index
{
    private static int GetMaxDistance(int[] a)
    {
        int max = -2;

        for (int p = 0; p < a.length; p++)
        {
            for (int q = 0; q < a.length; q++)
            {
                boolean isAdjacent = true;

                for (int i = 0; i < a.length; i++)
                {
                    if ((a[i] > a[p] && a[i] < a[q]) || (a[i] < a[p] && a[i] > a[q]))
                    {
                        isAdjacent = false;
                        break;
                    }
                }

                if (isAdjacent)
                {
                    int distance = a[p] - a[q];

                    if (distance < max)
                    {
                        max = distance;
                    }
                }
            }
        }

        return max;
    }

    // Driver program
    public static void main (String[] args)
    {
        int[] A = new int[8];
        A[0] = 0;
        A[1] = 3;
        A[2] = 3;
        A[3] = 7;
        A[4] = 5;
        A[5] = 3;
        A[6] = 11;
        A[7] = 1;

        System.out.println(GetMaxDistance(A));
    }
}
