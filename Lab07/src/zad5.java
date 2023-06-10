import java.util.InputMismatchException;
import java.util.Scanner;

public class zad5
{
    public static void main(String[] args)
    {
        System.out.print("Enter an INT: ");
        int number = inputInt();

        System.out.print("Enter a DOUBLE: ");
        double number2 = inputDouble();

        System.out.print("Enter a FLOAT: ");
        float number3 = inputFloat();

        System.out.print("Enter a STRING: ");
        String inputUser = inputString();
    }

    //  ======================= INT SECTION ===================
    public static int inputInt()
    {
        Scanner inputIn = new Scanner(System.in);
        int number;

        while(true)
        {
            try
            {
                number = inputIn.nextInt();
                break;
            }
            catch(InputMismatchException x)
            {
                System.out.print("Enter the correct INT number:");
                inputIn.next();
            }
        }
        return number;
    }

    //  ======================= DOUBLE SECTION ===================
    public static double inputDouble()
    {
       Scanner inputIn = new Scanner(System.in);
       double number;

       while (true)
       {
           try
           {
               number = inputIn.nextDouble();
               break;
           }
           catch (InputMismatchException x)
           {
               System.out.print("Enter the correct DOUBLE number: ");
               inputIn.next();
           }
       }
       return number;
    }

    //  ======================= FLOAT SECTION ===================
    public static float inputFloat()
    {
        Scanner inputIn = new Scanner(System.in);
        float number;

        while (true)
        {
            try
            {
                number = inputIn.nextFloat();
                break;
            }
            catch (InputMismatchException x)
            {
                System.out.print("Enter the correct FLOAT number: ");
                inputIn.next();
            }
        }
        return number;
    }

    //  ======================= STRING SECTION ===================
    public static String inputString()
    {
       Scanner inputIn = new Scanner(System.in);
       String inputUser;

       while (true)
       {
           try
           {
               inputUser = inputIn.next();
               break;
           }
           catch (InputMismatchException x)
           {
               System.out.print("Enter the correct STRING format: ");
               inputIn.next();
           }
       }
       return inputUser;
    }

}
