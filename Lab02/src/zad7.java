import java.util.Scanner;

public class zad7
{
    public static void main(String[] args)
    {
        ArraySort();
    }

    //metoda do wprowadzania z klawiatury
    public static int InputIn()
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }

    //metoda do robienia tablicy
    public static int[] ArrayElements()
    {
        System.out.print("\nPodaj ilosc liczb do posortowania: ");
        int amount = InputIn();
        int[] array = new int[amount];

        System.out.println("Podaj "+amount+" liczb do posortowania");
        for(int i=0; i<amount; i++)
        {
            System.out.format("Element %d: ",i);
            array[i] = InputIn();
        }
        return array;
    }

    //metoda do sortowania
    public static void ArraySort()
    {
        int[] array = ArrayElements();
        int i,j,temp;

        for(i=0; i<array.length-1;i++)
        {
            for(j=0; j< array.length-i-1;j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] =temp;
                }
            }
        }

        //wypisanie
        System.out.print("Posortowane liczby: ");
        for(i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
