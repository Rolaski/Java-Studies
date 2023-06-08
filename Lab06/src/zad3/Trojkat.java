package zad3;

class Trojkat extends Figura implements IFigury
{
	float wys=0;
	float podst=0;
	Trojkat(int wys,int podst,String kolor)
	{
		
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
	}
	@Override
	void skaluj(float skala)
	{
		wys = wys/skala;
		podst = podst/skala;
	}

	@Override
	public float getPowierzchnia()
	{
		return (wys*podst)/2;
	}

	@Override
	public boolean wPolu(Punkt p)
	{
		return false;
	}

	public String Opis(){
		return "Objekt: "+getClass().getSimpleName()+", o wymairach: "+wys+"  "+podst;
	}
}