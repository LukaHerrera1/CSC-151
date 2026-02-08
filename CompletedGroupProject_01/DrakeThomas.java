package CompletedGroupProject_01;

import javax.swing.*;

public class DrakeThomas {
    public DrakeThomas() {
        JFrame frame = new JFrame("Drake Thomas Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Drake Thomas | Position: LB | #42 | Height: 5-11 | Weight: 228 | Age: 25 | Experience: 3 | College: N.C. State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrakeThomas::new);
    }
}
