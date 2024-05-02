import java.util.Scanner;

class NegIntEnterException extends Exception
{
    String error()
    {
        return "NegativeIntegerEnteredException!";
    }
}

class Lab4_Pgm4
{
    public static void main(String[] args)
    {
        System.out.println("\n**************************************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 24/04/2024");
		System.out.println("Lab Cycle : 4");
		System.out.println("Program   : Find the average of N positive integers, raising a user defined exception for each negative input.");
		System.out.println("**************************************************************************************************************\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit : ");
        int limit = sc.nextInt();

        int arr[] = new int[limit];
        int sum = 0;
        float avg = 0;

        System.out.println("Enter the values : ");
        try
        {
            for(int i = 0; i < limit; i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i] < 0)
                    throw new NegIntEnterException();
                sum += arr[i];
            }

            avg = (float) sum / limit;
            System.out.println("Average : " + avg);
        }
        catch(NegIntEnterException ne)
        {
            System.out.println(ne.error());
            System.out.println("Negative value is not allowed.");
        }

        sc.close();
    }
}