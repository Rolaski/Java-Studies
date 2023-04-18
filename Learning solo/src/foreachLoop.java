import java.util.ArrayList;

public class foreachLoop
{
    public static void main(String[] args)
    {
        String[] animals = {"kot", "pies", "bocian","karp"};

        for(String i: animals)              //w pętli foreach elementy to
        {                                   //String - po jakich elementach chodzimy
            System.out.print(i+" ");        //i - to nasze typowe i z fora
        }                                   //animals - tablica która używamy
        System.out.println();

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pomarańcza");
        food.add("Pieczarka");
        food.add("Kiwi");
        food.add("Ogórek");

        for(String i: food)
        {
            System.out.print(i+" ");
        }
    }
}
