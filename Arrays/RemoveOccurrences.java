// Java Array Program to Remove All Occurrences of an Element in an Array
import java.util.Scanner;

public class RemoveOccurrences {
    static void remove(int[] arr, int key)
    {
        int new_idx = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != key)
            {
                arr[new_idx++] = arr[i];
            }
        }
        for(int i = 0; i < new_idx; i++)
        {
           System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 50, 10};
        int key = 10;
        remove(arr, key);
    }

}
