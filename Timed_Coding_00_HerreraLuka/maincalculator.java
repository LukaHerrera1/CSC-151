package Timed_Coding_00_HerreraLuka;
import java.awt.event.*;
import javax.swing.*;

public class maincalculator extends JFrame implements ActionListener { 
    JTextField num1Field;
    JTextField num2Field;
    JButton addButton;
    JLabel resultLabel;

    public maincalculator() {
    setTitle("Sum Calculator");
    setSize(300,300);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(20, 20, 80, 25);
        add(label1);

        num1Field = new JTextField();
        num1Field.setBounds(100, 20, 150, 25);
        add(num1Field);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(20, 60, 80, 25);
        add(label2);

        num2Field = new JTextField();
        num2Field.setBounds(100, 60, 150, 25);
        add(num2Field);

        addButton = new JButton("Add");
        addButton.setBounds(100, 100, 80, 30);
        addButton.addActionListener(this);
        add(addButton);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 140, 200, 25);
        add(resultLabel);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(num1Field.getText());
        int num2 = Integer.parseInt(num2Field.getText());
        int sum = num1 + num2;
        resultLabel.setText("Result: " + sum);
    }
    public static void main(String[] args) {
        new maincalculator();
    }
}