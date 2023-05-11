package zad1;

public class Plane implements Fly
{
    @Override
    public void flying()
    {
        System.out.println("Ours plane is flying right now :)");
    }

    @Override
    public void falling()
    {
        System.out.println("Our plane is falling :(");
    }
}
