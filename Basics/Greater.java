import java.util.Scanner;
public class Greater
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = scanner.nextInt();
		System.out.print("Enter second number: ");
		int b = scanner.nextInt();
		System.out.print("Enter third number: ");
		int c = scanner.nextInt();
		scanner.close();
		
		if((a < b) && (a < c))
		{
			System.out.println("\n"+a+" is minimum");
		}
		else if ((b < a) && (b < c))
		{
			System.out.println("\n"+b+" is minimum");
		}
		else
		{
			System.out.println("\n"+c+" is minimum");
		}
	}
}