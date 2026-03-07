package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow {

    public MainWindow(List<TeamMember> players,
                      List<TeamMember> coaches,
                      List<TeamMember> staff) {

        JFrame frame = new JFrame("Football Team Manager");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 1));

        JButton playersBtn = new JButton("Players");
        JButton coachesBtn = new JButton("Coaches");
        JButton staffBtn   = new JButton("Staff");

        playersBtn.addActionListener(e -> new PlayersWindow(players));
        coachesBtn.addActionListener(e -> new CoachesWindow());
        staffBtn.addActionListener(e -> new StaffWindow(staff));

        frame.add(playersBtn);
        frame.add(coachesBtn);
        frame.add(staffBtn);

        frame.setVisible(true);
    }
    public static void main(String[] args) {

        // Load data from CSV files
        List<TeamMember> players =
                CSVLoader.loadTeam(
                "JavaCode_GroupProject_02_POLISHED_HerreraLuka/players.csv");

        List<TeamMember> coaches =
                CSVLoader.loadTeam(
                "JavaCode_GroupProject_02_POLISHED_HerreraLuka/coaches.csv");

        List<TeamMember> staff =
                CSVLoader.loadTeam(
                "JavaCode_GroupProject_02_POLISHED_HerreraLuka/staff.csv");

        // Launch GUI
        new MainWindow(players, coaches, staff);
    }
}
