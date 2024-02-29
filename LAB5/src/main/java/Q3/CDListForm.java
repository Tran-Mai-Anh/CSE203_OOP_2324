/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author maianhtran
 */
import Q1.CD;
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

    public CDListForm() {
        setTitle("Quach Tinh_CD Store");
        setSize(455, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel inputPanel = new JPanel();

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

        addButton.addActionListener(e -> addCDs());
        clearButton.addActionListener(e -> clearFields());
        showAllButton.addActionListener(e -> displayAllCDs());

        add(inputPanel);
        
        CDs = new ArrayList<>();
        loadCDs();

    }

    public void displayAllCDs() {
        for (int i = 0; i < CDs.size(); i++) {
            CDs.get(i).print();
        }
    }

    public void addCDs() {
        String id=idTextField.getText();
        String title=titleTextField.getText();
        ActionListener[] collection=collectionCombobox.getActionListeners();
        ActionListener[] vcd=vcdRadioButton.getActionListeners();
        ActionListener[] cd=cdRadioButton.getActionListeners();
        double price = Double.parseDouble(priceTextField.getText());
        int year = Integer.parseInt(yearTextField.getText());
        
        if(id.isEmpty()||title.isEmpty()){
            
        }
        
       // CD cd1=new CD(id,title,collection,vcd,cd,price,year);
       // CDs.add(cd1);
        
        saveCDs();
        clearFields();
        
        /*System.out.print("Enter the number of CDs: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            CD cd = new CD();
            cd.input();
            CDs.add(cd);
        }*/
    }
    
    private void clearFields() {
        idTextField.setText("");
        titleTextField.setText("");
        priceTextField.setText("");
        yearTextField.setText("");
        
    }

    /*public void searchTitle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD title: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getTitle().equalsIgnoreCase(n)) {
                CDs.get(i).print();
                break;
            }
        }
    }

    public void searchCollection() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the collection: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDcollection().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void searchType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDtype().equalsIgnoreCase(n)) {
                CDs.get(i).print();
            }
        }
    }

    public void deleteId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                CDs.remove(i);
            }
        }
    }

    public void editInformation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CD Id: ");
        String n = sc.nextLine();
        for (int i = 0; i < CDs.size(); i++) {
            if (CDs.get(i).getCDId().equalsIgnoreCase(n)) {
                CDs.get(i).input();
                CDs.get(i).setCDId(n);
            }
        }
    }

    public void sort() {
        Comparator<CD> com = new Comparator<CD>() {
            public int compare(CD o1, CD o2) {
                return o1.getYearOfRelease() - o2.getYearOfRelease();
            }
        };
        CDs.sort(com);
        displayAllCDs();
    }*/
    
    String fileName = "CD.Dat";
    public void saveCDs() {
        try {
            FileOutputStream f = new FileOutputStream(fileName);
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeObject(CDs);
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error save file"+ e.getMessage());
        }
    }

    public void loadCDs() {
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

    }

}
