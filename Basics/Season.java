import java.util.Scanner;
public class Season
{
	void summer()
	{
		System.out.println("Its Summer\n");
	}
	void autumn()
	{
		System.out.println("Its Autumn\n");
	}
	void monsoon()
	{
		System.out.println("Its Monsoon\n");
	}
	void winter()
	{
		System.out.println("Its Winter\n");
	}
	public static void main(String[] args)
	{
		Season sea = new Season();
		Scanner s = new Scanner(System.in);
		char a;
		do{
		System.out.println("1. March - May");
		System.out.println("2. June - September");
		System.out.println("3. October - November");
		System.out.println("4. November - February");
		System.out.print("Enter your choice: ");
		int choice = s.nextInt();
		
		switch (choice)
		{
			case 1:
				sea.summer();
				break;
		
			case 2:
				sea.monsoon();
				break;
		
			case 3:
				sea.autumn();
				break;
		
			case 4:	
				sea.winter();
				break;

			default:
				System.out.println("Invalid Choice");
				break;
		}

		s.nextLine();

		System.out.print("Do you want to continue? (y/n): ");
		a = s.nextLine().trim().toUpperCase().charAt(0);

		}while(a == 'Y');
		
		s.close();
	}
}
																							