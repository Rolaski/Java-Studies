package zad3;

public class Novel extends Book
{
    String genre;
    public Novel(String author, String title, double price, int publicationDate, String genre)
    {
        super(author, title, price, publicationDate);
        this.genre = genre;
    }
    void title()
    {
        System.out.print("The book has a title "+title);
    }
    public String toString()
    {
        return super.toString()+
                ", genre: "+genre;
    }
}
