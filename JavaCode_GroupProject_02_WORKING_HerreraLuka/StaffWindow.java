//Staff Window Class.

package JavaCode_GroupProject_02_WORKING_HerreraLuka;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.FileWriter;

public class StaffWindow {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Staff Members");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JButton ViewStaffButton = new JButton("View Staff");
        JButton addStaffButton = new JButton("Add Staff");
       
        ViewStaffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
        StaffMembers.main(null); // <-- This will open the Staff Members window to view the tree
            }
    }
    );
            
        addStaffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String [] options = {"Main Staff", "Secondary Staff"};
                int choice = JOptionPane.showOptionDialog(null, "Select Staff Category", "Staff Category",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);    

                        try {
                          
                            if (choice == 0) {
                                String name = JOptionPane.showInputDialog("Enter name:");
                                String title = JOptionPane.showInputDialog("Enter title:");

                                if (name == null || title == null) return;

                                FileWriter writer = new FileWriter("JavaCode_GroupProject_02_WORKING_HerreraLuka/main_staff.csv", true);
                                 writer.write(name + "," + title + "\n");
                                writer.close();
                                JOptionPane.showMessageDialog(null, "Staff member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                            else if (choice == 1) {
                                String[] departments = {
                                "Player Personnel",
                                "Information Technology",
                                "Finance",
                                "Business Strategy & Analytics",
                                "Communications Broadcasting",
                                "Administration",
                                "Food Services"
                                };

                                String department = (String) JOptionPane.showInputDialog(
                                    null,
                                    "Select department:",
                                    "Department Selection",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    departments,
                                    departments[0]
                                );

                                String name = JOptionPane.showInputDialog("Enter name:");
                                String title = JOptionPane.showInputDialog("Enter title:");

                                 if (department == null || name == null || title == null) return;

                                FileWriter writer = new FileWriter("JavaCode_GroupProject_02_WORKING_HerreraLuka/secondary_staff.csv", true);
                                writer.write(department + "," + name + "," + title + "\n");
                                writer.close();
                               
                                JOptionPane.showMessageDialog(null, "Staff member added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        } 
            }
        });
        frame.add(ViewStaffButton);
        frame.add(addStaffButton);
        frame.setVisible(true);
    }
}
