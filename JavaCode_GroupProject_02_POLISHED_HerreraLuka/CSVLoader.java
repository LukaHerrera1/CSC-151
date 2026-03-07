package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import java.io.*;
import java.util.*;

public class CSVLoader {

    public static List<TeamMember> loadTeam(String fileName) {
        List<TeamMember> team = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            // skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                String[] data = line.split(",");

                // Expect: Type,Name,Position,Number,Role
                String type = data[0].trim();
                String name = data[1].trim();
                String position = data.length > 2 ? data[2].trim() : "";
                String number = data.length > 3 ? data[3].trim() : "";
                String role = data.length > 4 ? data[4].trim() : "";

                team.add(new TeamMember(type, name, position, number, role));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return team;
    }
}
