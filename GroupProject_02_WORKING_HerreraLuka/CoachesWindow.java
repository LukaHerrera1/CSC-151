//Coaches Window Class.

//All Code in ths file was written by Luka Herrera.

package GroupProject_02_WORKING_HerreraLuka;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;


public class CoachesWindow {

       // Coach dropdown options
    private String[] headCoaches = {
            "Head Coach",
            "Assistant Head Coach",
    };

    private String[] coordinators = {
            "Offensive Coordinator",
            "Defensive Coordinator",
            "Special Teams Coordinator"
    };

    private String[] positionCoaches = {
            "Quarterbacks Coach",
            "Wide Receivers Coach",
            "Tight Ends Coach",
            "Offensive Line Coach",
            "Run Game Coordinator/Senior Offensive Advisor",
            "Offensive Assistant/Quarterbacks",
            "Run Game Specialist/Assistant Offensive Line",
            "Offensive Assistant/Quality Control - OL",
            "Assistant Special Teams",
            "Offensive Assistant",
            "Offensive Passing Game Coordinator",
            "Inside Linbackers Coach",
            "Outside Linebackers Coach",
            "Defensive Line Coach",
            "Defensive Passing Game Coordinator/Defensive Backs Coach",
            "Safeties Coach",
            "Defensive Assistant/Defensive Backs",
            "Defensive Assistant/LineBackers",
            "Defensive Intern",
            "Director of Player Performance and Development",
            "Head Strength Coach",
            "Associate Head Strength Coach",
            "Strength and Conditioning Assistant 1",
            "Strength and Conditioning Assistant 2",
            "Strength and Conditioning Assistant 3",
    };

    // Coach details map
    private Map<String, String> coachDetails = new HashMap<>();

    // Constructor (called from main menu)
    public CoachesWindow() {
        loadCoachDetails();
        showCoachesMenu();
    }

    private void loadCoachDetails() {
        try { File file = new File("GroupProject_02_WORKING_HerreraLuka/coaches.csv");
                Scanner scanner = new Scanner(file);
                scanner.nextLine(); // Skip header
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                String[] parts = line.split(",");
                   String title = parts[1].trim();
                   String name = parts[2].trim();
                   String experience = parts[3].trim();
                   String role = parts[4].trim();

                   String details = "Name: " + name + "\nExperience: " + experience + "\nRole: " + role;
                         coachDetails.put(title, details);

                         System.out.println("Loaded: " + title);

                    }
                scanner.close();
                }
        catch (FileNotFoundException e) {
                e.printStackTrace();
        }
    }

private void writeCoachToFile(String category, String title, String name, String experience, String role) {
        try {
            FileWriter writer = new FileWriter("GroupProject_02_WORKING_HerreraLuka/coaches.csv");
            
            writer.write("\n" + category + "," + title + "," + name + "," + experience + "," + role);

            writer.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
}


    

    // Main menu
    private void showCoachesMenu() {

        String[] options = {
                "Head Coach",
                "Coordinators",
                "Position Coaches",
                "Add Coach",
                "Exit"
        };

        int choice = JOptionPane.showOptionDialog(
                null,
                "Select a coaching group:",
                "Coaches",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0]
        );

        switch (choice) {
            case 0 -> showHeadCoach();
            case 1 -> showCoordinators();
            case 2 -> showPositionCoaches();
            case 3 -> addCoach();
            default -> {
                // Exit
            }
        }
    }

    // Head Coach selection
    private void showHeadCoach() {

        String coach = (String) JOptionPane.showInputDialog(
                null,
                "Select the Head Coach:",
                "Head Coach",
                JOptionPane.QUESTION_MESSAGE,
                null,
                headCoaches,
                headCoaches[0]
        );

        showCoachDetails(coach);
    }

    // Coordinators selection
    private void showCoordinators() {

        String coach = (String) JOptionPane.showInputDialog(
                null,
                "Select a Coordinator:",
                "Coordinators",
                JOptionPane.QUESTION_MESSAGE,
                null,
                coordinators,
                coordinators[0]
        );

        showCoachDetails(coach);
    }

    // Position Coaches selection
    private void showPositionCoaches() {

        String coach = (String) JOptionPane.showInputDialog(
                null,
                "Select a Position Coach:",
                "Position Coaches",
                JOptionPane.QUESTION_MESSAGE,
                null,
                positionCoaches,
                positionCoaches[0]
        );

        showCoachDetails(coach);
    }

    private void addCoach() {
        String category = JOptionPane.showInputDialog("Enter Category: ");
        String title = JOptionPane.showInputDialog("Enter Title: ");
        String name = JOptionPane.showInputDialog("Enter Name: ");
        String experience = JOptionPane.showInputDialog("Enter Experience: ");
        String role = JOptionPane.showInputDialog("Enter Role: ");

        writeCoachToFile(category, title, name, experience, role);

        JOptionPane.showMessageDialog(null, "Coach added successfully!");
    }

    // Display coach info
    private void showCoachDetails(String coach) {

        if (coach != null) {
            String details = coachDetails.get(coach);

            JOptionPane.showMessageDialog(
                    null,
                    coach + "\n\n" + details,
                    "Coach Details",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        showCoachesMenu();
    }
}