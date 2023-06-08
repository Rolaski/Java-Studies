package zad3;

class Trojkat extends Figura
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

	public String Opis(){
		return "Objekt: "+getClass().getSimpleName()+", o wymairach: "+wys+"  "+podst;
	}
}