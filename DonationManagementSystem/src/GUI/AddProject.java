/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.PersistentDB;
import java.awt.Color;
import Model.*;
import java.awt.Toolkit;

/**
 *
 * @author Danial
 */
public class AddProject extends javax.swing.JFrame {

    /**
     * Creates new form AddProject
     */
    public AddProject() {
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
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        projectnameLabel = new javax.swing.JTextField();
        projectCityLabel = new javax.swing.JTextField();
        addProject = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectDescriptionArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        projectLocationLabel = new javax.swing.JTextField();
        projectCountryLabel = new javax.swing.JTextField();
        message = new javax.swing.JLabel();

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

        jLabel6.setBackground(new java.awt.Color(255, 83, 61));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        jLabel6.setText("Logout");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
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
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow (1).png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Project Description*");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Project Name*");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Location");

        projectnameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        projectnameLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectnameLabelActionPerformed(evt);
            }
        });

        projectCityLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        projectCityLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectCityLabelActionPerformed(evt);
            }
        });

        addProject.setBackground(new java.awt.Color(15, 22, 38));
        addProject.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        addProject.setForeground(new java.awt.Color(200, 200, 200));
        addProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addProject.setText("Add Project");
        addProject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        addProject.setOpaque(true);
        addProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProjectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addProjectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addProjectMouseExited(evt);
            }
        });

        projectDescriptionArea.setColumns(20);
        projectDescriptionArea.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        projectDescriptionArea.setRows(5);
        jScrollPane1.setViewportView(projectDescriptionArea);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("City");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Country");

        projectLocationLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        projectLocationLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectLocationLabelActionPerformed(evt);
            }
        });

        projectCountryLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        projectCountryLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectCountryLabelActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectnameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectCityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectLocationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectCountryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(back))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(addProject, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(back)
                .addGap(71, 71, 71)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(projectnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(projectLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(projectCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectCountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addProject, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageDonorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonorsMouseEntered
        // TODO add your handling code h
        manageDonors.setForeground(Dashboard.coral);
        ManageDonorsBar.setOpaque(true);
        ManageDonorsBar.repaint();
    }//GEN-LAST:event_manageDonorsMouseEntered

    private void manageDonorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonorsMouseExited
        // TODO add your handling code here:
        manageDonors.setForeground(Dashboard.primaryTextColor);
        ManageDonorsBar.setOpaque(false);
        ManageDonorsBar.repaint();
    }//GEN-LAST:event_manageDonorsMouseExited

    private void manageOrganizationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseEntered
        // TODO add your handling code here:
        Color highlight = new Color(255,83,61);
        manageOrganization.setForeground(highlight);
        manageOrganizationBar.setOpaque(true);
        manageOrganizationBar.repaint();
    }//GEN-LAST:event_manageOrganizationMouseEntered

    private void manageOrganizationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseExited
        // TODO add your handling code here:
        Color dullGray = new Color(200,200,200);
        manageOrganizationBar.setOpaque(false);
        manageOrganizationBar.repaint();
        manageOrganization.setForeground(dullGray);
    }//GEN-LAST:event_manageOrganizationMouseExited

    private void manageProjectsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProjectsMouseEntered
        // TODO add your handling code here:
        manageProjects.setForeground(Dashboard.coral);
        ManageProjectBar.setOpaque(true);
        ManageProjectBar.repaint();
    }//GEN-LAST:event_manageProjectsMouseEntered

    private void manageProjectsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProjectsMouseExited
        // TODO add your handling code here:
        manageProjects.setForeground(Dashboard.primaryTextColor);
        ManageProjectBar.setOpaque(false);
        ManageProjectBar.repaint();
    }//GEN-LAST:event_manageProjectsMouseExited

    private void manageDonationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonationsMouseEntered
        manageDonations.setForeground(Dashboard.coral);
        ManageDonationBar.setOpaque(true);
        ManageDonationBar.repaint();
    }//GEN-LAST:event_manageDonationsMouseEntered

    private void manageDonationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonationsMouseExited
        manageDonations.setForeground(Dashboard.primaryTextColor);
        ManageDonationBar.setOpaque(false);
        ManageDonationBar.repaint();
    }//GEN-LAST:event_manageDonationsMouseExited

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
        Home.setForeground(Dashboard.coral);
        HomeBar.setOpaque(true);
        HomeBar.repaint();
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        // TODO add your handling code here:
        Home.setForeground(Dashboard.primaryTextColor);
        HomeBar.setOpaque(false);
        HomeBar.repaint();
    }//GEN-LAST:event_HomeMouseExited

    private void projectnameLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectnameLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectnameLabelActionPerformed

    private void projectCityLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectCityLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectCityLabelActionPerformed

    private void addProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProjectMouseClicked
        // TODO add your handling code here:
       String name = projectnameLabel.getText();
       String description = projectDescriptionArea.getText();
       String location = projectLocationLabel.getText();
       String city = projectCityLabel.getText();
       String country = projectCountryLabel.getText();
       
       if(!name.isEmpty() && !description.isEmpty())
       {
           Project p = Login.admin.createNewProject();
           
           p.setName(name);
           p.setDescritpion(description);           
           p.setAddr(location,city,country);
           
           System.out.println("Project added successfully");
           message.setForeground(Color.green);
           message.setText("Project added!");
           
           backMouseClicked(null);
       }
       else{
           message.setText("Some required fields are empty");
       }
    }//GEN-LAST:event_addProjectMouseClicked

    private void addProjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProjectMouseEntered
        // TODO add your handling code here:
        addProject.setBackground(Dashboard.buttonHighlight);
        addProject.setForeground(Dashboard.coral);

    }//GEN-LAST:event_addProjectMouseEntered

    private void addProjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProjectMouseExited
        // TODO add your handling code here:
        addProject.setBackground(Dashboard.navyBlue);
        addProject.setForeground(Dashboard.primaryTextColor);
    }//GEN-LAST:event_addProjectMouseExited

    private void projectLocationLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectLocationLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectLocationLabelActionPerformed

    private void projectCountryLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectCountryLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectCountryLabelActionPerformed
                                                
                                            

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        manageProjectsMouseClicked(null);
    }//GEN-LAST:event_backMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        Dashboard md = new Dashboard();
        md.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

    private void manageOrganizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseClicked
        // TODO add your handling code here:
        ManageOrganization mo = new ManageOrganization();
        mo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageOrganizationMouseClicked

    private void manageProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProjectsMouseClicked
        // TODO add your handling code here:
         ManageProjects mp = new ManageProjects();
        mp.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_manageProjectsMouseClicked

    private void manageDonationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonationsMouseClicked
        // TODO add your handling code here:
        ManageDonations md = new ManageDonations();
        md.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageDonationsMouseClicked

    private void manageDonorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonorsMouseClicked
        // TODO add your handling code here:
        ManageDonors md = new ManageDonors();
        md.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_manageDonorsMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
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

    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel HomeBar;
    private javax.swing.JLabel ManageDonationBar;
    private javax.swing.JLabel ManageDonorsBar;
    private javax.swing.JLabel ManageProjectBar;
    private javax.swing.JLabel addProject;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JTextField projectCityLabel;
    private javax.swing.JTextField projectCountryLabel;
    private javax.swing.JTextArea projectDescriptionArea;
    private javax.swing.JTextField projectLocationLabel;
    private javax.swing.JTextField projectnameLabel;
    // End of variables declaration//GEN-END:variables
}
