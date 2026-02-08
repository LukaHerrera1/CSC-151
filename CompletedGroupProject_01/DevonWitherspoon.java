package CompletedGroupProject_01;

import javax.swing.*;

public class DevonWitherspoon {
    public DevonWitherspoon() {
        JFrame frame = new JFrame("Devon Witherspoon Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Devon Witherspoon | Position: CB | #21 | Height: 6-0 | Weight: 185 | Age: 25 | Experience: 3 | College: Illinois");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DevonWitherspoon::new);
    }
}
