package UserInterface.SupplierRole;

import Business.Product;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class SearchResultJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Product product;
    public SearchResultJPanel(JPanel upc, Product p) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        txtName.setText(p.getProdName());
        txtId.setText(String.valueOf(p.getModelNumber()));
        targetPriceTxtField.setText(String.valueOf(p.getTargetPrice()));
        floorPriceTxtField.setText(String.valueOf(p.getFloorPrice()));
        ceilPriceTxtField.setText(String.valueOf(p.getCeilPrice()));
        availTxtField.setText(String.valueOf(p.getAvail()));
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        targetPriceTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ceilPriceTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        availTxtField = new javax.swing.JTextField();
        floorPriceTxtField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Product Detail");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 30));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 159, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUpdate.setText("Update Product");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 176, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 159, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Target Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, 30));

        targetPriceTxtField.setEditable(false);
        targetPriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(targetPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Product Ceil Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, 30));

        ceilPriceTxtField.setEditable(false);
        ceilPriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(ceilPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Product Availability:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 30));

        availTxtField.setEditable(false);
        availTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(availTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 160, 30));

        floorPriceTxtField.setEditable(false);
        floorPriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(floorPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Product Floor Price:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 170, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        //txtId.setEditable(true);
        txtName.setEditable(true);
        txtId.setEditable(true);
        targetPriceTxtField.setEditable(true);
        availTxtField.setEditable(true);
        ceilPriceTxtField.setEditable(true);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

      private void backAction() {
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        product.setTargetPrice(Integer.parseInt(targetPriceTxtField.getText()));
        product.setFloorPrice(Integer.parseInt(availTxtField.getText()));
        product.setCeilPrice(Integer.parseInt(ceilPriceTxtField.getText()));
        product.setModelNumber(Integer.parseInt(txtId.getText()));
        product.setProdName(txtName.getText());
    }//GEN-LAST:event_btnSaveActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availTxtField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField ceilPriceTxtField;
    private javax.swing.JTextField floorPriceTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField targetPriceTxtField;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
