package CompletedGroupProject_01;

//Code format was done by Donomic Yarnell, in Which Luka Herrera and Maria King added to the code for more players.

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
        DefaultMutableTreeNode Safeties = new DefaultMutableTreeNode("Safeties");
        DefaultMutableTreeNode Center = new DefaultMutableTreeNode("Center");
        DefaultMutableTreeNode FullBack = new DefaultMutableTreeNode("Full Back");
        DefaultMutableTreeNode NoseBack = new DefaultMutableTreeNode("Nose Back");
        DefaultMutableTreeNode Cornerbacks = new DefaultMutableTreeNode("Cornerbacks");
        DefaultMutableTreeNode Tackles = new DefaultMutableTreeNode("Tackles");

        // Players 1 - 13 (Done by Luka Herrera)
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

         // Players 14 - 23 (Done by Maria King)
        DefaultMutableTreeNode JoshJobe = new DefaultMutableTreeNode("Josh Jobe");
        DefaultMutableTreeNode ErnestJones = new DefaultMutableTreeNode("Ernest Jones IV");
        DefaultMutableTreeNode JoshJones = new DefaultMutableTreeNode("Josh Jones");
        DefaultMutableTreeNode NickKallerup = new DefaultMutableTreeNode("Nick Kallerup");
        DefaultMutableTreeNode TyriceKnight = new DefaultMutableTreeNode("Tyrice Knight");
        DefaultMutableTreeNode CooperKupp = new DefaultMutableTreeNode("Cooper Kupp");
        DefaultMutableTreeNode DeMarcusLawrence = new DefaultMutableTreeNode("DeMarcus Lawrence");
        DefaultMutableTreeNode DrewLock = new DefaultMutableTreeNode("Drew Lock");
        DefaultMutableTreeNode JulianLove = new DefaultMutableTreeNode("Julian Love");
        DefaultMutableTreeNode AbrahamLucas = new DefaultMutableTreeNode("Abraham Lucas");

        // Players 24 - 37 (Done by Donomic Yarnell)
        DefaultMutableTreeNode JalenMilroe = new DefaultMutableTreeNode("Jalen Milroe");
        DefaultMutableTreeNode BoyeMafe = new DefaultMutableTreeNode("Boye Mafe");
        DefaultMutableTreeNode UchennaNwosu = new DefaultMutableTreeNode("Uchenna Nwosu");
        DefaultMutableTreeNode PatrickOConnell = new DefaultMutableTreeNode("Patrick O'Connell");
        DefaultMutableTreeNode ConnorOToole = new DefaultMutableTreeNode("Connor O'Toole");
        DefaultMutableTreeNode RylieMills = new DefaultMutableTreeNode("Rylie Mills");
        DefaultMutableTreeNode MikeMorris = new DefaultMutableTreeNode("Mike Morris");
        DefaultMutableTreeNode ByronMurphyII = new DefaultMutableTreeNode("Byron Murphy II");
        DefaultMutableTreeNode JasonMyers = new DefaultMutableTreeNode("Jason Myers");
        DefaultMutableTreeNode TyOkada = new DefaultMutableTreeNode("Ty Okada");
        DefaultMutableTreeNode OluOluwatimi = new DefaultMutableTreeNode("Olu Oluwatimi");
        DefaultMutableTreeNode RobbieOuzts = new DefaultMutableTreeNode("Robbie Ouzts");
        DefaultMutableTreeNode BrandonPili = new DefaultMutableTreeNode("Brandon Pili");
        
        // Players 38 - 53 (Done by Maria King)
        DefaultMutableTreeNode BradyRussell = new DefaultMutableTreeNode("Brady Russell");
        DefaultMutableTreeNode EricSaubert = new DefaultMutableTreeNode("Eric Saubert");
        DefaultMutableTreeNode RashidShaheed = new DefaultMutableTreeNode("Rashid Shaheed");
        DefaultMutableTreeNode JaxonSmithNjigba = new DefaultMutableTreeNode("Jaxon Smith-Njigba");
        DefaultMutableTreeNode ChrisStoll = new DefaultMutableTreeNode("Chris Stoll");
        DefaultMutableTreeNode JalenSundell = new DefaultMutableTreeNode("Jalen Sundell");
        DefaultMutableTreeNode ChazzSurratt = new DefaultMutableTreeNode("Chazz Surratt");
        DefaultMutableTreeNode DrakeThomas = new DefaultMutableTreeNode("Drake Thomas");
        DefaultMutableTreeNode KennethWalkerIII = new DefaultMutableTreeNode("Kenneth Walker III");
        DefaultMutableTreeNode LeonardWilliams = new DefaultMutableTreeNode("Leonard Williams");
        DefaultMutableTreeNode DevonWitherspoon = new DefaultMutableTreeNode("Devon Witherspoon");
        DefaultMutableTreeNode RiqWoolen = new DefaultMutableTreeNode("Riq Woolen");
        DefaultMutableTreeNode DarekeYoung = new DefaultMutableTreeNode("Dareke Young");
        DefaultMutableTreeNode GreyZabel = new DefaultMutableTreeNode("Grey Zabel");

        // Build tree (group by position)

        Tightends.add(ElijahArroyo);
        Tightends.add(AjBarner);
        Widereceivers.add(JakeBobo);
        Guards.add(AnthonyBradford);
        Tackles.add(CharlesCross);
        Guards.add(ChristianHayes);
        Quarterbacks.add(SamDarnold);
        Punter.add(MichealDickerson);
        Safeties.add(CobyBryant);
        Safeties.add(NickEmmanwori);
        Linebackers.add(DerickHall);
        Linebackers.add(JaydenIvey);
        NoseBack.add(GeorgeHolani); 
        FullBack.add(BradyRussell);
        NoseBack.add(KennethWalkerIII);
        DefensiveTackle.add(LeonardWilliams);
        Cornerbacks.add(DevonWitherspoon);
        Guards.add(ChrisStoll);
        Center.add(JalenSundell);
        Guards.add(JoshJones);
        Quarterbacks.add(JalenMilroe);
        Linebackers.add(BoyeMafe);
        Linebackers.add(UchennaNwosu);
        Linebackers.add(PatrickOConnell);
        Linebackers.add(ConnorOToole);
        Tackles.add(AbrahamLucas);
        DefensiveEnd.add(RylieMills);
        DefensiveEnd.add(MikeMorris);
        DefensiveTackle.add(ByronMurphyII);
        Kicker.add(JasonMyers);
        Safeties.add(TyOkada);
        Center.add(OluOluwatimi);
        FullBack.add(RobbieOuzts);
        NoseBack.add(BrandonPili);
        Quarterbacks.add(DrewLock);
        Linebackers.add(ErnestJones);
        Linebackers.add(TyriceKnight);
        Linebackers.add(DeMarcusLawrence);
        Linebackers.add(ChazzSurratt);
        Linebackers.add(DrakeThomas);
        Cornerbacks.add(JoshJobe);
        Cornerbacks.add(DevonWitherspoon);
        Cornerbacks.add(RiqWoolen);
        Safeties.add(JulianLove);
        Widereceivers.add(CooperKupp);
        Widereceivers.add(RashidShaheed);
        Widereceivers.add(JaxonSmithNjigba);
        Widereceivers.add(DarekeYoung);
        Tightends.add(NickKallerup);
        Tightends.add(EricSaubert);
        Tackles.add(AbrahamLucas);
        Tackles.add(GreyZabel);

        root.add(Quarterbacks);
        root.add(Linebackers);
        root.add(Guards);
        root.add(DefensiveEnd);
        root.add(DefensiveTackle);
        root.add(Kicker);
        root.add(Safeties);
        root.add(Center);
        root.add(FullBack);
        root.add(NoseBack);
        root.add(Punter);
        root.add(Tightends);
        root.add(Widereceivers);   
        root.add(Cornerbacks);
        root.add(Tackles);
        root.add(Safeties);


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
            else if (selected.equals("Josh Jobe")) {
                new JoshJobe();
            }
            else if (selected.equals("Ernest Jones IV")) {
                new ErnestJones();
            }
            else if (selected.equals("Josh Jones")) {
                new JoshJones();
            }
            else if (selected.equals("Nick Kallerup")) {
                new NickKallerup();
            }
            else if (selected.equals("Tyrice Knight")) {
                new TyriceKnight();
            }
            else if (selected.equals("Cooper Kupp")) {
                new CooperKupp();
            }
            else if (selected.equals("DeMarcus Lawrence")) {
                new DeMarcusLawrence();
            }
            else if (selected.equals("Drew Lock")) {
                new DrewLock();
            }
            else if (selected.equals("Julian Love")) {
                new JulianLove();
            }
            else if (selected.equals("Abraham Lucas")) {
                new AbrahamLucas();
            }
            else if (selected.equals("Jalen Milroe")) {
                new JalenMilroe();
            }
            else if (selected.equals("Boye Mafe")) {
                new BoyeMafe();
            }
            else if (selected.equals("Uchenna Nwosu")) {
                new UchennaNwosu();
            }
            else if (selected.equals("Patrick O'Connell")) {
                new PatrickOConnell();
            }
             else if (selected.equals("Connor O'Toole")) {
                new ConnorOToole();
            }
            else if (selected.equals("Rylie Mills")) {
                new RylieMills();
            }
            else if (selected.equals("Mike Morris")) {
                new MikeMorris();
            }
            else if (selected.equals("Byron Murphy II")) {
                new ByronMurphyII();
            }
            else if (selected.equals("Jason Myers")) {
                new JasonMyers();
            }
            else if (selected.equals("Ty Okada")) {
                new TyOkada();
            }
            else if (selected.equals("Olu Oluwatimi")) {
                new OluOluwatimi();
            }
            else if (selected.equals("Robbie Ouzts")) {
                new RobbieOuzts();
            }
            else if (selected.equals("Brandon Pili")) {
                new BrandonPili();
            }
            else if (selected.equals("Brady Russell")) {
                new BradyRussell();
            }
            else if (selected.equals("Eric Saubert")) {
                new EricSaubert();
            }
            else if (selected.equals("Rashid Shaheed")) {
                new RashidShaheed();
            }
            else if (selected.equals("Jaxon Smith-Njigba")) {
                new JaxonSmithNjigba();
            }
            else if (selected.equals("Chris Stoll")) {
                new ChrisStoll();
            }
            else if (selected.equals("Jalen Sundell")) {
                new JalenSundell();
            }
            else if (selected.equals("Chazz Surratt")) {
                new ChazzSurratt();
            }
            else if (selected.equals("Drake Thomas")) {
                new DrakeThomas();
            }
            else if (selected.equals("Kenneth Walker III")) {
                new KennethWalkerIII();
            }
            else if (selected.equals("Leonard Williams")) {
                new LeonardWilliams();
            }
            else if (selected.equals("Devon Witherspoon")) {
                new DevonWitherspoon();
            }
             else if (selected.equals("Riq Woolen")) {
                new RiqWoolen();
            }
             else if (selected.equals("Dareke Young")) {
                new DarekeYoung();
            }
             else if (selected.equals("Grey Zabel")) {
                new GreyZabel();
            }
        });

        frame.add(new JScrollPane(tree));
        frame.setVisible(true);
    }
}