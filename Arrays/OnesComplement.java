import java.lang.invoke.ConstantCallSite;
import java.util.Scanner;

public class OnesComplement
{
    static void compute_1s_complement(String binary)
    {
        String onescompl = "";
        for(int i = 0; i < binary.length(); i++)
        {
            char bit = binary.charAt(i);
            if(bit == '0')
            {
                onescompl += '1';
            }
            else if(bit == '1')
            {
                onescompl += '0';
            }
            else
            {
                System.out.print("Invalid Input");
            }
        }
        System.out.print("1's Complement = " + onescompl);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String bin = s.nextLine();

        compute_1s_complement(bin);
    }
}
