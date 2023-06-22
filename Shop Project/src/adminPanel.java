public class adminPanel
{
    public static String login, password;

    //========================== METODA DO ZALOGOWANIA SIĘ NA ADMINA SKLEPU ========================
    public static void option3()
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

            DataBase loginAdmin = new DataBase("SELECT login,password FROM jdbc.admin where login = '"+login+"' AND password = '"+password+"';");
            boolean loginAccept = loginAdmin.login();
            if(loginAccept)
            {
                loginSuccessfulAdmin();
            }
            else {
                System.out.println("\nIncorrect login details!");
            }
        }
    }

    //========================== POMYŚLNE ZALOGOWANIE, WYŚWIETLENIE MENU I OPCJA WYBORU ========================
    public static void loginSuccessfulAdmin()
    {
        System.out.println("\n\n================================== ADMIN PANEL ====================================");
        System.out.println("Hi "+login+"!, Here is the management panel");
        do {
            System.out.println();
            allMenu.menuAdmin();
            System.out.print("What do you want to do? :");
            int choiceOption = inputs.inputInt();
            System.out.println();

            switch (choiceOption) {
                case 1 -> {
                    while (true) {
                        System.out.print("Do you want to add a computer? (yes/no): ");
                        String choice = inputs.inputString();
                        if (choice.equals("yes")) {
                            addPc();
                        } else break;
                    }
                }
                case 2 -> {
                    while (true) {
                        System.out.print("Do you want to add a Laptop (yes/no): ");
                        String choice = inputs.inputString();
                        if (choice.equals("yes")) {
                            addLaptop();
                        } else break;
                    }
                }
                case 3 -> {
                    while (true) {
                        System.out.print("Do you want to add a Tablet (yes/no): ");
                        String choice = inputs.inputString();
                        if (choice.equals("yes")) {
                            addTablet();
                        } else break;
                    }
                }
                case 4 -> {
                    while (true) {
                        System.out.print("Do you want to add a Smartphone (yes/no): ");
                        String choice = inputs.inputString();
                        if (choice.equals("yes")) {
                            addSmartphone();
                        } else break;
                    }
                }
                case 5 -> {
                    while (true) {
                        System.out.print("Do you want to add a Monitor (yes/no): ");
                        String choice = inputs.inputString();
                        if (choice.equals("yes")) {
                            addMonitor();
                        } else break;
                    }
                }
                case 6 -> {
                    while (true) {
                        System.out.print("Do you want to add a Keyboard (yes/no): ");
                        String choice = inputs.inputString();
                        if (choice.equals("yes")) {
                            addKeyboard();
                        } else break;
                    }
                }
                case 7 -> {
                    while (true) {
                        System.out.print("Do you want to add a Mouse (yes/no): ");
                        String choice = inputs.inputString();
                        if (choice.equals("yes")) {
                            addMouse();
                        } else break;
                    }
                }
                case 8 -> {
                    while(true) {
                        System.out.print("Do you want to add a new user (yes/no): ");
                        String choice = inputs.inputString();
                        if(choice.equals("yes"))
                        {
                            addUser();
                        } else break;
                    }
                }
                case 9 -> allMenu.whichOption();
                default -> System.out.println("Enter correct number!\n");
            }
        } while (true);
    }
    //========================== METODA DO DODAJĄCA KOMPUTER DO BAZY ========================
    public static void addPc()
    {
        //walidacja danych here
        String mark = inputs.inputStringMessage("Enter mark: ");
        String model = inputs.inputStringMessage("Enter model: ");
        String cpu = inputs.inputStringMessage("Enter cpu: ");
        String gpu = inputs.inputStringMessage("Enter gpu: ");
        String ram = inputs.inputStringMessage("Enter ram: ");
        String disk = inputs.inputStringMessage("Enter disk: ");
        int price = inputs.inputIntMessage("Enter price: ");
        int quantity = inputs.inputIntMessage("Enter quantity: ");
        if(mark.length() >39 || model.length() >39 || cpu.length()>39 || gpu.length()>39 || ram.length()>39 || disk.length()>39)
        {
            System.out.println("Enter the correct values again!");
            addPc();
        }
        else if(price <=0 || quantity <=0)
        {
            System.out.println("Enter the correct values again for price or quantity!");
            addPc();
        }
        else
        {
            PersonalComputer pc = new PersonalComputer(mark, model, cpu, gpu, ram, disk, price, quantity);
            DataBase pcNew = new DataBase("INSERT INTO `jdbc`.`pc` (`mark`, `model`, `cpu`, `gpu`, `ram`, `disk`, `price`, `quantity`) VALUES ('"+mark+"', '"+model+"', '"+cpu+"', '"+gpu+"', '"+ram+"', '"+disk+"', '"+price+"', '"+quantity+"');");
            pcNew.productInput();
            System.out.println("The computer has been added successfully\n");
        }

    }
    //========================== METODA DO DODAJĄCA LAPTOP DO BAZY ========================
    public static void addLaptop()
    {
        String mark = inputs.inputStringMessage("Enter mark: ");
        String model = inputs.inputStringMessage("Enter model: ");
        String cpu = inputs.inputStringMessage("Enter cpu: ");
        String gpu = inputs.inputStringMessage("Enter gpu: ");
        String ram = inputs.inputStringMessage("Enter ram: ");
        String disk = inputs.inputStringMessage("Enter disk: ");
        double screenDiagonal = inputs.inputDoubleMessage("Enter the diagonal of the screen: ");
        int price = inputs.inputIntMessage("Enter price: ");
        int quantity = inputs.inputIntMessage("Enter quantity: ");
        if(mark.length() >39 || model.length() >39 || cpu.length()>39 || gpu.length()>39 || ram.length()>39 || disk.length()>39)
        {
            System.out.println("Enter the correct values again!\n");
            addLaptop();
        }
        else if(price <=0 || quantity <=0 || screenDiagonal<=0 || screenDiagonal>25)
        {
            System.out.println("Enter the correct values again!\n");
            addTablet();
        }
        else
        {
            Laptop laptop = new Laptop(mark, model, price, quantity, cpu, gpu, ram, disk, screenDiagonal);
            DataBase laptopNew = new DataBase("INSERT INTO `jdbc`.`laptop` (`mark`, `model`, `cpu`, `gpu`, `ram`, `disk`, `screenDiagonal`, `price`, `quantity`) VALUES ('"+mark+"', '"+model+"', '"+cpu+"', '"+gpu+"', '"+ram+"', '"+disk+"', '"+screenDiagonal+"', '"+price+"', '"+quantity+"');");
            laptopNew.productInput();
            System.out.println("The Laptop has been added successfully\n");
        }
    }
    //========================== METODA DO DODAJĄCA TABLET DO BAZY ========================
    public static void addTablet()
    {
        String mark = inputs.inputStringMessage("Enter mark: ");
        String model = inputs.inputStringMessage("Enter model: ");
        String ram = inputs.inputStringMessage("Enter ram: ");
        String memory = inputs.inputStringMessage("Enter memory: ");
        double screenDiagonal = inputs.inputDoubleMessage("Enter the diagonal of the screen: ");
        int price = inputs.inputIntMessage("Enter price: ");
        int quantity = inputs.inputIntMessage("Enter quantity: ");
        if(mark.length() >39 || model.length() >39 || ram.length()>39 || memory.length()>39)
        {
            System.out.println("Enter the correct values again!\n");
            addTablet();
        }
        else if(price <=0 || quantity <=0 || screenDiagonal<=0 || screenDiagonal>25)
        {
            System.out.println("Enter the correct values again!\n");
            addTablet();
        }
        else
        {
            Tablet tablet = new Tablet(mark, model, price, quantity, ram, memory, (int) screenDiagonal);
            DataBase tabletNew = new DataBase("INSERT INTO `jdbc`.`tablet` (`mark`, `model`, `ram`, `memory`, `screenSize`, `price`, `quantity`) VALUES ('"+mark+"', '"+model+"', '"+ram+"', '"+memory+"', '"+screenDiagonal+"', '"+price+"', '"+quantity+"');");
            tabletNew.productInput();
            System.out.println("The Tablet has been added successfully\n");
        }
    }
    //========================== METODA DO DODAJĄCA TELEFON DO BAZY ========================
    public static void addSmartphone()
    {
        String mark = inputs.inputStringMessage("Enter mark: ");
        String model = inputs.inputStringMessage("Enter model: ");
        String ram = inputs.inputStringMessage("Enter ram: ");
        String memory = inputs.inputStringMessage("Enter memory: ");
        double screenDiagonal = inputs.inputDoubleMessage("Enter the diagonal of the screen: ");
        int price = inputs.inputIntMessage("Enter price: ");
        int quantity = inputs.inputIntMessage("Enter quantity: ");
        if(mark.length() >39 || model.length() >39 || ram.length()>39 || memory.length()>39)
        {
            System.out.println("Enter the correct values again!\n");
            addSmartphone();
        }
        else if(price <=0 || quantity <=0 || screenDiagonal<=0 || screenDiagonal>25)
        {
            System.out.println("Enter the correct values again!\n");
            addSmartphone();
        }
        else
        {
            Smartphone smartphone = new Smartphone(mark, model, price, quantity, ram, memory, (int) screenDiagonal);
            DataBase smartphoneNew = new DataBase("INSERT INTO `jdbc`.`smartphone` (`mark`, `model`, `ram`, `memory`, `screenSize`, `price`, `quantity`) VALUES ('"+mark+"', '"+model+"', '"+ram+"', '"+memory+"', '"+screenDiagonal+"', '"+price+"', '"+quantity+"');");
            smartphoneNew.productInput();
            System.out.println("The Smartphone has been added successfully\n");
        }
    }
    //========================== METODA DO DODAJĄCA MONITOR DO BAZY ========================
    public static void addMonitor()
    {
        String mark = inputs.inputStringMessage("Enter mark: ");
        String model = inputs.inputStringMessage("Enter model: ");
        String matrix = inputs.inputStringMessage("Enter matrix: ");
        String resolution = inputs.inputStringMessage("Enter resolution: ");
        int price = inputs.inputIntMessage("Enter price: ");
        int quantity = inputs.inputIntMessage("Enter quantity: ");
        if(mark.length() >39 || model.length() >39 || matrix.length()>15 || resolution.length()>30)
        {
            System.out.println("Enter the correct values again!\n");
            addMonitor();
        }
        else if(price <=0 || quantity <=0)
        {
            System.out.println("Enter the correct values again!\n");
            addMonitor();
        }
        else
        {
            Monitor monitor = new Monitor(mark, model, price, quantity, matrix, resolution);
            DataBase monitorNew = new DataBase("INSERT INTO `jdbc`.`monitor` (`mark`, `model`, `matrix`, `resolution`, `price`, `quantity`) VALUES ('"+mark+"', '"+model+"', '"+matrix+"', '"+resolution+"',  '"+price+"', '"+quantity+"');");
            monitorNew.productInput();
            System.out.println("The Monitor has been added successfully\n");
        }
    }
    //========================== METODA DO DODAJĄCA KLAWIATURĘ DO BAZY ========================
    public static void addKeyboard()
    {
        String mark = inputs.inputStringMessage("Enter mark: ");
        String model = inputs.inputStringMessage("Enter model: ");
        String connection = inputs.inputStringMessage("Enter connection (wired / wireless): ");
        String switchKeyboard = inputs.inputStringMessage("Enter keyboard switch: ");
        String backlight = inputs.inputStringMessage("Enter keyboard light (ONLY: yes / no): ");
        int price = inputs.inputIntMessage("Enter price: ");
        int quantity = inputs.inputIntMessage("Enter quantity: ");
        if(mark.length() >39 || model.length() >39 || switchKeyboard.length()>15 || backlight.length()>5)
        {
            System.out.println("Enter the correct values again!\n");
            addKeyboard();
        }
        else if(price <=0 || quantity <=0)
        {
            System.out.println("Enter the correct values again!\n");
            addKeyboard();
        }
        else
        {
            Keyboard keyboard = new Keyboard(mark, model, connection, switchKeyboard, price, quantity, backlight);
            DataBase monitorNew = new DataBase("INSERT INTO `jdbc`.`keyboard` (`mark`, `model`, `connection`, `switch`, `backlight`, `price`, `quantity`) VALUES ('"+mark+"', '"+model+"', '"+connection+"', '"+switchKeyboard+"', '"+backlight+"', '"+price+"', '"+quantity+"');");
            monitorNew.productInput();
            System.out.println("The Keyboard has been added successfully\n");
        }
    }
    //========================== METODA DO DODAJĄCA MYSZKĘ DO BAZY ========================
    public static void addMouse()
    {
        String mark = inputs.inputStringMessage("Enter mark: ");
        String model = inputs.inputStringMessage("Enter model: ");
        String connection = inputs.inputStringMessage("Enter connection (wired / wireless): ");
        int price = inputs.inputIntMessage("Enter price: ");
        int quantity = inputs.inputIntMessage("Enter quantity: ");
        if(mark.length() >39 || model.length() >39)
        {
            System.out.println("Enter the correct values again!\n");
            addMouse();
        }
        else if(price <=0 || quantity <=0)
        {
            System.out.println("Enter the correct values again!\n");
            addMouse();
        }
        else
        {
            Mouse mouse = new Mouse(mark,model,price,quantity,connection);
            DataBase mouseNew = new DataBase("INSERT INTO `jdbc`.`mouse` (`mark`, `model`, `connection`, `price`, `quantity`) VALUES ('"+mark+"', '"+model+"', '"+connection+"', '"+price+"', '"+quantity+"');");
            mouseNew.productInput();
            System.out.println("The Mouse has been added successfully\n");
        }
    }
    //========================== METODA DO DODAJĄCA UŻYTKOWNIKA ========================
    public static void addUser()
    {
        String login = inputs.inputStringMessage("Enter login: ");
        String password = inputs.inputStringMessage("Enter password: ");
        int wallet = inputs.inputIntMessage("Enter the amount to deposit: ");
        if(login.length()>30 || password.length() > 40 || wallet<0)
        {
            System.out.println("Enter the correct values!\n");
        }
        else
        {
            DataBase userNew = new DataBase("INSERT INTO `jdbc`.`customers` (`login`, `password`, `wallet`) VALUES ('"+login+"', '"+password+"', '"+wallet+"');");
            userNew.productInput();
            System.out.println("New user has been added successfully!\n");
        }
    }
}
