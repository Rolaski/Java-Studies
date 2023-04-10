package zad1;
public class Point
{
    double x,y;
//=========CONSTRUCTORS===========
    public Point()
    {
        this.x=0.0;
        this.y=0.0;
    }
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

//=========GETTERS===========
    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

//=========SETTERS===========
    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public void reset()
    {
        x=0.0;
        y=0.0;
    }
    public void description()
    {
        System.out.println("Punkt o współrzędnych ["+x+","+y+"]");
    }

    public void move(double x,double y)
    {
        this.x = this.x + x;
        this.y = this.y + y;
    }
}
