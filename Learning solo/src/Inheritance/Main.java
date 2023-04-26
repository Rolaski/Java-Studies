package Inheritance;
import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        Boss MainBoss = new Boss();
        MainBoss.name = JOptionPane.showInputDialog("Enter your name");
        MainBoss.surname = JOptionPane.showInputDialog("Enter your surname");
        MainBoss.profession = JOptionPane.showInputDialog("Enter your profession");
        MainBoss.paycheck = Integer.parseInt(JOptionPane.showInputDialog("Enter your paycheck"));
        MainBoss.bonus = Integer.parseInt(JOptionPane.showInputDialog("Enter your bonus bitch"));
        MainBoss.setMonthlyTax();
        System.out.println(MainBoss.toString());

        BookKeeping Accountant = new BookKeeping();
        Accountant.name = Accountant.setName();
        Accountant.surname = Accountant.setSurname();
        Accountant.profession = Accountant.setProfession();
        Accountant.paycheck = Accountant.setPaycheck();
        Accountant.bonus = Accountant.setBonus();
        System.out.println(Accountant.toString());
    }


}
