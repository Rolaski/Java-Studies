package Abstraction;

public class Main
{
    public static void main(String[] args)
    {
        //Nie można tworzyć obiektów klas abstrakcyjnych
        //Vehicle vehicle1 = new Vehicle();

        Car car1 = new Car();
        car1.go();
        System.out.println("The car was stopped from a speed of "+car1.stop()+"km/h");
    }
}
