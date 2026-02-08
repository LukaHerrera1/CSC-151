package CompletedGroupProject_01;

import javax.swing.*;

public class JoshJobe {
    public JoshJobe() {
        JFrame frame = new JFrame("Josh Jobe Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Josh Jobe | Position: CB | #14 | Age: 24 | College: Alabama");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JoshJobe::new);
    }
}
