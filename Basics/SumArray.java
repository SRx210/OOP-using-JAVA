import java.util.Scanner;

public class SumArray
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n, sum = 0, avg = 0;
		
		
		System.out.println("Enter size of array: ");
		n = s.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter element " + (i + 1) + ": ");
			arr[i] = s.nextInt();
		}
		
		System.out.println("Array is: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Avg = " + (sum/n));
	}
}