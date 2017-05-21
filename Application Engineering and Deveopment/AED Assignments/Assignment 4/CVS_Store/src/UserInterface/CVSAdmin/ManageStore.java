/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CVSAdmin;

import Business.CVSStore;
import javax.swing.JPanel;
import Business.StoreDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Piyush
 */
public class ManageStore extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StoreDirectory storeDirectory;
    
    public ManageStore(StoreDirectory storeDirectory,JPanel userProcessContainer) {
        initComponents();
        this.storeDirectory = storeDirectory;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        storeTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddStore = new javax.swing.JButton();
        btnManageSuppliers1 = new javax.swing.JButton();

        jLabel1.setText("Manage Stores JPanel");

        storeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Store Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setText("View Store");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddStore.setText("Add Store");
        btnAddStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStoreActionPerformed(evt);
            }
        });

        btnManageSuppliers1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageSuppliers1.setText("View Inventory >>");
        btnManageSuppliers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnAddStore)
                        .addGap(181, 181, 181)
                        .addComponent(btnView))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(storeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnManageSuppliers1)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(storeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStore)
                    .addComponent(btnView))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnManageSuppliers1))
                .addGap(20, 20, 20))
        );

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        populateTable();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRow = storeTable.getSelectedRow();
        if(selectedRow>=0){
            CVSStore cvsStore = (CVSStore)storeTable.getValueAt(selectedRow, 0);
            ViewStore pane1 = new ViewStore(cvsStore,userProcessContainer);
            userProcessContainer.add("addStore",pane1);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select a Row from the Table");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAddStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStoreActionPerformed
        
        AddStore panel = new AddStore(storeDirectory,userProcessContainer,this);
        userProcessContainer.add("addStore",panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddStoreActionPerformed

    private void btnManageSuppliers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers1ActionPerformed
        int selectedRow = storeTable.getSelectedRow();
        if(selectedRow>=0){
            CVSStore cvsStore = (CVSStore)storeTable.getValueAt(selectedRow, 0);
        ViewInventoryLevel panel = new ViewInventoryLevel(cvsStore,userProcessContainer);
        userProcessContainer.add("ManageStore",panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Select a Row from the Table");
        }
    }//GEN-LAST:event_btnManageSuppliers1ActionPerformed

public void populateTable() {
    DefaultTableModel dtm = (DefaultTableModel)storeTable.getModel();
    dtm.setRowCount(0);
    for(CVSStore c : storeDirectory.getStoreList()){
        Object row [] = new Object[1];
        row[0] = c;
        dtm.addRow(row);
    }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStore;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnManageSuppliers1;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable storeTable;
    // End of variables declaration//GEN-END:variables
}
