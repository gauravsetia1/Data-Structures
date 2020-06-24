package Arrays;

public class EvenOdd
{
    public static void main(String[] args)
    {
        int arr[] ={1,9,6,3,4,10,7,13};

        int e=3;
        int o=5;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length-1;j++)
            {
                int temp=0;
                if(arr[i]%2==0)
                {
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
