import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JPanel a GUI component that functions as a container to hold other components

        JFrame frame = new JFrame(); // create a JFrame

        JLabel redLabelText = new JLabel("This is a red panel");
        redLabelText.setForeground(Color.WHITE);

        JLabel blueLabelText = new JLabel("This is a blue panel");
        blueLabelText.setForeground(Color.WHITE);

        JLabel greenLabelText = new JLabel("This is a green panel");
        greenLabelText.setForeground(Color.BLACK);
        greenLabelText.setVerticalAlignment(JLabel.CENTER); // adjust to use border layout
        greenLabelText.setHorizontalAlignment(JLabel.CENTER);

        JPanel redPanel = new JPanel(); // create a panel
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.add(redLabelText);

        JPanel bluePanel = new JPanel(); // create a panel
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.add(blueLabelText);

        JPanel greenPanel = new JPanel(); // create a panel
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(new BorderLayout()); // use a border layout manager
        greenPanel.add(greenLabelText);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // no layout manager
        frame.setSize(750,750);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);


        frame.setVisible(true);
    }
}