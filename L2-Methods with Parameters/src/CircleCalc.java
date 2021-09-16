import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {


    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("What is the radius"));

        //create and run the program
        area(radius);
        perimeter(radius);
    }

    //re-write the method to calculate a circle's area using parameters
    public static void area(double radius) {

        DecimalFormat round = new DecimalFormat("#.##");
        double area = Math.PI * Math.pow(radius, 2);
        JOptionPane.showMessageDialog(null, "The area is " + round.format(area));
    }

    //re-write the method to calculate a circle's perimeter using parameters
    public static void perimeter(double radius) {
        DecimalFormat round = new DecimalFormat("#.##");
        double perimeter = 2 * Math.PI * radius;
        JOptionPane.showMessageDialog(null, "The perimeter is " + round.format(perimeter));
    }
}
