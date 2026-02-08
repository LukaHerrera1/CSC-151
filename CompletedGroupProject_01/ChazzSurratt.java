package CompletedGroupProject_01;

import javax.swing.*;

public class ChazzSurratt {
    public ChazzSurratt() {
        JFrame frame = new JFrame("Chazz Surratt Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Chazz Surratt | Position: LB | #44 | Height: 6-2 | Weight: 233 | Age: 28 | Experience: 4 | College: North Carolina");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChazzSurratt::new);
    }
}
