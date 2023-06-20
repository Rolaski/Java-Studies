import java.sql.*;

public class DataBase
{
    private String query;

    //konstruktor
    public DataBase(String query)
    {
        this.query = query;
    }

    //kwerenda
    public void setQuery(String query)
    {
        this.query = query;
    }

    //wypisywanie PC
    public void showPc()
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            int i=1;
            while(resultPrint.next())
            {
                System.out.print(i+") "+resultPrint.getString(2)+" ");
                System.out.print(resultPrint.getString(3)+" ");
                System.out.print(resultPrint.getString(4)+" ");
                System.out.print(resultPrint.getString(5)+" ");
                System.out.print(resultPrint.getString(6)+" ");
                System.out.print(resultPrint.getString(7)+" ");
                System.out.print("    price: "+resultPrint.getInt(8)+"\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //wypisywanie laptopów
    public void showLaptop()
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            int i=1;
            while(resultPrint.next())
            {
                System.out.print(i+") "+resultPrint.getString(2)+" ");
                System.out.print(resultPrint.getString(3)+" ");
                System.out.print(resultPrint.getString(4)+" ");
                System.out.print(resultPrint.getString(5)+" ");
                System.out.print(resultPrint.getString(6)+" ");
                System.out.print(resultPrint.getString(7)+" ");
                System.out.print(resultPrint.getInt(8)+" ");
                System.out.print("    price: "+resultPrint.getInt(9)+"\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //wypisywanie tabletów
    public void showTablet()
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            int i=1;
            while(resultPrint.next())
            {
                System.out.print(i+") "+resultPrint.getString(2)+" ");
                System.out.print(resultPrint.getString(3)+" ");
                System.out.print(resultPrint.getString(4)+" ");
                System.out.print(resultPrint.getString(5)+" ");
                System.out.print(resultPrint.getInt(6)+" ");
                System.out.print("    price: "+resultPrint.getInt(7)+"\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //wypisywanie telefonow
    public void showSmartphone()
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            int i=1;
            while(resultPrint.next())
            {
                System.out.print(i+") "+resultPrint.getString(2)+" ");
                System.out.print(resultPrint.getString(3)+" ");
                System.out.print(resultPrint.getString(4)+" ");
                System.out.print(resultPrint.getString(5)+" ");
                System.out.print(resultPrint.getInt(6)+" ");
                System.out.print("    price: "+resultPrint.getInt(7)+"\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //wypisywanie monitorow
    public void showMonitor()
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            int i=1;
            while(resultPrint.next())
            {
                System.out.print(i+") "+resultPrint.getString(2)+" ");
                System.out.print(resultPrint.getString(3)+" ");
                System.out.print(resultPrint.getString(4)+" ");
                System.out.print(resultPrint.getString(5)+" ");
                System.out.print("    price: "+resultPrint.getInt(6)+"\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //wypisywanie klawiatur
    public void showKeyboard()
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            int i=1;
            while(resultPrint.next())
            {
                System.out.print(i+") "+resultPrint.getString(2)+" ");
                System.out.print(resultPrint.getString(3)+" ");
                System.out.print(resultPrint.getString(4)+" ");
                System.out.print(resultPrint.getString(5)+" ");
                System.out.print("backlight: "+resultPrint.getBoolean(6)+" ");
                System.out.print("    price: "+resultPrint.getInt(7)+"\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //wypisywanie myszek
    public void showMouse()
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            int i=1;
            while(resultPrint.next())
            {
                System.out.print(i+") "+resultPrint.getString(2)+" ");
                System.out.print(resultPrint.getString(3)+" ");
                System.out.print(resultPrint.getString(4)+" ");
                System.out.print("    price: "+resultPrint.getInt(5)+"\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //============================= SEKCJA OBLICZANIA CENY =============================
    public int totalPrice()
    {
        int sum = 0;
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            Statement statement = connect.createStatement();
            ResultSet resultPrint = statement.executeQuery(query);
            while(resultPrint.next())
            {
                sum = sum + resultPrint.getInt("price");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return sum;
    }

    //============================= SEKCJA OBLICZANIA ILOŚCI PRODUKTU =============================
    public int totalQuantity()
    {
        int quantity = 0;
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            Statement statement = connect.createStatement();
            ResultSet resultPrint = statement.executeQuery(query);
            while(resultPrint.next())
            {
                quantity = resultPrint.getInt("quantity");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return quantity;
    }
    public int updateQuantity()
    {
        int updateQuantity;
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            Statement statement = connect.createStatement();
            updateQuantity = statement.executeUpdate(query);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return updateQuantity;
    }

}