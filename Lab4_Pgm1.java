import java.util.Scanner;

/*
import area.figures.Rectangle;
import area.figures.Triangle;
import area.figures.Circle;
import area.figures.Square;
*/

import area.figures.*;

class Lab4_Pgm1
{
	public static void main(String[] args)
	{
	
		System.out.println("\n*************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 15/04/2024");
		System.out.println("Lab Cycle : 4");
		System.out.println("Program   : Create a Graphics package that has classes and interfaces for figures Rectangle, Triangle, Square\n\t    and Circle. Test the package by finding the area of these figures.");
		System.out.println("*************************************************************************************************************");
	
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do
		{
			System.out.println("\n1. Area of Rectangle\n2. Area of Triangle\n3. Area of Square\n4. Area of Circle\n5. Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch( choice )
			{
				case 1:
				{
					System.out.println("\nYou have selected \"Area of Rectangle\"");
				
					System.out.print("Enter the length of the Rectangle : ");
					float l = sc.nextFloat();
					
					System.out.print("Enter the breadth of the Rectangle : ");
					float b = sc.nextFloat();
					
					Rectangle r = new Rectangle(l, b);
					
					System.out.println("Area of Rectangle with length '" + l + "' and breadth '" + b + "' is '" + r.area() + "'");
					
					break; 
				}
				case 2:
				{
					System.out.println("\nYou have selected \"Area of Triangle\"");
				
					System.out.print("Enter the breath of the Triangle : ");
					float b = sc.nextFloat();
					
					System.out.print("Enter the height of the Triangle : ");
					float h = sc.nextFloat();
					
					Triangle t = new Triangle(b, h);
					
					System.out.println("Area of Triangle with breadth '" + b + "' and height '" + h + "' is '" + t.area() + "'");
					
					break; 
				}
				case 3:
				{
					System.out.println("\nYou have selected \"Area of Square\"");
				
					System.out.print("Enter the length of the Square : ");
					float l = sc.nextFloat();
					
					Square s = new Square(l);
					
					System.out.println("Area of Square with length '" + l + "' is '" + s.area() + "'");
					
					break; 
				}
				case 4:
				{
					System.out.println("\nYou have selected \"Area of Circle\"");
				
					System.out.print("Enter the radius of the Circle : ");
					float r = sc.nextFloat();
					
					Circle c = new Circle(r);
					
					System.out.println("Area of Circle with radius '" + r + "' is '" + c.area() + "'");
					
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
	}
}
