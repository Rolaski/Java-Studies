package Abstraction;

import javax.swing.*;

public class Car extends Vehicle
{
    @Override
    void go()
    {
        System.out.println("The driver is driving the car");
    }
    @Override
    double stop()
    {
        double speed = Double.parseDouble(JOptionPane.showInputDialog("Enter your actual speed in km/h"));
        return speed;
    }
}
