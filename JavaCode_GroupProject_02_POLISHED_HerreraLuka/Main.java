package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<TeamMember> players = CSVLoader.loadTeam("FootballTeamApp/player.csv");
        List<TeamMember> coaches = CSVLoader.loadTeam("FootballTeamApp/coaches.csv");
        List<TeamMember> staff   = CSVLoader.loadTeam("FootballTeamApp/staff.csv");

        new MainWindow(players, coaches, staff);
    }
}
