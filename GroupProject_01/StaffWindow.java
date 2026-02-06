//Staff Window Class.

package GroupProject_01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StaffWindow {
    //Can be deleted, this was a test to see if the window opens with JOptionPane.
public StaffWindow() {
        JFrame frame = new JFrame("Staff Window");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, "The Staff Window will be created by Maria King.");
    }
}
