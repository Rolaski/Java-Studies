import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args)
    {
        Kalkulator();
    }


                    //SEKCJA GŁÓWNA -> MÓZG
    public static void Kalkulator()
    {
        //cyfry do
        double a = Liczby();
        double b = Liczby();

        while (true)
        {
            Opcja();
            switch(Wybor())
            {
                case 1:
                    a = Liczby();
                    b = Liczby();
                    break;

                case 2:
                    System.out.println("Suma liczb to: "+suma(a,b));
                   break;

                case 3:
                    System.out.println("Suma liczb to: "+roznica(a,b));
                    break;

                case 4:
                    System.out.println("Suma liczb to: "+iloczyn(a,b));
                    break;

                case 5:
                    System.out.println("Suma liczb to: "+iloraz(a,b));
                    break;

                case 6:
                    System.out.println("Suma liczb to: "+potega(a,b));
                    break;

                case 7:
                    System.out.println("Suma liczb to: "+pierwiastek(a,b));
                    break;

                case 8:
                    trygonometria(a);
                    trygonometria(b);
                    break;

                case 9:
                    System.exit(1);
                    break;

                case 10:
                    Kalkulator();
                    break;

                default:
                    break;
            }
        }
    }


                    //SEKCJA MENU I WIELOKROTNEGO WYBORU

    public static int Wybor()   //wybor opcji
    {
        System.out.println("Wybierz opcje: ");
        Scanner input = new Scanner(System.in);
        int opc = input.nextInt();
        return opc;
    }

    public static double Liczby()   //wprowadzanie liczb
    {
        System.out.print("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        double liczba = input.nextDouble();
        return liczba;
    }
    public static void Opcja()  //wyswietlanie opcji
    {
        System.out.println("Oto twoj kalkulator! \n\n" +
                "1. Podaj liczby\n" +
                "2. Suma liczb\n" +
                "3. Różnica liczb\n" +
                "4. Iloczyn liczb\n" +
                "5. Iloraz liczb\n" +
                "6. Potęga liczby a do liczby b\n" +
                "7. Pierwiastek kwadratowy\n" +
                "8. Funkcje trygonometryczne\n" +
                "9. Wyjdź\n" +
                "10.Zresetuj program");
    }


                //SEKCJA OBLICZEN NA PODANYCH LICZBACH
    public static double suma(double a, double b)
    {
       double suma = a+b;
       return suma;
    }
    public static double roznica(double a, double b)
    {
        double roznica = a-b;
        return roznica;
    }
    public static double iloczyn(double a, double b)
    {
        double iloczyn = a*b;
        return iloczyn;
    }
    public static double iloraz(double a, double b)
    {
        double iloraz = a/b;
        return iloraz;
    }
    public static double potega(double a, double b)
    {
        double potega = Math.pow(a,b);
        return potega;
    }
    public static double pierwiastek(double a, double b)
    {
        double pierwiastek = Math.sqrt(a);
        return pierwiastek;
    }
    public static void trygonometria(double a)
    {
        double sin = Math.sin(Math.toRadians(a));
        double cos = Math.cos(Math.toRadians(a));
        double tan = Math.tan(Math.toRadians(a));
        double ctg = cos/sin;
        System.out.println("Trygonometria dla kąta " +a+ ": sinus = " +sin+ "; cosinus = " +cos+ "; tangens = " +tan+ "; cotangens = " +ctg);
    }
}



