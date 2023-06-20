import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n**************WELCOME TO THE ELECTRONICS STORE!**************");
        whichOption();
    }

    //================================ SEKCJA WYBORU ================================
    //tutaj jest początkowe menu, gdzie dokonuje się wyboru kategori zakupu, bądź panelu admina
    public static void whichOption()
    {
        menu();
        System.out.print("What shopping do you choose? :");
        int choiceShopping = inputInt();
        switch (choiceShopping)
        {
            case 1:
                option1();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(1);
                break;
            default:
                System.out.println("\nEnter correct number!");
                whichOption();
                break;
        }
    }


    //================================ SEKCJA ZAKUPÓW DETALICZNYCH ================================

    public static void option1()
    {
        System.out.println("\n===============RETAIL SHOPPING===============");
        System.out.println("Remember that as a retail customer you can buy a maximum of 5 items!");
        while(true)
        {
            menuProducts();
            System.out.print("What do you want to do?: ");
            int choiceOption = inputInt(); System.out.println();
            switch (choiceOption)
            {
                case 1:
                    DataBase showPc = new DataBase("SELECT * from jdbc.pc");
                    showPc.showPc(); System.out.println();
                    buyingPC();

                    break;
                case 2:
                    DataBase laptopShow = new DataBase("SELECT * from jdbc.laptop");
                    laptopShow.showLaptop();
                    buyingLaptop();
                    break;
                case 3:
                    DataBase tabletShow = new DataBase("SELECT * from jdbc.tablet");
                    tabletShow.showTablet();
                    buyingTablet();
                    break;
                case 4:
                    DataBase smartphoneShow = new DataBase("SELECT * from jdbc.smartphone");
                    smartphoneShow.showSmartphone();
                    buyingSmartphone();
                    break;
                case 5:
                    DataBase monitorShow = new DataBase("SELECT * from jdbc.monitor");
                    monitorShow.showMonitor();
                    buyingMonitor();
                    break;
                case 6:
                    DataBase keyboardShow = new DataBase("SELECT * from jdbc.keyboard");
                    keyboardShow.showKeyboard();
                    buyingKeyboard();
                    break;
                case 7:
                    DataBase mouseShow = new DataBase("SELECT * from jdbc.mouse");
                    mouseShow.showMouse();
                    buyingMouse();
                    break;
                case 8:
                    shoppingCartTotal();

                    break;
                case 9:
                    whichOption();
                default:
                    System.out.println("Enter correct number!\n");
            }
        }
    }





    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //======================================= DLA KOMPUTERÓW STACJONARNYCH ========================================
    //sekcja globalnych danych żeby każdy je widział
    static int sum = 0;
    static int[] quantityPc = {0,0,0,0,0};
    static int[] quantityLaptop = {0,0,0,0,0};
    static int[] quantityTablet = {0,0,0,0,0};
    static int[] quantitySmartphone = {0,0,0,0,0};
    static int[] quantityMonitor = {0,0,0,0,0};
    public static void shoppingCartPC()
    {
        if(pcOnList.isEmpty() && laptopOnList.isEmpty() && tabletOnList.isEmpty() && smartphoneOnList.isEmpty() && monitorOnList.isEmpty() && keyboardOnList.isEmpty() && mouseOnList.isEmpty())
        {
            x =0;
            System.out.println("Your shopping cart is empty!\n");
        }
        else
        {
            //obliczanie sumy kwoty za komputery i zmiana ilości magazynowej
            for(int j=0; j< pcOnList.size(); j++)
            {
                sum = sum + shoppingCartSum(pcOnList.get(j), "pc","PC");
                quantityCountPc(j);
            }
        }
    }
    //Liczenie ilosci dla komputerow
    public static void quantityCountPc(int j)
    {
        if(pcOnList.get(j)==1)
        {
            quantityPc[0]++;
        }
        else if(pcOnList.get(j)==2)
        {
            quantityPc[1]++;
        }
        else if(pcOnList.get(j)==3)
        {
            quantityPc[2]++;;
        }
        else if(pcOnList.get(j)==4)
        {
            quantityPc[3]++;
        }
        else
        {
            quantityPc[4]++;
        }
    }

    //Wykonywanie sumowania ceny produktu, ma być w pętli
    public static int shoppingCartSum(Integer option, String option2,String option3)
    {
        int sumMoney = 0;
        DataBase priceCheck = new DataBase("SELECT price FROM jdbc."+option2+" WHERE id"+option3+" = "+option+";");
        sumMoney = sumMoney + priceCheck.totalPrice();
        return sumMoney;
    }
    public static int shoppingCartQuantityUpdate(Integer option,String option2,String option3, int option4)
    {
        DataBase quantityUpdate = new DataBase("UPDATE jdbc."+option2+" SET quantity ="+option4+" WHERE id"+option3+" ="+option);
        int quantityUpdating = quantityUpdate.updateQuantity();
        return quantityUpdating;
    }
    public static int shoppingCartQuantityCheck(Integer option, String option2,String option3)
    {
        DataBase quantityCheck = new DataBase("SELECT quantity FROM jdbc."+option2+" WHERE id"+option3+" = "+option+";");
        int quantityActual = quantityCheck.totalQuantity();
        return quantityActual;
    }


    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //=============================================== DLA LAPTOPÓW =================================================
    public static void shoppingCartLaptop()
    {
        for(int j=0; j< laptopOnList.size(); j++)
        {
            sum = sum + shoppingCartSum(laptopOnList.get(j), "laptop","Laptop");
            quantityCountLaptop(j);
        }
    }
    public static void quantityCountLaptop(int j)
    {
        if(laptopOnList.get(j)==1)
        {
            quantityLaptop[0]++;
        }
        else if(laptopOnList.get(j)==2)
        {
            quantityLaptop[1]++;
        }
        else if(laptopOnList.get(j)==3)
        {
            quantityLaptop[2]++;;
        }
        else if(laptopOnList.get(j)==4)
        {
            quantityLaptop[3]++;
        }
        else
        {
            quantityLaptop[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //=============================================== DLA TABLETÓW =================================================
    public static void shoppingCartTablet()
    {
        for(int j=0; j< tabletOnList.size(); j++)
        {
            sum = sum + shoppingCartSum(tabletOnList.get(j), "tablet","tablet");
            quantityCountTablet(j);
        }
    }
    public static void quantityCountTablet(int j)
    {
        if(tabletOnList.get(j)==1)
        {
            quantityTablet[0]++;
        }
        else if(tabletOnList.get(j)==2)
        {
            quantityTablet[1]++;
        }
        else if(tabletOnList.get(j)==3)
        {
            quantityTablet[2]++;;
        }
        else if(tabletOnList.get(j)==4)
        {
            quantityTablet[3]++;
        }
        else
        {
            quantityTablet[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ DLA SMARTPHONE ==================================================
    public static void shoppingCartSmartphone()
    {
        for(int j=0; j< smartphoneOnList.size(); j++)
        {
            sum = sum + shoppingCartSum(smartphoneOnList.get(j), "smartphone","smartphone");
            quantityCountSmartpone(j);
        }
    }
    public static void quantityCountSmartpone(int j)
    {
        if(smartphoneOnList.get(j)==1)
        {
            quantitySmartphone[0]++;
        }
        else if(smartphoneOnList.get(j)==2)
        {
            quantitySmartphone[1]++;
        }
        else if(smartphoneOnList.get(j)==3)
        {
            quantitySmartphone[2]++;;
        }
        else if(smartphoneOnList.get(j)==4)
        {
            quantitySmartphone[3]++;
        }
        else
        {
            quantitySmartphone[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ DLA MONITORÓW ==================================================
    public static void shoppingCartMonitor()
    {
        for(int j=0; j< monitorOnList.size(); j++)
        {
            sum = sum + shoppingCartSum(monitorOnList.get(j), "monitor","monitor");
            quantityCountMonitor(j);
        }
    }
    public static void quantityCountMonitor(int j)
    {
        if(monitorOnList.get(j)==1)
        {
            quantityMonitor[0]++;
        }
        else if(monitorOnList.get(j)==2)
        {
            quantityMonitor[1]++;
        }
        else if(monitorOnList.get(j)==3)
        {
            quantityMonitor[2]++;;
        }
        else if(monitorOnList.get(j)==4)
        {
            quantityMonitor[3]++;
        }
        else
        {
            quantityMonitor[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ PODSUMOWUJĄCA =======================================
    public static void shoppingCartTotal()
    {
        shoppingCartPC();
        shoppingCartLaptop();
        shoppingCartTablet();
        shoppingCartSmartphone();
        shoppingCartMonitor();
        //wpłacanie hajsu
        System.out.print("Enter the amount you are paying into your wallet: ");
        int money = inputInt();
        if((money-sum)<0)
        {
            System.out.println("You have no money, the order has been canceled!");
            pcOnList.clear();
        }
        else
        {
            System.out.println("The order has been sent");
            //pętla do aktualizacji produktów
            for(int j=0; j<5;j++)
            {
                //pobranie akutalnej ilosci komputerow i wprowadzenie do bazy
                int quantityActualPc = shoppingCartQuantityCheck(j+1, "pc","PC");
                int quantityNewPc = shoppingCartQuantityUpdate(j+1,"pc","PC", (quantityActualPc- quantityPc[j]));

                //pobieranie akutalnej ilosci laptopow i wprowadzenie do bazy
                int quantityActualLaptop = shoppingCartQuantityCheck(j+1, "laptop","Laptop");
                int quantityNewLaptop = shoppingCartQuantityUpdate(j+1, "laptop", "Laptop", (quantityActualLaptop-quantityLaptop[j]));

                //pobieranie akutalnej ilosci tabletow i wprowadzenie do bazy
                int quantityAcutalTablet = shoppingCartQuantityCheck(j+1,"tablet","tablet");
                int quantityNewTablet = shoppingCartQuantityUpdate(j+1, "tablet", "tablet",(quantityAcutalTablet-quantityTablet[j]));

                //pobieranie akutalnej ilosci telefonow i wprowadzenie do bazy
                int quantityActualSmartphone = shoppingCartQuantityCheck(j+1, "smartphone","smartphone");
                int quantityNewSmartphone = shoppingCartQuantityUpdate(j+1, "smartphone","smartphone",(quantityActualSmartphone-quantitySmartphone[j]));

                //pobieranie akutalnej ilosci monitorow i wprowadzenie do bazy
                int quantityActualMonitor = shoppingCartQuantityCheck(j+1, "monitor", "monitor");
                int quantityNewMonitor = shoppingCartQuantityUpdate(j+1, "monitor", "monitor", (quantityActualMonitor-quantityMonitor[j]));
            }
        }
        System.out.println(sum+" "+money);
        //czyszczenie listy po zakupach
        pcOnList.clear();

    }


    //================================ SEKCJA DODAWANIA DO KOSZYKA, WIELOKROTNEGO ZAKUPU ================================
    // ============== TUTAJ DODAJEMY PRODUKTY DO KOSZYKA, KLIENT WYBIERA CO CHCE UMIEŚCIĆ NA LIŚCIE A CO NIE ============

    //koszyki zakupowe listy, zrobione tak aby widoczne były dla każdej metody
    public static ArrayList<Integer> pcOnList = new ArrayList<Integer>();
    public static ArrayList<Integer> laptopOnList = new ArrayList<Integer>();
    public static ArrayList<Integer> tabletOnList = new ArrayList<Integer>();
    public static ArrayList<Integer> smartphoneOnList = new ArrayList<Integer>();
    public static ArrayList<Integer> monitorOnList = new ArrayList<Integer>();
    public static ArrayList<Integer> keyboardOnList = new ArrayList<Integer>();
    public static ArrayList<Integer> mouseOnList = new ArrayList<Integer>();
    //zmienna x, ktora odpowiada za maksymalna ilosc rzeczy jako detaliczny klient moze kupic
    public static int x = 0;

    //sekcja do wielokrotnego dodawania do koszyka komputerów
    public static void buyingPC()
    {
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputString();
            //sprawdzamy w ifie czy przypadkiem klient nie ma juz max towarow w koszyku
            if(x !=5)
            {
                if(choiceBuyOrNot.equals("yes"))
                {
                    System.out.print("Which option do you want to buy?:");
                    int choiceBuy = inputInt();
                    switch (choiceBuy)
                    {
                        case 1:
                            System.out.println("Computer number 1 has been added to the cart!\n");
                            pcOnList.add(1);
                            break;
                        case 2:
                            System.out.println("Computer number 2 has been added to the cart!\n");
                            pcOnList.add(2);
                            break;
                        case 3:
                            System.out.println("Computer number 3 has been added to the cart!\n");
                            pcOnList.add(3);
                            break;
                        case 4:
                            System.out.println("Computer number 4 has been added to the cart!\n");
                            pcOnList.add(4);
                            break;
                        case 5:
                            System.out.println("Computer number 5 has been added to the cart!\n");
                            pcOnList.add(5);
                            break;
                        default:
                            System.out.print("Enter correct number!\n");
                    }
                    //zwiekszamy x po dodaniu towaru do koszyka
                    x++;
                }
                else
                {
                    System.out.println();
                    break;
                }
            }
            else
            {
                //wywala nam zakup jesli juz klient detaliczny ma max produktow
                System.out.println("you have added 5 items to your cart, you cannot add more!\n");
                break;
            }

        }
    }
    //sekcja do wielokrotnego dodawania do koszyka laptopów
    public static void buyingLaptop()
    {
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputString();
            if(x !=5)
            {
                if(choiceBuyOrNot.equals("yes"))
                {
                    System.out.print("Which option do you want to buy?:");
                    int choiceBuy = inputInt();
                    switch (choiceBuy)
                    {
                        case 1:
                            System.out.println("Laptop number 1 has been added to the cart!\n");
                            laptopOnList.add(1);
                            break;
                        case 2:
                            System.out.println("Laptop  number 2 has been added to the cart!\n");
                            laptopOnList.add(2);
                            break;
                        case 3:
                            System.out.println("Laptop  number 3 has been added to the cart!\n");
                            laptopOnList.add(3);
                            break;
                        case 4:
                            System.out.println("Laptop  number 4 has been added to the cart!\n");
                            laptopOnList.add(4);
                            break;
                        case 5:
                            System.out.println("Laptop  number 5 has been added to the cart!\n");
                            laptopOnList.add(5);
                            break;
                        default:
                            System.out.print("Enter correct number!\n");
                    }
                    x++;
                }
                else
                {
                    System.out.println();
                    break;
                }
            }
            else
            {
                System.out.println("you have added 5 items to your cart, you cannot add more!\n");
                break;
            }

        }
    }
    //sekcja do wielokrotnego dodawania do koszyka tabletow
    public static void buyingTablet()
    {
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputString();
            if(x !=5)
            {
                if(choiceBuyOrNot.equals("yes"))
                {
                    System.out.print("Which option do you want to buy?:");
                    int choiceBuy = inputInt();
                    switch (choiceBuy)
                    {
                        case 1:
                            System.out.println("Tablet number 1 has been added to the cart!\n");
                            tabletOnList.add(1);
                            break;
                        case 2:
                            System.out.println("Tablet  number 2 has been added to the cart!\n");
                            tabletOnList.add(2);
                            break;
                        case 3:
                            System.out.println("Tablet  number 3 has been added to the cart!\n");
                            tabletOnList.add(3);
                            break;
                        case 4:
                            System.out.println("Tablet  number 4 has been added to the cart!\n");
                            tabletOnList.add(4);
                            break;
                        case 5:
                            System.out.println("Tablet  number 5 has been added to the cart!\n");
                            tabletOnList.add(5);
                            break;
                        default:
                            System.out.print("Enter correct number!\n");
                    }
                }
                else
                {
                    System.out.println();
                    break;
                }
                x++;
            }
            else
            {
                System.out.println("you have added 5 items to your cart, you cannot add more!\n");
                break;
            }

        }
    }
    //sekcja do wielokrotnego dodawania do koszyka monitorow
    public static void buyingMonitor()
    {
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputString();
            if(x !=5)
            {
                if(choiceBuyOrNot.equals("yes"))
                {
                    System.out.print("Which option do you want to buy?:");
                    int choiceBuy = inputInt();
                    switch (choiceBuy)
                    {
                        case 1:
                            System.out.println("Monitor number 1 has been added to the cart!\n");
                            monitorOnList.add(1);
                            break;
                        case 2:
                            System.out.println("Monitor  number 2 has been added to the cart!\n");
                            monitorOnList.add(2);
                            break;
                        case 3:
                            System.out.println("Monitor  number 3 has been added to the cart!\n");
                            monitorOnList.add(3);
                            break;
                        case 4:
                            System.out.println("Monitor  number 4 has been added to the cart!\n");
                            monitorOnList.add(4);
                            break;
                        case 5:
                            System.out.println("Monitor  number 5 has been added to the cart!\n");
                            monitorOnList.add(5);
                            break;
                        default:
                            System.out.print("Enter correct number!\n");
                    }
                }
                else
                {
                    System.out.println();
                    break;
                }
                x++;
            }
            else
            {
                System.out.println("you have added 5 items to your cart, you cannot add more!\n");
                break;
            }
        }
    }
    //sekcja do wielokrotnego dodawania do koszyka telefonow
    public static void buyingSmartphone()
    {
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputString();
            if(x !=5)
            {
                if(choiceBuyOrNot.equals("yes"))
                {
                    System.out.print("Which option do you want to buy?:");
                    int choiceBuy = inputInt();
                    switch (choiceBuy)
                    {
                        case 1:
                            System.out.println("Smartphone number 1 has been added to the cart!\n");
                            smartphoneOnList.add(1);
                            break;
                        case 2:
                            System.out.println("Smartphone  number 2 has been added to the cart!\n");
                            smartphoneOnList.add(2);
                            break;
                        case 3:
                            System.out.println("Smartphone  number 3 has been added to the cart!\n");
                            smartphoneOnList.add(3);
                            break;
                        case 4:
                            System.out.println("Smartphone  number 4 has been added to the cart!\n");
                            smartphoneOnList.add(4);
                            break;
                        case 5:
                            System.out.println("Smartphone  number 5 has been added to the cart!\n");
                            smartphoneOnList.add(5);
                            break;
                        default:
                            System.out.print("Enter correct number!\n");
                    }
                }
                else
                {
                    System.out.println();
                    break;
                }
                x++;
            }
            else
            {
                System.out.println("you have added 5 items to your cart, you cannot add more!\n");
                break;
            }
        }
    }

    //sekcja do wielokrotnego dodawania do koszyka klawiatur
    public static void buyingKeyboard()
    {
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputString();
            if(x !=5)
            {
                if(choiceBuyOrNot.equals("yes"))
                {
                    System.out.print("Which option do you want to buy?:");
                    int choiceBuy = inputInt();
                    switch (choiceBuy)
                    {
                        case 1:
                            System.out.println("Keyboard number 1 has been added to the cart!\n");
                            keyboardOnList.add(1);
                            break;
                        case 2:
                            System.out.println("Keyboard number 2 has been added to the cart!\n");
                            keyboardOnList.add(2);
                            break;
                        case 3:
                            System.out.println("Keyboard number 3 has been added to the cart!\n");
                            keyboardOnList.add(3);
                            break;
                        case 4:
                            System.out.println("Keyboard number 4 has been added to the cart!\n");
                            keyboardOnList.add(4);
                            break;
                        case 5:
                            System.out.println("Keyboard number 5 has been added to the cart!\n");
                            keyboardOnList.add(5);
                            break;
                        default:
                            System.out.print("Enter correct number!\n");
                    }
                }
                else
                {
                    System.out.println();
                    break;
                }
                x++;
            }
            else
            {
                System.out.println("you have added 5 items to your cart, you cannot add more!\n");
                break;
            }
        }
    }
    //sekcja do wielokrotnego dodawania do koszyka myszek
    public static void buyingMouse()
    {
        while (true)
        {
            if(x !=5)
            {
                System.out.print("\nAdd to shopping cart? (yes/no): ");
                String choiceBuyOrNot = inputString();
                if(choiceBuyOrNot.equals("yes"))
                {
                    System.out.print("Which option do you want to buy?:");
                    int choiceBuy = inputInt();
                    switch (choiceBuy)
                    {
                        case 1:
                            System.out.println("Mouse number 1 has been added to the cart!\n");
                            mouseOnList.add(1);
                            break;
                        case 2:
                            System.out.println("Mouse number 2 has been added to the cart!\n");
                            mouseOnList.add(2);
                            break;
                        case 3:
                            System.out.println("Mouse number 3 has been added to the cart!\n");
                            mouseOnList.add(3);
                            break;
                        case 4:
                            System.out.println("Mouse number 4 has been added to the cart!\n");
                            mouseOnList.add(4);
                            break;
                        case 5:
                            System.out.println("Mouse number 5 has been added to the cart!\n");
                            mouseOnList.add(5);
                            break;
                        default:
                            System.out.print("Enter correct number!\n");
                    }
                }
                else
                {
                    System.out.println();
                    break;
                }
                x++;
            }
            else
            {
                System.out.println("you have added 5 items to your cart, you cannot add more!\n");
                break;
            }

        }
    }







    //================================ SEKCJA SCANNEROW DO METOD ================================
    public static String inputString()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static int inputInt()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    //================================ SEKCJA MENU, PRINTY ================================
    public static void menu()
    {
        System.out.println("1) Shopping for standard customers");
        System.out.println("2) Wholesale purchases");
        System.out.println("3) Admin panel (login required)");
        System.out.println("4) Exit from store");
    }
    public static void menuProducts()
    {
        System.out.println("1) Show Personal Computers");
        System.out.println("2) Show Laptops");
        System.out.println("3) Show Tablet");
        System.out.println("4) Show Smartphones");
        System.out.println("5) Show Monitors");
        System.out.println("6) Show Keyboards");
        System.out.println("7) Show Mouse");
        System.out.println("8) Buy things from your own shopping cart");
        System.out.println("9) GO BACK");
    }
}