import java.util.Scanner;
public class Vowel
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String input = scanner.next();
		char a = input.charAt(0);
		scanner.close();

		if(a == 'A'|| a== 'E'||a == 'I'||a == 'O'||a == 'U'||a == 'a'||a == 'e'||a == 'i'||a == 'o'||a == 'u')
		{
			System.out.println("Entered character "+ a +" is a vowel");
		}
		else
		{
			System.out.println("Entered character "+ a +" is a consonant");
		}
	}
}
