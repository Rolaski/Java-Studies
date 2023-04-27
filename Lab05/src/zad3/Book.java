package zad3;

public class Book
{
    private String author;
    String title;
    private double price;
    private int publicationDate;

    public Book(String author, String title, double price, int publicationDate)
    {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publicationDate = publicationDate;
    }
    void title()
    {
        System.out.print("The book has a title "+title);
    }

    @Override
    public String toString() {
        return "author: " + author +
                ", title: " + title +
                ", price: " + price +
                ", publication date: " + publicationDate;
    }
}
