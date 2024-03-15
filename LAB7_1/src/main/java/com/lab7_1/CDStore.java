package com.lab7_1;

import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author maianhtran
 */
public class CDStore extends javax.swing.JFrame implements Serializable {

    /**
     * Creates new form CDStore
     */
     ArrayList<CD> CDs = new ArrayList<>();
    CDManager cdManager = new CDManager();
    NewCD newCD = new NewCD(this, true);

    public CDStore() {
        initComponents();
        setLocationRelativeTo(null);

        loadCDs();
        fillInCDTable();
        manageTable.putClientProperty("JTable.autoStartsEdit", Boolean.FALSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newCDButton = new javax.swing.JButton();
        backupButton = new javax.swing.JButton();
        restoreButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        searchComboBox = new javax.swing.JComboBox<>();
        searchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CD Store");

        newCDButton.setText("New CD");
        newCDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCDButtonActionPerformed(evt);
            }
        });

        backupButton.setText("Backup");
        backupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupButtonActionPerformed(evt);
            }
        });

        restoreButton.setText("Restore");
        restoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        manageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Collection", "Type", "Price"
            }
        ));
        jScrollPane1.setViewportView(manageTable);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "Collection", "Type", "Price" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(newCDButton)
                        .addGap(46, 46, 46)
                        .addComponent(backupButton)
                        .addGap(53, 53, 53)
                        .addComponent(restoreButton)
                        .addGap(52, 52, 52)
                        .addComponent(refreshButton)
                        .addGap(68, 68, 68)
                        .addComponent(deleteButton)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(searchField)
                .addGap(18, 18, 18)
                .addComponent(searchButton)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newCDButton)
                    .addComponent(deleteButton)
                    .addComponent(refreshButton)
                    .addComponent(restoreButton)
                    .addComponent(backupButton))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newCDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCDButtonActionPerformed
        new NewCD(this, true).setVisible(true);
        //loadCDs();
        //fillInCDTable();
    }//GEN-LAST:event_newCDButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) manageTable.getModel();
        int deleteIndex = manageTable.getSelectedRow();
        if (deleteIndex != -1) {
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete this CD?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                cdManager.getListCD().remove(deleteIndex);
            }
            saveCDs();
            fillInCDTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        
        fillInCDTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void backupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int select = fileChooser.showSaveDialog(this);
        if (select == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            System.out.print("Save as file: " + file.getAbsolutePath());
        }

    }//GEN-LAST:event_backupButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String select = (String) this.searchComboBox.getItemAt(this.searchComboBox.getSelectedIndex());
        String search = searchField.getText();
        ArrayList<CD> sort = new ArrayList<>();
        switch (select) {
            case "Title":
                sort = searchByTitle(search);
                break;
            case "Collection":
                sort = searchByCollection(search);
                break;
            case "Type":
                sort = searchByType(search);
                break;
            case "Price":
                double price = Double.parseDouble(search);
                sort = searchByPrice(price);
                break;

        }
        fillInCDTable();

    }//GEN-LAST:event_searchButtonActionPerformed

    private void restoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restoreButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.print("Selected file: " + selectedFile.getAbsolutePath());
        }

    }//GEN-LAST:event_restoreButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private ArrayList<CD> searchByTitle(String search) {
        ArrayList<CD> sort = new ArrayList<>();
        for (CD cd : cdManager.getListCD()) {
            if (cd.getTitle().compareToIgnoreCase(search) == 0) {
                sort.add(cd);
            }
        }
        return sort;
    }

    private ArrayList<CD> searchByCollection(String search) {
        ArrayList<CD> sort = new ArrayList<>();
        for (CD cd : cdManager.getListCD()) {
            if (cd.getCollection().compareToIgnoreCase(search) == 0) {
                sort.add(cd);
            }
        }
        return sort;
    }

    private ArrayList<CD> searchByType(String search) {
        ArrayList<CD> sort = new ArrayList<>();
        for (CD cd : cdManager.getListCD()) {
            if (cd.getType().compareToIgnoreCase(search) == 0) {
                sort.add(cd);
            }
        }
        return sort;
    }

    private ArrayList<CD> searchByPrice(double search1) {
        ArrayList<CD> sort = new ArrayList<>();
        for (CD cd : cdManager.getListCD()) {
            if (cd.getPrice() == search1) {
                sort.add(cd);
            }
        }
        return sort;
    }

    /*private void saveCDs() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CDs.Dat"))) {
            oos.writeObject(cdManager.getListCD());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving CDs to file.");
        }
    }*/

    private void loadCDs() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CDs.Dat"))) {
            cdManager.setListCD((ArrayList<CD>) ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error loading CDs from file.");
        }
    }
    
    private void loadCDs(String fileName){
        CDs = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line="";
            while ((line = br.readLine()) != null) {
                String id = line;
                String title= br.readLine();
                String collection= br.readLine();
                String type = br.readLine();
                double price = Double.parseDouble(br.readLine());
                int year = Integer.parseInt(br.readLine());
                CD cd = new CD( id,  title,  collection,  type,  price,  year);
                CDs.add(cd);
            }
            CDManager.setListCD((ArrayList<CD>)

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    private void fillInCDTable() {
        //Delete all row
        DefaultTableModel model = (DefaultTableModel) manageTable.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        //Add row

        for (CD cd : cdManager.getListCD()) {
            Object[] rows = new Object[]{cd.getTitle(), cd.getCollection(), cd.getType(), cd.getPrice()};
            model.addRow(rows);
        }

        pack();
    }

    private void fillListCD(ArrayList<CD> sort) {
        DefaultTableModel model = (DefaultTableModel) manageTable.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        for (CD cd : cdManager.getListCD()) {
            Object[] rows = new Object[]{ cd.getTitle(), cd.getCollection(), cd.getType(), cd.getPrice()};
            model.addRow(rows);
        }
        pack();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backupButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageTable;
    private javax.swing.JButton newCDButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton restoreButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchComboBox;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}