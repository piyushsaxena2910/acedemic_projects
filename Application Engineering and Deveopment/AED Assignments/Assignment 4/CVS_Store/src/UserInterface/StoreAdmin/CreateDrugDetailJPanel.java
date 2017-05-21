/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.StoreAdmin;

import Business.CVSStore;
import Business.Drug;
import Business.InitializationFile;
import Business.Inventory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Piyush
 */
public class CreateDrugDetailJPanel extends javax.swing.JPanel {

    private CVSStore cvsStore;
    private JPanel userProcessContainer;
    ManageDrugCatalogJPanel mdc;
    public CreateDrugDetailJPanel(CVSStore cvsStore, JPanel userProcessContainer,ManageDrugCatalogJPanel mdc) {
        initComponents();
        this.cvsStore = cvsStore;
        this.userProcessContainer = userProcessContainer;
        this.mdc = mdc;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        drugNameTxtField = new javax.swing.JTextField();
        drugSerialNumberTxtField = new javax.swing.JTextField();
        drugWeightTxtField = new javax.swing.JTextField();
        drugManufacturerTxtField = new javax.swing.JTextField();
        drugQuantityTxtField = new javax.swing.JTextField();
        drugDateManufacturedTxtField = new javax.swing.JTextField();
        drugExpirationDateTxtField = new javax.swing.JTextField();
        drugPatientFactorTxtField = new javax.swing.JTextField();
        drugListPriceTxtField = new javax.swing.JTextField();
        drugDosageFormTxtField = new javax.swing.JTextField();
        creteDrugBTN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Drug Name");

        jLabel2.setText("Drug Serial Number");

        jLabel3.setText("Drug Manufacturer");

        jLabel4.setText("Weight");

        jLabel5.setText("Quantity");

        jLabel6.setText("Date  Manufactured");

        jLabel7.setText("Expiration Date");

        jLabel8.setText("Patient Factor");

        jLabel9.setText("List Price");

        jLabel10.setText("Dosage Form");

        drugNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNameTxtFieldActionPerformed(evt);
            }
        });

        drugSerialNumberTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugSerialNumberTxtFieldActionPerformed(evt);
            }
        });

        drugWeightTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugWeightTxtFieldActionPerformed(evt);
            }
        });

        drugManufacturerTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugManufacturerTxtFieldActionPerformed(evt);
            }
        });

        drugQuantityTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugQuantityTxtFieldActionPerformed(evt);
            }
        });

        drugDateManufacturedTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugDateManufacturedTxtFieldActionPerformed(evt);
            }
        });

        drugExpirationDateTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugExpirationDateTxtFieldActionPerformed(evt);
            }
        });

        drugPatientFactorTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugPatientFactorTxtFieldActionPerformed(evt);
            }
        });

        drugListPriceTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugListPriceTxtFieldActionPerformed(evt);
            }
        });

        drugDosageFormTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugDosageFormTxtFieldActionPerformed(evt);
            }
        });

        creteDrugBTN.setText("Create Drug");
        creteDrugBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creteDrugBTNActionPerformed(evt);
            }
        });

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drugNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugListPriceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugPatientFactorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugExpirationDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugDateManufacturedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugWeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugManufacturerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugSerialNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drugDosageFormTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(67, 67, 67)
                .addComponent(creteDrugBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(drugNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(drugSerialNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(drugManufacturerTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(drugWeightTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(drugQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(drugDateManufacturedTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(drugExpirationDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(drugPatientFactorTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(drugListPriceTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(drugDosageFormTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creteDrugBTN)
                    .addComponent(jButton2)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void drugNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugNameTxtFieldActionPerformed

    private void drugSerialNumberTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugSerialNumberTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugSerialNumberTxtFieldActionPerformed

    private void drugWeightTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugWeightTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugWeightTxtFieldActionPerformed

    private void drugManufacturerTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugManufacturerTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugManufacturerTxtFieldActionPerformed

    private void drugQuantityTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugQuantityTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugQuantityTxtFieldActionPerformed

    private void drugDateManufacturedTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugDateManufacturedTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugDateManufacturedTxtFieldActionPerformed

    private void drugExpirationDateTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugExpirationDateTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugExpirationDateTxtFieldActionPerformed

    private void drugPatientFactorTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugPatientFactorTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugPatientFactorTxtFieldActionPerformed

    private void drugListPriceTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugListPriceTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugListPriceTxtFieldActionPerformed

    private void drugDosageFormTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugDosageFormTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugDosageFormTxtFieldActionPerformed

    private void creteDrugBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creteDrugBTNActionPerformed
    
    int counter = 0;
        
        
    if(cvsStore.getDrugCatalog().getDrugList().size()==0){    
    Drug drug = cvsStore.getDrugCatalog().addDrug();
    drug.setDrugName(drugNameTxtField.getText());
    drug.setDrugSerialNumber(Integer.parseInt(drugSerialNumberTxtField.getText()));
    drug.setDrugMnufacturer(drugManufacturerTxtField.getText());
    drug.setWeight(Integer.parseInt(drugWeightTxtField.getText()));
    drug.setQuantity(Integer.parseInt(drugQuantityTxtField.getText()));
    drug.setDateManufactured(drugDateManufacturedTxtField.getText());
    drug.setExpirationDate(drugExpirationDateTxtField.getText());
    drug.setPatientFactor(drugPatientFactorTxtField.getText());
    drug.setListPrice(Float.parseFloat(drugListPriceTxtField.getText()));
    drug.setDosageForm(drugDosageFormTxtField.getText());
    }
    
    else{
    for(int i = 0; i<cvsStore.getDrugCatalog().getDrugList().size(); i++){
        String expirationDateOnCreation = cvsStore.getDrugCatalog().getDrugList().get(i).getExpirationDate();
        int drugSerialNumberOnCreation = cvsStore.getDrugCatalog().getDrugList().get(i).getDrugSerialNumber();
        String drugName = cvsStore.getDrugCatalog().getDrugList().get(i).getDrugName();
        
        counter++;
        if(drugName.equals(drugNameTxtField.getText())&&expirationDateOnCreation.equals(drugExpirationDateTxtField.getText()) && drugSerialNumberOnCreation==Integer.parseInt(drugSerialNumberTxtField.getText()))
        {
            
            Inventory inv = new Inventory();
            int newQuantity = cvsStore.getDrugCatalog().getDrugList().get(i).getQuantity() + Integer.parseInt(drugQuantityTxtField.getText());
            if(drugNameTxtField.getText().equalsIgnoreCase("Crocin")){
                if(Integer.parseInt(drugQuantityTxtField.getText())<=inv.crocinQuantity){
            cvsStore.getDrugCatalog().getDrugList().get(i).setQuantity(newQuantity);
            inv.crocinQuantity = inv.crocinQuantity - Integer.parseInt(drugQuantityTxtField.getText());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Cannot add more stock. Drug is now out of stock");
                }
            }
            else if(drugNameTxtField.getText().equalsIgnoreCase("Disprin")){
                if(Integer.parseInt(drugQuantityTxtField.getText())<=inv.disprinQuantity){
            cvsStore.getDrugCatalog().getDrugList().get(i).setQuantity(newQuantity);
            inv.disprinQuantity = inv.disprinQuantity - Integer.parseInt(drugQuantityTxtField.getText());
            }
                else{
                    JOptionPane.showMessageDialog(null, "Cannot add more stock. Drug is now out of stock");
                }
            }
            else if(drugNameTxtField.getText().equalsIgnoreCase("Allegra")){
                if(Integer.parseInt(drugQuantityTxtField.getText())<=inv.allegraQuantity){
            cvsStore.getDrugCatalog().getDrugList().get(i).setQuantity(newQuantity);
            inv.allegraQuantity = inv.allegraQuantity - Integer.parseInt(drugQuantityTxtField.getText());  
            }
                else{
                    JOptionPane.showMessageDialog(null, "Cannot add more stock. Drug is now out of stock");
                }
            }
            else if(drugNameTxtField.getText().equalsIgnoreCase("Cetirizine")){
                if(Integer.parseInt(drugQuantityTxtField.getText())<=inv.cetirizineQuantity){
            cvsStore.getDrugCatalog().getDrugList().get(i).setQuantity(newQuantity);
            inv.cetirizineQuantity = inv.cetirizineQuantity - Integer.parseInt(drugQuantityTxtField.getText()); 
            }
                else{
                    JOptionPane.showMessageDialog(null, "Cannot add more stock. Drug is now out of stock");
                }
            }
            else if(drugNameTxtField.getText().equalsIgnoreCase("Cepacol")){
                if(Integer.parseInt(drugQuantityTxtField.getText())<=inv.cepacolQuantity){
            cvsStore.getDrugCatalog().getDrugList().get(i).setQuantity(newQuantity);
            inv.cepacolQuantity = inv.cepacolQuantity - Integer.parseInt(drugQuantityTxtField.getText()); 
            }
                else{
                    JOptionPane.showMessageDialog(null, "Cannot add more stock. Drug is now out of stock");
                }
            }
            return;
        }
    }    
    if(counter == cvsStore.getDrugCatalog().getDrugList().size())
    {
    
    Drug drug = cvsStore.getDrugCatalog().addDrug();
    drug.setDrugName(drugNameTxtField.getText());
    drug.setDrugSerialNumber(Integer.parseInt(drugSerialNumberTxtField.getText()));
    drug.setDrugMnufacturer(drugManufacturerTxtField.getText());
    drug.setWeight(Integer.parseInt(drugWeightTxtField.getText()));
    drug.setQuantity(Integer.parseInt(drugQuantityTxtField.getText()));
    drug.setDateManufactured(drugDateManufacturedTxtField.getText());
    drug.setExpirationDate(drugExpirationDateTxtField.getText());
    drug.setPatientFactor(drugPatientFactorTxtField.getText());
    drug.setListPrice(Float.parseFloat(drugListPriceTxtField.getText()));
    drug.setDosageForm(drugDosageFormTxtField.getText());
    }
    }
    
    
    }//GEN-LAST:event_creteDrugBTNActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    userProcessContainer.remove(this);
    mdc.populateTable();
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creteDrugBTN;
    private javax.swing.JTextField drugDateManufacturedTxtField;
    private javax.swing.JTextField drugDosageFormTxtField;
    private javax.swing.JTextField drugExpirationDateTxtField;
    private javax.swing.JTextField drugListPriceTxtField;
    private javax.swing.JTextField drugManufacturerTxtField;
    private javax.swing.JTextField drugNameTxtField;
    private javax.swing.JTextField drugPatientFactorTxtField;
    private javax.swing.JTextField drugQuantityTxtField;
    private javax.swing.JTextField drugSerialNumberTxtField;
    private javax.swing.JTextField drugWeightTxtField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
