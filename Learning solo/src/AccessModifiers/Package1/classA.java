package AccessModifiers.Package1;
import AccessModifiers.Package2.*;
public class classA
{
    public static void main(String[] args)
    {
        classC c = new classC();
        System.out.println(c.publicMessage);

        classB b = new classB();
        //System.out.println(classB.privateMessage);
        //nie możemy jej wywołać ponieważ ma modyfikator private
    }
    protected String protectedMessage = "This is protected message!";
}
