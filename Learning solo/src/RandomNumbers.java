import java.util.Random;
public class RandomNumbers
{
    public static void main(String[] args)
    {
        Random randomNumber = new Random();
        int x;
        double y = randomNumber.nextDouble();
        boolean z = randomNumber.nextBoolean();
        for(int i=0; i<=10; i++)
        {
            System.out.print(randomNumber.nextInt(6)+" ");
            // wyświetli od 0 do 5;  6 to ilość cyfr
        }
        System.out.println();
        for(int i=0; i<=10; i++)
        {
            System.out.print(randomNumber.nextInt(10)+11+" ");
            //10 to zakres, standardowo od 0, dodajemy 11 żeby zaczął od 10
        }
        System.out.println();
        for(int i=0; i<=10; i++)
        {
            System.out.print(randomNumber.nextInt(21)-10+" ");
            //<-10,10> leci od -10 i zakres to 21 cyfr
        }
    }
}
