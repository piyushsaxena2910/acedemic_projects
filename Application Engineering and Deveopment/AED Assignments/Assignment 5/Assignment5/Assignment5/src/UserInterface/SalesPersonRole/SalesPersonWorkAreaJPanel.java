/*
 * ProductManagerWorkAreaJPanel.java
 *
 * Created on October 3, 2008, 8:06 AM
 */
package UserInterface.SalesPersonRole;

import Business.CustomerCatalog;
import Business.MasterOrderCatalog;
import Business.SalesPerson;
import Business.SalesPersonDirectory;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;


/**
 *
 * @author Rushabh
 */
public class SalesPersonWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private SalesPerson salesPerson;
    private MasterOrderCatalog masterOrderCatalog;
    private CustomerCatalog customerCatalog;
    private SupplierDirectory supplierDirectory;
    /** Creates new form ProductManagerWorkAreaJPanel */
    public SalesPersonWorkAreaJPanel(JPanel upc, SalesPerson sp, MasterOrderCatalog moc, CustomerCatalog custCatalog, SupplierDirectory suppDirectory) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplierDirectory = suppDirectory;
        this.masterOrderCatalog = moc;
        this.customerCatalog = custCatalog;
        this.salesPerson = sp;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        createCustomer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        browseProductsBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("My Work Area (Sales Person Role)");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        createCustomer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createCustomer.setText("Manage Customer >>");
        createCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCustomerActionPerformed(evt);
            }
        });
        add(createCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SalesPersonRole/bestbuy.gif"))); // NOI18N
        jLabel2.setText("Welcome To XEROX!");
        jLabel2.setIconTextGap(7);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        browseProductsBTN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browseProductsBTN.setText("Browse Product Catalog >>");
        browseProductsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseProductsBTNActionPerformed(evt);
            }
        });
        add(browseProductsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void createCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCustomerActionPerformed
        // TODO add your handling code here:
        ManageCustomerJPanel bp = new ManageCustomerJPanel(userProcessContainer, customerCatalog);
        userProcessContainer.add("BrowseProducts", bp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);   
        
    }//GEN-LAST:event_createCustomerActionPerformed

    private void browseProductsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseProductsBTNActionPerformed
        BrowseProducts bp = new BrowseProducts(userProcessContainer, supplierDirectory, masterOrderCatalog, salesPerson, customerCatalog);
        userProcessContainer.add("BrowseProducts", bp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_browseProductsBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseProductsBTN;
    private javax.swing.JButton createCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
