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
    static JTextField textInputField2;
    static JLabel resultLabel;

    public static void main(String[] args) {
        JFrame window = new JFrame("Calculator");
        JPanel panel = new JPanel();
        textInputField = new JTextField(10);
        textInputField2 = new JTextField(10);
        JLabel textInputLabel = new JLabel("Enter a Number ");
        JLabel textInputLabel2 = new JLabel("Enter a Number ");

        JButton addition = new JButton("Addition");
        JButton subtraction = new JButton("Subtraction");
        JButton multiplication = new JButton("Multiplication");
        JButton division = new JButton("Division");

        window.setSize(300, 150);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(textInputLabel);
        panel.add(textInputField);
        panel.add(textInputLabel2);
        panel.add(textInputField2);


        panel.add(resultLabel);

        panel.add(subtraction);
        panel.add(addition);
        panel.add(multiplication);
        panel.add(division);

        window.add(panel);
        window.setVisible(true);

    }

    private static class addListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            double number1 = Double.parseDouble(textInputField.getText());
            double number2 = Double.parseDouble(textInputField2.getText());
            resultLabel.setText(String.valueOf(number1 + number2));


        }

        private static class subtractListener implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {

                double number1 = Double.parseDouble(textInputField.getText());
                double number2 = Double.parseDouble(textInputField2.getText());
                resultLabel.setText(String.valueOf(number1 - number2));

            }

            private static class multiplyListener implements ActionListener {

                public void actionPerformed(ActionEvent actionEvent) {

                    double number1 = Double.parseDouble(textInputField.getText());
                    double number2 = Double.parseDouble(textInputField2.getText());
                    resultLabel.setText(String.valueOf(number1 * number2));


                }

                private static class divideListener implements ActionListener {

                    public void actionPerformed(ActionEvent actionEvent) {

                        double number1 = Double.parseDouble(textInputField.getText());
                        double number2 = Double.parseDouble(textInputField2.getText());
                        resultLabel.setText(String.valueOf(number1 / number2));

                    }
                }
            }
        }
    }
}
