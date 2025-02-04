public class Max_Min_In_Array {
    static void max_min_element(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            else if(min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Max Element in Array = " + max);
        System.out.println("Min Element in Array = " + min);
    }

    public static void main(String[] args)
    {
        int[] arr = {6, 4, 2, 10, 8};
        max_min_element(arr);
    }
}
