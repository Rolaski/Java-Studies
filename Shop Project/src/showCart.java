import javax.xml.crypto.Data;

public class showCart
{
    //tworzenie zmiennych, nowych które nie będą kolidować z zakupami detalicznymi
    static int[] quantityPcCart = {0,0,0,0,0};
    static int[] quantityLaptopCart = {0,0,0,0,0};
    static int[] quantityTabletCart = {0,0,0,0,0};
    static int[] quantitySmartphoneCart = {0,0,0,0,0};
    static int[] quantityMonitorCart = {0,0,0,0,0};
    static int[] quantityKeyboardCart = {0,0,0,0,0};
    static int[] quantityMouseCart = {0,0,0,0,0};
    static int sum = 0;
    public static void showCartAll()
    {
        //sprawdzanie czy cokolwiek jest w koszyku
        if(retailShopping.pcOnList.isEmpty() && retailShopping.laptopOnList.isEmpty() && retailShopping.tabletOnList.isEmpty() && retailShopping.smartphoneOnList.isEmpty() && retailShopping.monitorOnList.isEmpty() && retailShopping.keyboardOnList.isEmpty() && retailShopping.mouseOnList.isEmpty())
        {
            System.out.println("Your shopping cart is empty!");
        }
        else
        {
            //pobranie ilości pc
            for(int j=0; j<retailShopping.pcOnList.size(); j++)
            {
                if(retailShopping.pcOnList.get(j)==1)
                {
                    quantityPcCart[0]++;
                }
                else if(retailShopping.pcOnList.get(j)==2)
                {
                    quantityPcCart[1]++;
                }
                else if(retailShopping.pcOnList.get(j)==3)
                {
                    quantityPcCart[2]++;
                }
                else if(retailShopping.pcOnList.get(j)==4)
                {
                    quantityPcCart[3]++;
                }
                else
                {
                    quantityPcCart[4]++;
                }
            }
            //pobieranie ilosci laptopow
            for(int j=0; j<retailShopping.laptopOnList.size(); j++)
            {
                if(retailShopping.laptopOnList.get(j)==1)
                {
                    quantityLaptopCart[0]++;
                }
                else if(retailShopping.laptopOnList.get(j)==2)
                {
                    quantityLaptopCart[1]++;
                }
                else if(retailShopping.laptopOnList.get(j)==3)
                {
                    quantityLaptopCart[2]++;
                }
                else if(retailShopping.laptopOnList.get(j)==4)
                {
                    quantityLaptopCart[3]++;
                }
                else
                {
                    quantityLaptopCart[4]++;
                }
            }
            //pobieranie ilosci tabletow
            for(int j=0; j<retailShopping.tabletOnList.size(); j++)
            {
                if(retailShopping.tabletOnList.get(j)==1)
                {
                    quantityTabletCart[0]++;
                }
                else if(retailShopping.tabletOnList.get(j)==2)
                {
                    quantityTabletCart[1]++;
                }
                else if(retailShopping.tabletOnList.get(j)==3)
                {
                    quantityTabletCart[2]++;
                }
                else if(retailShopping.tabletOnList.get(j)==4)
                {
                    quantityTabletCart[3]++;
                }
                else
                {
                    quantityTabletCart[4]++;
                }
            }
            //pobieranie ilosci telefonow
            for(int j=0; j<retailShopping.smartphoneOnList.size(); j++)
            {
                if(retailShopping.smartphoneOnList.get(j)==1)
                {
                    quantitySmartphoneCart[0]++;
                }
                else if(retailShopping.smartphoneOnList.get(j)==2)
                {
                    quantitySmartphoneCart[1]++;
                }
                else if(retailShopping.smartphoneOnList.get(j)==3)
                {
                    quantitySmartphoneCart[2]++;
                }
                else if(retailShopping.smartphoneOnList.get(j)==4)
                {
                    quantitySmartphoneCart[3]++;
                }
                else
                {
                    quantitySmartphoneCart[4]++;
                }
            }
            //pobieranie ilosci monitorow
            for(int j=0; j<retailShopping.monitorOnList.size(); j++)
            {
                if(retailShopping.monitorOnList.get(j)==1)
                {
                    quantityMonitorCart[0]++;
                }
                else if(retailShopping.monitorOnList.get(j)==2)
                {
                    quantityMonitorCart[1]++;
                }
                else if(retailShopping.monitorOnList.get(j)==3)
                {
                    quantityMonitorCart[2]++;
                }
                else if(retailShopping.monitorOnList.get(j)==4)
                {
                    quantityMonitorCart[3]++;
                }
                else
                {
                    quantityMonitorCart[4]++;
                }
            }
            //pobieranie ilosci klawiatur
            for(int j=0; j<retailShopping.keyboardOnList.size(); j++)
            {
                if (retailShopping.keyboardOnList.get(j) == 1)
                {
                    quantityKeyboardCart[0]++;
                }
                else if (retailShopping.keyboardOnList.get(j) == 2)
                {
                    quantityKeyboardCart[1]++;
                }
                else if (retailShopping.keyboardOnList.get(j) == 3)
                {
                    quantityKeyboardCart[2]++;
                }
                else if (retailShopping.keyboardOnList.get(j) == 4)
                {
                    quantityKeyboardCart[3]++;
                }
                else
                {
                    quantityKeyboardCart[4]++;
                }
            }
            //pobieranie ilosci myszek
            for(int j=0; j<retailShopping.mouseOnList.size(); j++)
            {
                if (retailShopping.mouseOnList.get(j) == 1)
                {
                    quantityMouseCart[0]++;
                }
                else if (retailShopping.mouseOnList.get(j) == 2)
                {
                    quantityMouseCart[1]++;
                }
                else if (retailShopping.mouseOnList.get(j) == 3)
                {
                    quantityMouseCart[2]++;
                }
                else if (retailShopping.mouseOnList.get(j) == 4)
                {
                    quantityMouseCart[3]++;
                }
                else
                {
                    quantityMouseCart[4]++;
                }
            }
            for(int p=0; p<5; p++)
            {
                for(int j = 0; j< quantityPcCart[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1, "pc","PC");
                    DataBase showPc = new DataBase("SELECT * from jdbc.pc WHERE idPC = "+(p+1)+";");
                    showPc.showInfo(p+1, "pc");
                }
                for(int j = 0; j< quantityLaptopCart[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"laptop","laptop");
                    DataBase showLaptop = new DataBase("SELECT * from jdbc.laptop WHERE idlaptop = "+(p+1)+";");
                    showLaptop.showInfo(p+1,"laptop");
                }
                for(int j = 0; j< quantityTabletCart[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"tablet","tablet");
                    DataBase showTablet = new DataBase("SELECT * from jdbc.tablet WHERE idtablet = "+(p+1)+";");
                    showTablet.showInfo(p+1,"tablet");
                }
                for(int j = 0; j< quantitySmartphoneCart[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"smartphone","smartphone");
                    DataBase showSmartphone = new DataBase("SELECT * from jdbc.smartphone WHERE idsmartphone = "+(p+1)+";");
                    showSmartphone.showInfo(p+1,"smartphone");
                }
                for(int j = 0; j< quantityMonitorCart[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"monitor","monitor");
                    DataBase showMonitor = new DataBase("SELECT * from jdbc.monitor WHERE idmonitor = "+(p+1)+";");
                    showMonitor.showInfo(p+1,"monitor");
                }
                for(int j = 0; j< quantityKeyboardCart[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"keyboard","keyboard");
                    DataBase showKeyboard = new DataBase("SELECT * from jdbc.keyboard WHERE idkeyboard = "+(p+1)+";");
                    showKeyboard.showInfo(p+1,"keyboard");
                }
                for(int j = 0; j< quantityMouseCart[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"mouse","mouse");
                    DataBase showMouse = new DataBase("SELECT * from jdbc.mouse WHERE idmouse = "+(p+1)+";");
                    showMouse.showInfo(p+1,"mouse");
                }
            }
            System.out.println("Total price of products in the cart: "+sum+"\n");
        }

    }
}
