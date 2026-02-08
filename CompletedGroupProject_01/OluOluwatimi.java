//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class OluOluwatimi {

     public OluOluwatimi(){



        JFrame frame = new JFrame("Olu Oluwatimi Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: OluOluwatimi | Position: C | #55 | Age:26 | College: Michigan");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
