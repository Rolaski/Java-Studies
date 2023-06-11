package zad4;

public class Preworkout
{
    String name;
    int DMAA, caffeine;

    public Preworkout(String name, int DMAA, int caffeine)
    {
        this.name = name;
        this.DMAA = DMAA;
        this.caffeine = caffeine;
    }

    public String toString()
    {
        return "Name: "+name+", DMAA: "+DMAA+"mg, Caffeine: "+caffeine+"mg";
    }
}
