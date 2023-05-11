package Encapsulation;

public class Car
{
    private String mark;
    private String model;
    private int year;

    Car(String mark, String model, int year)
    {
        this.mark = mark;
        this.model = model;
        this.year = year;
    }

    //GETTERS SECTION
    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    //SETTERS SECTION

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


