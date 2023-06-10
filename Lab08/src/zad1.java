import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class zad1
{
    public static void main(String[] args)
    {
        Scanner inputIn = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        String name;
        final String noMoreNames = "-";
        do
        {
            System.out.print("Enter name: ");
            name = inputIn.next();
            if(!name.equals(noMoreNames))
            {
                names.add(name);
            }
        }while(!name.equals(noMoreNames));

        System.out.println("The unique number of names is: "+names.size());
        System.out.println(names+" ");
    }
}
