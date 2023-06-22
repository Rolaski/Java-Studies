public class shoppingCartOperations
{
    //sumowanie kwoty produktów w koszyku
    public static int shoppingCartSum(Integer option, String option2,String option3)
    {
        int sumMoney = 0;
        DataBase priceCheck = new DataBase("SELECT price FROM jdbc."+option2+" WHERE id"+option3+" = "+option+";");
        sumMoney = sumMoney + priceCheck.totalPrice();
        return sumMoney;
    }
    //wrzuca nam nowa ilosc produktu do bazy
    public static int shoppingCartQuantityUpdate(Integer option,String option2,String option3, int option4)
    {
        DataBase quantityUpdate = new DataBase("UPDATE jdbc."+option2+" SET quantity ="+option4+" WHERE id"+option3+" ="+option);
        int quantityUpdating = quantityUpdate.updateQuantity();
        return quantityUpdating;
    }
    //sprawdza nam ilośc sztuk w magazynie w podanej bazie dla konktretnego id
    public static int shoppingCartQuantityCheck(Integer option, String option2,String option3)
    {
        DataBase quantityCheck = new DataBase("SELECT quantity FROM jdbc."+option2+" WHERE id"+option3+" = "+option+";");
        int quantityActual = quantityCheck.totalQuantity();
        return quantityActual;
    }
}
