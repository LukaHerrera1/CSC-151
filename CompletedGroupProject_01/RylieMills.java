//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class RylieMills {

     public RylieMills(){



        JFrame frame = new JFrame("Rylie Mills Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Rylie Mills | Position: DE | #6 | Age:23 | College: Alabama");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
