package CompletedGroupProject_01;

import javax.swing.*;

public class NickKallerup {
    public NickKallerup() {
        JFrame frame = new JFrame("Nick Kallerup Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Nick Kallerup | Position: TE | #17 | Age: 25 | College: Northern Illinois");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NickKallerup::new);
    }
}
