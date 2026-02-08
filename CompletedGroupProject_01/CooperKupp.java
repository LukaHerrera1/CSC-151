package CompletedGroupProject_01;

import javax.swing.*;

public class CooperKupp {
    public CooperKupp() {
        JFrame frame = new JFrame("Cooper Kupp Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Cooper Kupp | Position: WR | #19 | Age: 29 | College: Eastern Washington");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CooperKupp::new);
    }
}
