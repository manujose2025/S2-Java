import java.util.Scanner;

class Lab1_Pgm1
{
	public static void main(String args[])
	{
		System.out.println("\n**************************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 13/02/2024");
		System.out.println("Lab Cycle : 1");
		System.out.println("Program   : Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price");
		System.out.println("**************************************************************************************************************************\n");
		
/*		Product p1 = new Product(101, "Nestle Maggi", 74);
		p1.display();
		Product p2 = new Product(102, "Sunfeast Yippi", 79);
		p2.display();
		Product p3 = new Product(103, "Nissin Top Ramen", 80);
		p3.display();
*/
		
		Product p1 = new Product();
		System.out.println("Enter the details of the 1st Product : ");
		p1.getData();
		Product p2 = new Product();
		System.out.println("\nEnter the details of the 2nd Product : ");
		p2.getData();
		Product p3 = new Product();
		System.out.println("\nEnter the details of the 3rd Product : ");
		p3.getData();
		
		System.out.println("\nThe products are as following : \n");
		p1.display();
		p2.display();
		p3.display();
		
		if((p1.price < p2.price) && (p1.price < p3.price))
			System.out.println("\n" + p1.pname + " has the least price than " + p2.pname + " & " + p3.pname);
		else if((p2.price < p1.price) && (p2.price < p3.price))
			System.out.println("\n" + p2.pname + " has the least price than " + p1.pname + " & " + p3.pname);
		else
			System.out.println("\n" + p3.pname + " has the least price than " + p1.pname + " & " + p2.pname);
			
	}
}

class Product
{
	int pcode;
	String pname;
	float price;
	
/*	Product(int code, String name, float cost)
	{
		pcode = code;
		pname = name;
		price = cost;
	} 
*/
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Product Code : ");
		pcode = sc.nextInt();
		
		sc.nextLine();
		
/*		System.out.print("Product Code : ");
		pcode = Integer.parseInt(sc.nextLine());*/
		
		System.out.print("Product Name : ");
		pname = sc.nextLine();
		
		System.out.print("Price : ");
		price = sc.nextFloat();	
	}
	
	void display()
	{
		System.out.println("Product Name : " + pname + "\tProduct Code : " + pcode + "\tPrice : " + price);
	}
}
