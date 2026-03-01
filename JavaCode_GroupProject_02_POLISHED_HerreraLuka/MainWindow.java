//All Code in ths file was written by Luka Herrera.

package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Seattle Seahawks Team Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JButton addPlayerButton = new JButton("Players");
        JButton addCoachButton = new JButton("Coaches");    
        JButton addStaffButton = new JButton("Staff");

        addPlayerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PlayersWindow();
                }
            });
        addCoachButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CoachesWindow();
            }
        });
        addStaffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new StaffWindow();
            }
        });
        frame.add(addPlayerButton);
        frame.add(addCoachButton);  
        frame.add(addStaffButton);
        frame.setVisible(true);
    }
}