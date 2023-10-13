import javax.swing.*;

public class CongTruNhanChia {
    public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        JOptionPane.showMessageDialog(null, num1 + num2 , "Sum of two number:",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 - num2 , "Difference of two number:",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 * num2 , "Product of two number:",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, num1 / num2 , "Quotient of two number:",
                JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
