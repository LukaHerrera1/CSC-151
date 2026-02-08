package CompletedGroupProject_01;

import javax.swing.*;

public class KennethWalkerIII {
    public KennethWalkerIII() {
        JFrame frame = new JFrame("Kenneth Walker III Info");
        frame.setSize(600, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel label = new JLabel("Name: Kenneth Walker III | Position: RB | #9 | Height: 5-9 | Weight: 211 | Age: 25 | Experience: 4 | College: Michigan State");
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(KennethWalkerIII::new);
    }
}
