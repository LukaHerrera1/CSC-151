package CompletedGroupProject_01;

import javax.swing.*;

public class LeonardWilliams {
    public LeonardWilliams() {
        JFrame frame = new JFrame("Leonard Williams Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Leonard Williams | Position: DT | #99 | Height: 6-5 | Weight: 310 | Age: 31 | Experience: 11 | College: USC");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LeonardWilliams::new);
    }
}
