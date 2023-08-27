import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame: a GUI to add components to


        /* Option one
        JFrame frame = new JFrame(); // create a frame

        frame.setVisible(true); // make a frame visible
        frame.setTitle("JFrame Title"); // frame title goes here
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setSize(420, 420); // set the x and y dimensions of the frame
        frame.setResizable(false); // prevent from being resized

        ImageIcon imageIcon = new ImageIcon("_49.gui/icon.png"); // create an image icon
        frame.setIconImage(imageIcon.getImage()); // change the frame icon
        frame.getContentPane().setBackground(new Color(0xF89B29)); // setting a black background color
        */

        // Defining a separate class
        new MyFrame(); //
    }
}