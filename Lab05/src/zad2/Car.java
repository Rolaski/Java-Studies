package zad2;
import javax.swing.JOptionPane;
public class Car
{
    String brand, model, carBody, color;
    int production, mileage;

    public Car(String brand, String model, String carBody, String color, int production, int mileage)
    {
        this.brand = brand;
        this.model = model;
        this.carBody = carBody;
        this.color = color;
        this.production = production;
        this.mileage = mileage;

        while(this.mileage < 0)
        {
            JOptionPane.showMessageDialog(null, "Mileage cannot be negative");
            this.mileage = Integer.parseInt(JOptionPane.showInputDialog("Enter new mileage for "+model));
        }
    }


    //==========SETTERS===========
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setCarBody(String carBody)
    {
        this.carBody = carBody;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setProduction(int production)
    {
        this.production = production;
    }

    public void setMileage(int mileage)
    {
        this.mileage = mileage;
    }

    @Override
    public String toString()
    {
        return "=============================\n"+
                "Informations about car:\n"+
                "Brand: "+brand+"\n"+
                "Model: "+model+"\n"+
                "Car body: "+carBody+"\n"+
                "Color: "+color+"\n"+
                "Year of production: "+production+"\n"+
                "Mileage: "+mileage+"km";
    }
}
