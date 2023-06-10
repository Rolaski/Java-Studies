import java.util.Random;
import java.util.Scanner;

public class zad8
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int i=0;
        while(true)
        {
            float x = random.nextInt(21)-10;
            float y = random.nextInt(21)-10;
            System.out.printf("[%.0f,%.0f] ",x,y);
            try
            {
                float result = Divide(x,y);
                System.out.println("result: "+result);
            }
            catch (DivideByZero error)
            {
                System.out.println("FATAL ERROR AMIGO: "+error.getMessage());
                i++;
                if(i==3) break;
            }
        }
    }

    public static int inputIn()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static class DivideByZero extends Exception
    {
        public DivideByZero()
        {
            super("cannot be divided by 0!");
        }
    }

    public static float Divide(float x, float y) throws DivideByZero
    {
        if(x==0 || y==0)
        {
            throw new DivideByZero();
        }
        float result = x/y;
        return result;
    }

}
