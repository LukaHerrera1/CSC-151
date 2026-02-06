package GroupProject_01;

import javax.swing.*;

public class AjBarner {

    public AjBarner() {

        JFrame frame = new JFrame("Aj Barner Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Aj Barner | Position: TE | #88 | Age: 23 | College: Michigan");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

