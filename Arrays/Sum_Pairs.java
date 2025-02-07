//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

public class Sum_Pairs
{
    static void sum_pairs(int[] arr, int val)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == val)
                {
                    System.out.println("{" + arr[i] + ", " + arr[j] + "}");
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = {3, 4, 7, 0, 1, 2, 5};
        int val = 7;
        
        sum_pairs(arr, val);
    }
}
