//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class TyOkada {

     public TyOkada(){



        JFrame frame = new JFrame("Ty Okada Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Ty Okada | Position: S | #39 | Age:26 | College: Montana State");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
