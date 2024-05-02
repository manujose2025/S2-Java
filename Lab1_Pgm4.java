import java.util.*;

class Sym_Matrix
{
	public static void main(String[] args)
	{
		System.out.println("\n**************************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 14/02/2024");
		System.out.println("Lab Cycle : 1");
		System.out.println("Program   : Read a matrix from the console and check whether it is symmetric or not.");
		System.out.println("*****************************************************************************************************************************");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the number of rows and columns for your matrix : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		if(row == col)
		{
			int[][] mat = new int[row][col];
			
			System.out.println("\nEnter the values into your matrix : ");
			
			for(int i = 0; i < row; i++)
				for(int j = 0; j < col; j++)
					mat[i][j] = sc.nextInt();
					
			System.out.println("\nThe given matrix is : ");
			
			for(int i = 0; i < row; i++)
			{
				for(int j = 0; j < col; j++)
				{
					System.out.print(mat[i][j] + "\t");
				}
				System.out.println();
			}
			
			int flag = 0;
			
			System.out.println("\nThe Transpose of the given matrix is : ");
			
			for(int i = 0; i < row; i++)
			{
				for(int j = 0; j < col; j++)
				{
					System.out.print(mat[j][i] + "\t");
					if(mat[i][j] != mat[j][i])
						flag = 1;

				}
				System.out.println();
			}
			
			if(flag == 1)
				System.out.println("\nSince the given matrix is not equal to its transpose, the given matrix is not a Symmetric matrix! Terminating the program...\n");
			else
				System.out.println("\nSince the given matrix is equal to its transpose, the given matrix is a Symmetric matrix! Terminating the program...\n");	
		}
		else
		{
			System.out.println("The given matrix is not a square matrix! Terminating the program...\n");
		}	
	}
}

