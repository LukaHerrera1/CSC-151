package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import javax.swing.*;
import javax.swing.tree.*;
import java.util.*;

public class PlayersWindow {

    public PlayersWindow(List<TeamMember> team) {

        JFrame frame = new JFrame("Players");
        frame.setSize(500, 500);
       
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Players");

        Map<String, DefaultMutableTreeNode> positionMap = new HashMap<>();

        for (TeamMember member : team) {

            if (member.getType().equals("Player")) {

                String position = member.getPosition();

                if (!positionMap.containsKey(position)) {
                    DefaultMutableTreeNode positionNode =
                            new DefaultMutableTreeNode(position);

                    positionMap.put(position, positionNode);
                    root.add(positionNode);
                }

                DefaultMutableTreeNode playerNode =
                        new DefaultMutableTreeNode(member.getName()
                                + " (#" + member.getNumber() + ")");

                positionMap.get(position).add(playerNode);
            }
        }

        JTree tree = new JTree(root);
        JScrollPane scrollPane = new JScrollPane(tree);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}