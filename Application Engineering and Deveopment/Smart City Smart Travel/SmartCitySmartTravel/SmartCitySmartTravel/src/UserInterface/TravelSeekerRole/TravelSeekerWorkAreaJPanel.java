/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelSeekerRole;

import Business.Car.Car;
import Business.CarOwner.CarOwner;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CarOwnerOrganization;
import Business.Organization.Organization;
import Business.Organization.TravelSeekerOrganization;
import Business.TravelSeeker.TravelSeeker;
import Business.Traveller.Traveller;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CarPoolWorkRequest;
import Business.WorkQueue.CarUnlockWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Piyush
 */
public class TravelSeekerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelSeekerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private TravelSeekerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public TravelSeekerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, TravelSeekerOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
        disableButtonLogic();
        addCarPoolRequestToUserAccountWorkQueue();
        populateCarYouAreTravellingWithTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestACarBTN = new javax.swing.JButton();
        checkCarPoolOptionsBTN = new javax.swing.JButton();
        enterDetailsBTN = new javax.swing.JButton();
        addTravelSeekersForCarPoolOptionsBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        carsYouAreTravellingInJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        drivingDirectionsAndCheckoutBTN = new javax.swing.JButton();

        requestACarBTN.setText("Request a Car");
        requestACarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestACarBTNActionPerformed(evt);
            }
        });

        checkCarPoolOptionsBTN.setText("Check Car Pool Options");
        checkCarPoolOptionsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCarPoolOptionsBTNActionPerformed(evt);
            }
        });

        enterDetailsBTN.setText("Enter your Details");
        enterDetailsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterDetailsBTNActionPerformed(evt);
            }
        });

        addTravelSeekersForCarPoolOptionsBTN.setText("Add Travel Seekers for Car Pool");
        addTravelSeekersForCarPoolOptionsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTravelSeekersForCarPoolOptionsBTNActionPerformed(evt);
            }
        });

        carsYouAreTravellingInJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Car Owner Name", "Car Model You are In", "Seats Vacant in the Car", "Car Unlocked/Car Pooled"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(carsYouAreTravellingInJTable);
        if (carsYouAreTravellingInJTable.getColumnModel().getColumnCount() > 0) {
            carsYouAreTravellingInJTable.getColumnModel().getColumn(0).setResizable(false);
            carsYouAreTravellingInJTable.getColumnModel().getColumn(1).setResizable(false);
            carsYouAreTravellingInJTable.getColumnModel().getColumn(2).setResizable(false);
            carsYouAreTravellingInJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Car You are Currently Travelling With : ");

        drivingDirectionsAndCheckoutBTN.setText("Driving Directions and Checkout");
        drivingDirectionsAndCheckoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drivingDirectionsAndCheckoutBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(enterDetailsBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(drivingDirectionsAndCheckoutBTN)))
                .addGap(608, 608, 608))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkCarPoolOptionsBTN)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(addTravelSeekersForCarPoolOptionsBTN)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(requestACarBTN)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(enterDetailsBTN)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestACarBTN)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(checkCarPoolOptionsBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(addTravelSeekersForCarPoolOptionsBTN)
                .addGap(18, 18, 18)
                .addComponent(drivingDirectionsAndCheckoutBTN)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestACarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestACarBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("TravelSeekerRequestACarJPanel", new TravelSeekerRequestACarJPanel(userProcessContainer, userAccount, organization, enterprise, this));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_requestACarBTNActionPerformed

    private void checkCarPoolOptionsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCarPoolOptionsBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("TravelSeekerCarPoolJPanel", new TravelSeekerCarPoolJPanel(userProcessContainer, userAccount, organization, enterprise, this));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkCarPoolOptionsBTNActionPerformed

    private void enterDetailsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterDetailsBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("TravelSeekerDetailsJPanel", new TravelSeekerDetailsJPanel(userProcessContainer, userAccount, organization, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_enterDetailsBTNActionPerformed

    private void addTravelSeekersForCarPoolOptionsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTravelSeekersForCarPoolOptionsBTNActionPerformed
        
        int counter = 0;
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            
                counter++;
            if(((CarPoolWorkRequest)request).getTravellerWithCar()==this.userAccount.getTraveller()){
                Traveller t = this.userAccount.getTraveller();
                TravelSeeker ts = (TravelSeeker)t;
                Car car = ts.getCar();
                if(request.getStatus()==null){
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    userProcessContainer.add("AddTravelSeekersToCarPoolJPanel", new AddTravelSeekersToCarPoolJPanel(userProcessContainer, userAccount, organization, enterprise, this));
                    layout.next(userProcessContainer);
                    break;
                }
                else if(request.getStatus().equals("Completed") && counter == organization.getWorkQueue().getWorkRequestList().size()){
                    JOptionPane.showMessageDialog(null, "You Don't have any Messages for Car Pool yet!");
                    break;
                }
                else if(car.getCapacity()==0){
                    JOptionPane.showMessageDialog(null, "Car is full, can't add more Travellers!");
                }
                else{
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    userProcessContainer.add("AddTravelSeekersToCarPoolJPanel", new AddTravelSeekersToCarPoolJPanel(userProcessContainer, userAccount, organization, enterprise, this));
                    layout.next(userProcessContainer);
        }
            
            }
        }
    }//GEN-LAST:event_addTravelSeekersForCarPoolOptionsBTNActionPerformed

    private void drivingDirectionsAndCheckoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drivingDirectionsAndCheckoutBTNActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("DrivingDirectionsAndCheckoutJPanel", new DrivingDirectionsAndCheckoutJPanel(userProcessContainer, userAccount, organization, enterprise,  this));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_drivingDirectionsAndCheckoutBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTravelSeekersForCarPoolOptionsBTN;
    private javax.swing.JTable carsYouAreTravellingInJTable;
    private javax.swing.JButton checkCarPoolOptionsBTN;
    private javax.swing.JButton drivingDirectionsAndCheckoutBTN;
    private javax.swing.JButton enterDetailsBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestACarBTN;
    // End of variables declaration//GEN-END:variables

    public void disableButtonLogic() {
        
        Traveller t = this.userAccount.getTraveller();
        TravelSeeker ts = (TravelSeeker)t;
        if(ts.getCarNeededFrom()!=0){
        boolean isCarUnlocker = false;
        boolean isCarPooler = false;
        boolean hasCarPoolOptions = false;
        boolean isNeitherCarPoolerNorCarUnlocker = false;
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(org instanceof TravelSeekerOrganization){
                for(WorkRequest req : org.getWorkQueue().getWorkRequestList()){
                    if(req.getReceiver()==this.userAccount && req.getSender()!=null){
                        hasCarPoolOptions = true;
                    }
                    else if(req.getReceiver()==this.userAccount && req.getSender()==null){
                        isCarUnlocker = true;
                        break;
                    }
                    else if(req.getSender()==this.userAccount){
                        isCarPooler = true;
                        break;
                    }
                    else
                        isNeitherCarPoolerNorCarUnlocker = true;
                    break;
                }
            }
        }
        if(hasCarPoolOptions){
            addTravelSeekersForCarPoolOptionsBTN.setEnabled(true);
            checkCarPoolOptionsBTN.setEnabled(false);
            requestACarBTN.setEnabled(false);
            drivingDirectionsAndCheckoutBTN.setEnabled(true);
        }
        else if(isCarPooler){
            addTravelSeekersForCarPoolOptionsBTN.setEnabled(false);
            checkCarPoolOptionsBTN.setEnabled(false);
            requestACarBTN.setEnabled(false);
            drivingDirectionsAndCheckoutBTN.setEnabled(false);
        }
        else if(isCarUnlocker){
            addTravelSeekersForCarPoolOptionsBTN.setEnabled(false);
            checkCarPoolOptionsBTN.setEnabled(false);
            requestACarBTN.setEnabled(false);
            drivingDirectionsAndCheckoutBTN.setEnabled(true);
        }
        else{
            addTravelSeekersForCarPoolOptionsBTN.setEnabled(false);
            checkCarPoolOptionsBTN.setEnabled(true);
            requestACarBTN.setEnabled(true);
            drivingDirectionsAndCheckoutBTN.setEnabled(false);
        }
        }
        
        else{
           checkCarPoolOptionsBTN.setEnabled(false);
           addTravelSeekersForCarPoolOptionsBTN.setEnabled(false);
           requestACarBTN.setEnabled(false);
           drivingDirectionsAndCheckoutBTN.setEnabled(false);
                }
    
    }
    
    public void addCarPoolRequestToUserAccountWorkQueue() {
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof TravelSeekerOrganization){
                org = organization;
                break;
            }
        }
        
        for(WorkRequest request : org.getWorkQueue().getWorkRequestList()){
            if(request instanceof CarPoolWorkRequest){
            if(((CarPoolWorkRequest)request).getReceiver()==this.userAccount){
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            }
        }
    }

    public void populateCarYouAreTravellingWithTable() {
        DefaultTableModel model = (DefaultTableModel)carsYouAreTravellingInJTable.getModel();
        model.setRowCount(0);
        for(Organization organ : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(organ instanceof TravelSeekerOrganization){
        
        for(WorkRequest request : organ.getWorkQueue().getWorkRequestList()){
            if(request instanceof CarPoolWorkRequest){
            if(((CarPoolWorkRequest)request).getTravellerWithoutCar()==this.userAccount.getTraveller()){
                Traveller t = this.userAccount.getTraveller();
                TravelSeeker ts = (TravelSeeker)t;
                Traveller travellerWithCar = request.getReceiver().getTraveller();
                TravelSeeker travelSeekerWithCar = (TravelSeeker)travellerWithCar;
                Car car = travelSeekerWithCar.getCar();
                CarOwner carOwnerFound = null;
                Traveller travellerCarOwner = null;
                for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if(org instanceof CarOwnerOrganization){
                        for(Traveller tr : org.getTravellerDirectory().getTravellerList()){
                            CarOwner co = (CarOwner)tr;
                                if(car==co.getCar()){
                                    carOwnerFound = co;
                                    travellerCarOwner = tr;
                                    break;
                                }
                            
                    }
                }
                    }
                if(request.getStatus().equals("Completed")){
                Object[] row = new Object[4];
                row[0] = travellerCarOwner == null ? "Waiting" : travellerCarOwner;
                row[1] = car.getModel() == null ? "Waiting" : travellerCarOwner;
                row[2] = car.getCapacity();
                row[3] = "Car Pooled";
                model.addRow(row);
                }
                else{
                Object[] row = new Object[4];
                row[0] = travellerCarOwner;
                row[1] = "Waiting";
                row[2] = "Waiting";
                row[3] = "Car Pooled Request Sent";
                model.addRow(row);                
                }
                }
            }
            }
        }
            
        else if(organ instanceof CarOwnerOrganization){
            for(WorkRequest request : organ.getWorkQueue().getWorkRequestList()){
        
            if(request instanceof CarUnlockWorkRequest){
                if(((CarUnlockWorkRequest)request).getSender()==this.userAccount){
                Traveller t = this.userAccount.getTraveller();
                TravelSeeker ts = (TravelSeeker)t;
                Traveller travellerWithCar = request.getReceiver().getTraveller();
                CarOwner carOwnerFound = (CarOwner)travellerWithCar;
                Car car = carOwnerFound.getCar();
                
                if(request.getStatus().equals("Completed")){
                Object[] row = new Object[4];
                row[0] = travellerWithCar == null ? "Waiting" : travellerWithCar;
                row[1] = car.getModel() == null ? "Waiting" : car.getModel();
                row[2] = car.getCapacity();
                row[3] = "Car Unlocked";
                model.addRow(row);
                }
                else{
                Object[] row = new Object[4];
                row[0] = travellerWithCar;
                row[1] = "Waiting";
                row[2] = "Waiting";
                row[3] = "Car Unlock Request Sent";
                model.addRow(row);                
                }
            }
            }
            }
        }
        }
    }
}
    

