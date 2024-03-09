/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import java.awt.*;

/**
 *
 * @author maianhtran
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    CardLayout cardLayout;

    public MainFrame() {
        initComponents();

        cardLayout = (CardLayout) (Cards.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Cards = new javax.swing.JPanel();
        Card2 = new javax.swing.JPanel();
        Card3 = new javax.swing.JPanel();
        Card4 = new javax.swing.JPanel();
        Card5 = new javax.swing.JPanel();
        Card1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 204, 204));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(773, 400));

        Cards.setLayout(new java.awt.CardLayout());

        Card2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout Card2Layout = new javax.swing.GroupLayout(Card2);
        Card2.setLayout(Card2Layout);
        Card2Layout.setHorizontalGroup(
            Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        Card2Layout.setVerticalGroup(
            Card2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );

        Cards.add(Card2, "Card2");

        Card3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout Card3Layout = new javax.swing.GroupLayout(Card3);
        Card3.setLayout(Card3Layout);
        Card3Layout.setHorizontalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        Card3Layout.setVerticalGroup(
            Card3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );

        Cards.add(Card3, "Card3");

        Card4.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout Card4Layout = new javax.swing.GroupLayout(Card4);
        Card4.setLayout(Card4Layout);
        Card4Layout.setHorizontalGroup(
            Card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        Card4Layout.setVerticalGroup(
            Card4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );

        Cards.add(Card4, "Card4");

        Card5.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout Card5Layout = new javax.swing.GroupLayout(Card5);
        Card5.setLayout(Card5Layout);
        Card5Layout.setHorizontalGroup(
            Card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        Card5Layout.setVerticalGroup(
            Card5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 831, Short.MAX_VALUE)
        );

        Cards.add(Card5, "Card5");

        Card1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout Card1Layout = new javax.swing.GroupLayout(Card1);
        Card1.setLayout(Card1Layout);
        Card1Layout.setHorizontalGroup(
            Card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        Card1Layout.setVerticalGroup(
            Card1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );

        Cards.add(Card1, "Card1");

        jSplitPane1.setRightComponent(Cards);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jButton2.setText("FOOD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jButton3.setText("CUSTOMER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jButton4.setText("ORDER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Kailasa", 1, 14)); // NOI18N
        jButton5.setText("REVENUE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cardLayout.show(Cards, "Card1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cardLayout.show(Cards, "Card2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardLayout.show(Cards, "Card3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cardLayout.show(Cards, "Card4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cardLayout.show(Cards, "Card5");
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Card1;
    private javax.swing.JPanel Card2;
    private javax.swing.JPanel Card3;
    private javax.swing.JPanel Card4;
    private javax.swing.JPanel Card5;
    private javax.swing.JPanel Cards;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
