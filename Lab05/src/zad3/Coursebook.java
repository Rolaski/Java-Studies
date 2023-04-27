package zad3;

public class Coursebook extends Book {
    String schoolSubject;
    int classNumber;

    public Coursebook(String author, String title, double price, int publicationDate, String schoolSubject, int classNumber)
    {
        super(author, title, price, publicationDate);
        this.schoolSubject = schoolSubject;
        this.classNumber = classNumber;
    }
    void title()
    {
        System.out.print("The book has a title "+title);
    }

    public String toString()
    {
        return super.toString()+
                ", school subject: "+schoolSubject+
                ", class number: "+classNumber;
    }
}

