import java.util.Scanner;

import arithmetic.*;

class Lab4_Pgm2
{
	public static void main(String[] args)
	{
	
		System.out.println("\n***************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 15/04/2024");
		System.out.println("Lab Cycle : 4");
		System.out.println("Program   : Create an Arithmetic package that has classes and interfaces for the 4 basic arithmetic operations.\n\t    Test the package by implementing all operations on two given numbers.");
		System.out.println("***************************************************************************************************************");
	
		Scanner sc = new Scanner(System.in);
		int choice = 0, d_type = 0;
		
		do
		{
			System.out.println("\n1. Addition of two numbers.\n2. Subtraction of two numbers.\n3. Multiplication of two numbers.\n4. Division of two numbers\n5. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch( choice )
			{
				case 1:
				{
					System.out.println("\nYou have selected \"Addition of two numbers\".");
					
					System.out.println("Enter the data type that you want to use.");
					System.out.println("1. Integer\n2. Float\n3. Double\n4. String");
					System.out.print("Enter your choice : ");
					d_type = sc.nextInt();
					
					Add a = new Add();
					
					switch( d_type )
					{
						case 1:
						{
							System.out.print("Enter the 1st integer value : ");
							int no1 = sc.nextInt();
					
							System.out.print("Enter the 2nd integer value : ");
							int no2 = sc.nextInt();
							
							System.out.println("The sum of '" + no1 + "' and '" + no2 + "' is '" + a.add(no1, no2) + "'.");
							
							break;
						}
						case 2:
						{
							System.out.print("Enter the 1st float value : ");
							float no1 = sc.nextFloat();
					
							System.out.print("Enter the 2nd float value : ");
							float no2 = sc.nextFloat();
							
							System.out.println("The sum of '" + no1 + "' and '" + no2 + "' is '" + a.add(no1, no2) + "'.");
							
							break;
						}
						case 3:
						{
							System.out.print("Enter the 1st double value : ");
							double no1 = sc.nextDouble();
					
							System.out.print("Enter the 2nd float value : ");
							double no2 = sc.nextDouble();
							
							System.out.println("The sum of '" + no1 + "' and '" + no2 + "' is '" + a.add(no1, no2) + "'.");
							
							break;
						}
						case 4:
						{
							System.out.print("Enter the 1st String : ");
							String no1 = sc.nextLine();
					
							System.out.print("Enter the 2nd String : ");
							String no2 = sc.nextLine();
							
							System.out.println("The sum of '" + no1 + "' and '" + no2 + "' is '" + a.add(no1, no2) + "'.");
							
							sc.nextLine();
							
							break;
						}
						default:
						{
							System.out.println("\nYou have entered the wrong choice. Please try again.");
						}
					}
					
					break; 
				}
				case 2:
				{
					System.out.println("\nYou have selected \"Subtraction of two numbers\".");
					
					System.out.println("Enter the data type that you want to use.");
					System.out.println("1. Integer\n2. Float\n3. Double");
					System.out.print("Enter your choice : ");
					d_type = sc.nextInt();
					
					Subtract s = new Subtract();
					
					switch( d_type )
					{
						case 1:
						{
							System.out.print("Enter the 1st integer value : ");
							int no1 = sc.nextInt();
					
							System.out.print("Enter the 2nd integer value : ");
							int no2 = sc.nextInt();
							
							System.out.println("The difference of '" + no1 + "' and '" + no2 + "' is '" + s.sub(no1, no2) + "'.");
							
							break;
						}
						case 2:
						{
							System.out.print("Enter the 1st float value : ");
							float no1 = sc.nextFloat();
					
							System.out.print("Enter the 2nd float value : ");
							float no2 = sc.nextFloat();
							
							System.out.println("The difference of '" + no1 + "' and '" + no2 + "' is '" + s.sub(no1, no2) + "'.");
							
							break;
						}
						case 3:
						{
							System.out.print("Enter the 1st double value : ");
							double no1 = sc.nextDouble();
					
							System.out.print("Enter the 2nd float value : ");
							double no2 = sc.nextDouble();
							
							System.out.println("The difference of '" + no1 + "' and '" + no2 + "' is '" + s.sub(no1, no2) + "'.");
							
							break;
						}
						default:
						{
							System.out.println("\nYou have entered the wrong choice. Please try again.");
						}
					}
					
					break; 
				}
				case 3:
				{
					System.out.println("\nYou have selected \"Multiplication of two numbers\".");
					
					System.out.println("Enter the data type that you want to use.");
					System.out.println("1. Integer\n2. Float\n3. Double");
					System.out.print("Enter your choice : ");
					d_type = sc.nextInt();
					
					Multiply m = new Multiply();
					
					switch( d_type )
					{
						case 1:
						{
							System.out.print("Enter the 1st integer value : ");
							int no1 = sc.nextInt();
					
							System.out.print("Enter the 2nd integer value : ");
							int no2 = sc.nextInt();
							
							System.out.println("The product of '" + no1 + "' and '" + no2 + "' is '" + m.multi(no1, no2) + "'.");
							
							break;
						}
						case 2:
						{
							System.out.print("Enter the 1st float value : ");
							float no1 = sc.nextFloat();
					
							System.out.print("Enter the 2nd float value : ");
							float no2 = sc.nextFloat();
							
							System.out.println("The product of '" + no1 + "' and '" + no2 + "' is '" + m.multi(no1, no2) + "'.");
							
							break;
						}
						case 3:
						{
							System.out.print("Enter the 1st double value : ");
							double no1 = sc.nextDouble();
					
							System.out.print("Enter the 2nd float value : ");
							double no2 = sc.nextDouble();
							
							System.out.println("The product of '" + no1 + "' and '" + no2 + "' is '" + m.multi(no1, no2) + "'.");
							
							break;
						}
						default:
						{
							System.out.println("\nYou have entered the wrong choice. Please try again.");
						}
					}
					
					break; 
				}
				case 4:
				{
					System.out.println("\nYou have selected \"Division of two numbers\".");
					
					System.out.println("Enter the data type that you want to use.");
					System.out.println("1. Integer\n2. Float\n3. Double");
					System.out.print("Enter your choice : ");
					d_type = sc.nextInt();
					
					Divide d = new Divide();
					
					switch( d_type )
					{
						case 1:
						{
							System.out.print("Enter the 1st integer value : ");
							int no1 = sc.nextInt();
					
							System.out.print("Enter the 2nd integer value : ");
							int no2 = sc.nextInt();
							
							System.out.println("The quotient of '" + no1 + "' and '" + no2 + "' is '" + d.div(no1, no2) + "'.");
							
							break;
						}
						case 2:
						{
							System.out.print("Enter the 1st float value : ");
							float no1 = sc.nextFloat();
					
							System.out.print("Enter the 2nd float value : ");
							float no2 = sc.nextFloat();
							
							System.out.println("The quotient of '" + no1 + "' and '" + no2 + "' is '" + d.div(no1, no2) + "'.");
							
							break;
						}
						case 3:
						{
							System.out.print("Enter the 1st double value : ");
							double no1 = sc.nextDouble();
					
							System.out.print("Enter the 2nd float value : ");
							double no2 = sc.nextDouble();
							
							System.out.println("The quotient of '" + no1 + "' and '" + no2 + "' is '" + d.div(no1, no2) + "'.");
							
							break;
						}
						default:
						{
							System.out.println("\nYou have entered the wrong choice. Please try again.");
						}
					}
					
					break;
				}
				case 5:
				{
					System.out.println("Exiting now... The Program has ended.");
					break;
				}
				default:
				{
					System.out.println("\nYou have entered the wrong choice. Please try again.");
				}
			}
		}while( choice != 5 );

		sc.close();
	}
}
