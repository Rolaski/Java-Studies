package zad1Figures;

public class Cuboid
{
    double bokA;
    double bokB;
    double bokC;

    public double obwod()
    {
        double obwod;
        obwod = 4*(bokA + bokB + bokC);
        return obwod;
    }

    public double pole()
    {
        double pole;
        pole = 2*((bokA*bokB)+(bokA*bokC)+(bokB*bokC));
        return pole;
    }

    public double objetosc()
    {
        double objetosc;
        objetosc = bokA * bokB * bokC;
        return objetosc;
    }

    public void setBokA(double bokA)
    {
        this.bokA = bokA;
    }

    public void setBokB(double bokB)
    {
        this.bokB = bokB;
    }

    public void setBokC(double bokC)
    {
        this.bokC = bokC;
    }
}
