import java.util.Random;
import java.util.Scanner;

public class zad4
{
    public static void main(String[] args)
    {
        System.out.println("Suma parzystych elementow to: "+RandomElements());
    }

    //METODA WPROWADZANIA Z KLAWIATURY
    public static int Range()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj ile liczb chcesz wylosowac z zakresu <-10,45>: ");
        int amount = input.nextInt();
        return amount;
    }

    public static int RandomElements()
    {
        Random randomNumber = new Random();
        int[] array = new int[Range()];
        int sum = 0;
        for(int i=0; i< array.length; i++)
        {
            array[i] = randomNumber.nextInt(56)-10;
            if(array[i]%2 == 0)
            {
                sum+=array[i];
            }
        }
        return sum;
    }
}
