/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdeliverysystem;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import static superdeliverysystem.connectionClass.con;

/**
 *
 * @author aseer
 */
public class Admin_ViewAllServices_3 extends javax.swing.JFrame {

    /**
     * Creates new form Admin_ViewAllServices_3
     */
    public Admin_ViewAllServices_3() {
        initComponents();
        //jPanel1.setBackground(new Color(0, 0, 0, 43));
        fillTable();
    }

    private void fillTable() {

        String qry = "SELECT * FROM placeorder ";

        connectionClass.getConnection();
        ResultSet r = connectionClass.getResrultset(qry);

        jTable1.setModel(DbUtils.resultSetToTableModel(r));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("All Services");
        setMaximumSize(new java.awt.Dimension(850, 850));
        setMinimumSize(new java.awt.Dimension(850, 850));
        setPreferredSize(new java.awt.Dimension(850, 850));
        setSize(new java.awt.Dimension(850, 850));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton1.setText("Approve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(610, 750, 120, 30);

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(40, 749, 120, 30);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel1.setText("Approve of selected service: ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(340, 740, 260, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Description", "Pickup From", "Deliver To", "Service Type", "Cost", "isApproved?", "isCarriedOut?"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 420, 700, 190);

        jLabel9.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 102));
        jLabel9.setText("All Services");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(70, 300, 240, 33);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aziza\\Desktop\\Background\\logo3.png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(570, 110, 290, 180);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, -50, 850, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AdminHomePage_2 adminHomePage = new AdminHomePage_2();
        adminHomePage.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (jTable1.getSelectedRow() >= 0) {

                int row = jTable1.getSelectedRow();
                Object id = jTable1.getValueAt(row, 0);

                String sql = "update placeorder set isapproved = true where orderid= '" + id.toString() + "'";
                Statement deleteStatement = con.createStatement();
                deleteStatement.executeUpdate(sql);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        fillTable();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_ViewCarriedOutOrders_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_ViewCarriedOutOrders_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_ViewCarriedOutOrders_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_ViewCarriedOutOrders_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_ViewAllServices_3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
