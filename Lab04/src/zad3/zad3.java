package zad3;

public class zad3
{
    public static void main(String[] args)
    {
        Gatunek crocodile = new Gatunek();
        crocodile.setName("Krokodyl");
        crocodile.setType("Strunowce");
        crocodile.setSpecies("Amerykański");
        crocodile.setDescription("Krokodyl występujący w Ameryce Południowej");
        crocodile.setNumber2n(48);
        crocodile.setX(24);
        System.out.println(crocodile.EnterFullName()+" "+crocodile.toString());

        Gatunek chimpanzee = new Gatunek();
        chimpanzee.setName("Szympans");
        chimpanzee.setType("Strunowce");
        chimpanzee.setSpecies("Zwyczajny");
        chimpanzee.setDescription("Taka duża groźna małpa");
        chimpanzee.setNumber2n(22366);
        chimpanzee.setX(11183);
        System.out.println(chimpanzee.EnterFullName()+" "+chimpanzee.toString());

        Gatunek newChimpanzee = new Gatunek();
        newChimpanzee = chimpanzee;
        newChimpanzee.setDescription("Sklonowana małpa teraz mniej groźna");
        System.out.println(newChimpanzee.EnterFullName()+" "+newChimpanzee.toString());
    }
}
