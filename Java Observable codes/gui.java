import javax.swing.JOptionPane;
public class gui {
    public static void main(String[]args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");

        //double example
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are "+height+" cm tall");

        double pi = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of PI"));
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of radius"));
        double circumference = 2*pi*radius;
        JOptionPane.showMessageDialog(null, "Your circumference is "+circumference+" cm");
    }
}
