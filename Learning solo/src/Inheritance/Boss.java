package Inheritance;
import javax.swing.*;

public class Boss extends Employee
{
     int bonus;
     int monthlyTax;
    public Boss()
    {
        bonus = 0;
        monthlyTax = 0;
    }
    public Boss(String name, String surname, String profession, int paycheck, int bonus, int monthlyTax)
    {
        super(name, surname, profession, paycheck);
        this.bonus = bonus;
        this.monthlyTax = monthlyTax;
    }

    @Override
    public String toString()
    {
        int finalPaycheck = paycheck + bonus;
        return "Boss{" +
                "name=" + name +
                ", surname='" + surname + '\'' +
                ", profession='" + profession + '\'' +
                ", paycheck='" + finalPaycheck + '\'' +
                '}';
    }

    public int setMonthlyTax()
    {
        monthlyTax = Integer.parseInt(JOptionPane.showInputDialog("Enter Monthly tax"));
        return monthlyTax;
    }
}
