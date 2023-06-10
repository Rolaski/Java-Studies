import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad2
{
    public static void main(String[] args)
    {
        String name;
        String partnerName;
        final String noMoreNames = "-";
        Map<String, String> names = new HashMap<>();

        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("Enter name: ");
            name = input.next();
            System.out.print("Enter partner's name: ");
            partnerName = input.next();
            if(!name.equals(noMoreNames))
            {
                names.put(name, partnerName);
            }
        }while(!name.equals(noMoreNames) || !partnerName.equals(noMoreNames));
        System.out.println(names+" ");
    }
}
