package CompletedGroupProject_01;

import javax.swing.*;

public class DeMarcusLawrence {
    public DeMarcusLawrence() {
        JFrame frame = new JFrame("DeMarcus Lawrence Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: DeMarcus Lawrence | Position: LB | #20 | Age: 30 | College: Boise State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DeMarcusLawrence::new);
    }
}
