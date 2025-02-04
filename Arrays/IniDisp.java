// Write a java program to initalize and display the array taking user inputs
import java.util.Scanner;

public class IniDisp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        // Initialzing the array
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        // Displaying The Array
        for(int i : arr)
        {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}