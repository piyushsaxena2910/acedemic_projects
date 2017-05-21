package UserInterface.AdminstrativeRole;

import Business.SalesPersonDirectory;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Piyush
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private SalesPersonDirectory salesPersonDirectory;
    public AdminWorkAreaJPanel(JPanel userProcessContainer,SupplierDirectory supplierDirectory,SalesPersonDirectory salesPersonDirectory) {
        
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.supplierDirectory=supplierDirectory;
        this.salesPersonDirectory = salesPersonDirectory;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageSuppliers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageSuppliers1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageSuppliers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageSuppliers.setText("Manage Suppliers >>");
        btnManageSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliersActionPerformed(evt);
            }
        });
        add(btnManageSuppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 260, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area -Aminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnManageSuppliers1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnManageSuppliers1.setText("Manage Sales Person >>");
        btnManageSuppliers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSuppliers1ActionPerformed(evt);
            }
        });
        add(btnManageSuppliers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 260, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliersActionPerformed
    ManageSuppliers ms = new ManageSuppliers(userProcessContainer, supplierDirectory);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliersActionPerformed

    private void btnManageSuppliers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSuppliers1ActionPerformed
    ManageSalesPerson msp = new ManageSalesPerson(userProcessContainer, salesPersonDirectory);
    userProcessContainer.add("ManageCustomerAdministrative", msp);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageSuppliers1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageSuppliers;
    private javax.swing.JButton btnManageSuppliers1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
