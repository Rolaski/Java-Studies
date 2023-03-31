package zad1Figures;

public class Cube
{
    double bok;

    public double pole()
    {
        double pole;
        pole = 6*Math.pow(bok,2);
        return pole;
    }
    public double obwod()
    {
        double obwod;
        obwod = 12 * bok;
        return obwod;
    }

    public double objetosc()
    {
        double objetosc;
        objetosc = Math.pow(bok,3);
        return objetosc;
    }

    public Cube(double bok) {
        this.bok = bok;
    }
}
