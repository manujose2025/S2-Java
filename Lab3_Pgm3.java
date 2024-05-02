import java.util.Scanner;

class Person
{
	String name;
	char gender;
	String address;
	int age;
	
	Person(String name, char gender, String addr, int age)
	{
		this.name = name;
		this.gender = gender;
		address = addr;
		this.age = age;
	}
}

class Emp extends Person
{
	int empid;
	String cmpy_name;
	String quali;
	double salary;
	
	Emp(String name, char gender, String addr, int age, int eid, String cname, String quali, double slry)
	{
		super(name, gender, addr, age);
		empid = eid;
		cmpy_name = cname;
		this.quali = quali;
		salary = slry;
	}
}

class Teacherr extends Emp
{
	String subject;
	String department;
	int teacherID;
	
	Teacherr(String name, char gender, String addr, int age, int eid, String cname, String quali, double slry, String sub, String dept, int tid)
	{
		super(name, gender, addr, age, eid, cname, quali, slry);
		subject = sub;
		department = dept;
		teacherID = tid;
	}
	
	void display()
	{
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Teacher ID    : " + teacherID);
		System.out.println("Name          : " + super.name);
		System.out.println("Gender        : " + super.gender);
		System.out.println("Age           : " + super.age);
		System.out.println("Address       : " + super.address);
		System.out.println("Department    : " + department);
		System.out.println("Subject       : " + subject);
		System.out.println("Employee ID   : " + super.empid);
		System.out.println("Company Name  : " + super.cmpy_name);
		System.out.println("Qualification : " + super.quali);
		System.out.println("Salary        : " + super.salary);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n******************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/06/2024");
		System.out.println("Lab Cycle : 3");
		System.out.println("Program   : Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor to initialize\n\t    the data members and another class ‘Employee’ that inherits the properties of class Person and also\n\t    contains its own data members like Empid, Company_name, Qualification, Salary and its own constructor.\n\t    Create another class ‘Teacher’ that inherits the properties of class Employee and contains its own\n\t    data members like Subject, Department, Teacherid and also contain constructors and methods to display\n\t    the data members. Use array of objects to display details of N teachers.");
		System.out.println("******************************************************************************************************************\n");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of records that needs to be entered : ");
		int n = sc.nextInt();
		
		String name, addr, cname, quali, sub, dept;
		char gen;
		int eid, age, tid;
		double salry;
		
		Teacherr t[] = new Teacherr[n];
		
		System.out.println("\n\nEnter the details " + n + " of the teacher...");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print("\nTeacher ID : ");
			tid = sc.nextInt();
			
			System.out.print("Age : ");
			age = sc.nextInt();
			
			System.out.print("Employee ID : ");
			eid = sc.nextInt();
			
			System.out.print("Salary : ");
			salry = sc.nextDouble();
			
			System.out.print("Gender(M/F/O) : ");
			gen = sc.next().charAt(0);
			
			sc.nextLine();
			
			System.out.print("Name : ");
			name = sc.nextLine();
			
			System.out.print("Subjects Taught : ");
			sub = sc.nextLine();
			
			System.out.print("Qualification : ");
			quali = sc.nextLine();
			
			System.out.print("Department : ");
			dept = sc.nextLine();
			
			System.out.print("Address : ");
			addr = sc.nextLine();
			
			System.out.print("Company Name : ");
			cname = sc.nextLine();
			
			t[i] = new Teacherr(name, gen, addr, age, eid, cname, quali, salry, sub, dept, tid); 
			
		}
		
		System.out.println("\n\nDetails of the Teachers are...\n");
		
		for(int i = 0; i < n; i++)
		{
			t[i].display(); 
			System.out.println();
		}
	
	}
}
