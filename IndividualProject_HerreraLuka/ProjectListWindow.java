package IndividualProject_HerreraLuka;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ProjectListWindow {
    public ProjectListWindow() {
        JFrame frame = new JFrame("Project Names");
        frame.setSize(300, 400);
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);
        try (BufferedReader reader = new BufferedReader(
            new FileReader("IndividualProject_HerreraLuka/project_data.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                textArea.append(data[0] + "\n"); // ONLY project name
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frame, "Error reading file.");
        }
        frame.setVisible(true);
    }
}
