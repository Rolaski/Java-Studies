public class zad2Buildings
{
    String name;
    int floors, year;

    public zad2Buildings(String name, int floors, int year)
    {
        this.name = name;
        this.floors = floors;
        this.year = year;
    }

    public String toString()
    {
        return "Budynek to: "+name+", piętra: "+floors+", rok wybudowania: "+year;
    }
}
