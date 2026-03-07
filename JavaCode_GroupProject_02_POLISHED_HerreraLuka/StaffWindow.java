package JavaCode_GroupProject_02_POLISHED_HerreraLuka;
import javax.swing.*;
import java.util.List;

public class StaffWindow {

    public StaffWindow(List<TeamMember> team) {

        JFrame frame = new JFrame("Staff");
        frame.setSize(400, 400);

        DefaultListModel<String> model = new DefaultListModel<>();

        for (TeamMember member : team) {
            if (member.getType().equals("Staff")) {
                model.addElement(member.toString());
            }
        }

        JList<String> list = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
