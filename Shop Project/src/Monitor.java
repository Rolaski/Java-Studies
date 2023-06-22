
public class Monitor extends Product implements ProductsInterface
{
    String matrix, resolution;

    public Monitor(String mark, String model, int price, int quantity, String matrix, String resolution)
    {
        super(mark, model, price, quantity);
        this.matrix = matrix;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "matrix='" + matrix + '\'' +
                ", resolution='" + resolution + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public String getMatrix() {
        return matrix;
    }

    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
