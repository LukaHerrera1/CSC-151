package CompletedGroupProject_01;

import javax.swing.*;

public class CharlesCross {

    public CharlesCross() {

        JFrame frame = new JFrame("Charles Cross Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Charles Cross | Position: T | #67 | Age: 25 | College: Mississippi State");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
