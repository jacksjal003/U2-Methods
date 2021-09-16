import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop

    1. get output
    2. isolate p and then 3 letters after it
    3. Output
     */

    public static void main(String[] args) {
       String word = JOptionPane.showInputDialog("Give me a word with at least one P");

        JOptionPane.showMessageDialog(null, pThree(word));
    }

    public static String pThree (String word){

        int pIndex = word.indexOf('p');

        return word.substring(pIndex, pIndex + 4);
    }

}
