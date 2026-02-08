//Creaeted by Domonic Yarnall

package CompletedGroupProject_01;
import javax.swing.*;

public class UchennaNwosu {

    public UchennaNwosu() {

        JFrame frame = new JFrame("Uchenna Nwosu Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Name: Uchenna Nwosu | Position: LB | #7 | Age:29 | College: USC");
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(label);

        frame.setVisible(true);   // 🚨 THIS IS REQUIRED
    }
}
