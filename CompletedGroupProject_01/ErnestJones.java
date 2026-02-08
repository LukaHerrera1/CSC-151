package CompletedGroupProject_01;

import javax.swing.*;

public class ErnestJones {
    public ErnestJones() {
        JFrame frame = new JFrame("Ernest Jones IV Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Ernest Jones IV | Position: LB | #15 | Age: 23 | College: South Carolina");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ErnestJones::new);
    }
}
