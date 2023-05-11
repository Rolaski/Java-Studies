package zad2;
import javax.swing.JOptionPane;
public class Carp extends Fish implements Swim
{
    public Carp(String species, String name)
    {
        super(species, name);
    }


    //SWIM INTERFACE SECTION
    @Override
    public void swimming()
    {
        System.out.println(name+" is swimming");
    }
    @Override
    public void emerge()
    {
        System.out.println(name+" just emerge");
    }
    @Override
    public void dive()
    {
        System.out.println(name+" just dive");
    }
    //ANIMAL ABSTRACT CLASS SECTION
    @Override
    public int isAlive()
    {
        int question = Integer.parseInt(String.valueOf(JOptionPane.showConfirmDialog(null, "Is "+name+" alive?", "", JOptionPane.YES_NO_OPTION)));
        return question;
    }
    //FISH ABSTRACT CLASS SECTION
    @Override
    public void eating()
    {
        System.out.println(name+" is eating right now");
    }
    @Override
    public void excreting()
    {
        System.out.println(name+" is excreting right now, just dont look");
    }
}
