package zad3;
//DEFINICJE DLA SPRYTNYCH ZMIENNYCH
//EVENT - LISTA OSÓB NA IMPREZIE
//PERSON - OSOBA Z WYODRĘBNIONYMI DANYMI
//PARTICIPANTS - CAŁA OSOBA Z WSZYSTKIMI DANYMI (CAŁOŚĆ)


import java.util.Objects;

//PANEL UCZESTNIKA IMPREZY, W KONKRETACH
public class Participants {
    //PODSTAWOWE INFORMACJE O UCZESTNIKU IMPEREZY
    int ID, age;
    String name;



    //KONSTRUKTOR OSOBY


    public Participants(int ID, String name, int age)
    {
        this.ID = ID;
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "[ID: "+ID+", Name: "+name+", Age: "+age+"]";
    }


    //================ HASHCODE AND EQUALS SECTION ===================


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participants that = (Participants) o;
        return ID == that.ID && age == that.age && name.equals(that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(ID, age, name);
    }

    //=============== SETTER SECTION =================
    public void setAge(int age)
    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public boolean getAge()
    {
        if(age<18)
        {
            return false;
        }
        return true;
    }
}


