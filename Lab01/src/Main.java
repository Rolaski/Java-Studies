import java.util.*;
public class Main
{
    public static void main(String[] args)      //psvm <- skrót
    {
        //Tworzymy różnego rodzaju zmienne//
        int xyz;
        final int max=23; // stała wartość bez możliwości zmiany
        short l1;
        long l2;
        float a1 = 2.123F;
        char znak = 'a';
        String tekst;
        boolean b1;
        var wyn = 11+12;

        //ZADANIE 1
        System.out.println("Imie: "+ Name());
        System.out.println("Wiek: "+ Age());


        //ZADANIE 2
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj a: ");
        float a = klawiatura.nextFloat();
        System.out.print("Podaj b: ");
        float b = klawiatura.nextFloat();
        TwoDigits(a,b);

        //ZADANIE 3
        System.out.println("Czy liczba jest parzysta? : "+CzyParzysta(a));

        //ZADANIE 4
        System.out.println("Czy jest podzielna przez 3 i 5?: "+CzyPodzielna(a));

        //ZADANIE 5
        System.out.println("Potega liczby a: "+Potega3(a));

        //ZADANIE 6
        System.out.println("Pierwiastek z liczby a: "+Pierwiastek(a));

        //ZADANIE 7
        int p1,p2;
        Random losowanie = new Random();
        System.out.print("Podaj poczatek przedzialu: ");
        p1 = klawiatura.nextInt();
        System.out.print("Podaj koniec przedzialu: ");
        p2 = klawiatura.nextInt();

        int przedzial = Math.abs(p2-p1);
        int randomA = losowanie.nextInt(przedzial) +p1;
        int randomB = losowanie.nextInt(przedzial) +p1;
        int randomC = losowanie.nextInt(przedzial) +p1;
        System.out.println(randomA+" "+randomB+" "+randomC);
        System.out.println(Trojkat(randomA, randomB, randomC));

    }







    //ZADANIE 1
    public static String Name()
    {
        return "Jakub";
    }
    public static int Age()
    {
        return 20;
    }

    //ZADANIE 2
    public static void TwoDigits(float a, float b)
    {
        System.out.println("Suma to: "+a+" + "+b+" = "+(a+b));
        System.out.println("Różnica to: "+a+" - "+b+" = "+(a-b));
        System.out.println("Iloczyn to: "+a+" * "+b+" = "+(a*b));
    }

    //ZADANIE 3
    public static boolean CzyParzysta(float a)
    {
        if(a%2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //ZADANIE 4
    public static boolean CzyPodzielna(float a)
    {
        if(a%5 == 0 && a%3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //ZADANIE 5
    public static double Potega3(float a)
    {
        double potega3 = Math.pow(a,3);
        return potega3;
    }

    //ZADANIE 6
    public static double Pierwiastek(float a)
    {
        double pierwiastek = Math.sqrt(a);
        return pierwiastek;
    }

    //ZADANIE 7
    public static boolean Trojkat(int a, int b, int c)
    {
        if(a+b > c && a+c > b && b+c > a)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}