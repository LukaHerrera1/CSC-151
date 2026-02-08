package CompletedGroupProject_01;

import javax.swing.*;

public class CobyBryant {

    public CobyBryant() {

        JFrame frame = new JFrame("Coby Bryant Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Coby Bryant | Position: S | #8 | Age: 26 | College: Cincinnati");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
