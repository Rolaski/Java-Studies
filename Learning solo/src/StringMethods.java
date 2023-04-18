public class StringMethods
{
    public static void main(String[] args)
    {
        String name = "Jacob";
        String name1 = "jacob";
        String name2 = "";
        String name3 = "     Maciek          ";
        boolean result = name.equals("Frajer");
        boolean result1 = name.equalsIgnoreCase(name1);
        //equalsIgnoreCase - polecenie ma w dupie duże i małe znaki

        int WordLength = name1.length();        //długość słowa
        char ThirdLetter = name.charAt(2);      //wyświetla np. 2 znak Stringu name
        int SearchingSign = name.indexOf("o");  //wyświetla nr indeksu konkretnego znaku np. o
        boolean isEmpty = name2.isEmpty();      //sprawdza czy String name2 jest pusty
        String Uppercase = name.toUpperCase();  //zmienia znaki na duże, analogicznie .toLowerCase
        String Trim = name3.trim();             //usuwa spacje, ucina je
        String Replace = Trim.replace("a", "o");    //zamiana znaku a na o


        System.out.println(result);
        System.out.println(result1 +" "+WordLength);
        System.out.println("Pierwsza litera słowa "+name+ " to: "+ThirdLetter);
        System.out.println("Litera 'o' ma indeks nr."+SearchingSign);
        System.out.println(isEmpty);
        System.out.println("słowo "+name+" ma teraz duże litery -> "+Uppercase);
        System.out.println("Teraz pozbyliśmy się niepotrzebnych miejsc: "+Trim);
        System.out.println("Maciek po przejściach: "+Replace);
    }
}
