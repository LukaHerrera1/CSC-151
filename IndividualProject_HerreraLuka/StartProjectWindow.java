package IndividualProject_HerreraLuka;
import javax.swing.*;
import java.awt.*;

import java.io.FileWriter;
import java.io.IOException;

public class StartProjectWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Start New Project");
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(14, 2,10,10));

        JLabel welcomeLabel = new JLabel("|Enter Project Details|");
        welcomeLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel nameLabel = new JLabel("Project Name:");
        JTextField namefield = new JTextField();

        JLabel locationLabel = new JLabel("Project Location:");
        JTextField locationfield = new JTextField();

        JLabel dimensionsLabel = new JLabel("|Dimensions Information|");
        dimensionsLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel lengthLabel = new JLabel("Project Length:");
        JTextField lengthfield = new JTextField();

        JLabel widthLabel = new JLabel("Project Width:");
        JTextField widthfield = new JTextField();

        JLabel slabthicknessLabel = new JLabel("Project SlabThickness:");
        JTextField slabthicknessfield = new JTextField();

        JLabel workerinfoLabel = new JLabel("|Employee Information|");
        workerinfoLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel numberofemployeesLabel = new JLabel("Number of Employees:");
        JTextField numberofemployeesfield = new JTextField();

        JLabel estimatelaborhoursLabel = new JLabel("Estimated Labor Hours:");
        JTextField estimatelaborhoursfield = new JTextField();

        JLabel estimatelaborcostLabel = new JLabel("Estimated Labor Cost:");
        JTextField estimatelaborcostfield = new JTextField();

        JLabel materialinfoLabel = new JLabel("|Material Information|");
        materialinfoLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel materialcostLabel = new JLabel("Estimated Material Cost:");
        JTextField materialcostfield = new JTextField();

        formPanel.add(welcomeLabel);
        formPanel.add(new JLabel());
        formPanel.add(nameLabel);
        formPanel.add(namefield);
        formPanel.add(locationLabel);
        formPanel.add(locationfield);
        formPanel.add(dimensionsLabel);
        formPanel.add(new JLabel());
        formPanel.add(lengthLabel);
        formPanel.add(lengthfield);
        formPanel.add(widthLabel);
        formPanel.add(widthfield);
        formPanel.add(slabthicknessLabel);
        formPanel.add(slabthicknessfield);
        formPanel.add(workerinfoLabel);
        formPanel.add(new JLabel());
        formPanel.add(numberofemployeesLabel);
        formPanel.add(numberofemployeesfield);
        formPanel.add(estimatelaborhoursLabel);
        formPanel.add(estimatelaborhoursfield);
        formPanel.add(estimatelaborcostLabel);
        formPanel.add(estimatelaborcostfield);
        formPanel.add(materialinfoLabel);
        formPanel.add(new JLabel());
        formPanel.add(materialcostLabel);
        formPanel.add(materialcostfield);

        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton submitButton = new JButton("Submit");
        JButton reviewButton = new JButton("Review");
        JButton cancelButton = new JButton("Cancel");

        buttonPanel.add(submitButton, BorderLayout.EAST);
        buttonPanel.add(reviewButton, BorderLayout.CENTER);
        buttonPanel.add(cancelButton, BorderLayout.WEST);

        cancelButton.addActionListener(e -> {
            new StarterWindow();
            frame.dispose();
        });

        submitButton.addActionListener(e -> {
            String projectName = namefield.getText();
            String projectLocation = locationfield.getText();
            String length = lengthfield.getText();
            String width = widthfield.getText();
            String slabThickness = slabthicknessfield.getText();
            String numberOfEmployees = numberofemployeesfield.getText();
            String estimateLaborHours = estimatelaborhoursfield.getText();
            String estimateLaborCost = estimatelaborcostfield.getText();
            String materialCost = materialcostfield.getText();
            
            try (FileWriter writer = new FileWriter("IndividualProject_HerreraLuka/project_data.csv", true)) {
                writer.write(projectName + "," + projectLocation + "," + length + "," + width + "," + slabThickness + "," + numberOfEmployees + "," + estimateLaborHours + "," + estimateLaborCost + "," + materialCost + "\n");
                JOptionPane.showMessageDialog(frame, "Project data saved successfully!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error saving project data: " + ex.getMessage());
            }
            namefield.setText("");
            locationfield.setText("");
            lengthfield.setText("");
            widthfield.setText("");
            slabthicknessfield.setText("");
            numberofemployeesfield.setText("");
            estimatelaborhoursfield.setText("");
            estimatelaborcostfield.setText("");
            materialcostfield.setText("");
        });
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        reviewButton.addActionListener(e -> {
                new ReviewProjectWindow();
                frame.dispose();
            });
    }
}