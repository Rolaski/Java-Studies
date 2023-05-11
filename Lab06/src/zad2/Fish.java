package zad2;

public abstract class Fish extends Animal
{
    String name;

    public Fish(String species, String name)
    {
        super(species);
        this.name = name;
    }

    abstract void eating();
    abstract void excreting();
}
