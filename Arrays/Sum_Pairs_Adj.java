//Write a Java program to find all "Adjacent" pairs of elements in an array whose sum is equal to a specified number.

public class Sum_Pairs_Adj
{
    static void sum_pairs(int[] arr, int val)
    {
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i-1] + arr[i] == val)
            {
                System.out.println("{" + arr[i-1] + ", " + arr[i] + "}");
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