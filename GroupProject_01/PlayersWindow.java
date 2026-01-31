//Players Window Class.

package GroupProject_01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PlayersWindow {
    //Can be deleted, this was a test to see if the window opens with JOptionPane.
 public PlayersWindow() {
        JFrame frame = new JFrame("Players Window");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, "PlayersWindow has been created!");
    }
}
