import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //task 1
        //task1();

        //task2
//        System.out.println();
//        try
//        {
//            System.out.println("3! = "+silnia(3));
//            System.out.println("6! = "+silnia(6));
//            System.out.println("9! = "+silnia(9));
//        }
//        catch(silniaException x)
//        {
//            System.out.println("Error : "+ x.getMessage());
//        }

        //task3
        try
        {
            Adres adresNEW = new Adres("Pokątna", "35-211","Rzeszów", -12);
        }
        catch(adresException e)
        {
            System.out.println("Zły adres!, "+e.getMessage());
        }
        try
        {
            Adres adresNEW = new Adres(null, "64-988",null, 37);
        }
        catch(adresException e)
        {
            System.out.println("Zły adres!, "+e.getMessage());
        }
        try
        {
            Adres adresNEW = new Adres("Lwowska", "36-131",null, 193);
        }
        catch(adresException e)
        {
            System.out.println("Zły adres!, "+e.getMessage());
        }
    }


    //====================== TASK 1 ==================
    public static void task1()
    {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        float number = 0;

        while(true)
        {
            try
            {
                number = input.nextFloat();
                break;
            }
            catch (InputMismatchException x)
            {
                System.out.print("Podaj poprawna liczbe!: ");
                input.next();
            }
        }
        if(number <0)
        {
            throw new IllegalArgumentException("Pierwiastek z liczby "+number+" nie istnieje");
        }
        System.out.printf("Pierwiastek z %.4f = %.4f",number,Math.sqrt(number));
    }


    //====================== TASK 2 - EXCEPTION CREATOR ==================
    public static int silnia(int n) throws silniaException
    {
        if(n<0)
        {
            throw new silniaException("silnie liczmy z >0");
        }
        int result = 1;
        for(int i=2; i<n; i++)
        {
            result *= i;
        }
        return result;
    }

    static class silniaException extends Exception
    {
        public silniaException(String message)
        {
            super(message);
        }
    }


    //====================== TASK 3 ==================
    static class adresException extends Exception
    {
        public adresException(String message)
        {
            super(message);
        }
    }

    static class Adres
    {
        String ulica, kodPocztowy, miasto;
        int nrDomu;

        public Adres(String ulica, String kodPocztowy, String miasto, int nrDomu) throws adresException
        {
            String error = "";
            if (ulica == null) error += "Ulica nie może być null,";
            if (kodPocztowy == null) error += "Kod pocztowy nie może być null,";
            if (miasto == null) error += "Miasto nie może być null,";
            if (nrDomu <= 0) error += "Nr domu nie może być mniejszy od zera,";
            if (!error.equals("")) throw new adresException(error);
        }
    }
}
