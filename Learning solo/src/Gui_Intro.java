import javax.swing.JOptionPane;
public class Gui_Intro
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age  = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Masz "+age+" lat");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Masz "+height+"cm wzrostu");

        System.out.println(name+" "+age+" "+height);
    }
}
