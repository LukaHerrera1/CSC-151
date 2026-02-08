//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;


import javax.swing.*;

public class ByronMurphyII {

     public ByronMurphyII(){



        JFrame frame = new JFrame("Byron Murphy II Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Byron Murphy II | Position: DT | #91 | Age:23 | College: Texas");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
