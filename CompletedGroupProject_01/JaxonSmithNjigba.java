package CompletedGroupProject_01;

import javax.swing.*;

public class JaxonSmithNjigba {
    public JaxonSmithNjigba() {
        JFrame frame = new JFrame("Jaxon Smith-Njigba Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Jaxon Smith-Njigba | Position: WR | #11 | Height: 6-0 | Weight: 197 | Age: 23 | Experience: 3 | College: Ohio State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JaxonSmithNjigba::new);
    }
}
