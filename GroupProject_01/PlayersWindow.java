//All Code was written by Luka Herrera in this file.

package GroupProject_01;

import javax.swing.*;
import javax.swing.tree.*;

public class PlayersWindow {

    public PlayersWindow() {

        JFrame frame = new JFrame("Players");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Team");

        // Positions
        DefaultMutableTreeNode Quarterbacks = new DefaultMutableTreeNode("Quarterbacks");
        DefaultMutableTreeNode Tightends = new DefaultMutableTreeNode("Tightends");
        DefaultMutableTreeNode Widereceivers = new DefaultMutableTreeNode("Wide Receivers");
        DefaultMutableTreeNode Guards = new DefaultMutableTreeNode("Guards");
        DefaultMutableTreeNode Linebackers = new DefaultMutableTreeNode("Linebackers");
        DefaultMutableTreeNode DefensiveEnd = new DefaultMutableTreeNode("Defensive End");
        DefaultMutableTreeNode DefensiveTackle = new DefaultMutableTreeNode("Defensive Tackle");
        DefaultMutableTreeNode Kicker = new DefaultMutableTreeNode("Kicker");
        DefaultMutableTreeNode Punter = new DefaultMutableTreeNode("Punter");
        DefaultMutableTreeNode Safety = new DefaultMutableTreeNode("Safety");
        DefaultMutableTreeNode Center = new DefaultMutableTreeNode("Center");
        DefaultMutableTreeNode FullBack = new DefaultMutableTreeNode("Full Back");
        DefaultMutableTreeNode NoseBack = new DefaultMutableTreeNode("Nose Back");
        DefaultMutableTreeNode Tackles = new DefaultMutableTreeNode("Tackles");

        // Players 1=13 (Done By Luka Herrera)
        DefaultMutableTreeNode ElijahArroyo = new DefaultMutableTreeNode("Elijah Arroyo");
        DefaultMutableTreeNode AjBarner = new DefaultMutableTreeNode("Aj Barner");
        DefaultMutableTreeNode JakeBobo = new DefaultMutableTreeNode("Jake Bobo");
        DefaultMutableTreeNode AnthonyBradford = new DefaultMutableTreeNode("Anthony Bradford");
        DefaultMutableTreeNode CobyBryant = new DefaultMutableTreeNode("Coby Bryant");
        DefaultMutableTreeNode CharlesCross = new DefaultMutableTreeNode("Charles Cross");
        DefaultMutableTreeNode SamDarnold = new DefaultMutableTreeNode("Sam Darnold");
        DefaultMutableTreeNode MichealDickerson = new DefaultMutableTreeNode("Micheal Dickerson");
        DefaultMutableTreeNode NickEmmanwori = new DefaultMutableTreeNode("Nick Emmanwori");
        DefaultMutableTreeNode DerickHall = new DefaultMutableTreeNode("Derick Hall");
        DefaultMutableTreeNode ChristianHayes = new DefaultMutableTreeNode("Christian Hayes");
        DefaultMutableTreeNode GeorgeHolani = new DefaultMutableTreeNode("George Holani");
        DefaultMutableTreeNode JaydenIvey = new DefaultMutableTreeNode("Jayden Ivey");

        // Build tree
        Tightends.add(ElijahArroyo);
        Tightends.add(AjBarner);
        Widereceivers.add(JakeBobo);
        Guards.add(AnthonyBradford);
        Tackles.add(CharlesCross);
        Guards.add(ChristianHayes);
        Quarterbacks.add(SamDarnold);
        Punter.add(MichealDickerson);
        Safety.add(CobyBryant);
        Safety.add(NickEmmanwori);
        Linebackers.add(DerickHall);
        Linebackers.add(JaydenIvey);
        NoseBack.add(GeorgeHolani);        
    
        root.add(Quarterbacks);
        root.add(Linebackers);
        root.add(Guards);
        root.add(Tackles);
        root.add(DefensiveEnd);
        root.add(DefensiveTackle);
        root.add(Kicker);
        root.add(Safety);
        root.add(Center);
        root.add(FullBack);
        root.add(NoseBack);
        root.add(Punter);
        root.add(Tightends);
        root.add(Widereceivers);   

        JTree tree = new JTree(root);

        // Click listener
        tree.addTreeSelectionListener(e -> {
            DefaultMutableTreeNode selectedNode =
                (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

            if (selectedNode == null) return;

            String selected = selectedNode.toString();

            if (selected.equals("Elijah Arroyo")) {
                new ElijahArroyo();
            }
            else if (selected.equals("Aj Barner")) {
                new AjBarner();
            }
            else if (selected.equals("Jake Bobo")) {
                new JakeBobo();
            }
            else if (selected.equals("Anthony Bradford")) {
                new AnthonyBradford();
            }
            else if (selected.equals("Coby Bryant")) {
                new CobyBryant();
            }
            else if (selected.equals("Charles Cross")) {
                new CharlesCross();
            }
            else if (selected.equals("Sam Darnold")) {
                new SamDarnold();
            }
            else if (selected.equals("Micheal Dickerson")) {
                new MichealDickerson();
            }
            else if (selected.equals("Nick Emmanwori")) {
                new NickEmmanwori();
            }
            else if (selected.equals("Derick Hall")) {
                new DerickHall();
            }
            else if (selected.equals("Christian Hayes")) {
                new ChristianHayes();
            }
            else if (selected.equals("George Holani")) {
                new GeorgeHolani();
            }
            else if (selected.equals("Jayden Ivey")) {
                new JaydenIvey();
            }
    });

        frame.add(new JScrollPane(tree));
        frame.setVisible(true);
    }
}