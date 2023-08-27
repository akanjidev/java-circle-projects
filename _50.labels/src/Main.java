import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JLabel is a GUI display area for a string, an image or both.

        JFrame frame = new JFrame();

        ImageIcon imageIcon = new ImageIcon("_49.gui/icon.png"); // create an image icon using the previous icon
        Border border = BorderFactory.createLineBorder(Color.GRAY,3); // create a border

        JLabel jLabel = getLabel(imageIcon, "JLabel with an icon", border);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500, 500);
        // frame.setLayout(null); // set the layout manager to null to be able to control the label
        frame.add(jLabel);

        frame.setVisible(true);
        frame.pack(); // resize the frame accommodate all the components
    }

    // We created a public method which returns a JLabel for readability
    private static JLabel getLabel(ImageIcon imageIcon, String label, Border border) {
        JLabel jLabel = new JLabel(label); // we can pass a text directly while creating a label or by using setText() method
        // jLabel.setText(label);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT
        jLabel.setVerticalTextPosition(JLabel.TOP); // set text TOP, MIDDLE, BOTTOM
        jLabel.setForeground(new Color(0xF89B29)); // set the font color
        jLabel.setFont(new Font("Times New Roman",Font.ITALIC, 20)); // set the font family, font style and font size
        jLabel.setIconTextGap(10); // set a gap of a text to image
        jLabel.setBackground(Color.BLUE); // set the label background color
        jLabel.setOpaque(true); // display the background color
        jLabel.setBorder(border); // set the border

        jLabel.setVerticalAlignment(JLabel.CENTER); // set the vertical alignment of content within the label
        jLabel.setHorizontalAlignment(JLabel.CENTER); // set the horizontal alignment

        // jLabel.setBounds(0,0, 300, 400); // x and y co-ordinates and size(width, height) fixed even when the frame is resized

        return jLabel;
    }
}