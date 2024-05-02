import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

class Lab4_Pgm7
{
    public static void main(String[] args)
    {
        System.out.println("\n**********************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 25/04/2024");
		System.out.println("Lab Cycle : 4");
		System.out.println("Program   : Write a Java program to compare two hash set.");
		System.out.println("**********************************************************\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("<<<<<<<Set Comparsion>>>>>>>\n");

        Set<String> set1 = new LinkedHashSet<String>();

        System.out.print("Enter the number of items to be inserted into the Set1 : ");
        int no = sc.nextInt();

        System.out.println("Enter the items to be inserted into Set1 : ");
        sc.nextLine();
        for(int i=0; i<no; i++)
        {
            set1.add(sc.nextLine());
        }

        Set<String> set2 = new LinkedHashSet<String>();

        System.out.print("\nEnter the number of items to be inserted into the Set2 : ");
        no = sc.nextInt();

        System.out.println("Enter the items to be inserted into Set2 : ");
        sc.nextLine();
        for(int i=0; i<no; i++)
        {
            set2.add(sc.nextLine());
        }

        System.out.println("\nThe given sets are...");
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);

        System.out.println("\nComparing the sets Set1 and Set2...");
        if(set1.equals(set2))
            System.out.println("Result : Set1 and Set2 are the same.");
        else
            System.out.println("Result : Set1 and Set2 are not the same.");

        System.out.println("\nProgram has ended.");

        sc.close();
    }
}