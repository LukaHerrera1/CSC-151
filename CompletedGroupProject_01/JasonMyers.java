//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class JasonMyers {

     public JasonMyers(){



        JFrame frame = new JFrame("Jason Myers Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Jason Myers | Position: K | #5 | Age:34 | College: Marist");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
