/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author maianhtran
 */
import Q3.CD;
import Q1.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.*;

/**
 *
 * @author maianhtran
 */
public class CDListForm extends JFrame {

    ArrayList<CD> CDs = new ArrayList<>();

    private JTextField idTextField, titleTextField, priceTextField, yearTextField;
    private JRadioButton vcdRadioButton, cdRadioButton;
    private JComboBox collectionCombobox;
    private JButton addButton, clearButton, showAllButton;
    private JLabel idLabel, titleLabel, collectionLabel, typeLabel, vcdLabel, cdLabel, priceLabel, yearLabel;
    private JList<String> cdList;
    private DefaultListModel<String> listModel;
    private ArrayList<CD> cds;

    public CDListForm() {
        setTitle("Quach Tinh_CD Store");
        setSize(455, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();
        JPanel mainPanel=new JPanel(new BorderLayout());

        String[] c = {"game", "movie", "music"};

        idTextField = new JTextField(30);
        titleTextField = new JTextField(30);
        priceTextField = new JTextField(30);
        yearTextField = new JTextField(30);
        vcdRadioButton = new JRadioButton();
        cdRadioButton = new JRadioButton();
        collectionCombobox = new JComboBox(c);
        addButton = new JButton("Add");
        clearButton = new JButton("Clear");
        showAllButton = new JButton("Show All");
        idLabel = new JLabel("CD ID");
        titleLabel = new JLabel("CD Title");
        collectionLabel = new JLabel("CD Collection");
        typeLabel = new JLabel("CD Type");
        vcdLabel = new JLabel("VCD");
        cdLabel = new JLabel("CD");
        priceLabel = new JLabel("CD Price");
        yearLabel = new JLabel("CD Year of Release");
        listModel = new DefaultListModel<>();
        cdList = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(cdList);

        ButtonGroup bg = new ButtonGroup();
        bg.add(vcdRadioButton);
        bg.add(cdRadioButton);

        inputPanel.add(idLabel);
        inputPanel.add(idTextField);
        inputPanel.add(titleLabel);
        inputPanel.add(titleTextField);
        inputPanel.add(collectionLabel);
        inputPanel.add(collectionCombobox);
        inputPanel.add(typeLabel);
        inputPanel.add(vcdRadioButton);
        inputPanel.add(vcdLabel);
        inputPanel.add(cdRadioButton);
        inputPanel.add(cdLabel);
        inputPanel.add(priceLabel);
        inputPanel.add(priceTextField);
        inputPanel.add(yearLabel);
        inputPanel.add(yearTextField);
        inputPanel.add(addButton);
        inputPanel.add(clearButton);
        inputPanel.add(showAllButton);

        idLabel.setFont(new Font("Arial", Font.BOLD, 15));
        titleLabel.setFont(new Font("Arial", Font.BOLD, 15));
        collectionLabel.setFont(new Font("Arial", Font.BOLD, 15));
        typeLabel.setFont(new Font("Arial", Font.BOLD, 15));
        vcdLabel.setFont(new Font("Arial", Font.BOLD, 15));
        cdLabel.setFont(new Font("Arial", Font.BOLD, 15));
        priceLabel.setFont(new Font("Arial", Font.BOLD, 15));
        yearLabel.setFont(new Font("Arial", Font.BOLD, 15));
        collectionCombobox.setFont(new Font("Arial", Font.BOLD, 15));
        addButton.setFont(new Font("Arial", Font.BOLD, 15));
        clearButton.setFont(new Font("Arial", Font.BOLD, 15));
        showAllButton.setFont(new Font("Arial", Font.BOLD, 15));
        
        mainPanel.add(listScrollPane, BorderLayout.CENTER);

        addButton.addActionListener(e -> addCDs());
        clearButton.addActionListener(e -> clearFields());
        showAllButton.addActionListener(e -> showAllCDs());

        add(inputPanel);

        CDs = new ArrayList<>();
        loadCDs();

    }

    public void showAllCDs() {
        
        /*for (int i = 0; i < CDs.size(); i++) {
            CDs.get(i).print();
        }*/
        int selectedIndex = cdList.getSelectedIndex();
        if (selectedIndex != -1) {
            CD cd1 = CDs.get(selectedIndex);
            JOptionPane.showMessageDialog(this,
                    "CD ID: " + cd1.getCDId()
                    + "\nCD Title: " + cd1.getTitle()
                    + "\nCD Collection: " + cd1.getCDcollection()
                    + "\nCD Type: " + cd1.getCDtype()
                    + "\nCD Price: " + cd1.getPrice()
                    + "\nCD Year of Release: " + cd1.getYearOfRelease()
            );

        } else {
            JOptionPane.showMessageDialog(this, "Please select a CD to display.");
        }

    }

    public void addCDs() {
        String id = idTextField.getText();
        String title = titleTextField.getText();
        String collection = "";
        String type = "";
        String priceStr = priceTextField.getText();
        String yearStr = yearTextField.getText();

        try {
            double price = Double.parseDouble(priceStr);
            int year = Integer.parseInt(yearStr);

            if (!id.isEmpty() && !title.isEmpty()) {
                if (vcdRadioButton.isSelected()) {
                    type = "VCD";
                } else if (cdRadioButton.isSelected()) {
                    type = "CD";
                }
                if (collectionCombobox.getSelectedIndex() != -1) {
                    collection = (String) collectionCombobox.getItemAt(collectionCombobox.getSelectedIndex());
                }
                CD cd2 = new CD(id, title, collection, type, price, year);
                CDs.add(cd2);
                JOptionPane.showMessageDialog(this, "Add successful.");
                saveCDs();
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "CD ID and CD Title can not be empty.");
                return;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "CD Price and CD Year of Release must be numbers.");

        }

    }

    private void clearFields() {
        idTextField.setText("");
        titleTextField.setText("");
        priceTextField.setText("");
        yearTextField.setText("");

        collectionCombobox.setSelectedIndex(0);

        ButtonGroup bg = new ButtonGroup();
        bg.add(vcdRadioButton);
        bg.add(cdRadioButton);
        bg.clearSelection();

    }

    /*String fileName = "CD.Dat";

    public void saveCDs() {
        try {
            FileOutputStream f = new FileOutputStream(fileName);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeObject(CDs);
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error save file" + e.getMessage());
        }
    }*/
    private void saveCDs() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CDs.dat"))) {
            oos.writeObject(CDs);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving CDs to file.");
        }
    }

    /*public void loadCDs() {
        try {
            FileInputStream f = new FileInputStream(fileName);
            ObjectInputStream inStream = new ObjectInputStream(f);
            CDs = (ArrayList<CD>) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error load file");
        }

    }*/
    private void loadCDs() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CDs.dat"))) {
            CDs = (ArrayList<CD>) ois.readObject();
            for (CD employee : CDs) {
                listModel.addElement(employee.getCDId());
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading CDs from file.");
        }
    }

}
