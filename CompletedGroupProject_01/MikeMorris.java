//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class MikeMorris {

    public MikeMorris() {

        JFrame frame = new JFrame("Mike Morris Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Mike Morris | Position: DE | #94 | Age:24 | College: Michigan");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
