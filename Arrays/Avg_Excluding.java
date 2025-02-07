/*Write a Java program to compute the average value of an array of integers except the largest and smallest values. */

class Avg_Excluding {
    static int compute_avg(int[] arr)
    {
        int large = arr[0];
        int small = arr[0];
        int sum = 0, large_idx = 0, small_idx = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(large < arr[i])
            {
                large = arr[i];
                large_idx = i;
            }
            else if(small > arr[i])
            {
                small = arr[i];
                small_idx = i;
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        
        sum = sum - arr[large_idx] - arr[small_idx];
        int avg = sum / (arr.length - 2);
        
        return avg;
    }
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5};
        
        int avg = compute_avg(arr);
        
        System.out.println("Average (excluding largest and smallest) = "+avg);
    }
}