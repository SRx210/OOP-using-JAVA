// Write a Java Program to compute sum & average of the array
import java.util.Scanner;

public class SumAvg
{
    static void sum_array(int[] arr, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        int avg = sum / n;

        System.out.println("\nThe Sum = " + sum);
        System.out.println("The Average = " + avg);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        sum_array(arr, n);
    }
}