import java.util.*;

class Lab1_Pgm2
{
	public static void main(String[] args)
	{
		System.out.println("\n**************************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 13/02/2024");
		System.out.println("Lab Cycle : 1");
		System.out.println("Program   : Read 2 matrices from the console and perform matrix addition");
		System.out.println("**************************************************************************************************************************\n");
		
		Scanner sc = new Scanner(System.in);
		
/*		System.out.print("Enter the row size of the 1st matrix : ");
		int row1 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the row size of the 1st matrix : ");
		int col1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter the row size of the 2nd matrix : ");
		int row2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the row size of the 2nd matrix : ");
		int col2 = sc.nextInt();
		sc.nextLine();
*/

		System.out.println("Enter the row & column size of the 1st Matrix : ");
		int row1 = Integer.parseInt(sc.next());
		int col1 = Integer.parseInt(sc.next());
		
		System.out.println("Enter the row & column size of the 2nd Matrix : ");
		int row2 = Integer.parseInt(sc.next());
		int col2 = Integer.parseInt(sc.next());
		
		
		if((row1 == row2) && (col1 == col2))
		{
			int[][] matrix1 = new int[row1][col1];
			System.out.println("Enter the values of the 1st Matrix : ");
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col1; j++)
				{
					matrix1[i][j] = Integer.parseInt(sc.next());
				}
			}
			
			int[][] matrix2 = new int[row2][col2];
			System.out.println("Enter the values of the 2nd Matrix : ");
			for(int i=0; i<row2; i++)
			{
				for(int j=0; j<col2; j++)
				{
					matrix2[i][j] = Integer.parseInt(sc.next());
				}
			}
			
			
			System.out.println("\nThe 1st Matrix is : ");
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col1; j++)
				{
					System.out.print(matrix1[i][j] + "\t");
				}
				System.out.println();
			}
			
			System.out.println("The 2nd Matrix is : ");
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col1; j++)
				{
					System.out.print(matrix2[i][j] + "\t");
				}
				System.out.println();
			}
			
			
			System.out.println("The added Matrix is : ");
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col1; j++)
				{
					System.out.print(matrix1[i][j] + matrix2[i][j]);
					System.out.print("\t");
				}
				System.out.println();
			}
			
		}
		
	}
}
