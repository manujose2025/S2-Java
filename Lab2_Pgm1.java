import java.util.Scanner;
import java.util.Arrays;

class Lab2_Pgm1
{
	public static void main(String[] args)
	{
		System.out.println("\n****************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 14/03/2024");
		System.out.println("Lab Cycle : 2");
		System.out.println("Program   : Program to Sort strings.");
		System.out.println("****************************************************************************************************\n");
		
		String val;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the string value to be sorted : ");
		val = sc.nextLine();
		
		String opt = stringSort(val);
		
		System.out.println("The sorted value of string \"" + val + "\" is \"" + opt + "\"");
	}
	
	public static String stringSort(String val)
	{
		char arr[] = val.toCharArray();
		Arrays.sort(arr);
		String rslt = new String(arr);
		return rslt;
	}
}
