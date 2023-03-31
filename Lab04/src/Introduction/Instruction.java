package Introduction;

public class Instruction {
    public static void main(String[] args)
    {
        Person object1 = new Person("zjeb", 18, false);
        System.out.println("imie: "+object1.getName());
        object1.setName("upo");
        System.out.println("imie: "+object1.getName());
        System.out.println(object1.toString());
    }
}