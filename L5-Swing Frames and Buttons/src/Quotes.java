import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */

    public static void main(String[] args) {

        JFrame window = new JFrame("Simple Window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click for a quote");

        window.setSize(600,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());

        panel.add(button);
        window.add(panel);
        window.setVisible(true);
    }

    private static class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "They say there are five stages of grief. Denial, anger, bargaining, depression, and acceptance. " +
                    "But I would like to add another one Revenge ");

            JOptionPane.showMessageDialog(null, "All my life i had to fight");

            JOptionPane.showMessageDialog(null, "Just keep swimming");

        }
    }

}
