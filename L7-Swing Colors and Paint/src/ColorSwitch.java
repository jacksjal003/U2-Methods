import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitch {

    Color panelBack = new Color(0, 0, 0);
    Color buttonBack = new Color(34, 40, 49);
    Color buttonFront = new Color(240, 84, 84);
    JFrame window;
    JPanel panel;
    JButton colorClicker;

    //Declare your frame, panel and three buttons.
    public ColorSwitch() {
        //create your GUI

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);


        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");

        //create a new Custom color
        Color panelBack = new Color(0, 0, 0);
        Color buttonBack = new Color(34, 40, 49);
        Color buttonFront = new Color(240, 84, 84);

        //set the colors of our buttons and panel
        panel.setBackground(panelBack);
        colorClicker.setForeground(buttonFront);
        colorClicker.setForeground(buttonBack);

        colorClicker.addActionListener(new ColorClickerListener());
        panel.add(colorClicker);
        window.add(panel);

        window.setVisible(true);

    }

    //Add a listener to change the color when the button is closed
    private class ColorClickerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(panelBack);
            colorClicker.setForeground(buttonBack);
            colorClicker.setBackground(buttonFront);

        }
    }

    //add listeners to change the colors. Don't forget to link them to buttons.
}