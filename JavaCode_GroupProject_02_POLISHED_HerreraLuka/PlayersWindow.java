//ALL CODE IN THIS FILE WAS WRITTEN BY LUKA HERRERA.

package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;

public class PlayersWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Players");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JButton viewPlayersButton = new JButton("View Players");
        JButton addPlayerButton = new JButton("Add Player");
        viewPlayersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Players.main(null);
            }
        });
        addPlayerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String[] positions = {
                        "Quarterback", "Running Back", "Wide Receiver",
                        "Tight End", "Offensive Lineman", "Defensive Lineman",
                        "Linebacker", "Cornerback", "Safety", "Kicker", "Punter"
                    };

                    String position = (String) JOptionPane.showInputDialog(
                        null,
                        "Select position:",
                        "Position Selection",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        positions,
                        positions[0]
                    );
                    String name = JOptionPane.showInputDialog("Enter player name:");
                    String number = JOptionPane.showInputDialog("Enter jersey number:");
                    if (position == null || name == null || number == null) return;
                    FileWriter writer = new FileWriter("JavaCode_GroupProject_02_POLISHED_HerreraLuka/player.csv", true);
                    writer.write("Player," + name + "," + position + "," + number + "," + "" + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(null, "Player added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        frame.add(viewPlayersButton);
        frame.add(addPlayerButton);
        frame.setVisible(true);
    }
}