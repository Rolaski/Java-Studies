package zad1;

public class Square extends Prostokat
{
    public Square(double height, String color)
    {
        super(height, height, color);
    }

    //SETTER AND GETTER
    public void setHeight(double height)
    {
        this.height = height;
        this.width = height;
    }
    public double getHeight()
    {
        return height;
    }

    //DESCRIPTION
    public String descriptionSquare()
    {
        return "Klasa kwadrat. Kolor obiektu: "+color;
    }

    public double getSurfaceAreaSquare()
    {
        return Math.pow(height,2);
    }
}
