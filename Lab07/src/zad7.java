import java.util.Scanner;

public class zad7
{
    public static void main(String[] args)
    {
        System.out.print("Enter number A: ");
        int a = inputIn();
        System.out.print("Enter number B: ");
        int b = inputIn();

        try
        {
            int result = divide(a,b);
        }
        catch (divisionByZero x)
        {
            System.out.println("Error: "+x.getMessage());
        }
    }

    //Tworzymy klasę wyjątek dzielenia
    public static class divisionByZero extends Exception
    {
        public divisionByZero()
        {
            super("cannot be divided by 0!");
        }
    }

    public static int divide(int a, int b) throws divisionByZero
    {
        if(a==0 || b==0)
        {
            throw new divisionByZero();
        }
        return (a/b);
    }

    public static int inputIn()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
