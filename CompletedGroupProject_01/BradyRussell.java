package CompletedGroupProject_01;

import javax.swing.*;

public class BradyRussell {
    public BradyRussell() {
        JFrame frame = new JFrame("Brady Russell Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Brady Russell | Position: FB | #38 | Height: 6-3 | Weight: 250 | Age: 27 | Experience: 3 | College: Colorado");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BradyRussell::new);
    }
}
