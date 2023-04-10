package zad1;

import static zad1.Main.InputIn;

public class Circle extends Point
{
    private double radius;
    private double x,y;

    public Circle()
    {
        this.radius = 0;
    }

    public Circle(double radius, double x, double y)
    {
        this.radius = radius;
        this.x = x;
        this.y = y;
        Point point = new Point();
    }


    //SURFACE AREA
    public double getSurfaceAreaCircle()
    {
        return (Math.PI * Math.pow(radius,2));
    }
    //DIAMETER
    public double getDiameter()
    {
        return (radius*2);
    }
    //DESCRIPTION
    public void descriptionCircle()
    {
        System.out.println("Punkt o współrzędnych ["+x+","+y+"]");
    }



    //====SETTER AND GETTER=====


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    //CIRCLE MIDDLE CHECK
    public void inCircle(Point point, Circle circle)
    {
        double distance = Math.sqrt(Math.pow((point.getX() - circle.x), 2) + Math.pow((point.getY() - circle.y), 2));
        if (distance <= circle.radius) {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") znajduje się wewnątrz okręgu.");
        } else {
            System.out.println("Punkt (" + point.getX() + ", " + point.getY() + ") znajduje się na zewnątrz okręgu.");
        }
    }
}
