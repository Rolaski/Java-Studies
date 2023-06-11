package zad3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Participants person1 = new Participants(1,"Michał",20);
        Participants person2 = new Participants(2,"Ewelina",23);
        Participants person3 = new Participants(3,"Fifonż",13);
        Participants person4 = new Participants(4,"Kacper",41);
        Participants person5 = new Participants(5,"Karol",16);
        Participants person6 = new Participants(6,"Małgorzata",32);

        //lista dla wszystkich
        ArrayList<Participants> list = new ArrayList<Participants>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);

        //lista bez osób niepełnoletnich
        LinkedList<Participants> listMinusKids = new LinkedList<>();
        for(Participants person : list)
        {
            if(person.getAge() == false)
            {
                listMinusKids.add(person);
            }
        }

        System.out.println("The list of participants");
        for(Participants person: list)
        {
            System.out.println(person);
        }
        System.out.println("The list of participants only minors");
        for(Participants i: listMinusKids)
        {
            System.out.println(i);
        }


    }

    public static String inputString()
    {
        Scanner input = new Scanner(System.in);
        return input.toString();
    }

    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }



}

