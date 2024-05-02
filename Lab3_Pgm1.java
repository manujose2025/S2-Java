import java.util.Scanner;

class Lab3_Pgm1
{	
	public static void main(String[] args)
	{
		System.out.println("\n*********************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/04/2024");
		System.out.println("Lab Cycle : 3");
		System.out.println("Program   : Area of different shapes using overloaded functions.");
		System.out.println("*********************************************************************************************************\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle (double value) : ");
		double r = sc.nextDouble();
		areaCalc(r);
		
		System.out.print("\nEnter the length of the square (int value) : ");
		int l = sc.nextInt();
		areaCalc(l);
		
		
		System.out.print("\nEnter the length & breadth of the rectangle (int values) : ");
		l = sc.nextInt();
		int b = sc.nextInt();
		areaCalc(l, b);
		
		System.out.print("\nEnter the length & height of the triangle (float values) : ");
		float le = sc.nextFloat();
		float h = sc.nextFloat();
		areaCalc(le, h);
		
		System.out.println("\nThe program has ended!");

		sc.close();
	}
	
	public static void areaCalc(double r)
	{
		double area = 3.14 * (r * r);
		System.out.println("Area of the circle : " + area);
	}
	
	public static void areaCalc(int l)
	{
		int area = l * l;
		System.out.println("Area of the square : " + area);
	}
	
	public static void areaCalc(int l, int b)
	{
		int area = l * b;
		System.out.println("Area of the rectangle/square : " + area);
	}	
	
	public static void areaCalc(float l, float h)
	{
		float area = ( l * h ) / 2;
		System.out.println("Area of the triangle : " + area);
	}
}
