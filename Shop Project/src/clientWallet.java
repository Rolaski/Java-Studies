public class clientWallet
{
    public static void clientWalletCheck(String login)
    {
        int walletCatch;
        DataBase wallet = new DataBase("SELECT wallet FROM jdbc.customers WHERE login ='"+login+"';");
        walletCatch = wallet.walletUser();
        System.out.println("Your current funds: "+walletCatch);
    }
    public static void clientWalletUpdate(String login)
    {
        //żeby wpłacić hajs trzeba wiedzieć ile użytkownik go ma
        //więc sprawdzimy i dodamy nową kwotę a sumę wrzucamy do bazy
        int walletCatch;
        DataBase wallet = new DataBase("SELECT wallet FROM jdbc.customers WHERE login ='"+login+"';");
        walletCatch = wallet.walletUser();

        int walletUpdate = inputs.inputIntMessage("Enter the amount to be deposited: ");
        DataBase walletInsert = new DataBase("UPDATE `jdbc`.`customers` SET `wallet` = '"+(walletCatch + walletUpdate)+"' WHERE (`login` = '"+login+"');");
        walletInsert.productInput();
    }
}
