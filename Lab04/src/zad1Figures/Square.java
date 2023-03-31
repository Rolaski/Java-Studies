package zad1Figures;

public class Square
{
    double bok;

    public double obwod()
    {
        double obwod = bok*4;
        return obwod;
    }
    public double pole()
    {
        double pole;
        pole = Math.pow(bok,2);
        return pole;
    }

    public Square(double bok) {
        this.bok = bok;
    }
}
