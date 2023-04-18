import java.util.*;
public class Array_List_2D
{
    public static void main(String[] args)
    {
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Mąka");
        bakeryList.add("Pszenica");
        bakeryList.add("Chleb");
        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("pomidory");
        produceList.add("ogórki");
        produceList.add("kukurydza");
        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("kawa");
        drinksList.add("cappuccino");
        drinksList.add("tymbark");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();   //na końcu <> musi być puste!
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(bakeryList);         //wyświetla całą listę
        System.out.println(bakeryList.get(2));  //wyświetla element o indeksie nr2
        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(0)); //pierwszy get to nr listy a drugi get to element
    }
}
