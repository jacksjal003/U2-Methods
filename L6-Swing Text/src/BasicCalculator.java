import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BasicCalculator {

    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS
     */

    static int calculatorCount = 0;
    static JLabel calculatorCountLabel;
    static JTextField textInputField;

    public static void main(String[] args) {
        JFrame window = new JFrame("Calculator");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
        calculatorCountLabel = new JLabel("Solution");
        JLabel textInputLabel = new JLabel("Enter a Number ");
        JButton addition = new JButton("Addition");
        JButton subtraction = new JButton("Subtraction");
        JButton multiplication = new JButton("Multiplication");
        JButton division = new JButton("Division");

        window.setSize(300, 150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(textInputLabel);
        panel.add(textInputLabel);
        panel.add(textInputField);
        panel.add(calculatorCountLabel);
        window.add(panel);

        window.setVisible(true);

    }

    private static class FeetToMeter implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent){




        }

        }



}
