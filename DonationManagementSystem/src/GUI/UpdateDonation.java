/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Model.*;
import java.awt.Color;
import java.util.List;
/**
 *
 * @author Danial
 */
public class UpdateDonation extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDonation
     */
    private int donationID;
    private boolean donate2Project;
    private boolean assignNew = false;
    public UpdateDonation(int ID)
    {
        this();
        donationID = ID;
        Donation d = Login.org.getDonation(ID);
        worthLabel.setText(String.valueOf(d.getValue()));        
        
        if(d.getAssociatedProject() == null)
        {
            currentProjectPanel.setVisible(false);
            currentProjectPanel.repaint();
            donate2Project = false;
            organization.setSelected(true);
        }
        else
        {
            currentProjectPanel.setVisible(true);
            currentProjectPanel.repaint();
            jPanel2.setVisible(false);
            jPanel2.repaint();
            currentProjectLabel.setText(d.getAssociatedProject().getName());
            donate2Project = true;
            project.setSelected(true);
        }
        
    }
    public UpdateDonation() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        worthLabel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        organization = new javax.swing.JRadioButton();
        project = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        confirmDonation = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProjectGrid = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        currentProjectPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        currentProjectLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        assignToNewProject = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(799, 717));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(manageOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(manageProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageDonations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 748));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow (1).png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 21, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Ammount");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 122, -1, -1));

        worthLabel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        worthLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worthLabelActionPerformed(evt);
            }
        });
        jPanel1.add(worthLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 119, 202, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Donate To");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 166, -1, -1));

        organization.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(organization);
        organization.setText("Organization");
        organization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationActionPerformed(evt);
            }
        });
        jPanel1.add(organization, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 170, -1, -1));

        project.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(project);
        project.setText("Project");
        project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectActionPerformed(evt);
            }
        });
        jPanel1.add(project, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 100, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel6.setText("PKRs");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 126, -1, -1));

        confirmDonation.setBackground(new java.awt.Color(15, 22, 38));
        confirmDonation.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        confirmDonation.setForeground(new java.awt.Color(200, 200, 200));
        confirmDonation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmDonation.setText("Update Donation");
        confirmDonation.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        confirmDonation.setOpaque(true);
        confirmDonation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmDonationMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmDonationMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmDonationMouseExited(evt);
            }
        });
        jPanel1.add(confirmDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 659, 172, 54));

        message.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 87, 330, 14));

        jPanel2.setOpaque(false);

        ProjectGrid.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        ProjectGrid.setSelectionBackground(new java.awt.Color(255, 83, 61));
        ProjectGrid.setSelectionForeground(new java.awt.Color(15, 22, 38));
        ProjectGrid.setShowVerticalLines(false);
        List<Project> record = Login.admin.getAllProjects();
        String [][] data = new String [record.size()][2];

        int i = 0;
        for(Project p: record )
        {
            data[i][0] = String.valueOf(p.getId());
            data[i][1] = p.getName();
            i++;
        }

        ProjectGrid.setModel(new javax.swing.table.DefaultTableModel(
            data,
            new String [] {
                "PROJECT ID", "PROJECT NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ProjectGrid);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Choose a Project");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel3.setText("(Optional)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 310, -1, -1));

        currentProjectPanel.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Current Project");

        currentProjectLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        currentProjectLabel.setText("Current Project");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("Assign to a new project");

        assignToNewProject.setBackground(new java.awt.Color(255, 255, 255));
        assignToNewProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToNewProjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout currentProjectPanelLayout = new javax.swing.GroupLayout(currentProjectPanel);
        currentProjectPanel.setLayout(currentProjectPanelLayout);
        currentProjectPanelLayout.setHorizontalGroup(
            currentProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentProjectPanelLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(currentProjectLabel)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(currentProjectPanelLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assignToNewProject)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        currentProjectPanelLayout.setVerticalGroup(
            currentProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentProjectPanelLayout.createSequentialGroup()
                .addGroup(currentProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(currentProjectLabel))
                .addGap(18, 18, 18)
                .addGroup(currentProjectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(assignToNewProject))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jPanel1.add(currentProjectPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 211, -1, -1));

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
        Dashboard d = new Dashboard();
        d.setVisible(true);
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

    private void worthLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worthLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_worthLabelActionPerformed

    private void organizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationActionPerformed
        // TODO add your handling code here:
        donate2Project = false;
    }//GEN-LAST:event_organizationActionPerformed

    private void projectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectActionPerformed
        // TODO add your handling code here:
        donate2Project = true;
    }//GEN-LAST:event_projectActionPerformed

    private void confirmDonationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmDonationMouseClicked
        // TODO add your handling code here:
        if(!worthLabel.getText().isEmpty())
        {
            Donation donation = Login.org.getDonation(donationID);
            donation.setValue(Double.valueOf(worthLabel.getText()));
            if(donate2Project && !assignNew)
            {

                try
                {
                    Integer row = ProjectGrid.getSelectedRow();                    
                    String value = ProjectGrid.getModel().getValueAt(row, 0).toString();
                    Project p = Login.org.getProject(Integer.valueOf(value));                   
                    donation.setValue(Double.valueOf(worthLabel.getText()));

                    donation.assignToProject(p);

                    Login.admin.addDonationToProject(donation, Integer.valueOf(value));
                    DonationDetails dd = new DonationDetails(donationID);
                    dd.setVisible(true);
                    this.dispose();
                }
                catch(Exception e)
                {
                    message.setText("No project is specified!");
                }

            }
            else
            {
                donation.removeProject();
                DonationDetails dd = new DonationDetails(donationID);
                dd.setVisible(true);
                this.dispose();
            }

        }
        
        else
        {
            message.setText("Some important fields are empty!");
        }

    }//GEN-LAST:event_confirmDonationMouseClicked

    private void confirmDonationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmDonationMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmDonationMouseEntered

    private void confirmDonationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmDonationMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmDonationMouseExited

    private void assignToNewProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToNewProjectActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        assignNew = true;
    }//GEN-LAST:event_assignToNewProjectActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        DonationDetails dd = new DonationDetails(donationID);
        dd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateDonation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDonation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDonation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDonation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDonation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel HomeBar;
    private javax.swing.JLabel ManageDonationBar;
    private javax.swing.JLabel ManageDonorsBar;
    private javax.swing.JLabel ManageProjectBar;
    private javax.swing.JTable ProjectGrid;
    private javax.swing.JCheckBox assignToNewProject;
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel confirmDonation;
    private javax.swing.JLabel currentProjectLabel;
    private javax.swing.JPanel currentProjectPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JRadioButton organization;
    private javax.swing.JRadioButton project;
    private javax.swing.JTextField worthLabel;
    // End of variables declaration//GEN-END:variables
}
