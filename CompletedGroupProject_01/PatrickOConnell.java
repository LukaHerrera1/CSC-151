//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;

import javax.swing.*;

public class PatrickOConnell {

     public PatrickOConnell(){



        JFrame frame = new JFrame("Patrick O'Connell Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Patrick O'Connell | Position: QB | #52 | Age:27 | College: Montana");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
