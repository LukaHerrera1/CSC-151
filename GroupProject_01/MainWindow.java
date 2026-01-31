//Main Window class for Group Project 01

//Code between lines 1 and # are created by Luka Herrera

package GroupProject_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow {
    public static void main(String[] args) {

        //Create new window.
        JFrame frame = new JFrame("Seattle Seahawks Team Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        //Create buttons.
        JButton addPlayerButton = new JButton("Players");
        JButton addCoachButton = new JButton("Coaches");    
        JButton addStaffButton = new JButton("Staff");

        //Plater Button Section.
        addPlayerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "players");
                }
            });
        
        //Coach Button Section.
        addCoachButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "coaches");
            }
        });

        //Staff Button Section.
        addStaffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "staff");
            }
        });

        //Adding buttons to frame.
        frame.add(addPlayerButton);
        frame.add(addCoachButton);  
        frame.add(addStaffButton);

        frame.setVisible(true);

    }
}


