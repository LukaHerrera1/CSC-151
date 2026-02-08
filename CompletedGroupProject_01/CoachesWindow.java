package CompletedGroupProject_01;

//Coaches Window Class.

//All Code in ths file was written by Luka Herrera.

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

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

    // Main menu
    private void showCoachesMenu() {

        String[] options = {
                "Head Coach",
                "Coordinators",
                "Position Coaches",
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