import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        // JFrame: a GUI to add components to

        JFrame frame = new JFrame(); // create a frame

        this.setTitle("JFrame Title"); // frame title goes here
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setSize(420, 420); // set the x and y dimensions of the frame
        this.setResizable(false); // prevent frame from being resized

        ImageIcon imageIcon = new ImageIcon("_49.gui/icon.png"); // create an image icon
        this.setIconImage(imageIcon.getImage()); // change the frame icon
        this.getContentPane().setBackground(new Color(0xF89B29)); // setting a black background color

        this.setVisible(true); // make a frame visible
    }
}
