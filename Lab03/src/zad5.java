import java.util.Scanner;
import java.util.Arrays;

public class zad5
{
    public static void main(String[] args)
    {
        if(PalindromCheck())
        {
            System.out.println("Słowo jest palindromem");
        }
        else
        {
            System.out.println("Słowo nie jest palindromem");
        }
    }

    public static char[] InputWord()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Wpisz słowo: ");
        String word = input.nextLine();
        char[] ArrayChar;
        ArrayChar = word.toCharArray();

        return ArrayChar;
    }

    public static boolean PalindromCheck()
    {
        char[] wordChar = InputWord();
        char[] wordCharRev = new char[wordChar.length];
        int l = wordChar.length;
        for(int i=0; i< wordChar.length; i++)
        {
            wordCharRev[l-1] = wordChar[i];
            l-=1;
        }

        return Arrays.equals(wordChar, wordCharRev);
    }
}
