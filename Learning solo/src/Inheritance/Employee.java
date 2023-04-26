package Inheritance;
public class Employee
{
    String name, surname, profession;
    int paycheck;

    public Employee()
    {
        name = "";
        surname = "";
        profession = "";
        paycheck = 0;
    }

    public Employee(String name, String surname, String profession, int paycheck)
    {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.paycheck = paycheck;
    }
}
