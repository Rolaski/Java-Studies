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

    //============================= SEKCJA WYPISYWANIA KOMPUTERÓW Z BAZY =============================
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
                System.out.print("CPU: "+resultPrint.getString(4)+" ");
                System.out.print("GPU: "+resultPrint.getString(5)+" ");
                System.out.print("RAM: "+resultPrint.getString(6)+" ");
                System.out.print("DISK: "+resultPrint.getString(7)+" ");
                System.out.print("PRICE: "+resultPrint.getInt(8)+"zł\n");
                i++;
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



    //============================= SEKCJA WYPISYWANIA LAPTOPÓW Z BAZY =============================
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



    //============================= SEKCJA WYPISYWANIA TABLETÓW Z BAZY =============================
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


    //============================= SEKCJA WYPISYWANIA TELEFONÓW Z BAZY =============================
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


    //============================= SEKCJA WYPISYWANIA MONITORÓW Z BAZY =============================
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


    //============================= SEKCJA WYPISYWANIA KLAWIATUR Z BAZY =============================
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


    //============================= SEKCJA WYPISYWANIA MYSZEK Z BAZY =============================
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

    //============================= SEKCJA SPRAWDZANIA UŻYTKOWNIKA W BAZIE =============================
    public boolean login()
    {
        boolean isNull = false;
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next() == true)
            {
                isNull = true;
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return isNull;
    }

    //============================= SEKCJA SPRAWDZANIA PORTFELA UŻYTKOWNIKA Z BAZY =============================
    public int walletUser()
    {
        int wallet = 0;
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                wallet = resultSet.getInt("wallet");
            }

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return wallet;
    }

    //===================================== SEKCJA WPROWADZANIA DO BAZY ===================================
    public void productInput()
    {
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            Statement statement = connect.createStatement();
            statement.executeUpdate(query);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
        //======================= SEKCJA WYPISYWANIA INFORMACJI DLA PODANEGO ID I TABELI ============================
    public static int i=1;
    public void showInfo(Integer id, String whichTable)
    {
        Connection connect = null;
        try {
            //z czym się łączymy
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            //tworzenie połączenie
            Statement statement = connect.createStatement();
            //zapytanie wypisujące z kwerendy, zakładamy że wszystko
            ResultSet resultPrint = statement.executeQuery(query);
            if(whichTable.equals("pc"))
            {
                while(resultPrint.next())
                {
                    System.out.print((i++)+") "+resultPrint.getString(2)+" ");
                    System.out.print(resultPrint.getString(3)+" ");
                    System.out.print("CPU: "+resultPrint.getString(4)+" ");
                    System.out.print("GPU: "+resultPrint.getString(5)+" ");
                    System.out.print("RAM: "+resultPrint.getString(6)+" ");
                    System.out.print("DISK: "+resultPrint.getString(7)+" ");
                    System.out.print("PRICE: "+resultPrint.getInt(8)+"zł\n");
                }
            }
            else if(whichTable.equals("laptop"))
            {
                while (resultPrint.next())
                {
                    System.out.print((i++)+") "+resultPrint.getString(2)+" ");
                    System.out.print(resultPrint.getString(3)+" ");
                    System.out.print(resultPrint.getString(4)+" ");
                    System.out.print(resultPrint.getString(5)+" ");
                    System.out.print(resultPrint.getString(6)+" ");
                    System.out.print(resultPrint.getString(7)+" ");
                    System.out.print(resultPrint.getInt(8)+" ");
                    System.out.print("    price: "+resultPrint.getInt(9)+"\n");
                }
            }
            else if(whichTable.equals("tablet"))
            {
                while(resultPrint.next())
                {
                    System.out.print((i++)+") "+resultPrint.getString(2)+" ");
                    System.out.print(resultPrint.getString(3)+" ");
                    System.out.print(resultPrint.getString(4)+" ");
                    System.out.print(resultPrint.getString(5)+" ");
                    System.out.print(resultPrint.getInt(6)+" ");
                    System.out.print("    price: "+resultPrint.getInt(7)+"\n");
                }
            }
            else if(whichTable.equals("smartphone"))
            {
                while (resultPrint.next())
                {
                    System.out.print(i+") "+resultPrint.getString(2)+" ");
                    System.out.print(resultPrint.getString(3)+" ");
                    System.out.print(resultPrint.getString(4)+" ");
                    System.out.print(resultPrint.getString(5)+" ");
                    System.out.print(resultPrint.getInt(6)+" ");
                    System.out.print("    price: "+resultPrint.getInt(7)+"\n");
                    i++;
                }
            }
            else if(whichTable.equals("monitor"))
            {
                while (resultPrint.next())
                {
                    System.out.print(i+") "+resultPrint.getString(2)+" ");
                    System.out.print(resultPrint.getString(3)+" ");
                    System.out.print(resultPrint.getString(4)+" ");
                    System.out.print(resultPrint.getString(5)+" ");
                    System.out.print("    price: "+resultPrint.getInt(6)+"\n");
                    i++;
                }
            }
            else if(whichTable.equals("keyboard"))
            {
                while (resultPrint.next())
                {
                    System.out.print(i+") "+resultPrint.getString(2)+" ");
                    System.out.print(resultPrint.getString(3)+" ");
                    System.out.print(resultPrint.getString(4)+" ");
                    System.out.print(resultPrint.getString(5)+" ");
                    System.out.print("backlight: "+resultPrint.getBoolean(6)+" ");
                    System.out.print("    price: "+resultPrint.getInt(7)+"\n");
                    i++;
                }
            }
            else if(whichTable.equals("mouse"))
            {
                while (resultPrint.next())
                {
                    System.out.print(i+") "+resultPrint.getString(2)+" ");
                    System.out.print(resultPrint.getString(3)+" ");
                    System.out.print(resultPrint.getString(4)+" ");
                    System.out.print("    price: "+resultPrint.getInt(5)+"\n");
                    i++;
                }
            }
            //zakończenie połączenia
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}