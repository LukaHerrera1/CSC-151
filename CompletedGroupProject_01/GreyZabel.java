package CompletedGroupProject_01;

import javax.swing.*;

public class GreyZabel {
    public GreyZabel() {
        JFrame frame = new JFrame("Grey Zabel Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Grey Zabel | Position: G | #76 | Height: 6-6 | Weight: 316 | Age: 23 | Experience: R | College: North Dakota State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GreyZabel::new);
    }
}
