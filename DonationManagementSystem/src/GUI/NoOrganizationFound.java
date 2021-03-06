/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Toolkit;

/**
 *
 * @author Danial
 */
public class NoOrganizationFound extends javax.swing.JFrame {

    /**
     * Creates new form NoOrganizationFound
     */
    public NoOrganizationFound() {
        setTitle("Donation Management System");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/donation.png")));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        yes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/404-error.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Do you want to create a new Organization?");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel3.setText("No Organization Found");

        no.setBackground(new java.awt.Color(15, 22, 38));
        no.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setText("No");
        no.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        no.setOpaque(true);
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noMouseExited(evt);
            }
        });

        yes.setBackground(new java.awt.Color(15, 22, 38));
        yes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        yes.setForeground(new java.awt.Color(255, 255, 255));
        yes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yes.setText("Yes");
        yes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        yes.setOpaque(true);
        yes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(366, 366, 366))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(14, 14, 14)))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155)
                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_noMouseClicked

    private void noMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseExited
        // TODO add your handling code here:
        no.setBackground(Dashboard.navyBlue);
        no.setForeground(Dashboard.primaryTextColor);
    }//GEN-LAST:event_noMouseExited

    private void noMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseEntered
        // TODO add your handling code here:
        no.setBackground(Dashboard.buttonHighlight);
        no.setForeground(Dashboard.coral);
    }//GEN-LAST:event_noMouseEntered

    private void yesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseClicked
        // TODO add your handling code here:
        CreateOrganization co = new CreateOrganization();
        co.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_yesMouseClicked

    private void yesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseExited
        // TODO add your handling code here:
        yes.setBackground(Dashboard.navyBlue);
        yes.setForeground(Dashboard.primaryTextColor);
    }//GEN-LAST:event_yesMouseExited

    private void yesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesMouseEntered
        // TODO add your handling code here:
        yes.setBackground(Dashboard.buttonHighlight);
        yes.setForeground(Dashboard.coral);
    }//GEN-LAST:event_yesMouseEntered

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
            java.util.logging.Logger.getLogger(NoOrganizationFound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoOrganizationFound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoOrganizationFound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoOrganizationFound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoOrganizationFound().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel no;
    private javax.swing.JLabel yes;
    // End of variables declaration//GEN-END:variables
}
