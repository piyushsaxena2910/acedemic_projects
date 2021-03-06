/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CarOwnerRole;

import Business.CarOwner.CarOwner;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CarOwnerOrganization;
import Business.TravelSeeker.TravelSeeker;
import Business.Traveller.Traveller;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Piyush
 */
public class CarOwnerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CarOwnerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private CarOwnerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public CarOwnerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, CarOwnerOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        disableButtonLogic();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carDetailsBTN = new javax.swing.JButton();
        checkCarRequestsBTN = new javax.swing.JButton();
        checkTravellersInCarBTN = new javax.swing.JButton();
        setBillingPreferenceBTN = new javax.swing.JButton();

        carDetailsBTN.setText("Enter Car Details");
        carDetailsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carDetailsBTNActionPerformed(evt);
            }
        });

        checkCarRequestsBTN.setText("Check if You have any Requests");
        checkCarRequestsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCarRequestsBTNActionPerformed(evt);
            }
        });

        checkTravellersInCarBTN.setText("Check Travellers in Your Car");
        checkTravellersInCarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTravellersInCarBTNActionPerformed(evt);
            }
        });

        setBillingPreferenceBTN.setText("Set Your Billing Preference");
        setBillingPreferenceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBillingPreferenceBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(checkCarRequestsBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(carDetailsBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(setBillingPreferenceBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(checkTravellersInCarBTN)))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(carDetailsBTN)
                .addGap(32, 32, 32)
                .addComponent(setBillingPreferenceBTN)
                .addGap(41, 41, 41)
                .addComponent(checkCarRequestsBTN)
                .addGap(38, 38, 38)
                .addComponent(checkTravellersInCarBTN)
                .addGap(78, 78, 78))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void carDetailsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carDetailsBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CarDetailsJPanel", new CarDetailsJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_carDetailsBTNActionPerformed

    private void checkCarRequestsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCarRequestsBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ProcessWorkRequestJPanel", new ProcessWorkRequestJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkCarRequestsBTNActionPerformed

    private void checkTravellersInCarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTravellersInCarBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CheckTravellersInCar", new CheckTravellersInCar(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkTravellersInCarBTNActionPerformed

    private void setBillingPreferenceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBillingPreferenceBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("BillingPreferenceJPanel", new BillingPreferenceJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_setBillingPreferenceBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carDetailsBTN;
    private javax.swing.JButton checkCarRequestsBTN;
    private javax.swing.JButton checkTravellersInCarBTN;
    private javax.swing.JButton setBillingPreferenceBTN;
    // End of variables declaration//GEN-END:variables

public void disableButtonLogic() {
        try{
        CarOwner co = (CarOwner)this.userAccount.getTraveller();
        
        if(co.getCar()==null || co.getBasePricePerHour() == 0){
            checkCarRequestsBTN.setEnabled(false);
            checkTravellersInCarBTN.setEnabled(false);
            setBillingPreferenceBTN.setEnabled(true);
        }
        else{
            checkCarRequestsBTN.setEnabled(true);
            checkTravellersInCarBTN.setEnabled(true);
            setBillingPreferenceBTN.setEnabled(true);
        }
        }
        catch(Exception e){
           checkCarRequestsBTN.setEnabled(false);
           checkTravellersInCarBTN.setEnabled(false);
           setBillingPreferenceBTN.setEnabled(false);
    }
    }

}
