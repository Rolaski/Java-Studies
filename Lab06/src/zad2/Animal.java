package zad2;

public abstract class Animal
{
    String species;

    public Animal(String species)
    {
        this.species = species;
    }

    abstract int isAlive();
}
