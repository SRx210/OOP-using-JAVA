// Write a Java program to test two arrays' equality.

import java.util.Scanner;

public class Equality
{
    static boolean similar(int[] arr1, int[] arr2, int n)
    {
        int count = 0;
        for(int i = 0; i < arr1.length; i++)
        {
            if(arr1[i] == arr2[i])
            {
                count++;
            }
        }
        if(count == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size of array 1: ");
        int n1 = s.nextInt();
        int[] arr1 = new int[n1];

        System.out.print("Enter size of array 2: ");
        int n2 = s.nextInt();
        int[] arr2 = new int[n2];

        if(n1 != n2)
        {
            System.out.println("The sizes of both the arrays should be same!!");
            return;
        }
        int n = n1;

        System.out.println("\nEnter values for array 1: ");
        for(int i = 0; i < n1; i++)
        {
            System.out.print("Enter element " +(i+1)+ ": ");
            arr1[i] = s.nextInt();
        }

        System.out.println("\nEnter values for array 2: ");
        for(int i = 0; i < n2; i++)
        {
            System.out.print("Enter element " +(i+1)+ ": ");
            arr2[i] = s.nextInt();
        }

        boolean check = similar(arr1, arr2, n);

        if(check)
        {
            System.out.println("The Two Arrays are Equal");
        }
        else
        {
            System.out.println("The Two Arrays are Unequal");
        }
    }
}
