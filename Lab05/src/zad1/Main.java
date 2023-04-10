package zad1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //POINT TEST
        System.out.println("====== Informacje o punkcie ======");
        Point pktA = new Point(23.45, 56.12);
        Point pktB = new Point(-4.20, -10.94);
        Point pktC = new Point(6.77, -6.77);
        pktA.move(-5.10, 5.10); pktA.description();
        pktB.description();
        pktC.description();

        //FIGURE TEST
        System.out.println("\n====== Informacje o Figurze ======");
        Figura figure = new Figura(10.50, 10.50);
        System.out.println(figure.descriptionFigure());
        figure.description();

        //RECTANGLE TEST
        System.out.println("\n====== Informacje o Prostokącie ======");
        Prostokat rectangle = new Prostokat(5, 9,"żółty");
        System.out.println("Pole prostokąta: "+rectangle.getSurfaceArea());
        rectangle.move(5,13);
        System.out.println(rectangle.descriptionRectangle());

        //TRIANGLE TEST
        System.out.println("\n====== Informacje o Trójkącie ======");
        Trojkat triangle = new Trojkat(6,12, "czerwony");
        System.out.println("Pole trójkąta: "+triangle.getSurfaceAreaTriangle());
        System.out.println(triangle.descriptionTriangle());

        //CIRCLE TEST
        System.out.println("\n====== Informacje o Okręgu ======");
        Circle circle1 = new Circle();
        System.out.print("Promień: "); circle1.setRadius(InputIn());
        System.out.print("Współrzędna X: "); circle1.setX(InputIn());
        System.out.print("Współrzędna Y: "); circle1.setY(InputIn());
        System.out.println("Pole koła: "+circle1.getSurfaceAreaCircle());
        circle1.inCircle(pktC, circle1);

        //SQUARE TEST
        System.out.println("\n====== Informacje o Kwadracie ======");
        Square square = new Square(5, "niebieski");
        System.out.println("Pole kwadratu: "+square.getSurfaceAreaSquare());
        square.descriptionSquare();
    }

    public static double InputIn()
    {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        return number;
    }

}
