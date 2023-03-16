import java.util.Scanner;

public class zad1
{
    public static void main(String[] args)
    {
        Trojmian();
    }

    public static void Trojmian()
    {
        System.out.print("Podaj a: ");
        double a = Liczby();
        System.out.print("Podaj b: ");
        double b = Liczby();
        System.out.print("Podaj c: ");
        double c = Liczby();

        if(a!=0)
        {
            double delta = Delta(a,b,c);
            if(delta<0)
            {
                System.out.println("Brak rozwiazan!");
            }
            else if(delta == 0)
            {
                System.out.println("Jedno rozwiazanie: "+DeltaZero(a,b,c));
            }
            else
            {
                DeltaDwa(a,b,c,delta);
            }
        }
    }

    public static double Liczby()
    {
        Scanner input = new Scanner(System.in);
        double liczba = input.nextDouble();
        return liczba;
    }

    public static double Delta(double a, double b, double c)
    {
        return Math.pow(b,2)-4*a*c;
    }

    public static double DeltaZero(double a, double b, double c)
    {
        double wyn = ((-b)/2*a);
        return wyn;
    }

    public static void DeltaDwa(double a, double b, double c, double delta)
    {
        double wyn1 = (-b-Math.sqrt(delta))/(2*a);
        double wyn2 = (-b+Math.sqrt(delta))/(2*a);
        System.out.format("Dwa miejsca zerowe: %f i %f",wyn1,wyn2);
    }
}
