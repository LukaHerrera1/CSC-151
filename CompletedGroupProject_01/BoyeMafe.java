//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class BoyeMafe {

    public BoyeMafe() {

        JFrame frame = new JFrame("Boye Mafe Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Boye Mafe | Position: LB | #53 | Age:27 | College: Minnesota");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
