package zad3;
public class main
{
	public static void main(String[] arg)
	{
		Prostokat figura1 = new Prostokat(5,10, "czerwony");
		Trojkat figura2 = new Trojkat(8,5, "żółty");
		Kwadrat figura3 = new Kwadrat(9, "niebieski");
		Punkt punkt1 = new Punkt(1,1);
		Prostokat figura5 = new Prostokat(92, 47, "chabrowy");
		Trojkat figura6 = new Trojkat(42,18, "fioletowy");
		Kwadrat figura7 = new Kwadrat(100, "zielony");
		Punkt figura8 = new Punkt(5,-6);
		Kwadrat figura9 = new Kwadrat(71, "magenta");
		Prostokat figura10 = new Prostokat(34,18, "beżowy");

		Figura tablicaFigur[] = new Figura[10];
		tablicaFigur[0] = figura1;
		tablicaFigur[1] = figura2;
		tablicaFigur[2] = figura3;
		tablicaFigur[3] = punkt1;
		tablicaFigur[4] = figura5;
		tablicaFigur[5] = figura6;
		tablicaFigur[6] = figura7;
		tablicaFigur[7] = figura8;
		tablicaFigur[8] = figura9;
		tablicaFigur[9] = figura10;
		for(int i=0; i< tablicaFigur.length; i++)
		{
			tablicaFigur[i].Opis();
		}

		IFigury kwadrat = new Kwadrat(7,"ogórkowy");
		System.out.println(kwadrat.getPowierzchnia()); kwadrat.wPolu(punkt1);
		IFigury prostokat = new Prostokat(5,15, "pomidorowy");
		System.out.println(prostokat.getPowierzchnia()); prostokat.wPolu(punkt1);
		IFigury trojkat = new Trojkat(5,3,"cukiniowy");
		System.out.println(trojkat.getPowierzchnia()); trojkat.wPolu(punkt1);
	}
}