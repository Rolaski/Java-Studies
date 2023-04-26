package zad2;

public class Main
{
    public static void main(String[] args)
    {
        PersonalCar Panda = new PersonalCar("Fiat","Panda","Hatchback","Blue",2009,208560,875,4.5, 5);
        Car Uno = new Car("Fiat", "Uno","Hatchback","Gray", 2000, 78930);
        Car Brabus = new Car("Mercedes-Benz", "G class", "SUV","Black",2023,-5);

        System.out.println(Panda);  System.out.println("\n");
        System.out.println(Uno+"\n=============================");  System.out.println("\n");
        System.out.println(Brabus+"\n=============================");
    }
}
