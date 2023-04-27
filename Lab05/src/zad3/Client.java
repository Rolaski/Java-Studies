package zad3;

import javax.swing.*;

public class Client
{
    String name, surname;
    int borrowedBooks = 0;

    public void setName(String name)
    {
        this.name = name;
    }

    //MY JOPTIONPANE SETTERS
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
}
