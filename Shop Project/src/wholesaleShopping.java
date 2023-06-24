import java.util.ArrayList;
import java.util.InputMismatchException;

public class wholesaleShopping
{
    //stworzenie listy w ktorych sa trzymane produkty do koszyka tak zeby byly widoczne fest
    public static ArrayList<Integer> pcOnListLog = new ArrayList<>();
    public static ArrayList<Integer> laptopOnListLog = new ArrayList<>();
    public static ArrayList<Integer> tabletOnListLog = new ArrayList<>();
    public static ArrayList<Integer> smartphoneOnListLog = new ArrayList<>();
    public static ArrayList<Integer> monitorOnListLog = new ArrayList<>();
    public static ArrayList<Integer> keyboardOnListLog = new ArrayList<>();
    public static ArrayList<Integer> mouseOnListLog = new ArrayList<>();
    public static String login, password;
    public static int sumLog = 0, moneyLog;

    //=========================================== SEKCJA LOGOWANIA, SPRAWDZANIA DANYCH ===========================
    public static void option2()
    {
        System.out.println("\n\n**************** LOGIN ****************");
        for(int j=0; j<=3; j++)
        {
            //przyjazd policji po nieudanych próbach logowania
            if(j==3)
            {
                System.out.println("You wanted to break in! The police will come for you soon");
                System.exit(1);
            }

            System.out.print("Enter login: ");
            login = inputs.inputString();
            System.out.print("Enter password: ");
            password = inputs.inputString();

            DataBase loginUser = new DataBase("SELECT login,password FROM jdbc.customers where login = '"+login+"' AND password = '"+password+"';");
            boolean loginAccept = loginUser.login();
            if(loginAccept)
            {
                System.out.println("\n\n======================== WHOLESALE SHOPPING ========================");
                System.out.println("Hi "+login+", as a logged in customer you have unlimited purchases!");
                loginSuccessful();
            }
            else {
                System.out.println("\nIncorrect login details!");
            }
        }
    }

    //=========================================== JEŚLI ZALOGOWANO POMYŚLNIE ==================================
    //====================================== DOSTAJESZ DOSTĘP DO PANELU ZAKUPOWEGO ============================
    public static void loginSuccessful()
    {
        int choiceOption=0;
        while(true)
        {
            System.out.println();
            allMenu.menuProductsLog();
            try
            {
                System.out.print("What do you want to do?: ");
                choiceOption = inputs.inputInt(); System.out.println();
            }
            catch (InputMismatchException e)
            {
                System.out.println("ERROR: you must enter an integer between 1-12!\n");
                loginSuccessful();
            }
            switch (choiceOption)
            {
                case 1:
                    DataBase showPc = new DataBase("SELECT * from jdbc.pc");
                    showPc.showPc(); System.out.println();
                    buyingPCLog();
                    break;
                case 2:
                    DataBase laptopShow = new DataBase("SELECT * from jdbc.laptop");
                    laptopShow.showLaptop();
                    buyingLaptopLog();
                    break;
                case 3:
                    DataBase tabletShow = new DataBase("SELECT * from jdbc.tablet");
                    tabletShow.showTablet();
                    buyingTabletLog();
                    break;
                case 4:
                    DataBase smartphoneShow = new DataBase("SELECT * from jdbc.smartphone");
                    smartphoneShow.showSmartphone();
                    buyingSmartphoneLog();
                    break;
                case 5:
                    DataBase monitorShow = new DataBase("SELECT * from jdbc.monitor");
                    monitorShow.showMonitor();
                    buyingMonitorLog();
                    break;
                case 6:
                    DataBase keyboardShow = new DataBase("SELECT * from jdbc.keyboard");
                    keyboardShow.showKeyboard();
                    buyingKeyboardLog();
                    break;
                case 7:
                    DataBase mouseShow = new DataBase("SELECT * from jdbc.mouse");
                    mouseShow.showMouse();
                    buyingMouseLog();
                    break;
                case 8:
                    clientWallet.clientWalletCheck(login);
                    break;
                case 9:
                    clientWallet.clientWalletUpdate(login);
                    break;
                case 10:
                    showCartWholesale.showCartAll();
                    break;
                case 11:
                    shoppingCartTotalLog();
                    break;
                case 12:
                    //wyszedłeś z konta? to czyścimy twoj koszyk typie
                    pcOnListLog.clear(); laptopOnListLog.clear();tabletOnListLog.clear(); smartphoneOnListLog.clear();
                    monitorOnListLog.clear(); keyboardOnListLog.clear(); mouseOnListLog.clear();
                    for(int j=0; j<5; j++)
                    {
                        quantityPcLog[j] = 0; quantityLaptopLog[j] = 0; quantityTabletLog[j]=0;
                        quantitySmartphoneLog[j]=0; quantityMonitorLog[j]=0; quantityKeyboardLog[j]=0; quantityMouseLog[j]=0;
                        showCartWholesale.quantityPcCartLog[j] =0; showCartWholesale.quantityLaptopCartLog[j] =0; showCartWholesale.quantityTabletCartLog[j]=0; showCartWholesale.quantityMonitorCartLog[j]=0;
                        showCartWholesale.quantityKeyboardCartLog[j]=0; showCartWholesale.quantityMouseCartLog[j]=0;
                    }
                    allMenu.whichOption();
                default:
                    System.out.println("Enter correct number!\n");
            }
        }
    }

    //==================================== SEKCJA KOSZYKA, SUMUJĄCA DLA KOMPUTERÓW =================================
    public static boolean shoppingCartPCLog()
    {
        //zmienna cartEmpty mówi nam o tym czy lista zakupowa jest pusta czy nie, potem jej użyjemy
        //do sprawdzenia czy możemy dokonac zakupów czy nie
        boolean cartEmpty = false;
        if(pcOnListLog.isEmpty() && laptopOnListLog.isEmpty() && tabletOnListLog.isEmpty() && smartphoneOnListLog.isEmpty() && monitorOnListLog.isEmpty() && keyboardOnListLog.isEmpty() && mouseOnListLog.isEmpty())
        {
            System.out.println("Your shopping cart is empty!");
            cartEmpty = true;
        }
        else
        {
            //obliczanie sumy kwoty za komputery i ustawienie nowej ilości magazynowej która się ma zmienić potem
            for(int j=0; j< pcOnListLog.size(); j++)
            {
                sumLog = sumLog + shoppingCartOperations.shoppingCartSum(pcOnListLog.get(j), "pc","PC");
                quantityCountPcLog(j);
                cartEmpty = false;
            }
        }
        return cartEmpty;
    }
    //Liczenie ilosci dla komputerow
    public static void quantityCountPcLog(int j)
    {
        if(pcOnListLog.get(j)==1)
        {
            quantityPcLog[0]++;
        }
        else if(pcOnListLog.get(j)==2)
        {
            quantityPcLog[1]++;
        }
        else if(pcOnListLog.get(j)==3)
        {
            quantityPcLog[2]++;
        }
        else if(pcOnListLog.get(j)==4)
        {
            quantityPcLog[3]++;
        }
        else
        {
            quantityPcLog[4]++;
        }
    }
    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //=============================================== DLA LAPTOPÓW =================================================
    public static void shoppingCartLaptopLog()
    {
        for(int j=0; j< laptopOnListLog.size(); j++)
        {
            sumLog = sumLog + shoppingCartOperations.shoppingCartSum(laptopOnListLog.get(j), "laptop","Laptop");
            quantityCountLaptopLog(j);
        }
    }
    public static void quantityCountLaptopLog(int j)
    {
        if(laptopOnListLog.get(j)==1)
        {
            quantityLaptopLog[0]++;
        }
        else if(laptopOnListLog.get(j)==2)
        {
            quantityLaptopLog[1]++;
        }
        else if(laptopOnListLog.get(j)==3)
        {
            quantityLaptopLog[2]++;
        }
        else if(laptopOnListLog.get(j)==4)
        {
            quantityLaptopLog[3]++;
        }
        else
        {
            quantityLaptopLog[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //=============================================== DLA TABLETÓW =================================================
    public static void shoppingCartTabletLog()
    {
        for(int j=0; j< tabletOnListLog.size(); j++)
        {
            sumLog = sumLog + shoppingCartOperations.shoppingCartSum(tabletOnListLog.get(j), "tablet","tablet");
            quantityCountTabletLog(j);
        }
    }
    public static void quantityCountTabletLog(int j)
    {
        if(tabletOnListLog.get(j)==1)
        {
            quantityTabletLog[0]++;
        }
        else if(tabletOnListLog.get(j)==2)
        {
            quantityTabletLog[1]++;
        }
        else if(tabletOnListLog.get(j)==3)
        {
            quantityTabletLog[2]++;
        }
        else if(tabletOnListLog.get(j)==4)
        {
            quantityTabletLog[3]++;
        }
        else
        {
            quantityTabletLog[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ DLA SMARTPHONE ==================================================
    public static void shoppingCartSmartphoneLog()
    {
        for(int j=0; j< smartphoneOnListLog.size(); j++)
        {
            sumLog = sumLog + shoppingCartOperations.shoppingCartSum(smartphoneOnListLog.get(j), "smartphone","smartphone");
            quantityCountSmartponeLog(j);
        }
    }
    public static void quantityCountSmartponeLog(int j)
    {
        if(smartphoneOnListLog.get(j)==1)
        {
            quantitySmartphoneLog[0]++;
        }
        else if(smartphoneOnListLog.get(j)==2)
        {
            quantitySmartphoneLog[1]++;
        }
        else if(smartphoneOnListLog.get(j)==3)
        {
            quantitySmartphoneLog[2]++;
        }
        else if(smartphoneOnListLog.get(j)==4)
        {
            quantitySmartphoneLog[3]++;
        }
        else
        {
            quantitySmartphoneLog[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ DLA MONITORÓW ==================================================
    public static void shoppingCartMonitorLog()
    {
        for(int j=0; j< monitorOnListLog.size(); j++)
        {
            sumLog = sumLog + shoppingCartOperations.shoppingCartSum(monitorOnListLog.get(j), "monitor","monitor");
            quantityCountMonitorLog(j);
        }
    }
    public static void quantityCountMonitorLog(int j)
    {
        if(monitorOnListLog.get(j)==1)
        {
            quantityMonitorLog[0]++;
        }
        else if(monitorOnListLog.get(j)==2)
        {
            quantityMonitorLog[1]++;
        }
        else if(monitorOnListLog.get(j)==3)
        {
            quantityMonitorLog[2]++;
        }
        else if(monitorOnListLog.get(j)==4)
        {
            quantityMonitorLog[3]++;
        }
        else
        {
            quantityMonitorLog[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ DLA KLAWIATUR ===================================================
    public static void shoppingCartKeyboardLog()
    {
        for(int j=0; j< keyboardOnListLog.size(); j++)
        {
            sumLog = sumLog + shoppingCartOperations.shoppingCartSum(keyboardOnListLog.get(j), "keyboard","keyboard");
            quantityCountKeyboardLog(j);
        }
    }
    public static void quantityCountKeyboardLog(int j)
    {
        if(keyboardOnListLog.get(j)==1)
        {
            quantityKeyboardLog[0]++;
        }
        else if(keyboardOnListLog.get(j)==2)
        {
            quantityKeyboardLog[1]++;
        }
        else if(keyboardOnListLog.get(j)==3)
        {
            quantityKeyboardLog[2]++;
        }
        else if(keyboardOnListLog.get(j)==4)
        {
            quantityKeyboardLog[3]++;
        }
        else
        {
            quantityKeyboardLog[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ DLA MYSZEK ===================================================
    public static void shoppingCartMouseLog()
    {
        for(int j=0; j< mouseOnListLog.size(); j++)
        {
            sumLog = sumLog + shoppingCartOperations.shoppingCartSum(mouseOnListLog.get(j), "monitor","monitor");
            quantityCountMouseLog(j);
        }
    }

    public static void quantityCountMouseLog(int j)
    {
        if(mouseOnListLog.get(j)==1)
        {
            quantityMouseLog[0]++;
        }
        else if(mouseOnListLog.get(j)==2)
        {
            quantityMouseLog[1]++;
        }
        else if(mouseOnListLog.get(j)==3)
        {
            quantityMouseLog[2]++;
        }
        else if(mouseOnListLog.get(j)==4)
        {
            quantityMouseLog[3]++;
        }
        else
        {
            quantityMouseLog[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ PODSUMOWUJĄCA ==================================================
    static int[] quantityPcLog = {0,0,0,0,0};
    static int[] quantityLaptopLog = {0,0,0,0,0};
    static int[] quantityTabletLog = {0,0,0,0,0};
    static int[] quantitySmartphoneLog = {0,0,0,0,0};
    static int[] quantityMonitorLog = {0,0,0,0,0};
    static int[] quantityKeyboardLog = {0,0,0,0,0};
    static int[] quantityMouseLog = {0,0,0,0,0};
    public static void shoppingCartTotalLog()
    {
        //wywołanie funkcji liczących cenę i ilość przedmiotów
        boolean cartEmpty = shoppingCartPCLog();
        shoppingCartLaptopLog();
        shoppingCartTabletLog();
        shoppingCartSmartphoneLog();
        shoppingCartMonitorLog();
        shoppingCartKeyboardLog();
        shoppingCartMouseLog();

        //wprowadzanie hajsu z bazy dla konkretnego użytkownika
        DataBase walletCheck = new DataBase("SELECT wallet FROM jdbc.customers where login='"+login+"';");
        moneyLog = walletCheck.walletUser();
        int restLog = moneyLog - sumLog;

        if((moneyLog-sumLog)<0 || moneyLog==0 || cartEmpty == true)
        {
            System.out.println("Your order has been canceled! :(");
        }
        else
        {
            System.out.println("Money left: "+restLog);
            System.out.println("The total price of your order: "+sumLog);
            System.out.println("THE ORDER HAS BEEN SENT :)");
            //pętla do aktualizacji produktów
            for(int j=0; j<5;j++)
            {
                //pobranie akutalnej ilosci komputerow i wprowadzenie do bazy
                int quantityActualPc = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "pc","PC");
                int quantityNewPc = shoppingCartOperations.shoppingCartQuantityUpdate(j+1,"pc","PC", (quantityActualPc- quantityPcLog[j]));

                //pobieranie akutalnej ilosci laptopow i wprowadzenie do bazy
                int quantityActualLaptop = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "laptop","Laptop");
                int quantityNewLaptop = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "laptop", "Laptop", (quantityActualLaptop-quantityLaptopLog[j]));

                //pobieranie akutalnej ilosci tabletow i wprowadzenie do bazy
                int quantityAcutalTablet = shoppingCartOperations.shoppingCartQuantityCheck(j+1,"tablet","tablet");
                int quantityNewTablet = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "tablet", "tablet",(quantityAcutalTablet-quantityTabletLog[j]));

                //pobieranie akutalnej ilosci telefonow i wprowadzenie do bazy
                int quantityActualSmartphone = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "smartphone","smartphone");
                int quantityNewSmartphone = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "smartphone","smartphone",(quantityActualSmartphone-quantitySmartphoneLog[j]));

                //pobieranie akutalnej ilosci monitorow i wprowadzenie do bazy
                int quantityActualMonitor = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "monitor", "monitor");
                int quantityNewMonitor = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "monitor", "monitor", (quantityActualMonitor-quantityMonitorLog[j]));

                //pobieranie akutalnej ilosci klawiatur i wprowadzenie do bazy
                int quantityActualKeyboard = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "keyboard", "keyboard");
                int quantityNewKeyboard = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "keyboard", "keyboard", (quantityActualKeyboard-quantityKeyboardLog[j]));

                //pobieranie akutalnej ilosci mysz i wprowadzenie do bazy
                int quantityActualMouse = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "mouse", "mouse");
                int quantityNewMouse = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "mouse", "mouse", (quantityActualMouse-quantityMouseLog[j]));
            }
            //przypisanie nowej ilości hajsu po zakupach i aktualizacja w bazie portfela klienta
            DataBase moneyUpdate = new DataBase("UPDATE jdbc.customers SET wallet = '"+restLog+"' WHERE login = '"+login+"';");
            moneyUpdate.productInput();
        }
        //czyszczenie listy po zakupach
        pcOnListLog.clear(); laptopOnListLog.clear(); tabletOnListLog.clear(); smartphoneOnListLog.clear(); monitorOnListLog.clear(); keyboardOnListLog.clear(); mouseOnListLog.clear();
        //czyszczenie ilości danych produktów
        for(int j=0; j<5; j++)
        {
            quantityPcLog[j]=0; quantityLaptopLog[j]=0; quantityTabletLog[j] =0; quantitySmartphoneLog[j]=0; quantityMonitorLog[j]=0; quantityKeyboardLog[j]=0; quantityMouseLog[j]=0;
            showCartWholesale.quantityPcCartLog[j] =0; showCartWholesale.quantityLaptopCartLog[j] =0; showCartWholesale.quantityTabletCartLog[j]=0; showCartWholesale.quantityMonitorCartLog[j]=0;
            showCartWholesale.quantityKeyboardCartLog[j]=0; showCartWholesale.quantityMouseCartLog[j]=0;
        }
    }


    //========================================= SEKCJA DODAWANIA DO KOSZYKA PRODUKTÓW ==================================
    public static void buyingPCLog()
    {
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(choiceBuyOrNot.equals("yes"))
            {
                try
                {
                    System.out.print("Which option do you want to buy?:");
                    choiceBuy = inputs.inputInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("You must enter an integer between 1-5!");
                }
                switch (choiceBuy) {
                    case 1 -> {
                        System.out.println("Computer number 1 has been added to the cart!\n");
                        pcOnListLog.add(1);
                    }
                    case 2 -> {
                        System.out.println("Computer number 2 has been added to the cart!\n");
                        pcOnListLog.add(2);
                    }
                    case 3 -> {
                        System.out.println("Computer number 3 has been added to the cart!\n");
                        pcOnListLog.add(3);
                    }
                    case 4 -> {
                        System.out.println("Computer number 4 has been added to the cart!\n");
                        pcOnListLog.add(4);
                    }
                    case 5 -> {
                        System.out.println("Computer number 5 has been added to the cart!\n");
                        pcOnListLog.add(5);
                    }
                    default -> System.out.print("Enter correct number!\n");
                }
            }
            else
            {
                System.out.println();
                break;
            }
        }
    }
    //sekcja do wielokrotnego dodawania do koszyka laptopów
    public static void buyingLaptopLog()
    {
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(choiceBuyOrNot.equals("yes"))
            {
                try
                {
                    System.out.print("Which option do you want to buy?:");
                    choiceBuy = inputs.inputInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("You must enter an integer between 1-5!");
                }
                switch (choiceBuy) {
                    case 1 -> {
                        System.out.println("Laptop number 1 has been added to the cart!\n");
                        laptopOnListLog.add(1);
                    }
                    case 2 -> {
                        System.out.println("Laptop number 2 has been added to the cart!\n");
                        laptopOnListLog.add(2);
                    }
                    case 3 -> {
                        System.out.println("Laptop number 3 has been added to the cart!\n");
                        laptopOnListLog.add(3);
                    }
                    case 4 -> {
                        System.out.println("Laptop number 4 has been added to the cart!\n");
                        laptopOnListLog.add(4);
                    }
                    case 5 -> {
                        System.out.println("Laptop number 5 has been added to the cart!\n");
                        laptopOnListLog.add(5);
                    }
                    default -> System.out.print("Enter correct number!\n");
                }
            }
            else
            {
                System.out.println();
                break;
            }
        }
    }
    //sekcja do wielokrotnego dodawania do koszyka tabletow
    public static void buyingTabletLog()
    {
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(choiceBuyOrNot.equals("yes"))
            {
                try
                {
                    System.out.print("Which option do you want to buy?:");
                    choiceBuy = inputs.inputInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("You must enter an integer between 1-5!");
                }
                switch (choiceBuy) {
                    case 1 -> {
                        System.out.println("Tablet number 1 has been added to the cart!\n");
                        tabletOnListLog.add(1);
                    }
                    case 2 -> {
                        System.out.println("Tablet number 2 has been added to the cart!\n");
                        tabletOnListLog.add(2);
                    }
                    case 3 -> {
                        System.out.println("Tablet number 3 has been added to the cart!\n");
                        tabletOnListLog.add(3);
                    }
                    case 4 -> {
                        System.out.println("Tablet number 4 has been added to the cart!\n");
                        tabletOnListLog.add(4);
                    }
                    case 5 -> {
                        System.out.println("Tablet number 5 has been added to the cart!\n");
                        tabletOnListLog.add(5);
                    }
                    default -> System.out.print("Enter correct number!\n");
                }
            }
            else
            {
                System.out.println();
                break;
            }
        }
    }
    //sekcja do wielokrotnego dodawania do koszyka monitorow
    public static void buyingMonitorLog()
    {
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(choiceBuyOrNot.equals("yes"))
            {
                try
                {
                    System.out.print("Which option do you want to buy?:");
                    choiceBuy = inputs.inputInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("You must enter an integer between 1-5!");
                }
                switch (choiceBuy) {
                    case 1 -> {
                        System.out.println("Monitor number 1 has been added to the cart!\n");
                        monitorOnListLog.add(1);
                    }
                    case 2 -> {
                        System.out.println("Monitor number 2 has been added to the cart!\n");
                        monitorOnListLog.add(2);
                    }
                    case 3 -> {
                        System.out.println("Monitor number 3 has been added to the cart!\n");
                        monitorOnListLog.add(3);
                    }
                    case 4 -> {
                        System.out.println("Monitor number 4 has been added to the cart!\n");
                        monitorOnListLog.add(4);
                    }
                    case 5 -> {
                        System.out.println("Monitor number 5 has been added to the cart!\n");
                        monitorOnListLog.add(5);
                    }
                    default -> System.out.print("Enter correct number!\n");
                }
            }
            else
            {
                System.out.println();
                break;
            }
        }
    }
    //sekcja do wielokrotnego dodawania do koszyka telefonow
    public static void buyingSmartphoneLog()
    {
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(choiceBuyOrNot.equals("yes"))
            {
                try
                {
                    System.out.print("Which option do you want to buy?:");
                    choiceBuy = inputs.inputInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("You must enter an integer between 1-5!");
                }
                switch (choiceBuy) {
                    case 1 -> {
                        System.out.println("Smartphone number 1 has been added to the cart!\n");
                        smartphoneOnListLog.add(1);
                    }
                    case 2 -> {
                        System.out.println("Smartphone number 2 has been added to the cart!\n");
                        smartphoneOnListLog.add(2);
                    }
                    case 3 -> {
                        System.out.println("Smartphone number 3 has been added to the cart!\n");
                        smartphoneOnListLog.add(3);
                    }
                    case 4 -> {
                        System.out.println("Smartphone number 4 has been added to the cart!\n");
                        smartphoneOnListLog.add(4);
                    }
                    case 5 -> {
                        System.out.println("Smartphone number 5 has been added to the cart!\n");
                        smartphoneOnListLog.add(5);
                    }
                    default -> System.out.print("Enter correct number!\n");
                }
            }
            else
            {
                System.out.println();
                break;
            }
        }
    }

    //sekcja do wielokrotnego dodawania do koszyka klawiatur
    public static void buyingKeyboardLog()
    {
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(choiceBuyOrNot.equals("yes"))
            {
                try
                {
                    System.out.print("Which option do you want to buy?:");
                    choiceBuy = inputs.inputInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("You must enter an integer between 1-5!");
                }
                switch (choiceBuy) {
                    case 1 -> {
                        System.out.println("Keyboard number 1 has been added to the cart!\n");
                        keyboardOnListLog.add(1);
                    }
                    case 2 -> {
                        System.out.println("Keyboard number 2 has been added to the cart!\n");
                        keyboardOnListLog.add(2);
                    }
                    case 3 -> {
                        System.out.println("Keyboard number 3 has been added to the cart!\n");
                        keyboardOnListLog.add(3);
                    }
                    case 4 -> {
                        System.out.println("Keyboard number 4 has been added to the cart!\n");
                        keyboardOnListLog.add(4);
                    }
                    case 5 -> {
                        System.out.println("Keyboard number 5 has been added to the cart!\n");
                        keyboardOnListLog.add(5);
                    }
                    default -> System.out.print("Enter correct number!\n");
                }
            }
            else
            {
                System.out.println();
                break;
            }
        }
    }
    //sekcja do wielokrotnego dodawania do koszyka myszek
    public static void buyingMouseLog()
    {
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(choiceBuyOrNot.equals("yes"))
            {
                try
                {
                    System.out.print("Which option do you want to buy?:");
                    choiceBuy = inputs.inputInt();
                }
                catch (InputMismatchException e)
                {
                    System.out.println("You must enter an integer between 1-5!");
                }
                switch (choiceBuy) {
                    case 1 -> {
                        System.out.println("Mouse number 1 has been added to the cart!\n");
                        mouseOnListLog.add(1);
                    }
                    case 2 -> {
                        System.out.println("Mouse number 2 has been added to the cart!\n");
                        mouseOnListLog.add(2);
                    }
                    case 3 -> {
                        System.out.println("Mouse number 3 has been added to the cart!\n");
                        mouseOnListLog.add(3);
                    }
                    case 4 -> {
                        System.out.println("Mouse number 4 has been added to the cart!\n");
                        mouseOnListLog.add(4);
                    }
                    case 5 -> {
                        System.out.println("Mouse number 5 has been added to the cart!\n");
                        mouseOnListLog.add(5);
                    }
                    default -> System.out.print("Enter correct number!\n");
                }
            }
            else
            {
                System.out.println();
                break;
            }
        }
    }
}
