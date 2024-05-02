import java.util.*;

class Lab1_Pgm3
{
	public static void main(String[] args)
	{
		System.out.println("\n**************************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 14/02/2024");
		System.out.println("Lab Cycle : 1");
		System.out.println("Program   : Add complex numbers");
		System.out.println("*****************************************************************************************************************************");
		
		int real, img;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the the real and imaginary part of a Complex number : ");
		real = sc.nextInt();
		img = sc.nextInt();
		
		Complex c1 = new Complex(real, img);
		
		System.out.print("\nEnter the the real and imaginary part of a Complex number : ");
		real = sc.nextInt();
		img = sc.nextInt();
		
		Complex c2 = new Complex(real, img);
		
		Complex c3 = new Complex();
		
		c3.real = c1.real + c2.real;
		c3.img = c1.img + c2.img;
		
		System.out.println("\n" + c1.real + "+" + c1.img + "i + " + c2.real + "+" + c2.img + "i = " + c3.real + "+" + c3.img + "i");
		
	}
}

class Complex
{
	int real, img;
	
	Complex()
	{
		real = 0;
		img = 0;
	}
	
	Complex(int real, int img)
	{
		this.real = real;
		this.img = img;
	}
	
}
