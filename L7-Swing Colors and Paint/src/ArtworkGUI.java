import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;

    //DECLARE VARIABLES

    public ArtworkGUI()
    {
        //CREATE THE GUI

        frame = new JFrame("My ArtWork");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);

    }

    private class MyDrawing extends JPanel
    {
        public MyDrawing(){
            //Set the background color
            setBackground(Color.black);
        }

        public void paintComponent(Graphics g) {

            super.paintComponent(g);

            g.drawOval(20, 120, 450, 200);
            g.drawOval(95, 115, 390, 280);

            g.setColor(Color.WHITE);
            g.fillOval(190, 170, 100, 100);

            g.setColor(new Color(47, 32, 66));
            g.fillOval(320, 295, 30, 30);

            g.setColor(new Color(1, 50, 32));
            g.fillOval(117, 117, 33, 33);

            g.setColor(new Color(137, 207, 240));
            g.fillOval(450, 200, 35, 35);


        }



        //Add the PaintComponent Method and create your drawing.
    }
}
