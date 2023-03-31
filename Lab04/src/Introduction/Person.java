package Introduction;

public class Person
{
    String name;
    int age;
    boolean isDead;

    public Person(String name, int age, boolean isDead)
    {
        this.name = name;
        this.age = age;
        this.isDead = isDead;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Person: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDead=" + isDead
                ;
    }
}
