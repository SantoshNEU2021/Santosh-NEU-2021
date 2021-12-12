/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierRole;

import Business.RawMaterial.RawMaterial;
import Business.Builder.FinalConfig;
import Business.Supplier.Supplier;
import Business.EcoSystem;
import Business.OS.OS;
import Business.Network.Network;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author santo
 */
public class NewGPUJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewDrugJPanel
     */
    private JPanel userProcessContainer;
    private FinalConfig build;
    private SupplierOrganization supplierOrganization;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem business;
    private static Logger log = Logger.getLogger(NewGPUJPanel.class);
    private static final String CLASS_NAME = NewGPUJPanel.class.getName();
    public NewGPUJPanel(JPanel userProcessContainer, FinalConfig build, SupplierOrganization supplierOrganization, UserAccount userAccount, Network network,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.build = build;
        this.supplierOrganization = supplierOrganization;
        this.userAccount = userAccount;
        this.network = network;
        this.business = business;
        txtNamePatient.setText(build.getBuildName());
        populateTable();
    }

        public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDrug.getModel();

        List<String> newDiseaseGenes = new ArrayList<String>();
        for (OS gene : build.getOSDirectory().getOSList()) {
            newDiseaseGenes.add(gene.getOperatingSystemName());
        }

        int i = 0;
        Map<String, String> GeneChem = new TreeMap<String, String>((String.CASE_INSENSITIVE_ORDER));
        for (Supplier d : business.getSupplierList().getSupplierList()) {

            for (i = 0; i < d.getRawMaterialList().getRawMaterialList().size(); i++) {

                RawMaterial c = d.getRawMaterialList().getRawMaterialList().get(i);
                OS g = d.getOSDirectory().getOSList().get(i);
                GeneChem.put(g.getOperatingSystemName(), c.getMaterialName());
            }

        }

        Map<String, String> newDrugFinal = new TreeMap<String, String>((String.CASE_INSENSITIVE_ORDER));
        for (String s : newDiseaseGenes) {

            if (GeneChem.containsKey(s)) {

                newDrugFinal.put(s, GeneChem.get(s));
            }
        }

        for (Map.Entry<String, String> entry : newDrugFinal.entrySet()) {
            String key = entry.getKey();
            String values = entry.getValue();
            Object[] row = new Object[2];
            row[0] = key;
            row[1] = values;
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

        btnNewDrug = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNamePatient = new javax.swing.JTextField();
        jScrollPane = new javax.swing.JScrollPane();
        tblDrug = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtNameDrug = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 255));

        btnNewDrug.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        btnNewDrug.setText("Add New GPU");
        btnNewDrug.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNewDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewDrugActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Palatino", 0, 14)); // NOI18N
        btnBack.setText("<- Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(248, 90, 51));

        jLabel4.setFont(new java.awt.Font("Baskerville", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NEW GPU");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel2.setText("Build Name:");

        tblDrug.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Software", "Raw Materials"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDrug.setRowHeight(30);
        jScrollPane.setViewportView(tblDrug);

        jLabel3.setFont(new java.awt.Font("Charter", 0, 14)); // NOI18N
        jLabel3.setText("GPU Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNamePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtNameDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNameDrug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(btnNewDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNewDrug, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewDrugActionPerformed
        // TODO add your handling code here:
        String gpuName = txtNameDrug.getText().trim();
        if(gpuName.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the GPU name");
            return;
        }
        ArrayList<String>drugCheck = new ArrayList<>();
        for(Supplier d:business.getSupplierList().getSupplierList())
        {
            drugCheck.add(d.getGPUName().toLowerCase());
        }
        if(drugCheck.contains(gpuName))
        {
             JOptionPane.showMessageDialog(null, " GPU name already exists ");
            return;
        }
        Supplier d = business.getSupplierList().addSupplierList();
        d.setGPUName(gpuName);
        build.setNewSupply(gpuName);
        int count = tblDrug.getRowCount();
        for (int i = 0; i < count; i++) {
            String s = tblDrug.getValueAt(i, 0).toString();
            d.getOSDirectory().addOS().setOperatingSystemName(s);
            String t = tblDrug.getValueAt(i, 1).toString();
            d.getRawMaterialList().addRawMaterialList().setMaterialName(t);
        }
        JOptionPane.showMessageDialog(null,"New GPU is added succesfully");
        log.debug(userAccount+" "+"added new GPU"+" "+gpuName);
    }//GEN-LAST:event_btnNewDrugActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ResultsJPanel dwjp = (ResultsJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNewDrug;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tblDrug;
    private javax.swing.JTextField txtNameDrug;
    private javax.swing.JTextField txtNamePatient;
    // End of variables declaration//GEN-END:variables
}
