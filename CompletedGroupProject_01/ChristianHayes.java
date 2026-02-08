package CompletedGroupProject_01;

import javax.swing.*;

public class ChristianHayes {

    public ChristianHayes() {

        JFrame frame = new JFrame("Christian Hayes Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Christian Hayes | Position: G | #64 | Age: 25 | College: Connecticut");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

