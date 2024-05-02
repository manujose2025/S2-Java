import java.util.Scanner;

class Lab2_Pgm2
{
	public static void main(String args[])
	{
		System.out.println("\n****************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 14/03/2024");
		System.out.println("Lab Cycle : 2");
		System.out.println("Program   : Search an element in an array.");
		System.out.println("****************************************************************************************************\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("\nEnter the integer value into the array : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nThe given array is : ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(arr[i] + "\t");
		}
		
		System.out.print("\n\nEnter the integer value to be searched in the array : ");
		int val = sc.nextInt();
		
		boolean rslt = checkVal(arr, val);
		
		if (rslt == true)
			System.out.println("\nThe value " + val + " is present in the array.");
		else
			System.out.println("\nThe value " + val + " is not present in the array.");	
	}
	
	public static boolean checkVal(int arr[], int val)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == val)
				return true;
		}
		
		return false;
	}
}
