import java.util.Scanner;
public class PersonalComputer extends Product implements ProductsInterface
{
    private String processor, graphicsCard, RAM, disk;

    public PersonalComputer(String mark, String model, String processor, String graphicsCard, String RAM, String disk,int price, int quantity)
    {
        super(mark, model, price, quantity);
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.RAM = RAM;
        this.disk = disk;
    }
    //======== SETTERS AND GETTERS =======


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

    //========= TOSTRING SECTION ========
    @Override
    public String toString()
    {
        return "PersonalComputer{" +
                "mark='" + mark + '\'' +
                "model='" + model + '\'' +
                "processor='" + processor + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", RAM='" + RAM + '\'' +
                ", disk='" + disk + '\'' +
                "price='" + price + '\'' +
                "quantity='" + quantity + '\'' +
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
