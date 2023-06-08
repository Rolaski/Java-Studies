package Enum;
import javax.swing.JOptionPane;


public class Main
{
    public static void main(String[] args)
    {
        //parsowanie okienka joptionapne na typ enuma(ranks)
        Ranks ranks = Ranks.valueOf(JOptionPane.showInputDialog(null, "What's your rank?"));

        switch (ranks)
        {
            case Private -> System.out.println("no visits this week!");
            case Corporal -> System.out.println("you are the worst squad leader!");
            case Sergeant -> System.out.println("today you will conduct training for new privates");
            case General -> System.out.println("I earn more than the entire department!");
        }
    }
}
