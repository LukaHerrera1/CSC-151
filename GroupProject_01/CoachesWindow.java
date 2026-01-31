//Coaches Window Class.

package GroupProject_01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CoachesWindow {
    //Can be deleted, this was a test to see if the window opens with JOptionPane;.
public CoachesWindow() {
        JFrame frame = new JFrame("Coaches Window");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, "CoachesWindow has been created!");
    }
}
