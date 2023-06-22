import java.util.Scanner;

public class inputs
{
    //zwykłe scannery
    public static String inputString()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    //scannery z wiadomościa, tj. podaj...
    public static String inputStringMessage(String message)
    {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static int inputIntMessage(String message)
    {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static double inputDoubleMessage(String message)
    {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
}
