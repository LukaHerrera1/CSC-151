package CompletedGroupProject_01;

import javax.swing.*;

public class TyriceKnight {
    public TyriceKnight() {
        JFrame frame = new JFrame("Tyrice Knight Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Tyrice Knight | Position: LB | #18 | Age: 22 | College: UTEP");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TyriceKnight::new);
    }
}
