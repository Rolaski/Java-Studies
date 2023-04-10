package zad1;
class Trojkat extends Figura
{
	double height = 0;
	double base = 0;

	Trojkat(double height, double base, String color)
	{
		super(color);
		this.height = height;
		this.base = base;
	}
	double getSurfaceAreaTriangle()
	{
		return ((height*base)/2);
	}

	public String descriptionTriangle()
	{
		return "Klasa trójkąt. Kolor obiektu: "+color;
	}
}