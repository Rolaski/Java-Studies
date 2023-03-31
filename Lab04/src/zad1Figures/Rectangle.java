package zad1Figures;

public class Rectangle
{
    double bokA;
    double bokB;

    public double Obowod()
    {
        double obwod;
        obwod = 2*bokA + 2*bokB;
        return obwod;
    }
    public double Pole()
    {
        double pole;
        pole = bokA*bokB;
        return pole;
    }

    public void setBokA(double bokA)
    {
        this.bokA = bokA;
    }

    public void setBokB(double bokB)
    {
        this.bokB = bokB;
    }
}
