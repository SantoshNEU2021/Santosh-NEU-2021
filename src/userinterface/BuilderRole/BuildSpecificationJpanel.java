/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BuilderRole;

import Business.Builder.FinalConfig;
import Business.Builder.Parts;
import Business.Builder.PartsList;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BuilderOrganization;
import Business.Organization.Organization;
import Business.Organization.WholesaleOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BuilderWorkRequest;
import Business.WorkQueue.WholesalerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author santo
 */
public class BuildSpecificationJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DocPrescriptionJpanel
     */
    private PartsList partsList;
    private BuilderOrganization organization;
    private Enterprise enterprise;
    private Network network;
    private EcoSystem system;
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Parts parts;
    private BuilderWorkRequest docreq;
    private static final String filePath = "./parts data.txt";
    private static Logger log = Logger.getLogger(BuildSpecificationJpanel.class);
    private static final String CLASS_NAME = BuildSpecificationJpanel.class.getName();
    public BuildSpecificationJpanel(JPanel userProcessContainer, PartsList list, UserAccount account, Enterprise enterprise, BuilderOrganization organization, EcoSystem system, Network network) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.userAccount=account;
        this.system=system;
        this.network=network;
        this.enterprise=enterprise;
        this.organization=organization;
        jLabel1.setFont(new Font("Helvetica Neue", Font.PLAIN, 36));
        
        
        populateWorkRequestTable();
        date.setMinSelectableDate(new Date());
    }

    public void populateWorkRequestTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblPrescription.getModel();
        
        dtm.setRowCount(0);
        
        for(WorkRequest work : userAccount.getWorkQueue().getWorkRequestList()){
            if(work instanceof WholesalerWorkRequest){
                Object[] row = new Object[4];
                
                String medicine = ((WholesalerWorkRequest)work).getGPUnitName();
                row[0] = (WholesalerWorkRequest) work;
                int quantity = ((WholesalerWorkRequest) work).getQuantity();
                row[1] = quantity;
                row[2] = ((WholesalerWorkRequest) work).getBuildName();
                String result = work.getStatus();
                row[3] = result == null ? "Waiting" : result;

                dtm.addRow(row);
            }
        }
    }
    
    public void saveRecord(String network,String disease,String medicine){
        try{
            FileWriter file = new FileWriter(filePath,true);
            BufferedWriter writer = new BufferedWriter(file);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println(network+","+disease+","+medicine);
            printWriter.flush();
            printWriter.close();
            log.debug("saving configuration details to parts data.txt");
        }catch(IOException ex){
            
            java.util.logging.Logger.getLogger(BuildSpecificationJpanel.class.getName()).log(Level.SEVERE, null, ex);
            log.error("parts data.txt" +ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSavePrescription = new javax.swing.JButton();
        cbxDiagnosis = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        cbxMedication = new javax.swing.JComboBox<>();
        cbxSex = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerNoOfTimes = new javax.swing.JSpinner();
        jSpinnerNoOfDays = new javax.swing.JSpinner();
        scrollPane2 = new javax.swing.JScrollPane();
        tblPrescription = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 255));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jPanel1.setBackground(new java.awt.Color(248, 90, 51));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Baskerville", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUILDER PORTAL");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 153, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/WhatsApp Image 2020-04-18 at 7.03.37 PM.jpeg"))); // NOI18N
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel2.setText("Build Name :");

        txtPatientName.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel3.setText("Make :");

        jLabel4.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel4.setText("Cores :");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel5.setText("Date :");

        btnSavePrescription.setBackground(new java.awt.Color(255, 255, 255));
        btnSavePrescription.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        btnSavePrescription.setText("Save");
        btnSavePrescription.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSavePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePrescriptionActionPerformed(evt);
            }
        });

        cbxDiagnosis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxDiagnosis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please select--", "Intel i7 11700K", "Intel i7 10700K", "Intel i5 11500", "AMD Ryzen 5 5800X", "AMD Ryzen 9 5900X", "AMD Ryzen 7 5700X" }));
        cbxDiagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiagnosisActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel6.setText("CPU :");

        jLabel7.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel7.setText("GPU");

        cbxMedication.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxMedication.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please select--", "RTX 3080", "RTX 3070", "RTX 3060", "GTX 1080ti", "Radeon RX 6900XT", "RTX Titan", "Radeon RX6800" }));
        cbxMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedicationActionPerformed(evt);
            }
        });

        cbxSex.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbxSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Intel", "AMD" }));
        cbxSex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel8.setText("Count");

        jLabel9.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel9.setText("For :");

        tblPrescription.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 20)); // NOI18N
        tblPrescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "GPU Name", "Total Quantity", "Build Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrescription.setRowHeight(25);
        scrollPane2.setViewportView(tblPrescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(cbxMedication, 0, 200, Short.MAX_VALUE)
                    .addComponent(cbxDiagnosis, 0, 200, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinnerNoOfTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerNoOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSavePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoOfTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerNoOfDays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSavePrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        log.debug("going back to Doctors work area");
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSavePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePrescriptionActionPerformed
        // TODO add your handling code here:
        Parts parts = new Parts();
        parts.setCPU(cbxDiagnosis.getSelectedItem().toString());
        parts.setGPU(cbxMedication.getSelectedItem().toString());
        parts.setNoofTimesInaday((Integer) jSpinnerNoOfTimes.getValue());
        parts.setTotalDays((Integer) jSpinnerNoOfDays.getValue());
        parts.setNetworkName(network.getName());
        String buildName = txtPatientName.getText();
        
        String age = txtAge.getText();
        boolean flag = true;
        try {
            Integer.parseInt(age);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Cores must be integer!");
            flag = false;
            return;
        }

        if (parts.getCPU().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the CPU");
            flag = false;
            return;
        } else if (txtPatientName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the name of the build!");
            flag = false;
            return;

        }
         if(((Integer) jSpinnerNoOfTimes.getValue())==0|| ((Integer) jSpinnerNoOfDays.getValue())==0)
                {
                     JOptionPane.showMessageDialog(null, "Please enter the no of days or no times !");
             flag = false;
             return;
                }
         if(date.getDate()==null)
         {
             JOptionPane.showMessageDialog(null, "Please select the date !");
             flag = false;
             return;
         }
         if(cbxMedication.getSelectedIndex()<=0)
         {
             JOptionPane.showMessageDialog(null, "Please select the GPU !");
             flag = false;
         }
         if(cbxSex.getSelectedIndex()<=0)
         {
          JOptionPane.showMessageDialog(null, "Please select either Intel or AMD!");
             flag = false;   
             return;
         }
         if(cbxDiagnosis.getSelectedIndex()<=0)
         {
             JOptionPane.showMessageDialog(null, "Please select the CPU name");
             flag=false;
             return;
         }
        
        if (flag == true) {
            
            
            organization.addParts(parts);

            WholesalerWorkRequest pwr = new WholesalerWorkRequest();

            pwr.setGPUnitName(cbxMedication.getSelectedItem().toString());
            pwr.setQuantity(((Integer) jSpinnerNoOfTimes.getValue()) * ((Integer) jSpinnerNoOfDays.getValue()));
            pwr.setSender(userAccount);
            pwr.setStatus("Sent");
            pwr.setPatientName(buildName);
            System.out.println(pwr.getGPUnitName());
            JOptionPane.showMessageDialog(null, "Configuration added successfully");

            System.out.println("****" + enterprise.getName());
            Organization org = null;

                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof WholesaleOrganization) {
                            org = organization;
                            System.out.println("-------" + org);
                            log.debug(org);
                            log.debug("Current Enterprise\t" +enterprise);
                            log.debug("Current Organization\t" +org);
                            log.debug("Current Network\t" +network);
                            break;
                        }
                    }
                }
            
            if (org != null) {

                org.getWorkQueue().getWorkRequestList().add(pwr);
                userAccount.getWorkQueue().getWorkRequestList().add(pwr);
                log.debug("request sent to wholesaler");
            }
            
           

            saveRecord(parts.getNetworkName(),parts.getCPU(),parts.getGPU());
            populateWorkRequestTable();
            txtPatientName.setText("");
            txtAge.setText("");
            jSpinnerNoOfTimes.setValue(0);
            jSpinnerNoOfDays.setValue(0);
            cbxSex.setSelectedIndex(0);
            cbxMedication.setSelectedIndex(0);
            cbxDiagnosis.setSelectedIndex(0);
            date.setDate(new Date());
            
            
        }
    }//GEN-LAST:event_btnSavePrescriptionActionPerformed

    private void cbxDiagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDiagnosisActionPerformed

    private void cbxMedicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMedicationActionPerformed

    private void cbxSexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSexActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSavePrescription;
    private javax.swing.JComboBox<String> cbxDiagnosis;
    private javax.swing.JComboBox<String> cbxMedication;
    private javax.swing.JComboBox<String> cbxSex;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JSpinner jSpinnerNoOfDays;
    private javax.swing.JSpinner jSpinnerNoOfTimes;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTable tblPrescription;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
