import javax.swing.JOptionPane;
public class HelloNameDialog {
    public static void main(String[] args){
        String result;
        result = JOptionPane.showInputDialog("please enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + result + ", how are yuuuuu");
        System.exit(0);
    }
}