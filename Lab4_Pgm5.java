import java.util.Scanner;
import java.util.LinkedList;

class Lab4_Pgm5
{
    public static void main(String[] args)
    {
        System.out.println("\n******************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 25/04/2024");
		System.out.println("Lab Cycle : 4");
		System.out.println("Program   : Program to remove all the elements from a linked list.");
		System.out.println("******************************************************************\n");

        Scanner sc = new Scanner(System.in);
        int choice, ind;
        String data;

        LinkedList<String> list = new LinkedList<String>();

        System.out.println("<<<<<<<Linked List Operations>>>>>>>\n");

        do
        {
            System.out.println("1. Add data");
            System.out.println("2. Delete all data");
            System.out.println("3. Delete specific data");
            System.out.println("4. Delete data at index");
            System.out.println("5. Display list");
            System.out.println("6. Exit");

            System.out.print("Enter your choice of operation : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("\nEnter the data to be added to the list : ");
                    sc.nextLine();
                    data = sc.nextLine();
                    list.add(data);
                    System.out.println("Data " + data + " has been added to the list.\n");
                    break;
                case 2:
                    System.out.println("\nDeleting all the data in the list....");
                    list.clear();
                    System.out.println("All the data in the list has been deleted.\n");
                    break;
                case 3:
                    System.out.print("\nEnter the data to be deleted from the list : ");
                    sc.nextLine();
                    data = sc.nextLine();
                    if(!list.contains(data))
                    {
                        System.out.println("The data " + data + " doesn't exist in the list.\n");
                        break;
                    }
                    list.remove(data);
                    System.out.println("Data " + data + " has been removed from the list.\n");
                    break;
                case 4:
                    {
                        try
                        {
                            System.out.print("\nEnter the index from which data has to be deleted from the list : ");
                            ind = sc.nextInt();
                            System.out.println("Data " + list.get(ind-1) + " has been removed from index " + ind + " of the list.\n");
                            list.remove(ind-1);
                            break;
                        }
                        catch(IndexOutOfBoundsException e)
                        {
                            System.out.println("Invalid list index. Please try again!\n");
                            break;
                        }
                    }
                case 5:
                    System.out.println("\nThe list contains : " + list + "\n");
                    break;
                case 6:
                    System.out.println("\nExiting the program...\n");
                    break;
                default:
                    System.out.println("\nEnter the wrong choice. Please try again!\n");
            }

        }while(choice != 6);

        sc.close();
    }
}