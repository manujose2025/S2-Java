import java.util.Scanner;

class Lab2_Pgm3
{
	public static void main(String[] args)
	{
		System.out.println("\n*********************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/04/2024");
		System.out.println("Lab Cycle : 2");
		System.out.println("Program   : Perform string manipulations.");
		System.out.println("*********************************************************************************************************\n");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String str1 = sc.nextLine();
		
		System.out.println("The length of the string " + str1 + " is " + str1.length());
		
		System.out.print("Enter a string to be added to 1st string : ");
		String str2 = sc.nextLine();
		
		System.out.println("The string \"" + str1 + "\" and \"" + str2 + "\" together becomes \""  + str1.concat(str2) + "\"");

		System.out.print("Enter a string : ");
		String str3 = sc.nextLine();

		System.out.println("The given string in uppercase : " + str3.toUpperCase());
		System.out.println("The given string in lowercase : " + str3.toLowerCase());

		System.out.println("The first 5 letters in the given string : " + str3.substring(0,5));
		System.out.println("The last 5 letters in the given string : " + str3.substring(str3.length() - 6, str3.length()));
		System.out.println("The letters from 5th position to last in the given string : " + str3.substring(4));

		System.out.print("Splitting the given string into two : ");
		String str4[] = str3.split("\\s", str3.length());
		System.out.println("1) " + str4[0] + " 2) " + str4[1]);
		
		System.out.print("Enter the word to be checked in the given string : ");
		String chk = sc.nextLine();

		if(str3.contains(chk))
			System.out.println("The word \"" + chk + "\" is present in the given string \"" + str3 + "\"");
		else
			System.out.println("The word \"" + chk + "\" is not present in the given string \"" + str3 + "\"");

		System.out.println("Replacing all the letter \"l\" with the letter \"i\" : \"" + str3.replaceAll("l", "i") + "\"");
		System.out.println("Replacing all the word \"Hello\" with the letter \"Ola\" : \"" + str3.replaceAll("Hello", "Ola") + "\"");

		System.out.print("Checking if the concatenated result of str1 & str2 is equal to str3 : ");

		if(str3.equals(str1.concat(str2)))
			System.out.println("Yes, they are equal!");
		else
			System.out.println("No, they are not equal!");

		System.out.println("Program has ended!");
	}
}
