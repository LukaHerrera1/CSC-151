//ALL CODE IN THIS FILE WAS WRITTEN BY LUKA HERRERA.

package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class CoachesWindow {
    private Map<String, String[]> coachDetails = new HashMap<>();
    public CoachesWindow() {
        loadCoachDetails();
        showCoachesMenu();
    }
    private void loadCoachDetails() {
        coachDetails.clear();
        try { File file = new File("JavaCode_GroupProject_02_POLISHED_HerreraLuka/coaches.csv");
                Scanner scanner = new Scanner(file);
                if (scanner.hasNextLine()) {
                   scanner.nextLine();
                }
                while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }  
                String[] parts = line.split(",");
                if (parts.length < 5) {
                    continue; 
                }
                String category = parts[0].trim();
                String title = parts[1].trim();
                String name = parts[2].trim();
                String experience = parts[3].trim();
                String role = parts[4].trim();

                if (category.equalsIgnoreCase("null") || title.equalsIgnoreCase("null") || name.equalsIgnoreCase("null") || experience.equalsIgnoreCase("null") || role.equalsIgnoreCase("null")) {
                    continue;
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
            FileWriter writer = new FileWriter("JavaCode_GroupProject_02_POLISHED_HerreraLuka/coaches.csv", true);
            writer.write("\n" + category + "," + title + "," + name + "," + experience + "," + role);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
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
            }
        }
    }
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