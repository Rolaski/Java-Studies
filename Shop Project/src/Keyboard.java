
public class Keyboard extends Product implements ProductsInterface
{
    String connection, keyboardSwitch;
    String backLight;

    public Keyboard(String mark, String model, String connection, String keyboardSwitch, int price, int quantity, String backLight) {
        super(mark, model, price, quantity);
        this.connection = connection;
        this.keyboardSwitch = keyboardSwitch;
        this.price = price;
        this.quantity = quantity;
        this.backLight = backLight;
    }

    @Override
    public String toString()
    {
        return "Keyboard{" +
                "connection='" + connection + '\'' +
                ", keyboardSwitch='" + keyboardSwitch + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", backLight=" + backLight +
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

    public String getKeyboardSwitch() {
        return keyboardSwitch;
    }

    public void setKeyboardSwitch(String keyboardSwitch) {
        this.keyboardSwitch = keyboardSwitch;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}