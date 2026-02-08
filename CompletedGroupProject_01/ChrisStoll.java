package CompletedGroupProject_01;

import javax.swing.*;

public class ChrisStoll {
    public ChrisStoll() {
        JFrame frame = new JFrame("Chris Stoll Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Chris Stoll | Position: LS | #41 | Height: 6-2 | Weight: 255 | Age: 27 | Experience: 3 | College: Penn State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChrisStoll::new);
    }
}
