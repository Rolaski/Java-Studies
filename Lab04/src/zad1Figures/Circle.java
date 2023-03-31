package zad1Figures;

public class Circle
{
    double promien;

    public double pole()
    {
        double pole;
        pole = Math.PI * Math.pow(promien,2);
        return pole;
    }
    public double obwod()
    {
        double obwod;
        obwod = 2*Math.PI*promien;
        return obwod;
    }

    public Circle(double promien)
    {
        this.promien = promien;
    }
}
