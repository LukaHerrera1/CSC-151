package CompletedGroupProject_01;

import javax.swing.*;

public class GeorgeHolani {

    public GeorgeHolani() {

        JFrame frame = new JFrame("George Holani Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: George Holani | Position: RB | #36 | Age: 26 | College: Boise State");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

