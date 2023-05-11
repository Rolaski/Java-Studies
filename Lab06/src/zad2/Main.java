package zad2;

public class Main
{
    public static void main(String[] args)
    {
        Carp carp = new Carp("freshwater fish", "European Carp");
        System.out.println("Name: "+carp.name);
        System.out.println("Species: "+carp.species);
        carp.swimming();
        carp.emerge();
        carp.dive();
        carp.excreting();
        if(carp.isAlive() == 0)
        {
            System.out.println(carp.name + " is happy to live with you");
        }
        else
        {
            System.out.println(carp.name+ " isnt alive, sad to hear that");
        }
        System.out.println("\n===================================\n");

        Whale whale = new Whale("Antarctic Minke whale", "Whale");
        System.out.println("Name: "+whale.name);
        System.out.println("Species: "+whale.species);
        whale.swimming();
        whale.emerge();
        whale.dive();
        whale.excreting();
        if(whale.isAlive() == 0)
        {
            System.out.println(whale.name + " is happy to live with you");
        }
        else
        {
            System.out.println(whale.name+ " isnt alive, sad to hear that");
        }
    }
}
