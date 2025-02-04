public class Print_Sub_Arrays
{
    static void sub_arrays(int[] arr)
    {
        for(int start = 0; start < arr.length; start++)
        {
            for(int end = start; end < arr.length; end++)
            {
                System.out.print("[");
                for(int k = start; k <= end; k++)
                {
                    System.out.print(arr[k]);
                    if(k < end)
                    {
                        System.out.print(", ");
                    }
                }
                System.out.print("]\n");
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5};
        sub_arrays(arr);
    }
}
