import java.util.Scanner;

class Sports
{
    String sport;
    int Rating;

    Sports(String spo, int ra)
    {
        sport = spo;
        Rating = ra;
    }

}
class Students extends Sports
{
    String Grade;
    double Overall_per;

    Students(String spo, int ra,String gd, double per )
    {
        super(spo, ra);
        Grade = gd;
        Overall_per = per;
    }
}
class Result extends Students 
{
    Result(String spo, int ra,String gd, double per )
    {
        super(spo, ra, gd, per);
    }

    void display()
    {
        System.out.println("\n***Sports Details of Student****");
        System.out.println("No. of Sport items participated : " + sport);
        System.out.println("Rating : " + Rating);
        System.out.println("\n***Academic Details of Student***");
        System.out.println("Academic Grade : " + Grade);
        System.out.println("Overall percentage : " + Overall_per + "%");
    }
    
    public static void main(String[] args) 
    {
        System.out.println("\n******************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/06/2024");
		System.out.println("Lab Cycle : 3");
		System.out.println("Program   : Create classes Student and Sports. Create another class Result inherited from Student and Sports.\n\t    Display the academic and sports score of a student.");
		System.out.println("******************************************************************************************************************\n");

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter Sports Details of Student");
        System.out.print("No. of Sport items participated : ");
        String a =sc.next();
        System.out.print("Sport Rating  out of 10 : ");
        int b =sc.nextInt();
        System.out.println("\nEnter Academic Details of Student");
        System.out.print("Academic Grade : ");
        String c =sc.next();
        System.out.print("Overall percentage : ");
        double d =sc.nextDouble();
        sc.close();
        Result obj= new Result(a,b,c,d);
        obj.display();
    }
}
