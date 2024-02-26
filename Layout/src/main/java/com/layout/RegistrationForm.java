/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.layout;

/**
 *
 * @author maianhtran
 */
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

public class RegistrationForm extends JFrame {

    private JTextField nameField, mobileField, addressField;
    private JComboBox dobField;
    private JRadioButton genderField1, genderField2;
    private JButton submitButton, resetButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        nameField = new JTextField();
        mobileField = new JTextField();
        genderField1 = new JRadioButton("Male");
        genderField2 = new JRadioButton("Female");
        dobField = new JComboBox();
        addressField = new JTextField();
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        genderField1.setBounds(10, 10, 170, 30);
        genderField1.setBounds(10, 20, 170, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(genderField1);
        bg.add(genderField2);

        inputPanel.add(new JLabel("Name"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Mobile"));
        inputPanel.add(mobileField);
        inputPanel.add(new JLabel("Gender"));
        inputPanel.add(genderField1);
        inputPanel.add(genderField2);
        inputPanel.add(new JLabel("DOB"));
        inputPanel.add(dobField);
        inputPanel.add(new JLabel("Address"));
        inputPanel.add(addressField);

        mainPanel.add(inputPanel, BorderLayout.NORTH);
        mainPanel.add(submitButton, BorderLayout.SOUTH);
        mainPanel.add(resetButton, BorderLayout.SOUTH);

        add(mainPanel);

    }
}

