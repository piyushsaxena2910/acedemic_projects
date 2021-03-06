/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SalesPersonRole;

import Business.Customer;
import Business.CustomerCatalog;
import Business.Product;
import Business.SalesPerson;
import UserInterface.AdminstrativeRole.ViewSalesPerson;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Piyush
 */
public class ManageCustomerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private CustomerCatalog customerCatalog;
    public ManageCustomerJPanel(JPanel userProcessContainer, CustomerCatalog customerCatalog) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customerCatalog = customerCatalog;
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

        backBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        createCustomerBTN = new javax.swing.JButton();
        vewCustomerBTN = new javax.swing.JButton();

        backBTN.setText("Back");

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Customer First Name", "Customer Last Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTable);
        if (customerTable.getColumnModel().getColumnCount() > 0) {
            customerTable.getColumnModel().getColumn(0).setResizable(false);
            customerTable.getColumnModel().getColumn(1).setResizable(false);
            customerTable.getColumnModel().getColumn(2).setResizable(false);
        }

        createCustomerBTN.setText("Create Customer");
        createCustomerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerBTNActionPerformed(evt);
            }
        });

        vewCustomerBTN.setText("View Customer");
        vewCustomerBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vewCustomerBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(backBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(vewCustomerBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createCustomerBTN)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCustomerBTN)
                    .addComponent(vewCustomerBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(backBTN)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void vewCustomerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vewCustomerBTNActionPerformed
        int row = customerTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer c = (Customer)customerTable.getValueAt(row,0);
        ViewCustomerJPanel vs = new ViewCustomerJPanel(userProcessContainer, c);
        userProcessContainer.add("ViewSupplier", vs);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_vewCustomerBTNActionPerformed

    private void createCustomerBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerBTNActionPerformed
        CreateCustomerJPanel ccp = new CreateCustomerJPanel(userProcessContainer, customerCatalog);
        userProcessContainer.add("ManageProductCatalogJPanel", ccp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createCustomerBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton createCustomerBTN;
    private javax.swing.JTable customerTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton vewCustomerBTN;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
    int rowCount = customerTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Customer c : customerCatalog.getCustomerList()) {
            Object row[] = new Object[3];
            row[0] = c;
            row[1] = c.getFirstName();
            row[2] = c.getLastName();
            model.addRow(row);
        }
    }
}
