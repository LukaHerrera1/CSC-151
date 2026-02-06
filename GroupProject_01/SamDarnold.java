package GroupProject_01;

import javax.swing.*;

public class SamDarnold {

    public SamDarnold() {

        JFrame frame = new JFrame("Sam Darnold Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Sam Darnold | Position: QB | #14 | Age: 28 | College: USC");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
