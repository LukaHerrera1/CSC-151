package CompletedGroupProject_01;

import javax.swing.*;

public class NickEmmanwori {

    public NickEmmanwori() {

        JFrame frame = new JFrame("Nick Emmanwori Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Nick Emmanwori | Position: S | #3 | Age: N/A | College: South Carolina");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
