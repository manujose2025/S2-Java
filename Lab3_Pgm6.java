import java.util.Scanner;

interface Prototype
{
    double area();
    double perimeter();
}

class Circle implements Prototype
{
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    public double area()
    {
        double area = 3.14 * (radius * radius);
        return area;
    }

    public double perimeter()
    {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }
}

class Rectangle implements Prototype
{
    double length;
    double breadth;

    Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }

    public double area()
    {
        double area = length * breadth;
        return area;
    }

    public double perimeter()
    {
        double perimeter = 2 * ( length + breadth);
        return perimeter;
    }
}

class Lab3_Pgm6
{
    public static void main(String[] args)
    {
        System.out.println("\n******************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 01/06/2024");
		System.out.println("Lab Cycle : 3");
		System.out.println("Program   : Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle\n\t    and Rectangle which implements the above interface. Create a menu driven program to find area and\n\t    perimeter of objects.");
		System.out.println("******************************************************************************************************************\n");

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while( choice != 3 )
        {
            System.out.println("Enter your choice from below given options:-\n");
            System.out.println("1. Area & Perimeter of Circle\n2. Area & Perimeter Rectangle\n3. Exit");
            System.out.print("\nEnter your choice : ");
            choice = sc.nextInt();
            
            switch( choice )
            {
                case 1:
                    System.out.println("\n***You have selected 'Area & Perimeter of Circle'***\n");
                    System.out.print("Enter the radius of Circle : ");
                    double rad = sc.nextDouble();

                    Circle c = new Circle(rad);

                    System.out.println("\nThe Area and Perimeter of the Circle with radius '" + rad + "' is '" + c.area() + "' and '" + c.perimeter() + "' respectively.\n");

                    System.out.println("***Choice Completed.***\n");

                    break;
                case 2:
                    System.out.println("\n***You have selected 'Area & Perimeter Rectangle'***\n");

                    System.out.print("Enter the length of the Rectangle : ");
                    double l = sc.nextDouble();

                    System.out.print("Enter the breadth of the Rectangle : ");
                    double b = sc.nextDouble();

                    Rectangle r = new Rectangle(l, b);

                    System.out.println("\nThe Area and Perimeter of the Rectangle with length '" + l + "' & breadth '" + b + "' is '" + r.area() + "' and '" + r.perimeter() + "' respectively.\n");

                    System.out.println("***Choice Completed.***\n");

                    break;
                case 3:
                    System.out.println("\n***You have selected 'Exit'***\n");

                    break;
                default:
                    System.out.println("\n***Invalid choice. Please try again!***\n");
            }
        }

        System.out.println("Exiting the program... The program has ended!\n");

        sc.close();
    }
}
