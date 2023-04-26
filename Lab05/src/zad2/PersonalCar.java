package zad2;
import javax.swing.*;

public class PersonalCar extends Car
{
    int maxPeople;
    double engineCapacity, weight;

    public PersonalCar(String brand, String model, String carBody, String color, int production, int mileage, double weight, double engineCapacity, int maxPeople)
    {
        super(brand, model, carBody, color, production, mileage);
        this.weight = weight;
        this.engineCapacity = engineCapacity;
        this.maxPeople = maxPeople;

        while(this.weight > 4.5 || this.weight < 2)
        {
            JOptionPane.showMessageDialog(null, "Weight must be in the range of 2t - 4.5t");
            this.weight = Double.parseDouble(JOptionPane.showInputDialog("Enter new weight"));
        }

        while(this.engineCapacity > 3 || this.engineCapacity < 0.8)
        {
            JOptionPane.showMessageDialog(null, "engine capacity must be in the range of 0.8 - 3.0");
            this.engineCapacity = Double.parseDouble(JOptionPane.showInputDialog("Enter new Engine capacity"));
        }
    }

    public String toString()
    {
        return super.toString()+"\n"+
                "Weight: "+weight+"t\n"+
                "Engine capacity: "+engineCapacity+"\n"+
                "Max number of people: "+maxPeople+"\n"+
                "=============================";
    }
}
