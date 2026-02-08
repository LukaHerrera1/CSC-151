package CompletedGroupProject_01;

import javax.swing.*;

public class EricSaubert {
    public EricSaubert() {
        JFrame frame = new JFrame("Eric Saubert Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Eric Saubert | Position: TE | #81 | Height: 6-5 | Weight: 253 | Age: 31 | Experience: 8 | College: Drake");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EricSaubert::new);
    }
}
