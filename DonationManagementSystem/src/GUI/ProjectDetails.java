/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Database.PersistentDB;
import Model.*;
import java.awt.Color;
import java.awt.Toolkit;
/**
 *
 * @author Danial
 */
public class ProjectDetails extends javax.swing.JFrame {

    /**
     * Creates new form ProjectDetails
     */
    private int projectID;
    
    public ProjectDetails(int ID)
    {
        this();
        projectID = ID;
        
        Project p = Login.org.getProject(projectID);
        projectNameLabel.setText(p.getName());
        projectDescriptionLabel.setText(p.getDescritpion());
        projectAddressLabel.setText((p.getAddr()!= null)? p.getAddr().toString() : "N/A");
    }
    
    public ProjectDetails() {
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
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        projectNameLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        projectDescriptionLabel = new javax.swing.JLabel();
        projectAddressLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        updateProject = new javax.swing.JLabel();
        removeProject = new javax.swing.JLabel();

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

        jLabel2.setBackground(new java.awt.Color(255, 83, 61));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        jLabel2.setText("Logout");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        projectNameLabel.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        projectNameLabel.setText("Project Name");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Description:");

        projectDescriptionLabel.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        projectDescriptionLabel.setText("description");

        projectAddressLabel.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        projectAddressLabel.setText("address");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Address:");

        updateProject.setBackground(new java.awt.Color(15, 22, 38));
        updateProject.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        updateProject.setForeground(new java.awt.Color(200, 200, 200));
        updateProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/writing.png"))); // NOI18N
        updateProject.setText("Update Project");
        updateProject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        updateProject.setOpaque(true);
        updateProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateProjectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateProjectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateProjectMouseExited(evt);
            }
        });

        removeProject.setBackground(new java.awt.Color(15, 22, 38));
        removeProject.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        removeProject.setForeground(new java.awt.Color(200, 200, 200));
        removeProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rubbish-bin.png"))); // NOI18N
        removeProject.setText("Remove Project");
        removeProject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        removeProject.setOpaque(true);
        removeProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeProjectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeProjectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeProjectMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(projectDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(back))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(48, 48, 48)
                                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(projectNameLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(26, 26, 26)
                                        .addComponent(projectAddressLabel))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(updateProject, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(removeProject, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(76, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(back)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(projectNameLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(projectDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectAddressLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateProject, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeProject, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageDonorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonorsMouseClicked
        // TODO add your handling code here:
        ManageDonors md = new ManageDonors();
        md.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageDonorsMouseClicked

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

    private void manageOrganizationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationMouseClicked
        // TODO add your handling code here
        ManageOrganization mo = new ManageOrganization();
        mo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageOrganizationMouseClicked

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

    private void manageProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProjectsMouseClicked
        // TODO add your handling code here:
        ManageProjects mp = new ManageProjects();
        mp.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_manageProjectsMouseClicked

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

    private void manageDonationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageDonationsMouseClicked
        // TODO add your handling code here:
        ManageDonations md = new ManageDonations();
        md.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_manageDonationsMouseClicked

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

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        Dashboard md = new Dashboard();
        md.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        manageProjectsMouseClicked(null);
    }//GEN-LAST:event_backMouseClicked

    private void updateProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProjectMouseClicked
        // TODO add your handling code here:
        UpdateProject up = new UpdateProject(projectID);
        up.setVisible(true);
        
        this.dispose();
      
    }//GEN-LAST:event_updateProjectMouseClicked

    private void updateProjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProjectMouseEntered
        // TODO add your handling code here:
        updateProject.setBackground(Dashboard.buttonHighlight);
        updateProject.setForeground(Dashboard.coral);
    }//GEN-LAST:event_updateProjectMouseEntered

    private void updateProjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateProjectMouseExited
        // TODO add your handling code here:
        updateProject.setBackground(Dashboard.navyBlue);
        updateProject.setForeground(Dashboard.primaryTextColor);
    }//GEN-LAST:event_updateProjectMouseExited

    private void removeProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeProjectMouseClicked
        // TODO add your handling code here:
        Project p = Login.org.getProject(projectID);
        Login.admin.removeProject(p);
        backMouseClicked(null);
        
    }//GEN-LAST:event_removeProjectMouseClicked

    private void removeProjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeProjectMouseEntered
        // TODO add your handling code here:
        removeProject.setBackground(Dashboard.buttonHighlight);
        removeProject.setForeground(Dashboard.coral);
    }//GEN-LAST:event_removeProjectMouseEntered

    private void removeProjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeProjectMouseExited
        // TODO add your handling code here:
        removeProject.setBackground(Dashboard.navyBlue);
        removeProject.setForeground(Dashboard.primaryTextColor);
    }//GEN-LAST:event_removeProjectMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
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

    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(ProjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel HomeBar;
    private javax.swing.JLabel ManageDonationBar;
    private javax.swing.JLabel ManageDonorsBar;
    private javax.swing.JLabel ManageProjectBar;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel manageDonations;
    private javax.swing.JLabel manageDonors;
    private javax.swing.JLabel manageOrganization;
    private javax.swing.JLabel manageOrganizationBar;
    private javax.swing.JLabel manageProjects;
    private javax.swing.JLabel message;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel projectAddressLabel;
    private javax.swing.JLabel projectDescriptionLabel;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JLabel removeProject;
    private javax.swing.JLabel updateProject;
    // End of variables declaration//GEN-END:variables
}
