package zad3;
public class Punkt extends Figura
{
	//pola
    float x = 0;
    float y = 0;
    // konstruktor
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String Opis()
    {
        return null;
    }

    @Override
    void skaluj(float skala) {
        x = x/skala;
        y = y/skala;
    }
}