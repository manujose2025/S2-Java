import java.util.Scanner;
import java.util.Stack;

class Lab4_Pgm6
{
    public static void main(String[] args)
    {
        System.out.println("\n************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 25/04/2024");
		System.out.println("Lab Cycle : 4");
		System.out.println("Program   : Program to remove an object from the Stack when the position is passed as parameter.");
		System.out.println("************************************************************************************************\n");

        Scanner sc = new Scanner(System.in);
        int choice, ind;
        String data;

        Stack<String> st = new Stack<String>();

        System.out.println("<<<<<<<Stack Operations>>>>>>>\n");

        do
        {
            System.out.println("1. Add data");
            System.out.println("2. Delete data at index");
            System.out.println("3. Display list");
            System.out.println("4. Exit");

            System.out.print("Enter your choice of operation : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("\nEnter the data to be added to the stack : ");
                    sc.nextLine();
                    data = sc.nextLine();
                    st.add(data);
                    System.out.println("Data " + data + " has been added to the stack.\n");
                    break;
                case 2:
                    {
                        try
                        {
                            System.out.print("\nEnter the index from which data has to be deleted from the stack : ");
                            ind = sc.nextInt();
                            System.out.println("Data " + st.get(ind-1) + " has been removed from index " + ind + " of the stack.\n");
                            st.remove(ind-1);
                            break;
                        }
                        catch(IndexOutOfBoundsException e)
                        {
                            System.out.println("Invalid stack index. Please try again!\n");
                            break;
                        }
                    }
                case 3:
                    System.out.println("\nThe stack contains : " + st + "\n");
                    break;
                case 4:
                    System.out.println("\nExiting the program...\n");
                    break;
                default:
                    System.out.println("\nEnter the wrong choice. Please try again!\n");
            }

        }while(choice != 4);

        sc.close();
    }
}