import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ColorSwitchGUI {

    //Declare your frame, panel and three buttons.
    JFrame window = new JFrame("Color Switch-a-roo");
    JPanel panel = new JPanel();
    JButton buttonThemeDark = new JButton("Theme: Dark");
    JButton buttonThemeWarren = new JButton("Theme: Warren");
    JButton buttonThemePrimary = new JButton("Theme; Primary");

    public ColorSwitchGUI() {
        //create you GUI
        window.setSize(400, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        buttonThemeDark.addActionListener(new ThemeDark());

        panel.add(buttonThemeDark);
        panel.add(buttonThemePrimary);
        panel.add(buttonThemeWarren);

        window.add(panel);
        window.setVisible(true);
    }

    //add listener
    private class ThemeDark implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Color panelBack = new Color(38, 28, 44);
            Color buttonBack = new Color(62, 44, 65);
            Color buttonText = new Color(110, 133, 178);

            panel.setBackground(panelBack);
            buttonThemeDark.setBackground(buttonText);
            buttonThemeDark.setForeground(buttonBack);
            buttonThemeWarren.setBackground(buttonBack);
            buttonThemeWarren.setForeground(buttonText);
            buttonThemePrimary.setBackground(buttonBack);
            buttonThemePrimary.setForeground(buttonText);
        }

        private class ThemePrimary implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Color panelBack = Color.BLACK;
                Color buttonBack = Color.YELLOW;
                Color buttonText = Color.WHITE;


            }
        }
    }
}
