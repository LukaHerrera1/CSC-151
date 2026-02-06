package GroupProject_01;

import javax.swing.*;

public class JaydenIvey {

    public JaydenIvey() {

        JFrame frame = new JFrame("Jayden Ivey Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Jayden Ivey | Position: LB | #51 | Age: 24 | College: Mississippi");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

