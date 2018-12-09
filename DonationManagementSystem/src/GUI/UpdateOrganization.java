/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.PersistentDB;
import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Danial
 */
public class UpdateOrganization extends javax.swing.JFrame {

    /**
     * Creates new form UpdateOrganization
     */
    public UpdateOrganization() {
        setTitle("Donation Management System");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/donation.png")));
        initComponents();
        
        organizationNameField.setText(Login.org.getName());
        organizationDescriptionField.setText(Login.org.getDescritpion());        
        organizationPhoneField.setText((Login.org.getPhoneNumbers().isEmpty())?"Not Available":Login.org.getPhoneNumbers().get(0));
        if(Login.org.getAddr() != null)
        {
            organizationLineField.setText((Login.org.getAddr().getAddrLine()!= null)?Login.org.getAddr().getAddrLine():"N/A");
            organizationCityField.setText((Login.org.getAddr().getCity()!= null)?Login.org.getAddr().getCity():"N/a");
            organizationCountryField.setText((Login.org.getAddr().getCountry()!=null)?Login.org.getAddr().getCountry():"N/A");
        }
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
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        updateDetails = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        organizationNameField = new javax.swing.JTextField();
        organizationPhoneField = new javax.swing.JTextField();
        organizationLineField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationDescriptionField = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        organizationCountryField = new javax.swing.JTextField();
        organizationCityField = new javax.swing.JTextField();

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

        jLabel3.setBackground(new java.awt.Color(255, 83, 61));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit.png"))); // NOI18N
        jLabel3.setText("Logout");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
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
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow (1).png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Phone Number");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Country");

        updateDetails.setBackground(new java.awt.Color(15, 22, 38));
        updateDetails.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        updateDetails.setForeground(new java.awt.Color(200, 200, 200));
        updateDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateDetails.setText("Update Details");
        updateDetails.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        updateDetails.setOpaque(true);
        updateDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateDetailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateDetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateDetailsMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Organization Name");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel12.setText("Description");

        organizationNameField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        organizationNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationNameFieldActionPerformed(evt);
            }
        });

        organizationPhoneField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        organizationPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationPhoneFieldActionPerformed(evt);
            }
        });

        organizationLineField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        organizationLineField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationLineFieldActionPerformed(evt);
            }
        });

        organizationDescriptionField.setColumns(20);
        organizationDescriptionField.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        organizationDescriptionField.setRows(5);
        jScrollPane1.setViewportView(organizationDescriptionField);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setText("Line Address");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel16.setText("City");

        organizationCountryField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        organizationCountryField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationCountryFieldActionPerformed(evt);
            }
        });

        organizationCityField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        organizationCityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationCityFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(543, 543, 543))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(organizationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizationPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizationLineField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizationCountryField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizationCityField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 156, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(updateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(back)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(organizationNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(organizationPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationLineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(organizationCityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(organizationCountryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(55, 55, 55)
                .addComponent(updateDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        // TODO add your handling code here:
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
        manageOrganizationMouseClicked(null);
    }//GEN-LAST:event_backMouseClicked

    private void updateDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDetailsMouseClicked
        // TODO add your handling code here:
        Login.org.setName(organizationNameField.getText());
        Login.org.setDescritpion(organizationDescriptionField.getText());
        Login.org.getPhoneNumbers().add(0,(organizationPhoneField.getText()));
        
        String line = organizationLineField.getText();
        String city = organizationCityField.getText();
        String country = organizationCountryField.getText();
        
        Login.org.setAddr(line, city, country);
        
        backMouseClicked(null);
    }//GEN-LAST:event_updateDetailsMouseClicked

    private void updateDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDetailsMouseEntered
        // TODO add your handling code here:
        updateDetails.setBackground(Dashboard.buttonHighlight);
        updateDetails.setForeground(Dashboard.coral);
    }//GEN-LAST:event_updateDetailsMouseEntered

    private void updateDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateDetailsMouseExited
        // TODO add your handling code here:
        updateDetails.setBackground(Dashboard.navyBlue);
        updateDetails.setForeground(Dashboard.primaryTextColor);
    }//GEN-LAST:event_updateDetailsMouseExited

    private void organizationNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationNameFieldActionPerformed

    private void organizationPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationPhoneFieldActionPerformed

    private void organizationLineFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationLineFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationLineFieldActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
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

    }//GEN-LAST:event_jLabel3MouseClicked

    private void organizationCountryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationCountryFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationCountryFieldActionPerformed

    private void organizationCityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationCityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationCityFieldActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateOrganization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateOrganization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateOrganization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateOrganization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateOrganization().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField organizationCityField;
    private javax.swing.JTextField organizationCountryField;
    private javax.swing.JTextArea organizationDescriptionField;
    private javax.swing.JTextField organizationLineField;
    private javax.swing.JTextField organizationNameField;
    private javax.swing.JTextField organizationPhoneField;
    private javax.swing.JLabel updateDetails;
    // End of variables declaration//GEN-END:variables
}
