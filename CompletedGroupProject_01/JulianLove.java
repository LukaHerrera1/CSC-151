package CompletedGroupProject_01;

import javax.swing.*;

public class JulianLove {
    public JulianLove() {
        JFrame frame = new JFrame("Julian Love Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Julian Love | Position: S | #22 | Age: 26 | College: Notre Dame");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JulianLove::new);
    }
}
