package zad3;

public class Gatunek
{
    String type, species, description;
    String name;

    int number2n;
    int x;

    public String EnterFullName()
    {
        return name;
    }
    public int EnterNumberChromosomes()
    {
        return number2n/2;
    }

        //SETTERS
    public void setType(String type) {
        this.type = type;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setNumber2n(int number2n) {
        this.number2n = number2n;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "type='" + type + '\'' +
                ", species='" + species + '\'' +
                ", description='" + description + '\'' +
                ", number2n=" + number2n +
                ", x=" + x +
                '}';
    }

    public Gatunek clone()
    {
        Gatunek clone = new Gatunek();
        clone.type = type;
        clone.species = species;
        clone.description = description;
        clone.number2n = number2n;
        clone.x = x;
        return clone;
    }
}
