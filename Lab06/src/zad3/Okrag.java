package zad3;

public class Okrag extends Figura implements RuchFigury
{
    float promien;
    @Override
    public String Opis()
    {
        return "Obiekt:"+getClass().getSimpleName()+", promien: "+promien;
    }
    @Override
    void skaluj(float skala)
    {
        promien = promien/skala;
    }

    @Override
    public void przesun(float x, float y)
    {
        x = x + promien;
        y = y + promien;
    }
}
