package zad1;
class Prostokat extends Figura
{
	double height=0;
	double width=0;

	public Prostokat(double height, double width,String color)
	{
		super(color);
		this.height = height;
		this.width = width;
	}

	double getSurfaceArea()
	{
        return (height * width);
    }

	public String descriptionRectangle()
	{
		return "Klasa prostokąt. Kolor obiektu: "+color;
	}
}