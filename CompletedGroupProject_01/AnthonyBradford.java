package CompletedGroupProject_01;

import javax.swing.*;

public class AnthonyBradford {

    public AnthonyBradford() {

        JFrame frame = new JFrame("Anthony Bradford Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Anthony Bradford | Position: G | #75 | Age: 24 | College: LSU");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
