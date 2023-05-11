package AccessModifiers.Package2;
import AccessModifiers.Package1.classA;

public class SubclassA extends classA
{
    public static void main(String[] args)
    {
        SubclassA subA = new SubclassA();
        System.out.println(subA.protectedMessage);
    }

}
