/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LAB6;

import java.awt.*;
import static java.awt.Event.DELETE;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maianhtran
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    StudentManager studentManager = new StudentManager();
    NewStudentDialog newStuDia = new NewStudentDialog();
    KeyEvent e;

    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
        newStuDia.loadStudents();
        studentManager = newStuDia.studentManager;
        fillInStudentTable();

        ListStudentTable.putClientProperty("JTable.autoStartsEdit", Boolean.FALSE);

        DeleteCustomer();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ListStudentTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        checkTotalStudentButton = new javax.swing.JButton();
        newStudentButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management");

        ListStudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Gender", "School Stage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ListStudentTable);

        checkTotalStudentButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        checkTotalStudentButton.setText("Check total Student");
        checkTotalStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTotalStudentButtonActionPerformed(evt);
            }
        });

        newStudentButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        newStudentButton.setText("New Student");
        newStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentButtonActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(checkTotalStudentButton)
                .addGap(39, 39, 39)
                .addComponent(newStudentButton)
                .addGap(38, 38, 38)
                .addComponent(refreshButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton)
                    .addComponent(newStudentButton)
                    .addComponent(checkTotalStudentButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentButtonActionPerformed
        newStuDia.setVisible(true);
    }//GEN-LAST:event_newStudentButtonActionPerformed

    private void checkTotalStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTotalStudentButtonActionPerformed
        // try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Students.Dat"))) {
        //     studentManager.listStudent = (ArrayList<Student>) ois.readObject();
        JOptionPane.showMessageDialog(this, "There are " + studentManager.getListStudent().size() + " students in the database.");
        //  } catch (IOException | ClassNotFoundException e) {
        //      JOptionPane.showMessageDialog(this, "Error loading students from file.");
        //   }

    }//GEN-LAST:event_checkTotalStudentButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        fillInStudentTable();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void fillInStudentTable() {
        //Delete all row
        DefaultTableModel model = (DefaultTableModel) ListStudentTable.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        //Add row

        for (Student s : studentManager.getListStudent()) {
            Object[] rows = new Object[]{s.getStudentID(), s.getFirstName(), s.getLastName(), s.getGender(), s.getSchoolStage()};
            model.addRow(rows);
        }

        pack();
    }

    private void DeleteCustomer() {
        DefaultTableModel model = (DefaultTableModel) ListStudentTable.getModel();

        ListStudentTable.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    int selectedRow = ListStudentTable.getSelectedRow();
                    if (selectedRow != -1) {
                        int choice = JOptionPane.showConfirmDialog(null, "Do you want to delete this student?",
                                "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            studentManager.getListStudent().remove(selectedRow);

                        }
                        newStuDia.saveStudents();
                        fillInStudentTable();
                    }
                }

            }
        });
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListStudentTable;
    private javax.swing.JButton checkTotalStudentButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newStudentButton;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}