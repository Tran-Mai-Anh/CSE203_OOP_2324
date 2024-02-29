/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author maianhtran
 */
public class ResortForm extends JFrame {

    private JTextField name;
    private JButton calculateButton;
    private JLabel label1, label2, label3, outputLabel, nameField;
    private JComboBox<String> weeks;
    private JCheckBox meal1, meal2, meal3;

    public ResortForm() {

        setTitle("This is my First Frame");
        setSize(455, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();

        String s[] = {"Week day(-10%)", "Weekend(+30%)"};

        label1 = new JLabel("Resort Price Calculator");
        label2 = new JLabel("Base price for a room is $200");
        label3 = new JLabel("Choose options that you want  ");
        nameField = new JLabel("Guest Name:");
        name = new JTextField(25);
        meal1 = new JCheckBox("Breakfast $20");
        meal2 = new JCheckBox("Goft $50");
        meal3 = new JCheckBox("Pool $15");
        weeks = new JComboBox(s);
        calculateButton = new JButton("Calculate");
        outputLabel = new JLabel();

        label1.setFont(new Font("Arial", Font.BOLD, 40));
        label2.setFont(new Font("Arial", Font.BOLD, 25));
        label3.setFont(new Font("Arial", Font.BOLD, 25));
        nameField.setFont(new Font("Arial", Font.BOLD, 15));
        meal1.setFont(new Font("Arial", Font.BOLD, 15));
        meal2.setFont(new Font("Arial", Font.BOLD, 15));
        meal3.setFont(new Font("Arial", Font.BOLD, 15));
        weeks.setFont(new Font("Arial", Font.BOLD, 15));
        calculateButton.setFont(new Font("Arial", Font.BOLD, 15));

        ButtonGroup bg = new ButtonGroup();
        bg.add(meal1);
        bg.add(meal2);
        bg.add(meal3);

        inputPanel.add(label1);
        inputPanel.add(label2);
        inputPanel.add(label3);
        inputPanel.add(nameField);
        inputPanel.add(name);
        inputPanel.add(meal1);
        inputPanel.add(meal2);
        inputPanel.add(meal3);
        inputPanel.add(weeks);
        inputPanel.add(calculateButton);
        inputPanel.add(outputLabel);

        calculateButton.addActionListener(e -> calculateButton());

        add(inputPanel);

    }

    private void calculateButton() {
        String name1 = name.getText().trim();
        if (name1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Guest name can not be empty");
            return;
        }

        double basePrice = 200.0;
        if (meal1.isSelected()) {
            basePrice += 20;
        } else if (meal2.isSelected()) {
            basePrice += 50;
        } else if (meal3.isSelected()) {
            basePrice += 15;
        }

        double multiWeek = 1.0;
        if (weeks.getSelectedItem().equals("Weekend(+30%)")) {
            multiWeek = 1.3;
        } else if (weeks.getSelectedItem().equals("Weekend(-10%)")) {
            multiWeek = 0.9;
        }

        double totalPay = basePrice * multiWeek;

        outputLabel.setText("Hello " + name1 + " Your payment is: $" + String.format("%.1f", totalPay));
        outputLabel.setFont(new Font("Arial", Font.BOLD, 20));

    }

}
