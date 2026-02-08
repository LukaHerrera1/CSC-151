//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class AbrahamLucas {

    public AbrahamLucas() {

        JFrame frame = new JFrame("Abraham Lucas Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Abraham Lucas | Position: T | #72 | Age:27 | College: Washington State");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
