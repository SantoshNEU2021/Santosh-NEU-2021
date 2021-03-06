/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SoftwareEngineerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.SoftwareOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SoftwareWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author raunak
 */
public class SoftwareEngineerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private SoftwareOrganization softwareOrganization;
    private Network network;
    private Enterprise enterprise;
    private static Logger log = Logger.getLogger(SoftwareEngineerWorkAreaJPanel.class);
    private static final String CLASS_NAME = SoftwareEngineerWorkAreaJPanel.class.getName();
    
    /**
     * Creates new form SoftwareEngineerWorkAreaJPanel
     */
    public SoftwareEngineerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.network = network;
        this.enterprise = enterprise;
        this.softwareOrganization = (SoftwareOrganization)organization;   
        log.debug(userAccount+" "+"logged in");     
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblLabWorkArea.getModel();

        model.setRowCount(0);

        for (WorkRequest request : softwareOrganization.getWorkQueue().getWorkRequestList()) {

            Object[] row = new Object[8];
            row[0] = ((SoftwareWorkRequest) request);
            row[1] = ((SoftwareWorkRequest) request).getBuild().getCores();
            row[2] = ((SoftwareWorkRequest) request).getBuild().getCPUType();
            row[3] = request.getMessage();
            row[4] = request.getSender().getEmployee().getName();
            row[5] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[6] = request.getStatus();
            row[7] = ((SoftwareWorkRequest) request).getBuild().getNewSupply();
            model.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblLabWorkArea = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));

        btnAssign.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        tblLabWorkArea.setFont(new java.awt.Font("Palatino Linotype", 0, 20)); // NOI18N
        tblLabWorkArea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Build Name", "Cores", "Make", "Message", "Sender", "Receiver", "Status", "New "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLabWorkArea.setRowHeight(30);
        jScrollPane.setViewportView(tblLabWorkArea);

        jPanel4.setBackground(new java.awt.Color(255, 102, 51));

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ENGINEER PORTAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = tblLabWorkArea.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        //to check task is  already completed
        if (tblLabWorkArea.getValueAt(selectedRow, 6) != null) {
            if (((tblLabWorkArea.getValueAt(selectedRow, 6).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }

        //to check task is already assigned        
        if (tblLabWorkArea.getValueAt(selectedRow, 6) != null) {
            if (tblLabWorkArea.getValueAt(selectedRow, 5) != null) {
                if (userAccount.getUsername().equalsIgnoreCase(tblLabWorkArea.getValueAt(selectedRow, 5).toString())) {

                    if (tblLabWorkArea.getValueAt(selectedRow, 6).equals("Pending")) {
                        JOptionPane.showMessageDialog(null, "Task is already assigned");
                        return;
                    }
                }
            }
        }
        //to check the task is assigned to some one else 
        if (tblLabWorkArea.getValueAt(selectedRow, 6) != null) {
            if (tblLabWorkArea.getValueAt(selectedRow, 5) != null) {
                if (tblLabWorkArea.getValueAt(selectedRow, 6).equals("Processing")) {
                    JOptionPane.showMessageDialog(null, "Task is already assigned");
                    return;
                }
            }
        }

        //to check whether task is already assigined 
        if (tblLabWorkArea.getValueAt(selectedRow, 5) != null) {
            if (!userAccount.getUsername().equalsIgnoreCase(tblLabWorkArea.getValueAt(selectedRow, 5).toString())) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        int flag = 0;

        for (WorkRequest request : softwareOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Pending")) {

                if (request.getReceiver() != null) {

                    if (userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                        flag = 1;
                    }
                }
            }
        }
        if (flag == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        int flag1 = 0;
        for (WorkRequest request : softwareOrganization.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (tblLabWorkArea.getValueAt(selectedRow, 5) != null) {
                if (request.getStatus().equals("Processing") && userAccount.getUsername().equalsIgnoreCase(tblLabWorkArea.getValueAt(selectedRow, 5).toString())) {
                    flag1 = 1;
                }
            }
        }
        if (flag1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest request = (WorkRequest) tblLabWorkArea.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");     
        log.debug(userAccount+" "+"has assigned the request");
        log.debug("status has been set to pending");   
        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
         
        int selectedRow = tblLabWorkArea.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        //to check whether the task is completed 
        SoftwareWorkRequest request = (SoftwareWorkRequest) tblLabWorkArea.getValueAt(selectedRow, 0);
        if (tblLabWorkArea.getValueAt(selectedRow, 6) != null) {
            if (((tblLabWorkArea.getValueAt(selectedRow, 6).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Task is already completed");
                return;
            }
        }
        //to check whether task is assigned for process
        if (tblLabWorkArea.getValueAt(selectedRow, 5) != null) {
            if (tblLabWorkArea.getValueAt(selectedRow, 6) == null || !userAccount.getEmployee().getName().equalsIgnoreCase(tblLabWorkArea.getValueAt(selectedRow, 5).toString())) {
                JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                return;
            }
        }
        int flag = 0;
        if (tblLabWorkArea.getValueAt(selectedRow, 5) != null) {
            if (tblLabWorkArea.getValueAt(selectedRow, 6).equals("Processing")) {

                flag = 1;
            }
        }
        if (flag != 1) {
            if (tblLabWorkArea.getValueAt(selectedRow, 6) != null) {

                if ((!(tblLabWorkArea.getValueAt(selectedRow, 6).equals("Pending")))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        request.setStatus("Processing");

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request, softwareOrganization, userAccount, network);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);        
        log.debug("entering process request page");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
        log.debug("refreshed the table");
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tblLabWorkArea;
    // End of variables declaration//GEN-END:variables
}
