package zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Preworkout preworkout1 = new Preworkout("Centurion", 60, 300);
        Preworkout preworkout2 = new Preworkout("Angel Dust", 35, 400);
        Preworkout preworkout3 = new Preworkout("Mesomorph", 50,400);
        Preworkout preworkout4 = new Preworkout("Chain Reaction", 100, 100);

        //tablica obiektów
        Preworkout[] preworkoutsArray = {preworkout1, preworkout2, preworkout3, preworkout4};

        //lista z elementów tablicy
        List<Object> preworkoutList = new ArrayList<>(Arrays.asList(preworkoutsArray));

        //zabranie elementow z preworkoutList do nowej preworkoutSubList
        List<Object> preworkoutSubList = new ArrayList<>(preworkoutList.subList(2,4));

        System.out.println("Original list:");
        System.out.println(preworkoutList);
        System.out.println("Sub list:");
        System.out.println(preworkoutSubList+"\n");

        System.out.println("Insane list: ");
        preworkoutList.removeAll(preworkoutSubList);
        System.out.println(preworkoutList);
    }
}
