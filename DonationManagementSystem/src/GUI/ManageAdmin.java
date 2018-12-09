/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.PersistentDB;
import java.awt.Color;
import java.util.*;
import Model.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Danial
 */
public class ManageAdmin extends javax.swing.JFrame {

    public ManageAdmin() {
        setTitle("Donation Management System");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/donation.png")));
        initComponents();
        nameLabel.setText(Login.admin.getName());
        
        //add window closing listener
        this.addWindowListener(new WindowCloser());
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
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        manageDonors = new javax.swing.JLabel();
        manageOrganization = new javax.swing.JLabel();
        manageProjects = new javax.swing.JLabel();
        manageDonations = new javax.swing.JLabel();
        manageOrganizationBar = new javax.swing.JLabel();
        ManageProjectBar = new javax.swing.JLabel();
        ManageDonationBar = new javax.swing.JLabel();
        ManageDonorsBar = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        HomeBar = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminGrid = new javax.swing.JTable();
        addAdmin = new javax.swing.JLabel();
        deleteAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(799, 717));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(15, 22, 38));

        jPanel7.setBackground(new java.awt.Color(255, 83, 61));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N

        nameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nameLabel.setText("Danial Mirza");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 2, 8)); // NOI18N
        jLabel9.setText("Admin");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(nameLabel)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        manageDonors.setBackground(new java.awt.Color(15, 22, 38));
        manageDonors.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        manageDonors.setForeground(new java.awt.Color(200, 200, 200));
        manageDonors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageDonors.setText(" Manage Donors");
        manageDonors.setOpaque(true);
        manageDonors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageDonorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageDonorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageDonorsMouseExited(evt);
            }
        });

        manageOrganization.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        manageOrganization.setForeground(new java.awt.Color(200, 200, 200));
        manageOrganization.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageOrganization.setText("  Manage  Organization");
        manageOrganization.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageOrganizationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageOrganizationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageOrganizationMouseExited(evt);
            }
        });

        manageProjects.setBackground(new java.awt.Color(15, 22, 38));
        manageProjects.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        manageProjects.setForeground(new java.awt.Color(200, 200, 200));
        manageProjects.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageProjects.setText("  Manage  Projects");
        manageProjects.setOpaque(true);
        manageProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageProjectsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageProjectsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageProjectsMouseExited(evt);
            }
        });

        manageDonations.setBackground(new java.awt.Color(255, 83, 61));
        manageDonations.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        manageDonations.setForeground(new java.awt.Color(200, 200, 200));
        manageDonations.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        manageDonations.setText("  Manage  Donations");
        manageDonations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageDonationsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manageDonationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manageDonationsMouseExited(evt);
            }
        });

        manageOrganizationBar.setBackground(new java.awt.Color(255, 83, 62));

        ManageProjectBar.setBackground(new java.awt.Color(255, 83, 62));

        ManageDonationBar.setBackground(new java.awt.Color(255, 83, 62));

        ManageDonorsBar.setBackground(new java.awt.Color(255, 83, 62));

        Home.setBackground(new java.awt.Color(15, 22, 38));
        Home.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Home.setForeground(new java.awt.Color(200, 200, 200));
        Home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Home.setText("  Home");
        Home.setOpaque(true);
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });

        HomeBar.setBackground(new java.awt.Color(255, 83, 62));

        Logout.setBackground(new java.awt.Color(255, 83, 61));
        Logout.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout.setOpaque(true);
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageOrganizationBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageDonationBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageDonorsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageProjectBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageDonors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageDonations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HomeBar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageOrganizationBar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageProjects, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageProjectBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageDonations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageDonationBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageDonorsBar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow (1).png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        message.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AdminGrid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        AdminGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        AdminGrid.setSelectionBackground(new java.awt.Color(255, 83, 61));
        AdminGrid.setSelectionForeground(new java.awt.Color(15, 22, 38));
        AdminGrid.setShowVerticalLines(false);
        List<Admin> record = Login.org.getAllAdmins();
        String [][] data = new String [record.size()][2];

        int i = 0;
        for(Admin p: record )
        {
            data[i][0] = String.valueOf(p.getId());
            data[i][1] = p.getName();
            i++;
        }

        AdminGrid.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "ADMIN ID", "ADMIN NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AdminGrid);

        addAdmin.setBackground(new java.awt.Color(15, 22, 38));
        addAdmin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addAdmin.setForeground(new java.awt.Color(200, 200, 200));
        addAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addAdmin.setText("Add Admin");
        addAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        addAdmin.setOpaque(true);
        addAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addAdminMouseExited(evt);
            }
        });

        deleteAdmin.setBackground(new java.awt.Color(15, 22, 38));
        deleteAdmin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        deleteAdmin.setForeground(new java.awt.Color(200, 200, 200));
        deleteAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteAdmin.setText("Delete Admin");
        deleteAdmin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        deleteAdmin.setOpaque(true);
        deleteAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteAdminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(back))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(addAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)
                        .addComponent(deleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(back)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        manageOrganizationMouseClicked(null);
    }//GEN-LAST:event_backMouseClicked

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        // TODO add your handling code here:
        Home.setForeground(Dashboard.primaryTextColor);
        HomeBar.setOpaque(false);
        HomeBar.repaint();
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
        Home.setForeground(Dashboard.coral);
        HomeBar.setOpaque(true);
        HomeBar.repaint();
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        Dashboard md = new Dashboard();
        md.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void manageDonationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonationsMouseExited
        manageDonations.setForeground(Dashboard.primaryTextColor);
        ManageDonationBar.setOpaque(false);
        ManageDonationBar.repaint();
    }//GEN-LAST:event_manageDonationsMouseExited

    private void manageDonationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonationsMouseEntered
        manageDonations.setForeground(Dashboard.coral);
        ManageDonationBar.setOpaque(true);
        ManageDonationBar.repaint();
    }//GEN-LAST:event_manageDonationsMouseEntered

    private void manageDonationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonationsMouseClicked
        // TODO add your handling code here:
        ManageDonations md = new ManageDonations();
        md.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageDonationsMouseClicked

    private void manageProjectsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProjectsMouseExited
        // TODO add your handling code here:
        manageProjects.setForeground(Dashboard.primaryTextColor);
        ManageProjectBar.setOpaque(false);
        ManageProjectBar.repaint();
    }//GEN-LAST:event_manageProjectsMouseExited

    private void manageProjectsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProjectsMouseEntered
        // TODO add your handling code here:
        manageProjects.setForeground(Dashboard.coral);
        ManageProjectBar.setOpaque(true);
        ManageProjectBar.repaint();
    }//GEN-LAST:event_manageProjectsMouseEntered

    private void manageProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProjectsMouseClicked
        // TODO add your handling code here:
        ManageProjects mp = new ManageProjects();
        mp.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_manageProjectsMouseClicked

    private void manageOrganizationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseExited
        // TODO add your handling code here:
        Color dullGray = new Color(200,200,200);
        manageOrganizationBar.setOpaque(false);
        manageOrganizationBar.repaint();
        manageOrganization.setForeground(dullGray);
    }//GEN-LAST:event_manageOrganizationMouseExited

    private void manageOrganizationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseEntered
        // TODO add your handling code here:
        Color highlight = new Color(255,83,61);
        manageOrganization.setForeground(highlight);
        manageOrganizationBar.setOpaque(true);
        manageOrganizationBar.repaint();
    }//GEN-LAST:event_manageOrganizationMouseEntered

    private void manageOrganizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseClicked
        // TODO add your handling code here:
        ManageOrganization mo = new ManageOrganization();
        mo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageOrganizationMouseClicked

    private void manageDonorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonorsMouseExited
        // TODO add your handling code here:
        manageDonors.setForeground(Dashboard.primaryTextColor);
        ManageDonorsBar.setOpaque(false);
        ManageDonorsBar.repaint();
    }//GEN-LAST:event_manageDonorsMouseExited

    private void manageDonorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonorsMouseEntered
        // TODO add your handling code h
        manageDonors.setForeground(Dashboard.coral);
        ManageDonorsBar.setOpaque(true);
        ManageDonorsBar.repaint();
    }//GEN-LAST:event_manageDonorsMouseEntered

    private void manageDonorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonorsMouseClicked
        // TODO add your handling code here:
        ManageDonors md = new ManageDonors();
        md.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageDonorsMouseClicked

    private void addAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminMouseClicked
        // TODO add your handling code here:
        AddAdmin ad = new AddAdmin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addAdminMouseClicked

    private void addAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_addAdminMouseEntered

    private void addAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAdminMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_addAdminMouseExited

    private void deleteAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAdminMouseClicked
        // TODO add your handling code here:
         int row = AdminGrid.getSelectedRow();
        if(row>-1)
        {
            if(Login.org.getAllAdmins().size() <= 1)
            {
                JOptionPane.showMessageDialog(this, "Cannot Delete.\nThe Organization must have atleast one Admin.");
            }
            else
            {
                String id = AdminGrid.getModel().getValueAt(row, 0).toString();
                
                System.out.println(id);
                
                boolean goToLogin = false;
                if(id.equals(String.valueOf(Login.admin.getId())))
                {
                    goToLogin = true;
                }
                //iterate list of all admins to get the selected admin
                for(int i=0; i<Login.org.getAllAdmins().size(); i++)
                {
                    if(Login.org.getAllAdmins().get(i).getId() == Integer.parseInt(id))
                    {
                        Login.org.getAllAdmins().remove(i);
                        break;
                    }
                }
                
                if(goToLogin)
                {
                    LogoutMouseClicked(null);
                }
                this.dispose();
                reloadPage();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please specify an Admin to delete");
        }
    }//GEN-LAST:event_deleteAdminMouseClicked

    private void reloadPage()
    {
        String[] args = null;
        main(args);        
    }
    private void deleteAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAdminMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteAdminMouseEntered

    private void deleteAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteAdminMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteAdminMouseExited

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        PersistentDB db = new PersistentDB();
        try
        {
            db.setOrganizationAndAdmin(Login.org, Login.admin);
            db.connect();
            db.saveToDB();
            db.disconnect();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Saving changes...");
        Login.org = null;
        Login.admin = null;

        Login log = new Login();
        log.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_LogoutMouseClicked

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
            java.util.logging.Logger.getLogger(ManageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AdminGrid;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel HomeBar;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel ManageDonationBar;
    private javax.swing.JLabel ManageDonorsBar;
    private javax.swing.JLabel ManageProjectBar;
    private javax.swing.JLabel addAdmin;
    private javax.swing.JLabel back;
    private javax.swing.JLabel deleteAdmin;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel manageDonations;
    private javax.swing.JLabel manageDonors;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JLabel manageOrganizationBar;
    private javax.swing.JLabel manageProjects;
    private javax.swing.JLabel message;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
