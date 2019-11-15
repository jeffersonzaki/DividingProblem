package Class.Recursion;

import javax.swing.*;
import java.util.Scanner;

public class DividingProblem {
    //for message pain. output variable
   public static String output = "";

   //global counter
    static int globalCounter = 0;

    public static int divide(int divided, int division) {
        int result = 0;
        //counts the amount of times it recurs
        globalCounter++;

        if(divided < division) {
            result = 0;
        }
        else {
            return divide(divided - division, division) + 1;
        }
        return result;
    }

    //*Main Method*//
    public static void main(String[] args) {
        //user input on option pane
        int dividend = Integer.parseInt(JOptionPane.showInputDialog("\nEnter a positive dividend number e.g. 7"));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("\nEnter a positive divisor e.g. 9"));

        output += "\nYour dividend " + dividend + " divided by " + divisor + " is: " + divide(dividend, divisor);
        //print out global counter
        output += "\nGlobal Counter: " + globalCounter;

        JOptionPane.showMessageDialog(null, output);

    }

}
