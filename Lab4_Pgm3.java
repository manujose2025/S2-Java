import java.util.Scanner;

class InvalidPasswordException extends Exception
{
    int checkValue;

    InvalidPasswordException(int value)
    {
        checkValue = value;
    }

    String error()
    {
        switch(checkValue)
        {
            case 1:
                return "There should be atleast 8 characters.";
            case 2:
                return "Password should not go beyond 15 characters.";
            case 3:
                return "There should be atleast 1 uppercase letter. (A-Z)";
            case 4:
                return "There should be atleast 1 lowercase letter. (a-z)";
            case 5:
                return "There should be atleast 1 digit. (0-9)";
            case 6:
                return "There should be atleast anyone of these characters. (!, @, #, $, %, &, * are allowed)";
            case 7:
                return "Backspace is not allowed";
            default:
                return "No exception";
        }
    }
}

class PasswordValidator
{
    void validate(String pswd) throws InvalidPasswordException
    {
        if(pswd.length() < 8)
            throw new InvalidPasswordException(1);

        if(pswd.length() > 15)
            throw new InvalidPasswordException(2);
        
/*
        if(true)
        {
            int count = 0;
            //char c;
            String s;

            for(int i = 97; i <= 122; i++)
            {
                s = i + "";

                if(pswd.contains(s))
                {
                    count = count + 1;
                    break;
                }
            }

            if(count == 0)
                throw new InvalidPasswordException(3);
        }

        if(true)
        {
            int count = 0;
            //char c;
            String s;

            for(int i = 97; i <= 122; i++)
            {
                s = Integer.toString(i);

                if(pswd.contains(s))
                {
                    count++;
                    break;
                }
            }

            if(count == 0)
                throw new InvalidPasswordException(4);
        }

        if(true)
        {
            int count = 0;
            String s;

            for(int i = 0; i <= 9; i++)
            {
                s = i + "";

                if(pswd.contains(s))
                {
                    count++;
                    break;
                }
            }

            if(count == 0)
                throw new InvalidPasswordException(5);
        }
*/
//      The above commented code will only work if the IDE supports ASCII.

        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;

        for(char c : pswd.toCharArray())
        {
            if(Character.isUpperCase(c))
                isUpper = true;
            else if(Character.isLowerCase(c))
                isLower = true;
            else if(Character.isDigit(c))
                isDigit = true;
        }

        if(isUpper == false)
            throw new InvalidPasswordException(3);
        if(isLower == false)
            throw new InvalidPasswordException(4);
        if(isDigit == false)
            throw new InvalidPasswordException(5);

        if(!(pswd.contains("!") || pswd.contains("@") || pswd.contains("#") || pswd.contains("$") || pswd.contains("%") || pswd.contains("&") || pswd.contains("*")))
            throw new InvalidPasswordException(6);

        if(pswd.contains(" "))
            throw new InvalidPasswordException(7);
    }
}

public class Lab4_Pgm3
{
    public static void main(String[] args)
    {
        System.out.println("\n********************************************************************************************");
		System.out.println("Name      : Manu Jose");
		System.out.println("Roll No.  : 41");
		System.out.println("Class     : S2 MCA");
		System.out.println("Date      : 24/04/2024");
		System.out.println("Lab Cycle : 4");
		System.out.println("Program   : Write a user defined exception class to authenticate the user name and password.");
		System.out.println("********************************************************************************************\n");

        System.out.println("-----Password Validator-----\n");
        System.out.println("The following creteria must be fulfilled:");
        System.out.println("1. Password must contain minimum 8 characters.");
        System.out.println("2. Password must contain maximum 15 characters.");
        System.out.println("3. Password must contain atleast 1 uppercase letter. (A-Z)");
        System.out.println("4. Password must contain atleast 1 lowercase letter.  (a-z)");
        System.out.println("5. Password must contain atleast 1 digit letter. (0-9)");
        System.out.println("6. Password must contain a special character characters. (!, @, #, $, %, &, * are allowed)");
        System.out.println("7. Password must not contain a space.");
        
        Scanner sc = new Scanner(System.in);

        boolean isValid = false;
        int cond = 0;

        do
        {
            try
            {
                System.out.print("\nEnter your password : ");
                String pswd = sc.nextLine();

                PasswordValidator pv = new PasswordValidator();
                pv.validate(pswd);
                System.out.println("The password satisfies all the creteria and hence it is valid.");
                isValid = true;
            }
            catch(InvalidPasswordException e)
            {
                System.out.println("Error : " + e.error());
                System.out.println("Please try again!");
                System.out.print("Enter 5 to exit or any other number to retry : ");
                cond = sc.nextInt();
                sc.nextLine();
            }
        }while((!isValid) || (cond == 5));

        sc.close();
    }    
}
