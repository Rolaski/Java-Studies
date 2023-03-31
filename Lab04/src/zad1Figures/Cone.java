package zad1Figures;

public class Cone
{
    double r;
    double h;
    double l;

    public double pole()
    {
        double pole;
        pole = Math.PI * r*(r+l);
        return pole;
    }
    public double objetosc()
    {
        double Pp = Math.PI * Math.pow(r,2);
        double objetosc = (1F/3F) * Pp * h;
        return objetosc;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setH(double h) {
        this.h = h;
    }

    public void setL(double l) {
        this.l = l;
    }
}
