package GroupProject_01;

import javax.swing.*;

public class DerickHall {

    public DerickHall() {

        JFrame frame = new JFrame("Derick Hall Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Derick Hall | Position: LB | #58 | Age: 24 | College: Auburn");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
