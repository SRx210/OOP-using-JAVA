import java.util.Scanner;

public class AddString
{
	static String add_string(String data, String insert_data, int idx)
	{
		String res = "";
		for(int i = 0; i < data.length(); i++)
		{
			res += data.charAt(i);
			if(i == idx)
			{
				res += insert_data;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter original data: ");
		String data = s.nextLine();
		
		System.out.print("Enter text to be inserted: ");
		String insert_data = s.nextLine();
		
		System.out.print("Enter index to which text needs to be inserted: ");
		int idx = s.nextInt();
		
		String res = add_string(data, insert_data, idx);
		System.out.println("Result: " + res);
	}
}