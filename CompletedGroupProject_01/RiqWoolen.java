package CompletedGroupProject_01;

import javax.swing.*;

public class RiqWoolen {
    public RiqWoolen() {
        JFrame frame = new JFrame("Riq Woolen Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Riq Woolen | Position: CB | #27 | Height: 6-4 | Weight: 210 | Age: 26 | Experience: 4 | College: Texas-San Antonio");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RiqWoolen::new);
    }
}
