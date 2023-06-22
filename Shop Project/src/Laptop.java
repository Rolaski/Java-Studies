
public class Laptop extends Product implements ProductsInterface
{
    String processor, graphicsCard, RAM, disk;
    double screenDiagonal;

    public Laptop(String mark, String model, int price, int quantity, String processor, String graphicsCard, String RAM, String disk, double screenDiagonal)
    {
        super(mark, model, price, quantity);
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.RAM = RAM;
        this.disk = disk;
        this.screenDiagonal = screenDiagonal;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", RAM='" + RAM + '\'' +
                ", disk='" + disk + '\'' +
                ", screenDiagonal=" + screenDiagonal +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
}
