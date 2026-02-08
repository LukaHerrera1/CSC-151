//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class BrandonPili {

     public BrandonPili(){



        JFrame frame = new JFrame("Brandon Pili Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Brandon Pili | Position: NT | #95 | Age:26 | College: USC");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
