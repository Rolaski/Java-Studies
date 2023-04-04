import java.time.LocalDate;
import java.util.Scanner;
public class zad2
{
    public static void main(String[] args)
    {
        zad2Buildings building1 = new zad2Buildings("Szpital",4,1996);
        zad2Buildings building2 = new zad2Buildings("Szkoła",2,2018);
        zad2Buildings building3 = new zad2Buildings("Przedszkole",1,2020);
        zad2Buildings building4 = new zad2Buildings("Ratusz",2,1973);

        System.out.println(building1);
        howOld(building1.year);
        System.out.println(building2);
        howOld(building2.year);
        System.out.println(building3);
        howOld(building3.year);
        System.out.println(building4);
        howOld(building4.year);
    }

    public static void howOld(int year)
    {
        LocalDate currentYear = LocalDate.now();
        int age = currentYear.getYear() - year;
        System.out.println("Budynek ma "+age+" lat");
    }
}
