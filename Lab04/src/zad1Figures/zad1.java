package zad1Figures;

import java.util.Scanner;

public class zad1
{
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.print("Podaj figure: ");
            String figure = InputString();

            switch (figure)
            {
                case "kolo":
                    System.out.print("Podaj promien koła: ");
                    Circle circle = new Circle(InputIn());
                    System.out.println("Obwód koła to: "+circle.obwod());
                    System.out.println("Pole koła to: "+circle.pole());
                    break;

                case "kwadrat":
                    System.out.print("Podaj bok kwadratu: ");
                    Square square = new Square(InputIn());
                    System.out.println("Obwód koła to: "+square.obwod());
                    System.out.println("Pole koła to: "+square.pole());
                    break;

                case "prostokat":
                    Rectangle rectangle = new Rectangle();
                    System.out.print("Podaj bok A: ");
                    rectangle.setBokA(InputIn());
                    System.out.print("Podaj bok B: ");
                    rectangle.setBokB(InputIn());
                    System.out.println("Obwód prostokąta to: "+rectangle.Obowod());
                    System.out.println("Pole prostokąta to: "+rectangle.Pole());
                    break;

                case "szescian":
                    System.out.print("Podaj bok szescianu: ");
                    Cube cube = new Cube(InputIn());
                    System.out.println("Obwód szescianu: "+cube.obwod());
                    System.out.println("Pole szescianu: "+cube.pole());
                    System.out.println("Objętość szescianu: "+cube.objetosc());
                    break;

                case "prostopadloscian":
                    Cuboid cuboid = new Cuboid();
                    System.out.print("Podaj bok A: ");
                    cuboid.setBokA(InputIn());
                    System.out.print("Podaj bok B: ");
                    cuboid.setBokB(InputIn());
                    System.out.print("Podaj bok C: ");
                    cuboid.setBokC(InputIn());
                    System.out.println("Obwód prostopadłościanu: "+cuboid.obwod());
                    System.out.println("Pole prostopadłościanu: "+cuboid.pole());
                    System.out.println("Objętość prostopadłościanu: "+cuboid.objetosc());
                    break;

                case "kula":
                    System.out.print("Podaj promien: ");
                    Sphere sphere = new Sphere(InputIn());
                    System.out.println("Pole kuli: "+sphere.pole());
                    System.out.println("Objętość kuli: "+sphere.objetosc());
                    break;

                case "stozek":
                    Cone cone = new Cone();
                    System.out.print("Podaj promien: ");
                    cone.setR(InputIn());
                    System.out.print("Podaj wysokosc: ");
                    cone.setH(InputIn());
                    System.out.print("Podaj tworzącą: ");
                    cone.setL(InputIn());
                    System.out.println("Pole kuli: "+cone.pole());
                    System.out.println("Objętość kuli: "+cone.objetosc());
                    break;

                default:
                    System.out.println("Musisz podać figurę!");
                    break;
            }
            System.out.println();
        }
    }

    public static double InputIn()
    {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        return number;
    }
    public static String InputString()
    {
        Scanner inputString = new Scanner(System.in);
        String figure = inputString.nextLine();
        return figure;
    }
}
