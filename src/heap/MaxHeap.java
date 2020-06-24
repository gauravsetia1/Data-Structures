package heap;

import java.util.Scanner;

public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    public MaxHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos)
    {
        return (2 * pos);
    }
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos)
    {
        if (pos >= (size / 2) && pos <= size)
            return true;
        return false;
    }

            private void swap(int fpos, int spos)
            {
                int tmp;
                tmp = Heap[fpos];
                Heap[fpos] = Heap[spos];
                Heap[spos] = tmp;
            }

            private void maxHeapify(int pos)
            {
                if (isLeaf(pos))
                    return;

                if (Heap[pos] < Heap[leftChild(pos)] ||
                        Heap[pos] < Heap[rightChild(pos)])
                {
                    if (Heap[leftChild(pos)] > Heap[rightChild(pos)])
                    {
                        swap(pos, leftChild(pos));
                        maxHeapify(leftChild(pos));
                    }
                    else
                    {
                        swap(pos, rightChild(pos));
                        maxHeapify(rightChild(pos));
                    }
                }
            }

            public void insert(int element)
            {
                Heap[++size] = element;

                int current = size;
                while (Heap[current] > Heap[parent(current)])
                {
                    swap(current, parent(current));
                    current = parent(current);
                }
            }

            public void print()
            {
                for (int i = 1; i <= size; i++)
                {
                    System.out.print(Heap[i] + " ");
                }
            }
            public static void main(String[] arg)
            {
                System.out.println("The Max Heap is ");
                MaxHeap maxHeap = new MaxHeap(15);
                maxHeap.insert(1);
                maxHeap.insert(3);
                maxHeap.insert(5);
                maxHeap.insert(4);
                maxHeap.insert(6);
                maxHeap.insert(13);
                maxHeap.insert(10);
                maxHeap.insert(9);
                maxHeap.insert(8);
                maxHeap.insert(15);
                maxHeap.insert(17);


                maxHeap.print();
            }
}
