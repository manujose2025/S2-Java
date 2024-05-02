import java.util.Scanner;

class Employee
{
	int empid;
	String name;
	double sal;
	String addr;
	
	Employee(int id, String nm, double sal, String addr)
	{
		empid = id;
		name = nm;
		this.sal = sal;
		this.addr = addr; 
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/06/2024");
		System.out.println("Lab Cycle : 3");
		System.out.println("Program   : Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to\n\t    initialize the data members. Create another class ‘Teacher’ that inherit the properties of class\n\t    employee and contain its own data members department, Subjects taught and constructors to\n\t    initialize these data members and also include display function to display all the data members.\n\t    Use array of objects to display details of N teachers.");
		System.out.println("************************************************************************************************************\n");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of records that needs to be entered : ");
		int n = sc.nextInt();
		
		int eid;
		String name;
		double salry;
		String addr;
		String subs;
		
		Teacher t[] = new Teacher[n];
		
		System.out.println("\n\nEnter the details of the teacher...");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("\nID : ");
			eid = sc.nextInt();
			
			//sc.nextLine();
			
			System.out.print("Name : ");
			name = sc.nextLine();
			
			System.out.print("Salary : ");
			salry = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("Address : ");
			addr = sc.nextLine();
			
			System.out.print("Subjects Taught : ");
			subs = sc.nextLine();
			
			t[i] = new Teacher(eid, name, salry, addr, subs); 
			
		}
		
		System.out.println("\n\nDetails of the Teachers are...\n");
		
		for(int i = 0; i < n; i++)
		{
			t[i].display(); 
			System.out.println();
		}
		
	
	}
}

class Teacher extends Employee
{
	String subjects;
	
	Teacher(int id, String nm, double sal, String addr, String sub)
	{
		super(id, nm, sal, addr);
		subjects = sub;
	}
	
	void display()
	{
		System.out.println("Employee ID : " + super.empid + " || Name : " + super.name + " || Salaray : " + super.sal + " || Address : " + super.addr + " || Subjects : " + subjects);
	}
	
}
