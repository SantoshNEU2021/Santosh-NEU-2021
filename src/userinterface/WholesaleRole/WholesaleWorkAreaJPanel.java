/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WholesaleRole;

import Business.Enterprise.Enterprise;
import Business.GPUInventory.GPUInventory;
import Business.GPUInventory.GPUInventoryList;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.WholesaleOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SupplierWorkRequest;
import Business.WorkQueue.WholesalerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author santo
 */
public class WholesaleWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyWorKAreaJPanel
     */
    JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private GPUInventoryList mil;
    private Organization org;
    private WholesaleOrganization wo;
    private Network network;
    private static Logger log = Logger.getLogger(WholesaleWorkAreaJPanel.class);
    private static final String CLASS_NAME = WholesaleWorkAreaJPanel.class.getName();
    public WholesaleWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, WholesaleOrganization wo, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.wo = wo;
        this.network = network;
        reorderTable();
        log.debug(userAccount+" "+"logged in");
        populateDocTable();
    }
    
    public void populateDocTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblPharmacyRequest.getModel();

        dtm.setRowCount(0);

        for (WorkRequest request : wo.getWorkQueue().getWorkRequestList()) {
            System.out.println("entering gpu");
           
            if(request instanceof WholesalerWorkRequest){
            Object[] row = new Object[3];
            row[0] = ((WholesalerWorkRequest) request).getGPUnitName();
            row[1] = ((WholesalerWorkRequest) request).getQuantity();
            row[2] = ((WholesalerWorkRequest) request).getStatus();

            dtm.addRow(row);
             }
        }
    }
    
    public void reorderTable() {
        int rowCount = tblRecord.getRowCount();
        DefaultTableModel dtm = (DefaultTableModel) tblRecord.getModel();
        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }
        for (GPUInventory mi : wo.getGPUList()) {
            Object row[] = new Object[6];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2] = mi.getAvailQuantity();
            row[3] = mi.getRequiredQuantity();
            row[4] = mi.getReorderStatus();
                    
            dtm.addRow(row);
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecord = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMedicineName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtReqQuantity = new javax.swing.JTextField();
        btnAddMedicine = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        tblPharmacyRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCheckStatus = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        btnViewRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tblRecord.setBorder(new javax.swing.border.MatteBorder(null));
        tblRecord.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "SERIAL NUMBER ", "AVAILABILE QUANTITY", "REQUIRED QUANTITY", "REORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecord.setRowHeight(25);
        jScrollPane1.setViewportView(tblRecord);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Serial Number :");

        txtSerialNumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Medicine Name :");

        txtMedicineName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMedicineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("In Stock :");

        txtInStock.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtInStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInStockActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Required Quantity :");

        txtReqQuantity.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        btnAddMedicine.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnAddMedicine.setText("ADD MEDICINE");
        btnAddMedicine.setBorder(null);
        btnAddMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReqQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReqQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblPharmacyRequest.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblPharmacyRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE NAME", "QUANTITY", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPharmacyRequest.setRowHeight(25);
        jScrollPane.setViewportView(tblPharmacyRequest);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("Prescribed Medicine:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                        .addComponent(jScrollPane))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PHARMACY PORTAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnCheckStatus.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnCheckStatus.setText("Check Status");
        btnCheckStatus.setBorder(null);
        btnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckStatusActionPerformed(evt);
            }
        });

        btnViewDetails.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.setBorder(null);
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnViewRequest.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        btnViewRequest.setText("View Request");
        btnViewRequest.setBorder(null);
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCheckStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicineActionPerformed
        // TODO add your handling code here:
        GPUInventory m = new GPUInventory();
        String name = txtMedicineName.getText().trim();
        String error_message = "";
        String avail = txtInStock.getText();
        try {
            Integer.parseInt(avail);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Available quantity must be integer");
            return;

        }
        if(name.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the name ");
            return;
        }

        m.setGPUName(txtMedicineName.getText());
        try{
            int availableQuantity = Integer.parseInt(txtInStock.getText());
            m.setAvailQuantity(availableQuantity);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
        try{
            int serialNumber = Integer.parseInt(txtSerialNumber.getText());
            m.setSerialNumber(serialNumber);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer!");
            return;
        }
        String req = txtReqQuantity.getText();
        try {

            m.setRequiredQuantity( Integer.parseInt(req));
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Required quantity must be integer!");
            return;
        }
        wo.addGPU(m);
        m.setReorderStatus("N");

        DefaultTableModel dtm = (DefaultTableModel) tblRecord.getModel();

        dtm.setRowCount(0);
        for (GPUInventory mi : wo.getGPUList()) {
            Object row[] = new Object[5];
            row[0] = mi;
            row[1] = mi.getSerialNumber();
            row[2] = mi.getAvailQuantity();
            row[3] = mi.getRequiredQuantity();
            row[4] = mi.getReorderStatus();
            dtm.addRow(row);
        }

        JOptionPane.showMessageDialog(null, "GPU Added Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
        log.debug("GPU added successfully");
        txtSerialNumber.setText("");
        txtMedicineName.setText("");
        txtInStock.setText("");
        txtReqQuantity.setText("");

    }//GEN-LAST:event_btnAddMedicineActionPerformed

    private void txtInStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInStockActionPerformed

    private void txtMedicineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineNameActionPerformed

    private void btnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckStatusActionPerformed
        // TODO add your handling code here:
        int medicinecheck=0;
        for (GPUInventory mi : wo.getGPUList()) {
            medicinecheck++;
        }

        if(medicinecheck<=0)
        {
            JOptionPane.showMessageDialog(null,"No units are present for invetory check  ");
            return;
        }
        for (GPUInventory mi : wo.getGPUList()) {

            if (mi.getAvailQuantity() <= mi.getRequiredQuantity()) {
                if (!mi.getReorderStatus().equals("Y")) {
                    SupplierWorkRequest request = new SupplierWorkRequest();

                    mi.setReorderStatus("Y");
                    request.setSupplierName(mi.getGPUName());
                    request.setQuantity(mi.getRequiredQuantity());
                    request.setSender(userAccount);

                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        System.out.println("***** Organization Name:" + enterprise.getName());
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            System.out.println("***** Organization Name:" + organization.getName());
                            if (organization.getName().equals("Supplier Organization")) {
                                System.out.println("True");

                                System.out.println("***** organization Name" + organization.getName());

                                organization.getWorkQueue().getWorkRequestList().add(request);
                                log.debug(userAccount+" "+"sending request to supplier Organization");
                            }
                        }

                    }

                }

            }
        }
        JOptionPane.showMessageDialog(null, "Inventory status checked and updated!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        reorderTable();
    }//GEN-LAST:event_btnCheckStatusActionPerformed

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewRequestJPanel", new ViewRequestJPanel(userProcessContainer, userAccount, enterprise, org));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int row = tblRecord.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        GPUInventory mi = (GPUInventory) tblRecord.getValueAt(row, 0);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        log.debug(userAccount+" "+"entering view details page");
        userProcessContainer.add("UpdateEntryJPanel", new ViewDetailsJPanel(userProcessContainer, userAccount, enterprise, mi));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMedicine;
    private javax.swing.JButton btnCheckStatus;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPharmacyRequest;
    private javax.swing.JTable tblRecord;
    private javax.swing.JTextField txtInStock;
    private javax.swing.JTextField txtMedicineName;
    private javax.swing.JTextField txtReqQuantity;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
