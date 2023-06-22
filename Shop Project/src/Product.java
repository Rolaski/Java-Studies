import java.util.Scanner;
public class Product implements ProductsInterface
{
    public String mark, model;
    public int price, quantity;

    public Product(String mark, String model, int price, int quantity)
    {
        this.mark = mark;
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    //========= SETTERS SECTION ========
    public void setMark(String mark)
    {
        mark = inputString();
        this.mark = mark;
    }

    public void setModel(String model) {
        model = inputString();
        this.model = model;
    }

    public void setPrice(int price) {
        price = inputInt();
        this.price = price;
    }

    public void setQuantity(int quantity) {
        quantity = inputInt();
        this.quantity = quantity;
    }

    //========= GETTERS SECTION ========
    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //========= TOSTRING SECTION ========
    @Override
    public String toString()
    {
        return "Product{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    //========= SCANER SECTION ========
    public String inputString()
    {
        Scanner input = new Scanner(System.in);
        return input.toString();
    }
    public int inputInt()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
