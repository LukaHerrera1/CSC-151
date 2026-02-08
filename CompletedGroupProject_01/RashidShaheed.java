package CompletedGroupProject_01;

import javax.swing.*;

public class RashidShaheed {
    public RashidShaheed() {
        JFrame frame = new JFrame("Rashid Shaheed Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Rashid Shaheed | Position: WR | #22 | Height: 6-0 | Weight: 180 | Age: 27 | Experience: 4 | College: Weber State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RashidShaheed::new);
    }
}
