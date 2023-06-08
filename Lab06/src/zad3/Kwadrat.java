package zad3;
class Kwadrat extends Prostokat implements IFigury
{
	public int bok;
	Kwadrat(int bok,String kolor)
	{
		super(bok,bok,kolor);
	}
	@Override
	public float getPowierzchnia()
	{
		return bok*bok;
	}
	@Override
	public boolean wPolu(Punkt p)
	{
		return false;
	}
}