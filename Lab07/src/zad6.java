import java.util.ArrayList;
import java.util.Scanner;

public class zad6
{
    public static void main(String[] args)
    {
        //Arraylist na potrzebe zadania do sprawdzenia
        ArrayList<String> foodArray = new ArrayList<String>();
        foodArray.add("banana");
        foodArray.add("carrot");
        foodArray.add("strawberry");
        foodArray.add("bread");

        System.out.print("Choose a product from the range 0-3: ");
        int choice;
        while (true)
        {
            try
            {
                choice = input();
                System.out.println(foodArray.get(choice));
                break;
            }
            catch (IndexOutOfBoundsException x)
            {
                System.out.print("I said range 0-3! Pick again: ");
            }
        }
        System.out.println();

        //oraz zwykły Array
        int[] array = new int[10];
        for(int i=0; i<array.length; i++)
        {
            array[i] = i*100;
        }
        System.out.print("Choose a product from the range 0-9: ");
        int choice2;
        while (true)
        {
            try
            {
                choice2 = input();
                System.out.println("Index content: "+array[choice2]);
                break;
            }
            catch (ArrayIndexOutOfBoundsException x)
            {
                System.out.print("I said range 0-9! Pick again: ");
            }
        }

    }
    public static int input()
    {
        Scanner inputIn = new Scanner(System.in);
        return inputIn.nextInt();
    }
}
