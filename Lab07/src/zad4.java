import java.util.InputMismatchException;
import java.util.Scanner;

public class zad4
{
    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        Scanner inputIn = new Scanner(System.in);
        double number = 0;

        while(true)
        {
            try
            {
                //co mamy sprawdzic, łapiemy dane z klawiatury
                number = inputIn.nextInt();
                //jezeli nie ma to breakujemy while
                break;
            }
            catch(InputMismatchException x)
            {
                //i co robi w momencie błędu
                System.out.print("Enter the correct number:");
                inputIn.next();
            }
        }
        if(number<0)
        {
            throw new InputMismatchException("The square root of a negative number does not exist!");
        }
        System.out.println("number: "+number+",pierwiastek: "+Math.sqrt(number));
    }
}
