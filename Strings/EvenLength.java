import java.util.Scanner;

public class EvenLength
{
	static void find_even_strings(String data)
	{
		String[] w = data.split(" ");
		int[] len = new int[w.length];
		
		for(int i = 0; i < len.length; i++)
		{
			len[i] = w[i].length();
		}
		
		for(int i = 0; i < len.length; i++)
		{
			if((len[i] % 2) == 0)
			{
				System.out.println(w[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string: ");
		String data = s.nextLine();
		
		find_even_strings(data);
	}
}