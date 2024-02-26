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
public class Form extends JFrame {

    private JTextField nameField;
    private JButton calculateButton;
    private JLabel headerLabel;

    public Form() {

        setTitle("This is my First Frame");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();

        String options[] = {"Week day(-10%)", "Weekend(+30%)"};
        JComboBox cb = new JComboBox(options);

        nameField = new JTextField();
        calculateButton = new JButton("Calculate");
        headerLabel.setFont(new Font("Resort Price Calculator", Font.BOLD, 24));
        
        inputPanel.add(headerLabel);
        inputPanel.add(new JLabel("Base price for a room is $200"));
        inputPanel.add(new JLabel("Choose options that you want"));
        inputPanel.add(new JLabel("Guest Name:"));
        inputPanel.add(nameField);
        inputPanel.add(calculateButton);
        inputPanel.add(cb);

        // mainPanel.add(listScrollPane, BorderLayout.CENTER);
        //mainPanel.add(deleteButton, BorderLayout.SOUTH);
        //mainPanel.add(displayButton, BorderLayout.EAST);
    }

    public static void calculate() {

    }

}
