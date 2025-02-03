import java.util.Scanner;
public class Operations
{
	Scanner scanner = new Scanner(System.in);
	void add(int a, int b)
	{
		int sum = a+b;
		System.out.println("Sum = " +sum);
	}
	void diff(int a, int b)
	{
		int differ = a-b;
		System.out.println("Difference = " +differ);
	}
	void multi(int a, int b)
	{
		int prod = a*b;
		System.out.println("Product = " +prod);
	}
	void division(int a, int b)
	{
		int div = a/b;
		System.out.println("Division = " +div);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Divison");
		System.out.print("Choose your choice: ");
		int choice = scanner.nextInt();

		Operations arithmetic = new Operations();

		switch (choice)
		{
			case 1:
				arithmetic.add(num1, num2);
				break;

			case 2:
				arithmetic.diff(num1, num2);
				break;

			case 3:
				arithmetic.multi(num1, num2);
				break;
		
			case 4:
				arithmetic.division(num1, num2);
				break;
			
			default:
				System.out.println("Invalid Choice");
				break;
		}
		
		scanner.close();
		arithmetic.scanner.close();
	}
}
				
		


		