import java.util.Scanner;

class Lab2_Pgm4
{
	public static void main(String[] args)
	{
		System.out.println("\n*********************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/04/2024");
		System.out.println("Lab Cycle : 2");
		System.out.println("Program   : Program to create a class for Employee having attributes eNo, eName eSalary. Read n employee \n\t    information and Search for an employee given eNo, using the concept of Array of Objects.");
		System.out.println("*********************************************************************************************************\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees whose details that you want to enter : ");
		int n = sc.nextInt();
		
		Employee emp[] = new Employee[n];
		int eno;
		String ename;
		float esal;
		
		System.out.println("\nEnter the details of the employees..\n");
		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter the employee number : "); 
			eno = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter the employee name : "); 
			ename = sc.nextLine();
			
			System.out.print("Enter the employee salary : "); 
			esal = sc.nextFloat();	
			
			emp[i] = new Employee(eno, ename, esal);
			
			System.out.println();
		}
		
		System.out.println("The details of employees are...");
		
		for(int i=0; i<n; i++)
		{
			emp[i].disp();
			System.out.println();	
		}
		
		System.out.println();
		
		System.out.print("Enter the employee number of the employee that you want to search : ");
		eno = sc.nextInt();
		
		int flag = 0;
		
		for(int i=0; i<n; i++)
		{
			if(emp[i].eNo == eno)
			{
				System.out.println("\nThe employee is present and the details are...");
				emp[i].disp();
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
			System.out.println("\nThe employee is not present.");
			
		System.out.println("\n\nThe program has ended!");
	} 
}

class Employee
{
	int eNo;
	String eName;
	float eSalary;
	
	Employee(int eno, String ename, float esal)
	{
		eNo = eno;
		eName = ename;
		eSalary = esal;
	}
	
	void disp()
	{
		System.out.print("Employee Number : " + eNo + " || Employee Name : " + eName + " || Employee Salary : " + eSalary); 
	}
}
