import java.util.Scanner;

public class XOR
{
	static void compute_xor(String bin1, String bin2)
	{
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < bin1.length(); i++)
		{
			char ch1 = bin1.charAt(i);
			char ch2 = bin2.charAt(i);
			if(ch1 == ch2)
			{
				res.append('0');
			}
			else
			{
				res.append('1');
			}
		}
		System.out.println("Result: " + res.toString());
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a first binary number: ");
		String bin1 = s.nextLine();
		
		System.out.println("Enter a second binary number: ");
		String bin2 = s.nextLine();
		
		compute_xor(bin1, bin2);
	}
}