package zad1;

class Figura extends Point {

	Point point;
	String color = "bialy";
	Figura(double x, double y)
	{
		super(x, y);
		point = new Point();
	}
	Figura(String color)
	{
		this.color=color;
	}
	Figura(Point point)
	{
		this.point=point;
	}
	String getColor()
	{
		return color;
	}
	String descriptionFigure()
	{
		return "Klasa Figura. Kolor obiektu: "+color;
	}
			
	
}
