import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */

    public static void main(String[] args) {
        double distance = Double.parseDouble(JOptionPane.showInputDialog("How much is the distance: "));
        JFrame window = new JFrame("Simple Window");
        JPanel panel = new JPanel();
        JButton clickMe = new JButton("Click for feet to meters");
        JButton clickMe2 = new JButton("Click for meters to feet");

        window.setSize(600, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        clickMe.addActionListener(new FeetToMeter());
        clickMe2.addActionListener(new FeetToMeter.MeterToFeet());

        panel.add(clickMe);
        panel.add(clickMe2);
        window.add(panel);
        window.setVisible(true);

    }

    private static class FeetToMeter implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            double feet = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of feet"));

            double meters = feet / 3.28;

            JOptionPane.showMessageDialog(null, meters + "meters. ");

        }

        private static class MeterToFeet implements ActionListener {

            public void actionPerformed(ActionEvent actionEvent) {

                double meters = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of feet"));

                double feet = meters * 3.28;

                JOptionPane.showMessageDialog(null, feet + "feet. ");

            }

        }
    }
}
