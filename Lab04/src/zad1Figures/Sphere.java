package zad1Figures;

public class Sphere
{
    double promien;

    public double pole()
    {
        double pole;
        pole = 4*Math.PI*Math.pow(promien,2);
        return pole;
    }
    public double objetosc()
    {
        double objetosc;
        objetosc = (4F/3F)*(Math.PI*Math.pow(promien,3));
        return  objetosc;
    }

    public Sphere(double promien) {
        this.promien = promien;
    }
}
