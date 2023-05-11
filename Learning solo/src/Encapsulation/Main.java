package Encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Fiat","Panda",2006);
        //Nie ma możliwości wyświetlenia roku obiektu car1
        //System.out.println(car.year);
        System.out.println(car1.getMark());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        //Nie ma możliwości też ustawiania wartości objektu
        //car1.year = 2010;
        car1.setYear(2010);
    }
}
