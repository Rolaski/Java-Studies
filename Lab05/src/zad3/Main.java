package zad3;
import javax.swing.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nWELCOME TO THE BOOKSTORE");
        Book book1 = new Book("Henryk Sienkiewicz", "Ogniem i mieczem", 45.99, 1884);
        Book book2 = new Book("J.R.R. Tolkien","Lord of the Rings", 120, 1954);
        Book book3 = new Book("J.R.R. Tolkien", "Hobbit", 90,1937);
        Coursebook coursebook1 = new Coursebook("Grzegorz Wojciechowski", "Wczoraj i dziś", 59.99, 2021, "History", 5);
        Coursebook coursebook2 = new Coursebook("Aleksandra Mrzigod", "To jest chemia", 45.50, 2019, "Chemistry", 1);
        Coursebook coursebook3 = new Coursebook("Katarzyna Kłosowska", "Biologia na czasie", 74.99, 2020, "Biology",2);
        Novel novel1 = new Novel("Henryk Sienkiewicz", "Sachem", 20,1880, "Novel");
        Novel novel2 = new Novel("Henryk Sienkiewicz", "Latarnik",19.99, 1883, "Novel");

        ArrayList<Book> myList = new ArrayList<>();
        ArrayList<String> myClient = new ArrayList<>();

        Menu();
        while(true)
        {
            switch (Choice())
            {
                case 1:
                    System.out.println("==================================");
                    System.out.println(book1);
                    System.out.println(book2);
                    System.out.println(book3);
                    System.out.println("==================================\n");

                    //Borrow section
                    int n1 = (JOptionPane.showConfirmDialog(null, "do you want to borrow a book?", "Hi", JOptionPane.YES_NO_OPTION));
                    if(n1==0)
                    {
                        Client client = new Client();
                        client.name = client.setName();
                        client.surname = client.setSurname();
                        int myBook = Integer.parseInt(JOptionPane.showInputDialog("Now enter number book to borrow"));
                        client.borrowedBooks++;
                        switch (myBook)
                        {
                            case 1:
                                myList.add(book1);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            case 2:
                                myList.add(book2);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            case 3:
                                myList.add(book3);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Wrong option! You must do it again XD");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("==================================");
                    System.out.println(coursebook1);
                    System.out.println(coursebook2);
                    System.out.println(coursebook3);
                    System.out.println("==================================\n");

                    //Borrow section
                    int n2 = (JOptionPane.showConfirmDialog(null, "do you want to borrow a coursebook?", "Hi", JOptionPane.YES_NO_OPTION));
                    if(n2==0)
                    {
                        Client client = new Client();
                        client.name = client.setName();
                        client.surname = client.setSurname();
                        int myBook = Integer.parseInt(JOptionPane.showInputDialog("Now enter number coursebook to borrow"));
                        client.borrowedBooks++;
                        switch (myBook)
                        {
                            case 1:
                                myList.add(coursebook1);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            case 2:
                                myList.add(coursebook2);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            case 3:
                                myList.add(coursebook3);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Wrong option! You must do it again XD");
                                break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("==================================");
                    System.out.println(novel1);
                    System.out.println(novel2);
                    System.out.println("==================================\n");

                    //Borrow section
                    int n3 = (JOptionPane.showConfirmDialog(null, "do you want to borrow a novel?", "Hi", JOptionPane.YES_NO_OPTION));
                    if(n3==0)
                    {
                        Client client = new Client();
                        client.name = client.setName();
                        client.surname = client.setSurname();
                        int myBook = Integer.parseInt(JOptionPane.showInputDialog("Now enter number novel to borrow"));
                        client.borrowedBooks++;
                        switch (myBook)
                        {
                            case 1:
                                myList.add(novel1);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            case 2:
                                myList.add(novel2);
                                myClient.add(client.name+" "+client.surname);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Wrong option! You must do it again XD");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n");
                    for(int i=0; i<myClient.size(); i++)
                    {
                        System.out.println("Client: "+myClient.get(i));
                        System.out.println(myList.get(i));
                        System.out.println();
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Wrong option!");
            }
        }

    }

    public static void Menu()
    {
        System.out.println("1) Show Books");
        System.out.println("2) Show Coursebook");
        System.out.println("3) Show Novels");
        System.out.println("4) Currently used books");
        System.out.println("5) Exit from Bookstore");

    }
    public static int Choice()
    {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("What do you want to do?"));
        return choice;
    }
}
