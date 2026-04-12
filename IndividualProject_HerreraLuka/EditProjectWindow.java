
package IndividualProject_HerreraLuka;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class EditProjectWindow {
    JTextField namefield = new JTextField();
    JTextField locationfield = new JTextField();
    JTextField lengthfield = new JTextField();
    JTextField widthfield = new JTextField();
    JTextField slabfield = new JTextField();
    JTextField workersfield = new JTextField();
    JTextField hoursfield = new JTextField();
    JTextField laborcostfield = new JTextField();
    JTextField materialcostfield = new JTextField();
    JTextField discountfield = new JTextField();
    String originalProjectName;

    public EditProjectWindow() {
        JFrame frame = new JFrame("Edit Project");
        frame.setSize(500, 600);
        frame.setLayout(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(16, 2, 10, 10));

        JLabel welcomeLabel = new JLabel("|Edit Project Details|");
        welcomeLabel.setFont(new Font("Dialog", Font.BOLD, 14));
        JLabel importantLabel = new JLabel("*Make sure to load the project before editing*");
        importantLabel.setFont(new Font("Dialog", Font.ITALIC, 12));

        JLabel dimensionsLabel = new JLabel("|Dimensions Information|");
        dimensionsLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel workerinfoLabel = new JLabel("|Employee Information|");
        workerinfoLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel materialinfoLabel = new JLabel("|Material Information|");
        materialinfoLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel extrasLabel = new JLabel("|Extra's|");
        extrasLabel.setFont(new Font("Dialog", Font.BOLD, 14));

        JLabel discountLabel = new JLabel("Discount:");

        formPanel.add(welcomeLabel);
        formPanel.add(new JLabel());
        formPanel.add(importantLabel);
        formPanel.add(new JLabel());
        formPanel.add(new JLabel("Project Name:"));
        formPanel.add(namefield);
        formPanel.add(new JLabel("Location:"));
        formPanel.add(locationfield);
        formPanel.add(dimensionsLabel);
        formPanel.add(new JLabel());
        formPanel.add(new JLabel("Length (ft):"));
        formPanel.add(lengthfield);
        formPanel.add(new JLabel("Width (ft):"));
        formPanel.add(widthfield);
        formPanel.add(new JLabel("Slab Thickness (ft):"));
        formPanel.add(slabfield);
        formPanel.add(workerinfoLabel);
        formPanel.add(new JLabel());
        formPanel.add(new JLabel("Number of Employees:"));
        formPanel.add(workersfield);
        formPanel.add(new JLabel("Labor Hours:"));
        formPanel.add(hoursfield);
        formPanel.add(new JLabel("Labor Cost Per Hour:"));
        formPanel.add(laborcostfield);
        formPanel.add(materialinfoLabel);
        formPanel.add(new JLabel());
        formPanel.add(new JLabel("Material Cost Per ft³:"));
        formPanel.add(materialcostfield);
        formPanel.add(extrasLabel);
        formPanel.add(new JLabel());
        formPanel.add(discountLabel);
        formPanel.add(discountfield);

        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton loadButton = new JButton("Load Project");
        JButton saveButton = new JButton("Save Changes");
        JButton reviewButton = new JButton("Review Project");
        JButton cancelButton = new JButton("Cancel");

        buttonPanel.add(loadButton, BorderLayout.WEST);
        buttonPanel.add(saveButton, BorderLayout.EAST);
        buttonPanel.add(reviewButton, BorderLayout.CENTER);
        buttonPanel.add(cancelButton, BorderLayout.SOUTH);
         cancelButton.addActionListener(e -> {
            new StarterWindow();
            frame.dispose();
        });
         reviewButton.addActionListener(e -> {
            new ReviewProjectWindow();
            frame.dispose();
        });

        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
         loadButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("Enter Project Name:");
            loadProject(name);
        });
        saveButton.addActionListener(e -> {
        String newName = namefield.getText();
        boolean exists = false;
        try (BufferedReader reader = new BufferedReader(
            new FileReader("IndividualProject_HerreraLuka/project_data.csv"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data[0].equalsIgnoreCase(newName) &&
                !data[0].equalsIgnoreCase(originalProjectName)) {
                exists = true;
                break;
            }
        }
    } catch (Exception ex) {
    ex.printStackTrace();
    }
        if (exists) {
            JOptionPane.showMessageDialog(frame,
        "Another project already has this name!");
        return;
    }
    saveUpdatedProject();
    JOptionPane.showMessageDialog(frame, "Project updated!");
});
    }
        public void loadProject(String projectName) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("IndividualProject_HerreraLuka/project_data.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equalsIgnoreCase(projectName)) {

                    originalProjectName = projectName;
                    namefield.setText(data[0]);
                    locationfield.setText(data[1]);
                    lengthfield.setText(data[2]);
                    widthfield.setText(data[3]);
                    slabfield.setText(data[4]);
                    workersfield.setText(data[5]);
                    hoursfield.setText(data[6]);
                    laborcostfield.setText(data[7]);
                    materialcostfield.setText(data[8]);
                    discountfield.setText(data[9]);

                    writeTempFile(data);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void writeTempFile(String[] data) {
        try {
            FileWriter writer = new FileWriter("temp_project.txt");
            for (String item : data) {
                writer.write(item + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void saveUpdatedProject() {
        File inputFile = new File("IndividualProject_HerreraLuka/project_data.csv");
        File tempFile = new File("temp.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(tempFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equalsIgnoreCase(originalProjectName)) {

                    writer.write(
                            namefield.getText() + "," +
                            locationfield.getText() + "," +
                            lengthfield.getText() + "," +
                            widthfield.getText() + "," +
                            slabfield.getText() + "," +
                            workersfield.getText() + "," +
                            hoursfield.getText() + "," +
                            laborcostfield.getText() + "," +
                            materialcostfield.getText() + "," +
                            discountfield.getText() + "\n"
                    );
                } else {
                    writer.write(line + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }
}