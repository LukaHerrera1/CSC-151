package CompletedGroupProject_01;

// StaffMembers.java
// Created on February 6, 2026

// All code in this file was written by Maria King.

import javax.swing.*;
import javax.swing.tree.*;

public class StaffMembers {
    public StaffMembers() {
                                                JFrame frame = new JFrame("Staff Members");
                                                frame.setSize(400, 500);
                                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        // Root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Staff Members");

        // Main Staff as a folder with all main staff members as children
        DefaultMutableTreeNode mainStaffFolder = new DefaultMutableTreeNode("Main Staff");
        for (StaffMember member : mainStaff) {
            mainStaffFolder.add(new DefaultMutableTreeNode(member.name + " - " + member.title));
        }

        // Secondary Staff
        DefaultMutableTreeNode secondaryStaff = new DefaultMutableTreeNode("Secondary Staff");

                                                // Secondary Staff Departments as folders
                                                String[] secondaryDepartments = {
                                                    "Player Personnel",
                                                    "Information Technology",
                                                    "Finance",
                                                    "Business Strategy & Analytics",
                                                    "Communications Broadcasting",
                                                    "Administration",
                                                    "Food Services"
                                                };
                                                for (String dept : secondaryDepartments) {
                                                    DefaultMutableTreeNode folder = new DefaultMutableTreeNode(dept);
                                                    // Fill in with names and titles for each department
                                                    if (dept.equals("Player Personnel")) {
                                                        folder.add(new DefaultMutableTreeNode("Nolan Teasley - Assistant General Manager"));
                                                        folder.add(new DefaultMutableTreeNode("Trent Kirchner - Vice President of Player Personnel"));
                                                        folder.add(new DefaultMutableTreeNode("Matt Berry - Vice President/Player Acquisition"));
                                                        folder.add(new DefaultMutableTreeNode("Aaron Hineline - Director of College Scouting"));
                                                        folder.add(new DefaultMutableTreeNode("Willie Schneider - Director of Pro Personnel"));
                                                        folder.add(new DefaultMutableTreeNode("Jason Barnes - Assistant Director of College Scouting"));
                                                        folder.add(new DefaultMutableTreeNode("Steve Hutchinson - Football Consultant"));
                                                        folder.add(new DefaultMutableTreeNode("Todd Brunner - Area Scout (Northeast)"));
                                                        folder.add(new DefaultMutableTreeNode("Ryan Florence - Area Scout (Southwest)"));
                                                        folder.add(new DefaultMutableTreeNode("Josh Graff - Area Scout (West)"));
                                                        folder.add(new DefaultMutableTreeNode("Kirk Parrish - Sr. College Scouting Coordinator / Area Scout"));
                                                        folder.add(new DefaultMutableTreeNode("Armani Perez - Assistant Director of Pro Personnel"));
                                                        folder.add(new DefaultMutableTreeNode("Azzaam Kapadia - Pro Scout"));
                                                        folder.add(new DefaultMutableTreeNode("Jack Green - Area Scout"));
                                                        folder.add(new DefaultMutableTreeNode("Harrison McCarthy - Personnel Assistant"));
                                                        folder.add(new DefaultMutableTreeNode("Jack Dunaway - Scouting Assistant"));
                                                    } else if (dept.equals("Information Technology")) {
                                                        folder.add(new DefaultMutableTreeNode("Sterling Monroe - Director of Information Technology / Information Security Officer"));
                                                        folder.add(new DefaultMutableTreeNode("Jon Poiana - Stadium IT Support Specialist"));
                                                        folder.add(new DefaultMutableTreeNode("Nick Johnson - Stadium IT Manager"));
                                                        folder.add(new DefaultMutableTreeNode("Kendra Stracuzzi - Information Security Manager"));
                                                        folder.add(new DefaultMutableTreeNode("Harold Boggs - Systems Administrator"));
                                                        folder.add(new DefaultMutableTreeNode("Victor Blaiotta - Systems Administrator"));
                                                        folder.add(new DefaultMutableTreeNode("Jordan Griffith - IT Support Engineer"));
                                                        folder.add(new DefaultMutableTreeNode("Tyron Ebuenga - Information Security Analyst"));
                                                    } else if (dept.equals("Finance")) {
                                                        folder.add(new DefaultMutableTreeNode("Ping Chen - Sr. Accounting Manager of Financial Reporting"));
                                                        folder.add(new DefaultMutableTreeNode("Deepthi Krishnan - Sr. Accounting Manager of Financial Reporting"));
                                                        folder.add(new DefaultMutableTreeNode("Faruk Punjani - Sr. Accounting Manager of Revenue and Analytics"));
                                                        folder.add(new DefaultMutableTreeNode("Michael Sattler - Accounting Manager, FP&A and Financial Systems"));
                                                        folder.add(new DefaultMutableTreeNode("Michelle Wright"));
                                                        folder.add(new DefaultMutableTreeNode("Ben Draeger"));
                                                        folder.add(new DefaultMutableTreeNode("Tina Godfrey - Executive Assistant"));
                                                        folder.add(new DefaultMutableTreeNode("Heather Stamp - Accounts Payable Supervisor"));
                                                        folder.add(new DefaultMutableTreeNode("John Martin - Staff Accountant"));
                                                    } else if (dept.equals("Business Strategy & Analytics")) {
                                                        folder.add(new DefaultMutableTreeNode("Peter Bach - Director of Revenue Analytics"));
                                                        folder.add(new DefaultMutableTreeNode("Victor Nguyen - Director of Data Analytics & Engineering"));
                                                        folder.add(new DefaultMutableTreeNode("Sora Moon - Senior Manager, Marketing Analytics"));
                                                        folder.add(new DefaultMutableTreeNode("Kimber-Lynn Anderson - Marketing Operations Manager"));
                                                        folder.add(new DefaultMutableTreeNode("Alex Buford - CRM Analytics Engineer"));
                                                        folder.add(new DefaultMutableTreeNode("Aliya Schenck - Analytics Engineer"));
                                                        folder.add(new DefaultMutableTreeNode("Jacob Parker - Marketing Data Analyst"));
                                                        folder.add(new DefaultMutableTreeNode("Marcus Wong - Partnership Strategy Analyst"));
                                                        folder.add(new DefaultMutableTreeNode("Madeline Willett - Analytics Engineer"));
                                                    } else if (dept.equals("Communications Broadcasting")) {
                                                        folder.add(new DefaultMutableTreeNode("Jeff Garza - Director of Communications"));
                                                        folder.add(new DefaultMutableTreeNode("Kaitlin Goodall - Director of Business Communications"));
                                                        folder.add(new DefaultMutableTreeNode("Brian O'Connell - Director of Broadcasting"));
                                                        folder.add(new DefaultMutableTreeNode("Julie Barber - Director of Media Service Operations"));
                                                        folder.add(new DefaultMutableTreeNode("Nasser Kyobe - Executive Producer"));
                                                        folder.add(new DefaultMutableTreeNode("Rich Gonzales - Communications Manager"));
                                                        folder.add(new DefaultMutableTreeNode("Christopher Whitehead - Communications Assistant"));
                                                        folder.add(new DefaultMutableTreeNode("Edwin Hooper - Multi-Media Coordinator"));
                                                        folder.add(new DefaultMutableTreeNode("Tricia Trageser - Administrative Assistant"));
                                                    } else if (dept.equals("Administration")) {
                                                        folder.add(new DefaultMutableTreeNode("Eric Heuston - Director of Human Resources"));
                                                        folder.add(new DefaultMutableTreeNode("Claire Penhale - Human Resources Senior Manager"));
                                                        folder.add(new DefaultMutableTreeNode("Marie Hayman - Human Resources Manager"));
                                                        folder.add(new DefaultMutableTreeNode("Gillian Nguyen - Human Resources Administration Assistant"));
                                                        folder.add(new DefaultMutableTreeNode("Chelsy West - Executive Assistant to the President"));
                                                        folder.add(new DefaultMutableTreeNode("Brooklynn Garcia - Administrative Assistant"));
                                                        folder.add(new DefaultMutableTreeNode("Drew Johnston - Managing Director Government Affairs & Compliance"));
                                                        folder.add(new DefaultMutableTreeNode("Alice Men - Counsel"));
                                    // ...existing code...
                                                        folder.add(new DefaultMutableTreeNode("Sara Cooley - Ticket Sales & Service Representative"));
                                                        folder.add(new DefaultMutableTreeNode("Blake Fry - Ticket Sales & Service Representative"));
                                                        folder.add(new DefaultMutableTreeNode("Lacey Robertson - Ticket Sales & Service Representative"));
                                                        folder.add(new DefaultMutableTreeNode("Ruby Fera - Ticket Sales and Service Representative"));
                                                        folder.add(new DefaultMutableTreeNode("Joey Dionisio - Ticket Sales and Service Representative"));
                                                        folder.add(new DefaultMutableTreeNode("Quinton Miller - Ticket Services Coordinator"));
                                                    } else if (dept.equals("Ticket Sales & Service")) {
                                                        // Already included in Box Office above, so just add a dummy node
                                                        folder.add(new DefaultMutableTreeNode(""));
                                                    } else if (dept.equals("Food Services")) {
                                                        folder.add(new DefaultMutableTreeNode("Bryan Acosta - Executive Chef"));
                                                        folder.add(new DefaultMutableTreeNode("Jim Zeng - Sous Chef"));
                                                        folder.add(new DefaultMutableTreeNode("Juan Silva - Sous Chef"));
                                                        folder.add(new DefaultMutableTreeNode("Pedro Flores - Cook"));
                                                        folder.add(new DefaultMutableTreeNode("Kevin Martinez-Jara - Cook"));
                                                        folder.add(new DefaultMutableTreeNode("Marice McGirt - Cook"));
                                                        folder.add(new DefaultMutableTreeNode("Alondra Perez Bautista - Cook"));
                                                        folder.add(new DefaultMutableTreeNode("Diego Sanchez Rodriguez - Cook"));
                                                    } else {
                                                        // Add a dummy child node to make it appear as a folder
                                                        folder.add(new DefaultMutableTreeNode(""));
                                                    }
                                                    secondaryStaff.add(folder);
                                                }


                            // Add main staff folder and secondary staff to root
                            root.add(mainStaffFolder);
                            root.add(secondaryStaff);

                                                JTree tree = new JTree(root);
                                                JScrollPane scrollPane = new JScrollPane(tree);
                                                frame.add(scrollPane);
                                                frame.setVisible(true);
                                            }

                                            // Main staff members for the Seahawks organization
                                            public static class StaffMember {
                                                public String name;
                                                public String title;

                                                public StaffMember(String name, String title) {
                                                    this.name = name;
                                                    this.title = title;
                                                }
                                            }

                                            public static StaffMember[] mainStaff = {
                                                new StaffMember("Jody Allen", "Chair"),
                                                new StaffMember("Bert Kolde", "Vice Chair"),
                                                new StaffMember("Chuck Arnold", "President, Seahawks and First & Goal Inc."),
                                                new StaffMember("John Schneider", "President of Football Operations/General Manager"),
                                                new StaffMember("Jeff Dunn", "Chief Strategy Officer"),
                                                new StaffMember("Ed Goines", "Chief Legal Officer"),
                                                new StaffMember("Cindy Kelley", "Chief Human Resources Officer"),
                                                new StaffMember("Dave Pearson", "Chief Communications Officer"),
                                                new StaffMember("Karen Spencer", "Chief Financial Officer"),
                                                new StaffMember("Amy Sprangers", "Chief Revenue Officer"),
                                                new StaffMember("David Young", "Chief Operating Officer"),
                                                new StaffMember("Nolan Teasley", "Assistant General Manager"),
                                                new StaffMember("Mario Bailey", "Vice President of Community Engagement & Legends"),
                                                new StaffMember("Matt Berry", "Vice President of Player Acquisition"),
                                                new StaffMember("Sarita Carter", "Vice President of Human Resources"),
                                                new StaffMember("Eric Engberg", "Vice President of Suites & Premium"),
                                                new StaffMember("Tyson Flandreau", "Vice President of Brand and Marketing"),
                                                new StaffMember("Mike Flood", "Vice President of Outreach & External Affairs"),
                                                new StaffMember("Peter Fonfara", "Vice President of Finance"),
                                                new StaffMember("Zach Hensley", "Vice President of Operations and General Manager of Lumen Field"),
                                                new StaffMember("Paimon Jaberi", "Vice President of Business Strategy & Analytics"),
                                                new StaffMember("Marissa John", "Vice President & General Counsel"),
                                                new StaffMember("Maurice Kelly", "Vice President of Player Affairs"),
                                                new StaffMember("Trent Kirchner", "Vice President of Player Personnel"),
                                                new StaffMember("Joey Laine", "Vice President of Football Administration"),
                                                new StaffMember("Chris Lawrence", "Vice President, Tickets & Premium"),
                                                new StaffMember("Kenton Olson", "Vice President of Digital & Emerging Media"),
                                                new StaffMember("Sam Ramsden", "Vice President of Health & Player Performance"),
                                                new StaffMember("William Saguilla", "Vice President of Football Finance"),
                                                new StaffMember("Chip Suttles", "Vice President of Technology"),
                                                new StaffMember("Karen Wilkins-Mickey", "Vice President of Diversity, Equity & Inclusion"),
                                                new StaffMember("Lisa Young", "Vice President of Corporate Partnerships")
                                            };
                                            public static void main(String[] args) {
                                                SwingUtilities.invokeLater(() -> new StaffMembers());
                                            }
                                        }
// ...existing code...
