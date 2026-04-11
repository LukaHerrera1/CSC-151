package IndividualProject_HerreraLuka;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StarterWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Concrete Pad Estimating Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JLabel welcomeLabel = new JLabel("Welcome to the Concrete Pad Estimating Application!", SwingConstants.CENTER);
        JButton startprojectButton = new JButton("Start Project");
        JButton editprojectButton = new JButton("Edit Project");
        JButton reviewprojectButton = new JButton("Review Project");
        JButton exitButton = new JButton("Exit");
        frame.add(welcomeLabel);
        frame.add(startprojectButton);
        frame.add(editprojectButton);
        frame.add(reviewprojectButton);
        frame.add(exitButton);
            startprojectButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        StartProjectWindow.main(null); 
    }
});
            editprojectButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        new EditProjectWindow();
    }
});

            reviewprojectButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        new ReviewProjectWindow();
    }
});
            exitButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});
    }
}