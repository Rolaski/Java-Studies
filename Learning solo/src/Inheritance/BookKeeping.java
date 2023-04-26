package Inheritance;
import javax.swing.*;

public class BookKeeping extends Employee
{
    int bonus;
    public BookKeeping()
    {
        bonus = 0;
    }
    public BookKeeping(String name, String surname, String profession, int paycheck)
    {
        super(name, surname, profession, paycheck);
        this.bonus = bonus;
    }


    public String setName()
    {
        name = JOptionPane.showInputDialog("Enter your name");
        return name;
    }
    public String setSurname()
    {
        surname = JOptionPane.showInputDialog("Enter your surname");
        return surname;
    }
    public String setProfession()
    {
        profession = JOptionPane.showInputDialog("Enter your profession");
        return profession;
    }
    public int setPaycheck()
    {
        paycheck = Integer.parseInt(JOptionPane.showInputDialog("Enter your paycheck"));
        return paycheck;
    }
    public int setBonus()
    {
        bonus = Integer.parseInt(JOptionPane.showInputDialog("Enter your bonus"));
        return bonus;
    }

    @Override
    public String toString()
    {
        int finalPaycheck = paycheck + bonus;
        return "BookKeeping{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", paycheck=" + finalPaycheck +
                '}';
    }
}
