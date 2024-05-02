import java.util.Scanner;

interface Calc
{
    void calc();
}

class Products
{
    int prod_id, qty;
    String name;
    double unit_pr, total;

    Products(int pr_id, String nm, int qty, double pr)
    {
        prod_id = pr_id;
        name = nm;
        this.qty = qty;
        unit_pr = pr;
        total = qty * pr;
    }

    Products()
    {
        prod_id = 0;
        name = "";
        qty = 0;
        unit_pr = 0;
        total = 0;
    }

    void getData()
    {
        Scanner sca = new Scanner(System.in);
        
        System.out.print("\nEnter the Product ID : ");
        prod_id = sca.nextInt();
        sca.nextLine();

        System.out.print("Enter the Product Name : ");
        name = sca.nextLine();
        
        System.out.print("Enter the Product Quantity : ");
        qty = sca.nextInt();

        System.out.print("Enter the Product Unit Price : ");
        unit_pr = sca.nextDouble();

        total = qty * unit_pr;
    }
}

class Orders implements Calc
{
    int order_no;
    String date;
    Products p[] = new Products[10];
    double net_amt;

    Orders(int ono, String dt, Products[] p1)
    {
        order_no = ono;
        date = dt;
        p = p1;
        net_amt = 0;
    }

    public void calc()
    {
        
        for(int i=0; p[i] != null; i++)
        {
            net_amt = net_amt + p[i].total;
        }

    }

    void printBill()
    {
        System.out.println("\n\n**********************************************************Bill*********************************************************");
        System.out.println("\nOrder No. : " + order_no);
        System.out.println("\nDate : " + date);
        System.out.println("\nProduct ID\t\tName\t\tQuantity\t\tUnit Price\t\tTotal");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        for(int i=0; p[i] != null; i++)
        {
            System.out.println("    " + p[i].prod_id + "\t\t\t " + p[i].name + "\t\t   " + p[i].qty + "\t\t\t  " + p[i].unit_pr + "\t\t\t" + p[i].total);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.print("\t\t\t\t\t\t\t\tNet Amount\t\t" + net_amt);
        System.out.println("\n\n***********************************************************End*********************************************************");
    }    
}

class Lab3_Pgm7
{
    public static void main(String[] args)
    {
        System.out.println("\n******************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/08/2024");
		System.out.println("Lab Cycle : 3");
		System.out.println("Program   : Prepare bill with the given format using calculate method from interface.");
		System.out.println("******************************************************************************************************************\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Order ID : ");
        int ord_id = sc.nextInt();

        sc.nextLine();

        System.out.print("\nEnter the date of the order (DD MMM YYYY) : ");
        String dt = sc.nextLine();
        System.out.println();

        int count = 0, choice = 0;

        Products p[] = new Products[10];

        while(( count < 10 ) && ( choice != 2))
        {
            System.out.println("1. Add items into the order. (Maximum 10 items).\n2. Exit.");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch( choice )
            {
                case 1:
                    p[count] = new Products();
                    p[count].getData();
                    count++;
                    System.out.println("\nTotal number of items in the order : " + count + "\n");
                    break;
                case 2:
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again!");
            }
        }

        Orders ord = new Orders(ord_id, dt, p);

        ord.calc();
        ord.printBill();

        sc.close();
    }
}