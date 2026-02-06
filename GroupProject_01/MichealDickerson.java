package GroupProject_01;

import javax.swing.*;

public class MichealDickerson {

    public MichealDickerson() {

        JFrame frame = new JFrame("Micheal Dickerson Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Micheal Dickerson | Position: P | #4 | Age: 30 | College: Texas");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}

