/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Model.*;
import Model.Admin;
import Model.Organization;
import Model.Project;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Danial
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static Organization org;
    public static Admin admin;
    
    public Login() throws SQLException, Exception {
        // Test values will be changed when database will be entered

//        org = new Organization(1, "FastCare", "Charity Org");
        
        // Get all organizations list from DB
        List<Organization> allOrgs = new ArrayList<>();
        PersistentDB db = new PersistentDB();
        db.connect();
        db.loadAllOrgsFromDB(allOrgs);
        if(allOrgs.size() > 0)
        {
            org = allOrgs.get(0);   //Use the first organization if only one
            //Load all components of selected Organization
            db.setOrg(org);
            db.loadFromDB();
            db.disconnect();
        }
//        org = null;
        if (org == null) {
            NoOrganizationFound o = new NoOrganizationFound();
            o.setVisible(true);
            this.dispose();
            return;
        }

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

        jComboBox1 = new javax.swing.JComboBox<>();
        userNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        Login = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(760, 600));
        getContentPane().setLayout(null);

        userNameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameField);
        userNameField.setBounds(334, 188, 202, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 191, 97, 23);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 248, 82, 23);

        passwordField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField);
        passwordField.setBounds(334, 245, 202, 30);

        Login.setBackground(new java.awt.Color(15, 22, 38));
        Login.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login.setText("Sign In");
        Login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        Login.setOpaque(true);
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMouseEntered(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(320, 310, 140, 50);

        message.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(message);
        message.setBounds(200, 150, 330, 14);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Background.setForeground(new java.awt.Color(255, 0, 0));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Background.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseEntered
        // TODO add your handling code here:
        Login.setBackground(Dashboard.buttonHighlight);
        Login.setForeground(Dashboard.coral);
    }//GEN-LAST:event_LoginMouseEntered

    private void LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseExited
        // TODO add your handling code here:
        Login.setBackground(Dashboard.navyBlue);
        Login.setForeground(Dashboard.primaryTextColor);
    }//GEN-LAST:event_LoginMouseExited

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        // TODO add your handling code here:
        String u_name = userNameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if (!u_name.isEmpty() && !password.isEmpty()) {
            Admin a = org.getAdmin(u_name, password);

            if (a != null) {
                System.out.println("Login Successfull");

                admin = a;

                Dashboard mainPage = new Dashboard();
                mainPage.setVisible(true);

                this.dispose();

            } else {
                message.setText("Your username or password is incorrect!");
            }
        } else {
            message.setText("Some fields are empty!");
        }

    }//GEN-LAST:event_LoginMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Login;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
