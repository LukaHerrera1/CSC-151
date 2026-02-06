package GroupProject_01;

import javax.swing.*;

public class JakeBobo {

    public JakeBobo() {

        JFrame frame = new JFrame("Jake Bobo Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Jake Bobo | Position: WR | #19 | Age: 27 | College: Duke");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
