package UserInterface.SupplierRole;

import Business.Product;
import Business.Supplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Supplier supplier;
    public CreateNewProductJPanel(JPanel upc, Supplier s){
        initComponents();
        userProcessContainer = upc;
        supplier = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ceilPriceTxtField = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        targetPriceTxtField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        floorPriceTxtField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        availabilityTxtField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create New Product");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Product :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 100, 30));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Product Ceil Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 160, 30));

        ceilPriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(ceilPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 160, 30));

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Product Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, 30));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Product Target Price:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, 30));

        targetPriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(targetPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 160, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Product Floor Price:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 170, 30));

        floorPriceTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(floorPriceTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Product Availability:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 170, 30));

        availabilityTxtField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(availabilityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 160, 30));
    }// </editor-fold>//GEN-END:initComponents
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        Product p = supplier.getProductCatalog().addProduct();
        txtId.setText(String.valueOf(p.getModelNumber()));
        p.setProdName(txtName.getText());
        p.setTargetPrice(Integer.parseInt(targetPriceTxtField.getText()));
        p.setCeilPrice(Integer.parseInt(ceilPriceTxtField.getText()));
        p.setFloorPrice(Integer.parseInt(floorPriceTxtField.getText()));
        p.setAvail(Integer.parseInt(availabilityTxtField.getText()));
        JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availabilityTxtField;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField ceilPriceTxtField;
    private javax.swing.JTextField floorPriceTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField targetPriceTxtField;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
