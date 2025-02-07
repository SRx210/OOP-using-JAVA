// Write a basic Java program to find whether an array is sorted or not

public class IsSorted {
    static boolean check_sorted(int[] arr)
    {
        int count = 0;
        for(int i = 0; i < (arr.length - 1); i++)
        {
            if(arr[i] > arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        if(check_sorted(arr))
        {
            System.out.println("Array is sorted");
        }
        else
        {
            System.out.println("Array is not sorted");
        }
    }
}
