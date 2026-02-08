package CompletedGroupProject_01;

import javax.swing.*;

public class DrewLock {
    public DrewLock() {
        JFrame frame = new JFrame("Drew Lock Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Drew Lock | Position: QB | #21 | Age: 25 | College: Missouri");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrewLock::new);
    }
}
