// Write a Java program to find the number of even and odd integers in a given array of integers
import java.util.Scanner;

public class Odd_Even
{
    static void count_ev_od(int[] arr)
    {
        int even = 0, odd = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("\nTotal Odd Integers = " + odd);
        System.out.println("Total Even Integers = " + even);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter element " +(i+1)+ ": ");
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        count_ev_od(arr);
    }
}
