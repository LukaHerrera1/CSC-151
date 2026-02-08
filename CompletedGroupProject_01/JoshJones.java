package CompletedGroupProject_01;
import javax.swing.*;

public class JoshJones {
    public JoshJones() {
        JFrame frame = new JFrame("Josh Jones Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Josh Jones | Position: G/T | #16 | Age: 28 | College: NC State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JoshJones::new);
    }
}
