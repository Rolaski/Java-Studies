import java.util.ArrayList;
import java.util.InputMismatchException;

public class retailShopping
{
    public static void option1()
    {
        System.out.println("\n\n================================ RETAIL SHOPPING ==================================");
        System.out.println("Remember that as a retail customer you can buy a maximum of 5 items!");
        while(true)
        {
            allMenu.menuProducts();
            int choiceOption = 0;
            try
            {
                System.out.print("What do you want to do?: ");
                choiceOption = inputs.inputInt(); System.out.println();
            }
            catch (InputMismatchException e)
            {
                System.out.println("ERROR: You must enter an integer between 1-10!!!");
                option1();
            }
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
                    showCart.showCartAll();
                    break;
                case 9:
                    shoppingCartTotal();
                    break;
                case 10:
                    //wyszedłeś z konta? to czyścimy twoj koszyk typie
                    pcOnList.clear(); laptopOnList.clear(); tabletOnList.clear(); smartphoneOnList.clear();
                    monitorOnList.clear(); keyboardOnList.clear(); mouseOnList.clear();
                    for(int j=0; j<5; j++)
                    {
                        quantityPc[j]=0; quantityLaptop[j]=0; quantityTablet[j] =0; quantitySmartphone[j]=0;
                        quantityMonitor[j]=0; quantityKeyboard[j]=0; quantityMouse[j]=0;
                        showCart.quantityPcCart[j] =0; showCart.quantityLaptopCart[j] =0; showCart.quantityTabletCart[j]=0; showCart.quantityMonitorCart[j]=0;
                        showCart.quantityKeyboardCart[j]=0; showCart.quantityMouseCart[j]=0;
                    }
                    allMenu.whichOption();
                default:
                    System.out.println("Enter correct number!\n");
            }
        }
    }





    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //======================================= DLA KOMPUTERÓW STACJONARNYCH ========================================
    //sekcja globalnych danych żeby każdy je widział
    static int sum = 0,money =0;
    static int[] quantityPc = {0,0,0,0,0};
    static int[] quantityLaptop = {0,0,0,0,0};
    static int[] quantityTablet = {0,0,0,0,0};
    static int[] quantitySmartphone = {0,0,0,0,0};
    static int[] quantityMonitor = {0,0,0,0,0};
    static int[] quantityKeyboard = {0,0,0,0,0};
    static int[] quantityMouse = {0,0,0,0,0};
    public static void shoppingCartPC()
    {
        sum =0;
        if(pcOnList.isEmpty() && laptopOnList.isEmpty() && tabletOnList.isEmpty() && smartphoneOnList.isEmpty() && monitorOnList.isEmpty() && keyboardOnList.isEmpty() && mouseOnList.isEmpty())
        {
            x =0;
            System.out.println("Your shopping cart is empty!");
            money =-5;
        }
        else
        {
            //obliczanie sumy kwoty za komputery i zmiana ilości magazynowej
            for(int j=0; j< pcOnList.size(); j++)
            {
                sum = sum + shoppingCartOperations.shoppingCartSum(pcOnList.get(j), "pc","PC");
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
            quantityPc[2]++;
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

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //=============================================== DLA LAPTOPÓW =================================================
    public static void shoppingCartLaptop()
    {
        for(int j=0; j< laptopOnList.size(); j++)
        {
            sum = sum + shoppingCartOperations.shoppingCartSum(laptopOnList.get(j), "laptop","Laptop");
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
            quantityLaptop[2]++;
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
            sum = sum + shoppingCartOperations.shoppingCartSum(tabletOnList.get(j), "tablet","tablet");
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
            quantityTablet[2]++;
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
            sum = sum + shoppingCartOperations.shoppingCartSum(smartphoneOnList.get(j), "smartphone","smartphone");
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
            quantitySmartphone[2]++;
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
            sum = sum + shoppingCartOperations.shoppingCartSum(monitorOnList.get(j), "monitor","monitor");
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
            quantityMonitor[2]++;
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
    //============================================ DLA KLAWIATUR ===================================================
    public static void shoppingCartKeyboard()
    {
        for(int j=0; j< keyboardOnList.size(); j++)
        {
            sum = sum + shoppingCartOperations.shoppingCartSum(keyboardOnList.get(j), "keyboard","keyboard");
            quantityCountKeyboard(j);
        }
    }
    public static void quantityCountKeyboard(int j)
    {
        if(keyboardOnList.get(j)==1)
        {
            quantityKeyboard[0]++;
        }
        else if(keyboardOnList.get(j)==2)
        {
            quantityKeyboard[1]++;
        }
        else if(keyboardOnList.get(j)==3)
        {
            quantityKeyboard[2]++;
        }
        else if(keyboardOnList.get(j)==4)
        {
            quantityKeyboard[3]++;
        }
        else
        {
            quantityKeyboard[4]++;
        }
    }

    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ DLA MYSZEK ===================================================
    public static void shoppingCartMouse()
    {
        for(int j=0; j< mouseOnList.size(); j++)
        {
            sum = sum + shoppingCartOperations.shoppingCartSum(mouseOnList.get(j), "mouse","mouse");
            quantityCountMouse(j);
        }
    }
    public static void quantityCountMouse(int j)
    {
        if(mouseOnList.get(j)==1)
        {
            quantityMouse[0]++;
        }
        else if(mouseOnList.get(j)==2)
        {
            quantityMouse[1]++;
        }
        else if(mouseOnList.get(j)==3)
        {
            quantityMouse[2]++;
        }
        else if(mouseOnList.get(j)==4)
        {
            quantityMouse[3]++;
        }
        else
        {
            quantityMouse[4]++;
        }
    }


    //================================ SEKCJA KOSZYKA, ZAKUPU Z STWORZONEGO KOSZYKA ================================
    //============================================ PODSUMOWUJĄCA =======================================
    public static void shoppingCartTotal()
    {
        //wywołanie funkcji liczących cenę i ilość przedmiotów
        shoppingCartPC();
        shoppingCartLaptop();
        shoppingCartTablet();
        shoppingCartSmartphone();
        shoppingCartMonitor();
        shoppingCartKeyboard();
        shoppingCartMouse();
        int rest =0;
        //tutaj pobieramy hajs od chłopa
        if(money == 0)
        {
            System.out.print("Enter the amount to be deposited into your wallet: ");
            money = inputs.inputInt();
        }
        //tutaj sprawdzamy czy klient może dokonać zakupów
        if((money-sum)<0)
        {
            System.out.println("Your order has been canceled! :(\n");
        }
        else
        {
            rest = money - sum;
            System.out.println("Money left: "+rest);
            System.out.println("The total price of your order: "+sum);
            System.out.println("THE ORDER HAS BEEN SENT :)\n");

            //pętla do aktualizacji produktów
            for(int j=0; j<5;j++)
            {
                //pobranie akutalnej ilosci komputerow i wprowadzenie do bazy
                int quantityActualPc = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "pc","PC");
                int quantityNewPc = shoppingCartOperations.shoppingCartQuantityUpdate(j+1,"pc","PC", (quantityActualPc- quantityPc[j]));

                //pobieranie akutalnej ilosci laptopow i wprowadzenie do bazy
                int quantityActualLaptop = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "laptop","Laptop");
                int quantityNewLaptop = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "laptop", "Laptop", (quantityActualLaptop-quantityLaptop[j]));

                //pobieranie akutalnej ilosci tabletow i wprowadzenie do bazy
                int quantityAcutalTablet = shoppingCartOperations.shoppingCartQuantityCheck(j+1,"tablet","tablet");
                int quantityNewTablet = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "tablet", "tablet",(quantityAcutalTablet-quantityTablet[j]));

                //pobieranie akutalnej ilosci telefonow i wprowadzenie do bazy
                int quantityActualSmartphone = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "smartphone","smartphone");
                int quantityNewSmartphone = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "smartphone","smartphone",(quantityActualSmartphone-quantitySmartphone[j]));

                //pobieranie akutalnej ilosci monitorow i wprowadzenie do bazy
                int quantityActualMonitor = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "monitor", "monitor");
                int quantityNewMonitor = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "monitor", "monitor", (quantityActualMonitor-quantityMonitor[j]));

                //pobieranie akutalnej ilosci klawiatur i wprowadzenie do bazy
                int quantityActualKeyboard = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "keyboard", "keyboard");
                int quantityNewKeyboard = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "keyboard", "keyboard", (quantityActualKeyboard-quantityKeyboard[j]));

                //pobieranie akutalnej ilosci mysz i wprowadzenie do bazy
                int quantityActualMouse = shoppingCartOperations.shoppingCartQuantityCheck(j+1, "mouse", "mouse");
                int quantityNewMouse = shoppingCartOperations.shoppingCartQuantityUpdate(j+1, "mouse", "mouse", (quantityActualMouse-quantityMouse[j]));
            }
        }
        //czyszczenie listy po zakupach lub próbie zakupy
        pcOnList.clear(); laptopOnList.clear(); tabletOnList.clear(); smartphoneOnList.clear(); monitorOnList.clear(); keyboardOnList.clear(); mouseOnList.clear();
        //czyszczenie ilości danych produktów
        for(int j=0; j<5; j++)
        {
            quantityPc[j]=0; quantityLaptop[j]=0; quantityTablet[j] =0; quantitySmartphone[j]=0; quantityMonitor[j]=0; quantityKeyboard[j]=0; quantityMouse[j]=0;
            showCart.quantityPcCart[j] =0; showCart.quantityLaptopCart[j] =0; showCart.quantityTabletCart[j]=0; showCart.quantityMonitorCart[j]=0;
            showCart.quantityKeyboardCart[j]=0; showCart.quantityMouseCart[j]=0;
        }
        x=0;
        money = rest;
    }


    //================================ SEKCJA DODAWANIA DO KOSZYKA, WIELOKROTNEGO ZAKUPU ================================
    // ============== TUTAJ DODAJEMY PRODUKTY DO KOSZYKA, KLIENT WYBIERA CO CHCE UMIEŚCIĆ NA LIŚCIE A CO NIE ============

    //koszyki zakupowe listy, zrobione tak aby widoczne były dla każdej metody
    public static ArrayList<Integer> pcOnList = new ArrayList<>();
    public static ArrayList<Integer> laptopOnList = new ArrayList<>();
    public static ArrayList<Integer> tabletOnList = new ArrayList<>();
    public static ArrayList<Integer> smartphoneOnList = new ArrayList<>();
    public static ArrayList<Integer> monitorOnList = new ArrayList<>();
    public static ArrayList<Integer> keyboardOnList = new ArrayList<>();
    public static ArrayList<Integer> mouseOnList = new ArrayList<>();
    //zmienna x, ktora odpowiada za maksymalna ilosc rzeczy jako detaliczny klient moze kupic
    public static int x = 0;

    //sekcja do wielokrotnego dodawania do koszyka komputerów
    public static void buyingPC()
    {
        int choiceBuy = 0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            //sprawdzamy w ifie czy przypadkiem klient nie ma juz max towarow w koszyku
            if(x !=5)
            {
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
                            pcOnList.add(1);
                        }
                        case 2 -> {
                            System.out.println("Computer number 2 has been added to the cart!\n");
                            pcOnList.add(2);
                        }
                        case 3 -> {
                            System.out.println("Computer number 3 has been added to the cart!\n");
                            pcOnList.add(3);
                        }
                        case 4 -> {
                            System.out.println("Computer number 4 has been added to the cart!\n");
                            pcOnList.add(4);
                        }
                        case 5 -> {
                            System.out.println("Computer number 5 has been added to the cart!\n");
                            pcOnList.add(5);
                        }
                        default -> System.out.print("Enter correct number!\n");
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
        int choiceBuy =0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(x !=5)
            {
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
                            laptopOnList.add(1);
                        }
                        case 2 -> {
                            System.out.println("Laptop  number 2 has been added to the cart!\n");
                            laptopOnList.add(2);
                        }
                        case 3 -> {
                            System.out.println("Laptop  number 3 has been added to the cart!\n");
                            laptopOnList.add(3);
                        }
                        case 4 -> {
                            System.out.println("Laptop  number 4 has been added to the cart!\n");
                            laptopOnList.add(4);
                        }
                        case 5 -> {
                            System.out.println("Laptop  number 5 has been added to the cart!\n");
                            laptopOnList.add(5);
                        }
                        default -> System.out.print("Enter correct number!\n");
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
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(x !=5)
            {
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
                            tabletOnList.add(1);
                        }
                        case 2 -> {
                            System.out.println("Tablet  number 2 has been added to the cart!\n");
                            tabletOnList.add(2);
                        }
                        case 3 -> {
                            System.out.println("Tablet  number 3 has been added to the cart!\n");
                            tabletOnList.add(3);
                        }
                        case 4 -> {
                            System.out.println("Tablet  number 4 has been added to the cart!\n");
                            tabletOnList.add(4);
                        }
                        case 5 -> {
                            System.out.println("Tablet  number 5 has been added to the cart!\n");
                            tabletOnList.add(5);
                        }
                        default -> System.out.print("Enter correct number!\n");
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
        int choiceBuy =0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(x !=5)
            {
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
                            monitorOnList.add(1);
                        }
                        case 2 -> {
                            System.out.println("Monitor  number 2 has been added to the cart!\n");
                            monitorOnList.add(2);
                        }
                        case 3 -> {
                            System.out.println("Monitor  number 3 has been added to the cart!\n");
                            monitorOnList.add(3);
                        }
                        case 4 -> {
                            System.out.println("Monitor  number 4 has been added to the cart!\n");
                            monitorOnList.add(4);
                        }
                        case 5 -> {
                            System.out.println("Monitor  number 5 has been added to the cart!\n");
                            monitorOnList.add(5);
                        }
                        default -> System.out.print("Enter correct number!\n");
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
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(x !=5)
            {
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
                            smartphoneOnList.add(1);
                        }
                        case 2 -> {
                            System.out.println("Smartphone  number 2 has been added to the cart!\n");
                            smartphoneOnList.add(2);
                        }
                        case 3 -> {
                            System.out.println("Smartphone  number 3 has been added to the cart!\n");
                            smartphoneOnList.add(3);
                        }
                        case 4 -> {
                            System.out.println("Smartphone  number 4 has been added to the cart!\n");
                            smartphoneOnList.add(4);
                        }
                        case 5 -> {
                            System.out.println("Smartphone  number 5 has been added to the cart!\n");
                            smartphoneOnList.add(5);
                        }
                        default -> System.out.print("Enter correct number!\n");
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
        int choiceBuy=0;
        while (true)
        {
            System.out.print("Add to shopping cart? (yes/no): ");
            String choiceBuyOrNot = inputs.inputString();
            if(x !=5)
            {
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
                            keyboardOnList.add(1);
                        }
                        case 2 -> {
                            System.out.println("Keyboard number 2 has been added to the cart!\n");
                            keyboardOnList.add(2);
                        }
                        case 3 -> {
                            System.out.println("Keyboard number 3 has been added to the cart!\n");
                            keyboardOnList.add(3);
                        }
                        case 4 -> {
                            System.out.println("Keyboard number 4 has been added to the cart!\n");
                            keyboardOnList.add(4);
                        }
                        case 5 -> {
                            System.out.println("Keyboard number 5 has been added to the cart!\n");
                            keyboardOnList.add(5);
                        }
                        default -> System.out.print("Enter correct number!\n");
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
        int choiceBuy=0;
        while (true)
        {
            if(x !=5)
            {
                System.out.print("\nAdd to shopping cart? (yes/no): ");
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
                            mouseOnList.add(1);
                        }
                        case 2 -> {
                            System.out.println("Mouse number 2 has been added to the cart!\n");
                            mouseOnList.add(2);
                        }
                        case 3 -> {
                            System.out.println("Mouse number 3 has been added to the cart!\n");
                            mouseOnList.add(3);
                        }
                        case 4 -> {
                            System.out.println("Mouse number 4 has been added to the cart!\n");
                            mouseOnList.add(4);
                        }
                        case 5 -> {
                            System.out.println("Mouse number 5 has been added to the cart!\n");
                            mouseOnList.add(5);
                        }
                        default -> System.out.print("Enter correct number!\n");
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
}
