//Coaches Window Class.

//ALL CODE IN THIS FILE WAS WRITTEN BY LUKA HERRERA.

package GroupProject_02_WORKING_HerreraLuka;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class CoachesWindow {

    /* (Old hardcoded data - replaced with CSV file reading/writing)
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

    // Load coach info
    private void loadCoachDetails() {

        coachDetails.put(
                "Head Coach",
                "Name: Mike MacDonald\n Role: Calls the defensive plays and manages the whole team\n Experience: 11 total years and 2nd year head coach"
        );

        coachDetails.put(
                "Assistant Head Coach",
                "Name: Leslie Frazier\n Role: Helps the head coach and provides administrative support\n Experience: 26 years"
        );

        coachDetails.put(
                "Offensive Coordinator",
                "Name: Klint Kubiak\n Role: Calls the offensive plays\n Experience: 12 years"
        );

        coachDetails.put(
                "Defensive Coordinator",
                "Name: Aden Durde\n Role: Manages defense\n Experience: 9 years"
        );

        coachDetails.put(
                "Special Teams Coordinator",
                "Name: Jay Harbaugh\n Role: Manages special team units\n Experience: 5 years"
        );

        coachDetails.put(
                "Quarterbacks Coach",
                "Name: Andrew Janocko\n Role: Coaches and improves quarterbacks\n Experience: 13 years"
        );

        coachDetails.put(
                "Wide Receivers Coach",
                "Name: Frisman Jackson\n Role: Coaches wide receivers\n Experience: 7 years"
        );

        coachDetails.put(
                "Tight Ends Coach",
                "Name: Mack Brown\n Role: Coaches tight ends\n Experience: 7 years"
        );

        coachDetails.put(
                "Offensive Line Coach",
                "Name: John Benton\n Role: Coaches offensive tackles and guards\n Experience: 33 years"
        );
        coachDetails.put(
                "Run Game Coordinator/Senior Offensive Advisor",
                "Name: Rick Dennison\n Role: Oversees run game and related position groups such as running backs and offensive linemen\n Experience: 29 years"
        );

        coachDetails.put(
                "Offensive Assistant/Quarterbacks",
                "Name: Tyson Prince\n Role: Develops quarterbacks and helps offensive scheme\n Experience: 3 years"
        );

        coachDetails.put(
                "Run Game Specialist/Assistant Offensive Line",
                "Name: Justin Outten\n Role: Helps run game and offensive line coaches\n Experience: 11 years"
        );

        coachDetails.put(
                "Offensive Assistant/Quality Control - OL",
                "Name: Quinshon Odom\n Role: Helps offensive side, specifically with the quality of the offensive line\n Experience: 4 years"
        );

        coachDetails.put(
                "Assistant Special Teams",
                "Name: Devin Fitzimmons\n Role: Helps special teams coordinator\n Experience: 11 years"
        );

        coachDetails.put(
                "Offensive Assistant",
                "Name: Michael Bryne\n Role: Helps offensive coordinator\n Experience: 2 years"
        );

        coachDetails.put(
                "Offensive Passing Game Coordinator",
                "Name: Jame Peetz\n Role: Helps the offensive coordinator and schemes plays\n Experience: 11 years"
        );

        coachDetails.put(
                "Inside Linbackers Coach",
                "Name: Kirk Olivadotti\n Role: Coaches middle linebackers\n Experience: 23 years"
        );

        coachDetails.put(
                "Outside Linebackers Coach",
                "Name: Chris Partridge\n Role: Coaches left and right outside linebackers\n Experience: 2 years"
        );

        coachDetails.put(
                "Defensive Line Coach",
                "Name: Justin Hinds\n Role: Coaches defensive tackles and edge players\n Experience: 4 years"
        );

        coachDetails.put(
                "Defensive Passing Game Coordinator/Defensive Backs Coach",
                "Name: Karl Scott\n Role: Coaches outside and inside cornerbacks and oversees passing defense schemes\n Experience: 5 years"
        );

        coachDetails.put(
                "Safeties Coach",
                "Name: Jeff Howard\n Role: Coaches strong and free safeties\n Experience: 13 years" 
                                
        );

        coachDetails.put(
                "Defensive Assistant/Defensive Backs",
                "Name: Neiko Thorre\n Role: Coaches outside and inside cornerbacks and helps defensive scheme\n Experience: 3 years"
        );

        coachDetails.put(
                "Defensive Assistant/LineBackers",
                "Name: Josh Bynes\n Role: Helps defensive coordinator around linebackers\n Experience: 2 years"
        );

        coachDetails.put(
                "Defensive Intern",
                "Name: Rob Caprice\n Role: Helps defensive coaches\n Experience: 2 years"
        );

        coachDetails.put(
                "Director of Player Performance and Development",
                "Name: Ivan Lewis\n Role: Oversees the development of player personnel\n Experience: 7 years"
        );

        coachDetails.put(
                "Head Strength Coach",
                "Name: Danny Van Dijk\n Role: Leads the weightlifting and fitness of players\n Experience: 7 years"
        );

        coachDetails.put(
                "Associate Head Strength Coach",
                "Name: Mark Phillip\n Role: Oversees player weightlifting\n Experience: 7 years"
        );

        coachDetails.put(
                "Strength and Conditioning Assistant 1",
                "Name: Thomas Garcia\n Role: Helps the coaching staff around strength and conditioning of players\n Experience: 7 years"
        );

        coachDetails.put(
                "Strength and Conditioning Assistant 2",
                "Name: Tim Ojeda\n Role: Helps the coaching staff around strength and conditioning of players\n Experience: 1 year"
        );

        coachDetails.put(
                "Strength and Conditioning Assistant 3",
                "Name: Jamie Yanchar\n Role: Helps the coaching staff around strength and conditioning of players\n Experience: 16 years"
        );
    }
    */

    // Coach details map
    private Map<String, String[]> coachDetails = new HashMap<>();

    // Constructor (called from main menu)
    public CoachesWindow() {
        loadCoachDetails();
        showCoachesMenu();
    }

    private void loadCoachDetails() {

        coachDetails.clear();

        try { File file = new File("GroupProject_02_WORKING_HerreraLuka/coaches.csv");
                Scanner scanner = new Scanner(file);

                if (scanner.hasNextLine()) {
                   scanner.nextLine(); // Skip header
                }
                

                while (scanner.hasNextLine()) {
                
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue; // Skip empty lines
                }  

                String[] parts = line.split(",");

                if (parts.length < 5) {
                    continue; // Skip malformed lines
                }

                String category = parts[0].trim();
                String title = parts[1].trim();
                String name = parts[2].trim();
                String experience = parts[3].trim();
                String role = parts[4].trim();

                if (category.equalsIgnoreCase("null") || title.equalsIgnoreCase("null") || name.equalsIgnoreCase("null") || experience.equalsIgnoreCase("null") || role.equalsIgnoreCase("null")) {
                    continue; // Skip entries with "null" values
                }

                   String details = "Name: " + name + "\nExperience: " + experience + "\nRole: " + role;
                         coachDetails.put(title, new String[]{category, details});
                    }
                scanner.close();
                }
        catch (FileNotFoundException e) {
                e.printStackTrace();
        }
    }

private String[] getCoachesByCategory(String category) {
        return coachDetails.entrySet().stream()
                .filter(entry -> entry.getValue()[0].equalsIgnoreCase(category))
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }

private void writeCoachToFile(String category, String title, String name, String experience, String role) {
        try {
            FileWriter writer = new FileWriter("GroupProject_02_WORKING_HerreraLuka/coaches.csv", true);
            
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

        String[] options = getCoachesByCategory("Head Coach");
        
        if (options.length == 0) {
            JOptionPane.showMessageDialog(null, "No Head Coaches available.");
            showCoachesMenu();
            return;
        }

        String coach = (String) JOptionPane.showInputDialog(
                null,
                "Select a Head Coach:",
                "Head Coach",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
        showCoachDetails(coach);
    }

    // Coordinators selection
    private void showCoordinators() {

       String[] options = getCoachesByCategory("Coordinator");
        
        if (options.length == 0) {
            JOptionPane.showMessageDialog(null, "No Coordinators available.");
            showCoachesMenu();
            return;
        }

        String coach = (String) JOptionPane.showInputDialog(
                null,
                "Select a Coordinator:",
                "Coordinators",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        showCoachDetails(coach);
    }

    // Position Coaches selection
    private void showPositionCoaches() {

        String[] options = getCoachesByCategory("Position Coach");
        
        if (options.length == 0) {
            JOptionPane.showMessageDialog(null, "No Position Coaches available.");
            showCoachesMenu();
            return;
        }

        String coach = (String) JOptionPane.showInputDialog(
                null,
                "Select a Position Coach:",
                "Position Coaches",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        showCoachDetails(coach);
    }

    private void addCoach() {
        String[] categories = {"Head Coach", "Coordinator", "Position Coach"};
        String category = (String) JOptionPane.showInputDialog(
                null,
                "Select Category:",
                "Add Coach",
                JOptionPane.QUESTION_MESSAGE,
                null,
                categories,
                categories[0]
        );
      if (category == null) {
        showCoachesMenu();
        return;
    }

    String title = JOptionPane.showInputDialog("Enter Title:");
    if (title == null) {
        showCoachesMenu();
        return;
    }

    String name = JOptionPane.showInputDialog("Enter Name:");
    if (name == null) {
        showCoachesMenu();
        return;
    }

    String experience = JOptionPane.showInputDialog("Enter Experience:");
    if (experience == null) {
        showCoachesMenu();
        return;
    }

    String role = JOptionPane.showInputDialog("Enter Role:");
    if (role == null) {
        showCoachesMenu();
        return;
    }
        writeCoachToFile(category, title, name, experience, role);

        loadCoachDetails();

        JOptionPane.showMessageDialog(null, "Coach added successfully!");
    }

    // Display coach info
    private void showCoachDetails(String coach) {

        if (coach != null && coachDetails.containsKey(coach)) {
            String details = coachDetails.get(coach)[1];

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