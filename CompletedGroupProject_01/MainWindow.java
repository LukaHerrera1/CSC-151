//Main Window class for Group Project 01.

//All Code in ths file was written by Luka Herrera.

package CompletedGroupProject_01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow {
    public static void main(String[] args) {

        //Create New Main Window.
        JFrame frame = new JFrame("Seattle Seahawks Team Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        //Create Buttons.
        JButton addPlayerButton = new JButton("Players");
        JButton addCoachButton = new JButton("Coaches");    
        JButton addStaffButton = new JButton("Staff");

        //Plater Button New Window Section (Go to PlayersWindow.java to edit info).
        addPlayerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new PlayersWindow();
                }
            });
        
        //Coach Button New Window Section (Go to CoachesWindow.java to edit info)..
        addCoachButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CoachesWindow();
            }
        });

        //Staff Button New WindowSection (Go to StaffWindow.java to edit info).
        addStaffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new StaffMembers();
            }
        });

        //Adding buttons to frame.
        frame.add(addPlayerButton);
        frame.add(addCoachButton);  
        frame.add(addStaffButton);

        frame.setVisible(true);

    }
}