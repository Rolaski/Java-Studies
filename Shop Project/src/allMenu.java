import java.util.InputMismatchException;

public class allMenu
{
    //tutaj jest początkowe menu, gdzie dokonuje się wyboru kategori zakupu, bądź panelu admina
    public static void whichOption()
    {
        try
        {
            allMenu.menu();
            System.out.print("What shopping do you choose? :");
            int choiceShopping = inputs.inputInt();
            switch (choiceShopping)
            {
                case 1 -> retailShopping.option1();
                case 2 -> wholesaleShopping.option2();
                case 3 -> adminPanel.option3();
                case 4 -> System.exit(1);
                default -> {
                    System.out.println("\nEnter correct number!");
                    whichOption();
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("ERROR: You must enter an integer between 1-4!!!\n");
            whichOption();
        }
    }
    public static void menu()
    {
        System.out.println("****************************************");
        System.out.println("1) Shopping for standard customers     *");
        System.out.println("2) Wholesale purchases                 *");
        System.out.println("3) Admin panel (login required)        *");
        System.out.println("4) Exit from store                     *");
        System.out.println("****************************************");
    }
    public static void menuProducts()
    {
        System.out.println("**********************************************");
        System.out.println("1) Show Personal Computers                   *");
        System.out.println("2) Show Laptops                              *");
        System.out.println("3) Show Tablet                               *");
        System.out.println("4) Show Smartphones                          *");
        System.out.println("5) Show Monitors                             *");
        System.out.println("6) Show Keyboards                            *");
        System.out.println("7) Show Mouse                                *");
        System.out.println("8) Show things from your shopping cart       *");
        System.out.println("9) Buy things from your own shopping cart    *");
        System.out.println("10) GO BACK                                  *");
        System.out.println("**********************************************");
    }
    public static void menuProductsLog()
    {
        System.out.println("**********************************************");
        System.out.println("1) Show Personal Computers                   *");
        System.out.println("2) Show Laptops                              *");
        System.out.println("3) Show Tablet                               *");
        System.out.println("4) Show Smartphones                          *");
        System.out.println("5) Show Monitors                             *");
        System.out.println("6) Show Keyboards                            *");
        System.out.println("7) Show Mouse                                *");
        System.out.println("8) Show my funds                             *");
        System.out.println("9) Add my funds                              *");
        System.out.println("10) Show things from your shopping cart      *");
        System.out.println("11) Buy things from your own shopping cart   *");
        System.out.println("12) GO BACK                                  *");
        System.out.println("**********************************************");
    }

    public static void menuAdmin()
    {
        System.out.println("****************************************");
        System.out.println("1) Add Personal computer to database   *");
        System.out.println("2) Add Laptop to database              *");
        System.out.println("3) Add Tablet to database              *");
        System.out.println("4) Add Smartphone to database          *");
        System.out.println("5) Add Monitor to database             *");
        System.out.println("6) Add Keyboard to database            *");
        System.out.println("7) Add Mouse to database               *");
        System.out.println("8) Add user to database                *");
        System.out.println("9) GO BACK                             *");
        System.out.println("****************************************");
    }
}
