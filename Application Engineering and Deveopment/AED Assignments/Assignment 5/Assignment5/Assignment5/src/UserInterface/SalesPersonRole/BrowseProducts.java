/*
 * BrowseProducts.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package UserInterface.SalesPersonRole;

import Business.Customer;
import Business.CustomerCatalog;
import Business.MasterOrderCatalog;
import Business.Order;
import Business.OrderItem;
import Business.Product;
import Business.SalesPerson;
import Business.Supplier;
import Business.SupplierDirectory;
import com.sun.org.apache.xalan.internal.xsltc.dom.CurrentNodeListFilter;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rushabh
 */
public class BrowseProducts extends javax.swing.JPanel {
    
    
    private JPanel userProcessContainer;
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private SalesPerson salesPerson;
    private CustomerCatalog customerCatalog;
    private Order order;
    boolean isCheckedOut = false;

    /** Creates new form BrowseProducts */
    public BrowseProducts(JPanel upc, SupplierDirectory sd, MasterOrderCatalog moc,SalesPerson salesPerson, CustomerCatalog customerCatalog) {
        initComponents();
        userProcessContainer = upc;
        supplierDirectory = sd;
        masterOrderCatalog = moc;
        this.customerCatalog = customerCatalog;
        this.salesPerson = salesPerson;
        populateSupplierCombo();
        populateCustomerombo();
      
    }
    
    public void populateSupplierCombo(){
        suppComboBox1.removeAllItems();
        for(Supplier supplier : supplierDirectory.getSupplierlist()){
            suppComboBox1.addItem(supplier);
        }
        populateProductTable();
        
        if(!isCheckedOut){
            order = new Order();
        }
    }
    
    private void populateCustomerombo() {
    customerComboBox.removeAllItems();
        for(Customer customer :customerCatalog.getCustomerList()){
            customerComboBox.addItem(customer);
        }
    }

    private void populateProductTable(){
        
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        Supplier supplier = (Supplier)suppComboBox1.getSelectedItem();
        model.setRowCount(0);
        
        if(supplier != null){
            for(Product product : supplier.getProductCatalog().getProductcatalog()){
                Object[] row = new Object[6];
                row[0] = product;
                row[1] = product.getModelNumber();
                row[2] = product.getTargetPrice();
                row[3] = product.getFloorPrice();
                row[4] = product.getCeilPrice();
                row[5] = product.getAvail();
                model.addRow(row);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        suppComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        viewProdjButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addtoCartButton6 = new javax.swing.JButton();
        quantitySpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        btnViewOrderItem = new javax.swing.JButton();
        btnModifyQuantity = new javax.swing.JButton();
        btnRemoveOrderItem = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        txtNewQuantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        customerComboBox = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 511));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Product Id", "Target Price", "Floor Price", "Ceil Price", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
            productTable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 590, 100));

        suppComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppComboBox1ActionPerformed(evt);
            }
        });
        add(suppComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Supplier");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 110, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Supplier Product Catalog");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 90, -1));

        viewProdjButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viewProdjButton2.setText("View Product Detail");
        viewProdjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProdjButton2ActionPerformed(evt);
            }
        });
        add(viewProdjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Vijaya", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SalesPersonRole/bestbuy.gif"))); // NOI18N
        jLabel4.setText("Welcome To Please Buy !");
        jLabel4.setIconTextGap(7);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 223, 1580, 460));

        addtoCartButton6.setText("ADD TO CART");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });
        add(addtoCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        jLabel6.setText("Sales Price");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 40, -1));

        jLabel7.setText("Item in cart");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity", "Total Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(orderTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 580, 110));

        btnViewOrderItem.setText("View Item");
        btnViewOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderItemActionPerformed(evt);
            }
        });
        add(btnViewOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        btnModifyQuantity.setText("Modify Quantity");
        btnModifyQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyQuantityActionPerformed(evt);
            }
        });
        add(btnModifyQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, -1, -1));

        btnRemoveOrderItem.setText("Remove");
        btnRemoveOrderItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveOrderItemActionPerformed(evt);
            }
        });
        add(btnRemoveOrderItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, -1));

        btnCheckOut.setText("Check out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        add(btnCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));
        add(txtNewQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Customer");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 110, 30));

        customerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerComboBoxActionPerformed(evt);
            }
        });
        add(customerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void suppComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppComboBox1ActionPerformed
        // TODO add your handling code here:
        populateProductTable();
    }//GEN-LAST:event_suppComboBox1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if(order.getOrderItemList().size() > 0){
            ArrayList<OrderItem> orderList = order.getOrderItemList();
            for(OrderItem oi : orderList){
                Product p = oi.getProduct();
                p.setAvail(oi.getQuantity() + p.getAvail());
            }
            order.getOrderItemList().removeAll(orderList);
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void viewProdjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProdjButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewProdjButton2ActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = productTable.getSelectedRow();
        Product selectedProduct;
        int salesPrice = 0;
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "PLease select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            selectedProduct = (Product)productTable.getValueAt(selectedRow, 0);
            }
        
        try{
            salesPrice = Integer.parseInt(txtSalesPrice.getText());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please enter a valid sales price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(salesPrice < selectedProduct.getFloorPrice()){
             JOptionPane.showMessageDialog(this, "Sales price should be more than floor price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        else if(salesPrice > selectedProduct.getCeilPrice())
        {
            JOptionPane.showMessageDialog(this, "Sales price should be less than ceil price", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       int fetchedQuantity = (Integer)quantitySpinner.getValue();
       if(fetchedQuantity <= 0){
             JOptionPane.showMessageDialog(this, "Select at least one quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
       }
       else if(fetchedQuantity <= selectedProduct.getAvail()){
           boolean alreadyPresent = false;
           for(OrderItem orderItem : order.getOrderItemList()){
               if(orderItem.getProduct() == selectedProduct){
                   int oldAvail = selectedProduct.getAvail();
                   int newAvail = oldAvail - fetchedQuantity;
                   selectedProduct.setAvail(newAvail);
                   orderItem.setQuantity(fetchedQuantity + orderItem.getQuantity());  //fetched quantity + old quantity
                   alreadyPresent = true;   //setting it true so that the next if doesn't get executed
                   refreshOrderTable();
                   populateProductTable();
                   break;
               }
           }
               if(!alreadyPresent){
                   int oldAvail = selectedProduct.getAvail();
                   int newAvail = oldAvail - fetchedQuantity;
                   selectedProduct.setAvail(newAvail);
                   order.addOrderItem(selectedProduct, fetchedQuantity, salesPrice);
                   refreshOrderTable();
                   populateProductTable();
                }
               else
                   JOptionPane.showMessageDialog(this, "Quantity > Availability", "Warning", JOptionPane.WARNING_MESSAGE);
           }
    } 
          public void refreshOrderTable(){
           
           DefaultTableModel model = (DefaultTableModel)orderTable.getModel();
           model.setRowCount(0);
           
           for(OrderItem oi : order.getOrderItemList()){
               Object row[] = new Object[4];
               row[0] = oi;
               row[1] = oi.getSalesPrice();
               row[2] = oi.getQuantity();
               row[3] = oi.getSalesPrice()*oi.getQuantity();
               model.addRow(row);
           }
    

    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        // TODO add your handling code here:
        
        if(order.getOrderItemList().size() > 0){
            masterOrderCatalog.addOrder(order);
            order.setSalesPerson(salesPerson);
            isCheckedOut = true;
            JOptionPane.showMessageDialog(null, "Order added successfully.");
            order = new Order();
            Customer customer = (Customer)customerComboBox.getSelectedItem();
            order.setCustomer(customer);
        int currentNoOfUnitsSold = 0;
        int rowCount = orderTable.getRowCount();
        Integer[] quantity = new Integer[rowCount];
        for(int i=0;i<orderTable.getRowCount();i++){
            quantity[i] = Integer.parseInt(String.valueOf(orderTable.getValueAt(i,2)));
        }
        
        for(int j = 0; j<quantity.length; j++){
            currentNoOfUnitsSold = salesPerson.getNumberOfProductsSold()+quantity[j];
            salesPerson.setNumberOfProductsSold(currentNoOfUnitsSold);
        }
        
       

            refreshOrderTable();
            populateProductTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "Order could not be completed as there are no items.");
        }
       
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnModifyQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyQuantityActionPerformed
        // TODO add your handling code here:
        
        //changes the value in the modify table. Does not add the two values. Refer Alibaba website
        
        int selectedRow = orderTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!txtNewQuantity.getText().isEmpty() && !txtNewQuantity.getText().equals("0")){
            OrderItem orderItem = (OrderItem)orderTable.getValueAt(selectedRow, 0);
            int currentAvail = orderItem.getProduct().getAvail();  //80
            int oldQty = orderItem.getQuantity();  //20
            int newQty = Integer.parseInt(txtNewQuantity.getText()); //85
            if(newQty > (currentAvail + oldQty)){ //85>100
                JOptionPane.showMessageDialog(this, "Quantity is more than the availability");
                return;
            }
            else{
                if(newQty <= 0){
                    JOptionPane.showMessageDialog(this, "Invalid quantity");
                    return;
                }
                orderItem.setQuantity(newQty); //85
                orderItem.getProduct().setAvail(currentAvail + (oldQty - newQty)); //80+(20-85)
                refreshOrderTable();
                populateProductTable();
            }
        } else
            JOptionPane.showMessageDialog(null, "Quantity cannot be zero");
        
        
    }//GEN-LAST:event_btnModifyQuantityActionPerformed

    private void btnRemoveOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveOrderItemActionPerformed

        int selectedRowCount = orderTable.getSelectedRowCount();
        if(selectedRowCount < 0){
             JOptionPane.showMessageDialog(this, "Select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int row = orderTable.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Failed to retrieve selected row");
            return;
        }
        OrderItem oi = (OrderItem)orderTable.getValueAt(row, 0);
        int oldQuantity = oi.getProduct().getAvail(); //1
        int orderQuantity = oi.getQuantity(); //99
        int newQuantity = oldQuantity + orderQuantity; //100
        oi.getProduct().setAvail(newQuantity);
        order.removeOrderItem(oi);
        JOptionPane.showMessageDialog(this, "The order of " + orderQuantity + " of " + oi + " has been removed.", "Warning", JOptionPane.WARNING_MESSAGE);
        refreshOrderTable();
        populateProductTable();
            
    }//GEN-LAST:event_btnRemoveOrderItemActionPerformed

    private void btnViewOrderItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderItemActionPerformed
        
    }//GEN-LAST:event_btnViewOrderItemActionPerformed

    private void customerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerComboBoxActionPerformed
    //populateCustomerombo();
    }//GEN-LAST:event_customerComboBoxActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnModifyQuantity;
    private javax.swing.JButton btnRemoveOrderItem;
    private javax.swing.JButton btnViewOrderItem;
    private javax.swing.JComboBox customerComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable orderTable;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox suppComboBox1;
    private javax.swing.JTextField txtNewQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JButton viewProdjButton2;
    // End of variables declaration//GEN-END:variables

    
}