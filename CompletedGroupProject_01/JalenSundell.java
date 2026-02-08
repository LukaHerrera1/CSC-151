package CompletedGroupProject_01;

import javax.swing.*;

public class JalenSundell {
    public JalenSundell() {
        JFrame frame = new JFrame("Jalen Sundell Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Jalen Sundell | Position: C | #61 | Height: 6-5 | Weight: 301 | Age: 26 | Experience: 2 | College: North Dakota State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JalenSundell::new);
    }
}
