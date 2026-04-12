package IndividualProject_HerreraLuka;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReviewProjectWindow {
    public ReviewProjectWindow() {
        JFrame frame = new JFrame("Review Project Data");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        String projectName = JOptionPane.showInputDialog(frame, "Enter Project Name:");
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("IndividualProject_HerreraLuka/project_data.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                if (data[0].equalsIgnoreCase(projectName)) {

                    found = true;
                    double length = Double.parseDouble(data[2]);
                    double width = Double.parseDouble(data[3]);
                    double thickness = Double.parseDouble(data[4]);
                    int workers = Integer.parseInt(data[5]);
                    double hours = Double.parseDouble(data[6]);
                    double laborCost = Double.parseDouble(data[7]);
                    double materialCost = Double.parseDouble(data[8]);
                    double discount = Double.parseDouble(data[9]);
                    double area = length * width;
                    double volume = area * thickness;
                    double totalCost = (Math.max(1, workers) * laborCost * Math.max(1, hours) + materialCost * volume) * (1 - Math.max(0, discount) / 100);

                    textArea.setText(
                            "PROJECT REVIEW\n\n" +
                            "Name: " + data[0] + "\n" +
                            "Location: " + data[1] + "\n" +
                            "Length: " + length + "\n" +
                            "Width: " + width + "\n" +
                            "Thickness: " + thickness + "\n" +
                            "Workers: " + workers + "\n" +
                            "Hours: " + hours + "\n\n" +
                            "AREA: " + area + "\n" +
                            "VOLUME: " + volume + "\n" +
                            "DISCOUNT: " + discount + "\n" +
                            "TOTAL COST: $" + totalCost
                    );
           break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame,
                    "Error reading project data: " + e.getMessage());
        }
            if (!found) {
                textArea.setText("Project not found.");
            }
            frame.setVisible(true);
        }
    }