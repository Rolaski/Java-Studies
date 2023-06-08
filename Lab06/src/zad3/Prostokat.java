package zad3;
class Prostokat extends Figura implements IFigury
{
	float wys=0;
	float szer=0;
	
	Prostokat(int wys,int szer,String kolor)
	{
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}

	@Override
	void skaluj(float skala)
	{
		wys = wys/skala;
		szer = szer/skala;
	}

	@Override
	public float getPowierzchnia()
	{
		return wys*szer;
	}

	@Override
	public boolean wPolu(Punkt p)
	{
		return false;
	}

	public String Opis()
	{
		return "Objekt: "+getClass().getSimpleName()+",o wymiarach: "+szer+" x "+wys;
	}
}