//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class RobbieOuzts {

     public RobbieOuzts(){



        JFrame frame = new JFrame("Robbie Ouzts Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Robbi eOuzts | Position: FB | #40 | Age:23 | College: Alabama");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
