//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class ConnorOToole {

     public ConnorOToole(){



        JFrame frame = new JFrame("Connor O'Toole Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Connor O'Toole | Position: LB | #57 | Age:23 | College: Uhta");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
