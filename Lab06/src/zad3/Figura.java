package zad3;
//deklaracja klasy abstrakcyjnej

public abstract class Figura
{
	public abstract String Opis();
	abstract void skaluj(float skala);

	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";


	Figura()
	{
		punkt = new Punkt(0,0);
	}
	Figura(String kolor)
	{
		this.kolor=kolor;
	}
	Figura(Punkt punkt)
	{
		this.punkt=punkt;
	}
	String getKolor()
	{
		return kolor;
	}
	//metody abstrakcyjne
}
