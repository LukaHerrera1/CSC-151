package GroupProject_01;

import javax.swing.*;

public class ElijahArroyo {

    public ElijahArroyo() {

        JFrame frame = new JFrame("Elijah Arroyo Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Elijah Arroyo | Position: TE | #18 | Age: 22 | College: Miami");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

