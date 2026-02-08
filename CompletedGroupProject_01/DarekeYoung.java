package CompletedGroupProject_01;

import javax.swing.*;

public class DarekeYoung {
    public DarekeYoung() {
        JFrame frame = new JFrame("Dareke Young Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Dareke Young | Position: WR | #83 | Height: 6-2 | Weight: 224 | Age: 26 | Experience: 4 | College: Lenoir Rhyne");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DarekeYoung::new);
    }
}
