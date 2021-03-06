/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;

/**
 *
 * @author vanth
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
       
        initComponents();
     //   ImageIcon im = new ImageIcon("C:\\Users\\vanth\\Desktop\\icon java/menu.png");
     //   this.setIconImage(im.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACKGROUND = new javax.swing.JPanel();
        jButton_DANGXUAT = new javax.swing.JButton();
        jButton_TRASACH = new javax.swing.JButton();
        jButton_QLDG = new javax.swing.JButton();
        jButton_MUONSACH = new javax.swing.JButton();
        jButton_QLSACH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ THƯ VIỆN - MENU");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton_DANGXUAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/LOGOUTBUTTON.png"))); // NOI18N
        jButton_DANGXUAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DANGXUATActionPerformed(evt);
            }
        });

        jButton_TRASACH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/TRASACHBUTTON.png"))); // NOI18N
        jButton_TRASACH.setText("TRẢ SÁCH");
        jButton_TRASACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TRASACHActionPerformed(evt);
            }
        });

        jButton_QLDG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/DOCGIABUTTON.png"))); // NOI18N
        jButton_QLDG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QLDGActionPerformed(evt);
            }
        });

        jButton_MUONSACH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/MUONSACHBUTTON.png"))); // NOI18N
        jButton_MUONSACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MUONSACHActionPerformed(evt);
            }
        });

        jButton_QLSACH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltv/SACHBUTTON.png"))); // NOI18N
        jButton_QLSACH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QLSACHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BACKGROUNDLayout = new javax.swing.GroupLayout(BACKGROUND);
        BACKGROUND.setLayout(BACKGROUNDLayout);
        BACKGROUNDLayout.setHorizontalGroup(
            BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BACKGROUNDLayout.createSequentialGroup()
                .addGroup(BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BACKGROUNDLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_DANGXUAT, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BACKGROUNDLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_MUONSACH, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_QLSACH, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_TRASACH, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_QLDG, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        BACKGROUNDLayout.setVerticalGroup(
            BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BACKGROUNDLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_QLDG, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_QLSACH, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(BACKGROUNDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_TRASACH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MUONSACH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addComponent(jButton_DANGXUAT, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jButton_DANGXUAT.getAccessibleContext().setAccessibleParent(BACKGROUND);
        jButton_QLDG.getAccessibleContext().setAccessibleParent(BACKGROUND);
        jButton_MUONSACH.getAccessibleContext().setAccessibleParent(BACKGROUND);
        jButton_QLSACH.getAccessibleContext().setAccessibleParent(BACKGROUND);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BACKGROUND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BACKGROUND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BACKGROUND.getAccessibleContext().setAccessibleParent(BACKGROUND);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TRASACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TRASACHActionPerformed
        // TODO add your handling code here:
        int chuatra = 0;
        Connection connect = ketnoicsdl.layKetNoi();
        try
        {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery(" EXEC USP_DGDANGMUON");
            while (rs.next())
            {
                chuatra++;
            }
        }
        catch (SQLException e)
        {

        }
        System.out.println(chuatra);
        if (chuatra != 0)
        {
            setVisible(false);
            removeAll();
            new TRASACH().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Tất cả sách mượn đã được trả");
        }
//        setVisible(true);
    }//GEN-LAST:event_jButton_TRASACHActionPerformed

    private void jButton_MUONSACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MUONSACHActionPerformed
        // TODO add your handling code here:
        int sosach = 0;
        Connection connect = ketnoicsdl.layKetNoi();
        try
        {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("EXEC USP_SACHCOTHEMUON");
            while (rs.next())
            {
                sosach++;
            }
        }
        catch(SQLException e)
        {
            
        }
        System.out.println(sosach);
        if (sosach != 0)
        {
            setVisible(false);
            removeAll();
            new MUONSACH().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Không còn sách để cho mượn");
        }
    }//GEN-LAST:event_jButton_MUONSACHActionPerformed

    private void jButton_DANGXUATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DANGXUATActionPerformed
        // TODO add your handling code here:
        //int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn đăng xuất?");
      //  if (check == 0)
        {
            setVisible(false);
            removeAll();
            new login().setVisible(true);
        }
    }//GEN-LAST:event_jButton_DANGXUATActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int check = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn thoát?");
        if(check == 0) System.exit(0);
        else setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_formWindowClosing

    private void jButton_QLSACHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QLSACHActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        removeAll();
        new SACH().setVisible(true);
    }//GEN-LAST:event_jButton_QLSACHActionPerformed

    private void jButton_QLDGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QLDGActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        removeAll();
        new DOCGIA().setVisible(true);
    }//GEN-LAST:event_jButton_QLDGActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUND;
    private javax.swing.JButton jButton_DANGXUAT;
    private javax.swing.JButton jButton_MUONSACH;
    private javax.swing.JButton jButton_QLDG;
    private javax.swing.JButton jButton_QLSACH;
    private javax.swing.JButton jButton_TRASACH;
    // End of variables declaration//GEN-END:variables
}
