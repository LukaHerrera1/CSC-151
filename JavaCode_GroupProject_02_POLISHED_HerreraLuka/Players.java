//ALL CODE WRITTEN BY DOMONIC YARNELL AND PLAYER INFO IN player.csv; CODE WAS FORMATED BY LUKA HERRERA TO FIT INTO ONE FILE.

package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import javax.swing.*;
import javax.swing.tree.*;
import java.io.*;
import java.util.*;

public class Players {
    public static class TeamMember {
        private String name, position, number;
        public TeamMember(String name, String position, String number) {
            this.name = name;
            this.position = position;
            this.number = number;
        }
        public String getName() { return name; }
        public String getPosition() { return position; }
        public String getNumber() { return number; }
    }
    private static List<TeamMember> loadPlayers(String fileName) {
        List<TeamMember> players = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] data = line.split(",");
                if (data[0].trim().equalsIgnoreCase("Player")) {
                    String name = data[1].trim();
                    String position = data.length > 2 ? data[2].trim() : "";
                    String number = data.length > 3 ? data[3].trim() : "";
                    players.add(new TeamMember(name, position, number));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Could not read player.csv file!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return players;
    }
    public Players() {
        JFrame frame = new JFrame("Players");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Players");
        Map<String, DefaultMutableTreeNode> positionMap = new HashMap<>();
        List<TeamMember> players = loadPlayers("JavaCode_GroupProject_02_POLISHED_HerreraLuka/player.csv"); // <-- CSV file
        for (TeamMember player : players) {
            String position = player.getPosition();
            DefaultMutableTreeNode positionNode = positionMap.get(position);
            if (positionNode == null) {
                positionNode = new DefaultMutableTreeNode(position);
                positionMap.put(position, positionNode);
                root.add(positionNode);
            }
            DefaultMutableTreeNode playerNode = new DefaultMutableTreeNode(player.getName() + " (#" + player.getNumber() + ")");
            positionNode.add(playerNode);
        }
        JTree tree = new JTree(root);
        tree.setRootVisible(true);
        tree.expandRow(0); // expand root by default
        JScrollPane scrollPane = new JScrollPane(tree);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Players());
    }
}