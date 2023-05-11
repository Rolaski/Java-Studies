package Interface;

public class Main
{
    public static void main(String[] args)
    {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();
        System.out.println();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
