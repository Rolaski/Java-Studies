public class Mouse extends Product implements ProductsInterface
{
    String connection;

    public Mouse(String mark, String model, int price, int quantity, String connection) {
        super(mark, model, price, quantity);
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "connection='" + connection + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
