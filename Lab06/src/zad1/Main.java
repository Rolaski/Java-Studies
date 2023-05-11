package zad1;

public class Main
{
    public static void main(String[] args)
    {
        Ship cruiseShip = new Ship();
        System.out.println("=====Ship section=====");
        cruiseShip.swimming();
        cruiseShip.sinking();

        System.out.println();
        System.out.println("=====Plane section=====");
        Plane ryanair = new Plane();
        ryanair.falling();
        ryanair.flying();

    }
}
