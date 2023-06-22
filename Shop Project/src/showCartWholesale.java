public class showCartWholesale
{
    static int[] quantityPcCartLog = {0,0,0,0,0};
    static int[] quantityLaptopCartLog = {0,0,0,0,0};
    static int[] quantityTabletCartLog = {0,0,0,0,0};
    static int[] quantitySmartphoneCartLog = {0,0,0,0,0};
    static int[] quantityMonitorCartLog = {0,0,0,0,0};
    static int[] quantityKeyboardCartLog = {0,0,0,0,0};
    static int[] quantityMouseCartLog = {0,0,0,0,0};
    static int sum=0;

    public static void showCartAll()
    {
        //sprawdzanie czy cokolwiek jest w koszyku
        if(wholesaleShopping.pcOnListLog.isEmpty() && wholesaleShopping.laptopOnListLog.isEmpty() && wholesaleShopping.tabletOnListLog.isEmpty() && wholesaleShopping.smartphoneOnListLog.isEmpty() && wholesaleShopping.monitorOnListLog.isEmpty() && wholesaleShopping.keyboardOnListLog.isEmpty() && wholesaleShopping.mouseOnListLog.isEmpty())
        {
            System.out.println("Your shopping cart is empty!");
        }
        else
        {
            //pobranie ilości pc
            for(int j=0; j<wholesaleShopping.pcOnListLog.size(); j++)
            {
                if(wholesaleShopping.pcOnListLog.get(j)==1)
                {
                    quantityPcCartLog[0]++;
                }
                else if(wholesaleShopping.pcOnListLog.get(j)==2)
                {
                    quantityPcCartLog[1]++;
                }
                else if(wholesaleShopping.pcOnListLog.get(j)==3)
                {
                    quantityPcCartLog[2]++;
                }
                else if(wholesaleShopping.pcOnListLog.get(j)==4)
                {
                    quantityPcCartLog[3]++;
                }
                else
                {
                    quantityPcCartLog[4]++;
                }
            }
            //pobranie ilosci laptopow
            for(int j=0; j<wholesaleShopping.laptopOnListLog.size(); j++)
            {
                if(wholesaleShopping.laptopOnListLog.get(j)==1)
                {
                    quantityLaptopCartLog[0]++;
                }
                else if(wholesaleShopping.laptopOnListLog.get(j)==2)
                {
                    quantityLaptopCartLog[1]++;
                }
                else if(wholesaleShopping.laptopOnListLog.get(j)==3)
                {
                    quantityLaptopCartLog[2]++;
                }
                else if(wholesaleShopping.laptopOnListLog.get(j)==4)
                {
                    quantityLaptopCartLog[3]++;
                }
                else
                {
                    quantityLaptopCartLog[4]++;
                }
            }
            //pobranie ilości tabletów
            for(int j=0; j<wholesaleShopping.tabletOnListLog.size(); j++)
            {
                if(wholesaleShopping.tabletOnListLog.get(j)==1)
                {
                    quantityTabletCartLog[0]++;
                }
                else if(wholesaleShopping.tabletOnListLog.get(j)==2)
                {
                    quantityTabletCartLog[1]++;
                }
                else if(wholesaleShopping.tabletOnListLog.get(j)==3)
                {
                    quantityTabletCartLog[2]++;
                }
                else if(wholesaleShopping.tabletOnListLog.get(j)==4)
                {
                    quantityTabletCartLog[3]++;
                }
                else
                {
                    quantityTabletCartLog[4]++;
                }
            }
            //pobranie ilosci telefonow
            for(int j=0; j<wholesaleShopping.smartphoneOnListLog.size(); j++)
            {
                if(wholesaleShopping.smartphoneOnListLog.get(j)==1)
                {
                    quantitySmartphoneCartLog[0]++;
                }
                else if(wholesaleShopping.smartphoneOnListLog.get(j)==2)
                {
                    quantitySmartphoneCartLog[1]++;
                }
                else if(wholesaleShopping.smartphoneOnListLog.get(j)==3)
                {
                    quantitySmartphoneCartLog[2]++;
                }
                else if(wholesaleShopping.smartphoneOnListLog.get(j)==4)
                {
                    quantitySmartphoneCartLog[3]++;
                }
                else
                {
                    quantitySmartphoneCartLog[4]++;
                }
            }
            //pobranie ilosci monitorow
            for(int j=0; j<wholesaleShopping.monitorOnListLog.size(); j++)
            {
                if(wholesaleShopping.monitorOnListLog.get(j)==1)
                {
                    quantityMonitorCartLog[0]++;
                }
                else if(wholesaleShopping.monitorOnListLog.get(j)==2)
                {
                    quantityMonitorCartLog[1]++;
                }
                else if(wholesaleShopping.monitorOnListLog.get(j)==3)
                {
                    quantityMonitorCartLog[2]++;
                }
                else if(wholesaleShopping.monitorOnListLog.get(j)==4)
                {
                    quantityMonitorCartLog[3]++;
                }
                else
                {
                    quantityMonitorCartLog[4]++;
                }
            }
            //pobranie ilosci klawiatur
            for(int j=0; j<wholesaleShopping.keyboardOnListLog.size(); j++)
            {
                if(wholesaleShopping.keyboardOnListLog.get(j)==1)
                {
                    quantityKeyboardCartLog[0]++;
                }
                else if(wholesaleShopping.keyboardOnListLog.get(j)==2)
                {
                    quantityKeyboardCartLog[1]++;
                }
                else if(wholesaleShopping.keyboardOnListLog.get(j)==3)
                {
                    quantityKeyboardCartLog[2]++;
                }
                else if(wholesaleShopping.keyboardOnListLog.get(j)==4)
                {
                    quantityKeyboardCartLog[3]++;
                }
                else
                {
                    quantityKeyboardCartLog[4]++;
                }
            }
            //pobranie ilosci myszek
            for(int j=0; j<wholesaleShopping.mouseOnListLog.size(); j++)
            {
                if(wholesaleShopping.mouseOnListLog.get(j)==1)
                {
                    quantityMouseCartLog[0]++;
                }
                else if(wholesaleShopping.mouseOnListLog.get(j)==2)
                {
                    quantityMouseCartLog[1]++;
                }
                else if(wholesaleShopping.mouseOnListLog.get(j)==3)
                {
                    quantityMouseCartLog[2]++;
                }
                else if(wholesaleShopping.mouseOnListLog.get(j)==4)
                {
                    quantityMouseCartLog[3]++;
                }
                else
                {
                    quantityMouseCartLog[4]++;
                }
            }
            for(int p=0; p<5; p++)
            {
                for(int j = 0; j< quantityPcCartLog[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1, "pc","PC");
                    DataBase showPc = new DataBase("SELECT * from jdbc.pc WHERE idPC = "+(p+1)+";");
                    showPc.showInfo(p+1, "pc");
                }
                for(int j = 0; j< quantityLaptopCartLog[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"laptop","laptop");
                    DataBase showLaptop = new DataBase("SELECT * from jdbc.laptop WHERE idlaptop = "+(p+1)+";");
                    showLaptop.showInfo(p+1,"laptop");
                }
                for(int j = 0; j< quantityTabletCartLog[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"tablet","tablet");
                    DataBase showTablet = new DataBase("SELECT * from jdbc.tablet WHERE idtablet = "+(p+1)+";");
                    showTablet.showInfo(p+1,"tablet");
                }
                for(int j = 0; j< quantitySmartphoneCartLog[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"smartphone","smartphone");
                    DataBase showSmartphone = new DataBase("SELECT * from jdbc.smartphone WHERE idsmartphone = "+(p+1)+";");
                    showSmartphone.showInfo(p+1,"smartphone");
                }
                for(int j = 0; j< quantityMonitorCartLog[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"monitor","monitor");
                    DataBase showMonitor = new DataBase("SELECT * from jdbc.monitor WHERE idmonitor = "+(p+1)+";");
                    showMonitor.showInfo(p+1,"monitor");
                }
                for(int j = 0; j< quantityKeyboardCartLog[p]; j++)
                {
                    sum = sum + shoppingCartOperations.shoppingCartSum(p+1,"keyboard","keyboard");
                    DataBase showKeyboard = new DataBase("SELECT * from jdbc.keyboard WHERE idkeyboard = "+(p+1)+";");
                    showKeyboard.showInfo(p+1,"keyboard");
                }
                for(int j = 0; j< quantityMouseCartLog[p]; j++)
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
