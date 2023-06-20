public class Smartphone extends Product implements ProductsInterface
{
    String RAM, memory;
    int screenSize;

    public Smartphone(String mark, String model, int price, int quantity, String RAM, String memory, int screenSize) {
        super(mark, model, price, quantity);
        this.RAM = RAM;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "RAM='" + RAM + '\'' +
                ", memory='" + memory + '\'' +
                ", screenSize=" + screenSize +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
