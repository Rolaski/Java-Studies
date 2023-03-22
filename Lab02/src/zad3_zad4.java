import java.util.*;

public class zad3_zad4
{
    public static void main(String[] args)
    {
        System.out.println("\nWITAJ W PROGRAMIE TABLICOWYM!\n");
        int Option;
        int suma = 0;
        int iloczyn = 1;
        int[] Array = ArrayElements();

        do
        {
            Menu();
            System.out.print("\nWybierz operacje: ");
            Option = InputIn();


            if (Option == 1)
            {
                Array = ArrayElements();
            }
            else if(Option == 2)
            {
                System.out.print("Twoja tablica:");
                for(int item: Array)
                {
                    System.out.print(item+" ");
                }
            }
            else if(Option == 3)
            {
                System.out.print("Twoja tablica od tylu:");
                for(int i = Array.length -1; i>=0; i--)
                {
                   System.out.print(Array[i]+" ");
                }
            }
            else if(Option == 4)
            {
                System.out.println("Twoja tablica parzystych indeksow");
                for(int i=0; i<= Array.length; i+=2)
                {
                    System.out.print(Array[i]+" ");
                }
            }
            else if(Option == 5)
            {
                System.out.println("Twoja tablica nieparzystych indeksow");
                for(int i=1; i<Array.length; i+=2)
                {
                    System.out.print(Array[i]+" ");
                }
            }
            else if(Option == 6)
            {
                for(int i=0; i<Array.length; i++)
                {
                    suma = suma + Array[i];
                }
                System.out.println("Suma twojej tablicy to: "+suma);
            }
            else if(Option == 7)
            {
               for(int i=0; i<Array.length; i++)
               {
                   iloczyn = iloczyn * Array[i];
               }
                System.out.println("Iloczyn tablicy to: "+iloczyn);
            }
            else if(Option == 8)
            {
                for(int i=0; i<Array.length; i++)
                {
                    suma = suma + Array[i];
                }
                int average = suma/Array.length;
                System.out.println("Srednia to: "+average);
            }
            else if(Option == 9)
            {
                int min = Array[0];
                for(int i=0; i<Array.length; i++)
                {
                    if(min > Array[i])
                    {
                        min = Array[i];
                    }
                }
                System.out.println("Najmniejsza wartosc to: "+min);
            }
            else if(Option == 10)
            {
                int max = Array[0];
                for(int i=0; i<Array.length; i++)
                {
                    if(max < Array[i])
                    {
                        max = Array[i];
                    }
                }
                System.out.println("Najwieksza wartosc to: "+max);
            }
            else if(Option == 11)
            {
                System.exit(1);
            }
            System.out.println();
        }while (true);

    }

    //Pobieranie z klawiatury
    public static int InputIn()
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }


    //Wprowadzanie elementow tablicy
    public static int[] ArrayElements()
    {
        final int ArrayLenght = 10;
        int[] Array = new int[ArrayLenght];
        System.out.println("Podaj nastepujace elementy do tablicy");
        for(int i=0; i<Array.length; i++)
        {
            System.out.format("Element %d: ",i);
            Array[i] = InputIn();
        }
        System.out.println();
        return Array;
    }

    //Menu programu
    public static void Menu()
    {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n" +
                "1. Wprowadz liczby\n" +
                "2. Wyswietlanie od pierwszego do ostatniego\n" +
                "3. Wyswietlanie od ostatniego do pierwszego\n" +
                "4. Wyswietlanie elementow o parzystych indeksach\n" +
                "5. Wyswietlanie elementow o nieparzystych indeksach\n" +
                "6. Suma tablicy\n" +
                "7. Iloczyn tablicy\n" +
                "8. Srednia wartosc\n" +
                "9. Wartosc minimalna\n" +
                "10.Wartosc maksymalna\n" +
                "11.Zakoncz\n" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
    }

}
