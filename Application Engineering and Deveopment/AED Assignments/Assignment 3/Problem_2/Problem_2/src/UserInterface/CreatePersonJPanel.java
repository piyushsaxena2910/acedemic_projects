/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import BusinessLogic.FieldLevelValidation;
import BusinessLogic.Person;
import BusinessLogic.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Piyush
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    private PersonDirectory personDirectory;
    private JPanel userProcessContainer;
    public CreatePersonJPanel(PersonDirectory personDirectory, JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.personDirectory = personDirectory;
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
        personNameTxtField = new javax.swing.JTextField();
        personAgeTxtField = new javax.swing.JTextField();
        personIDTxtField = new javax.swing.JTextField();
        personGenderTxtField = new javax.swing.JTextField();
        createPersonBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        jLabel1.setText("Person Name");

        jLabel2.setText("Person Age");

        jLabel3.setText("Person ID");

        jLabel4.setText("Person Gender");

        createPersonBTN.setText("Create");
        createPersonBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonBTNActionPerformed(evt);
            }
        });

        backBTN.setText("<< Back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personGenderTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personAgeTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personIDTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personNameTxtField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(createPersonBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBTN)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(personNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(personAgeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(personIDTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(personGenderTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createPersonBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBTN)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonBTNActionPerformed
    FieldLevelValidation fieldLevelValidation = new FieldLevelValidation();
    
    int counter = 0;
    if(personIDTxtField.getText().trim().isEmpty()||
            personNameTxtField.getText().trim().isEmpty()||
                personAgeTxtField.getText().trim().isEmpty()||
                    personGenderTxtField.getText().trim().isEmpty())
    {
        JOptionPane.showMessageDialog(null, "One or More Fields are Blank!");
    }
    else{
       
        String personID = personIDTxtField.getText().trim();
    boolean isPersonIDValid = fieldLevelValidation.checkPersonIDField(personID);
    if(isPersonIDValid==true)
    {
        counter++;
    }
    else
        JOptionPane.showMessageDialog(null, "Person ID Invalid");
    
    String personName = personNameTxtField.getText().trim();
    boolean isPersonNameValid = fieldLevelValidation.checkPersonNameField(personName);
    if(isPersonNameValid==true)
    {
        counter++;
    }
    else
        JOptionPane.showMessageDialog(null, "Person Name Invalid");
    
    String personAge = personAgeTxtField.getText().trim();
    boolean isPersoAgeValid = fieldLevelValidation.checkPersonAgeField(personAge);
    if(isPersoAgeValid==true)
    {
        counter++;
    }
    else
        JOptionPane.showMessageDialog(null, "Person Age Invalid");
    
    String personGender = personGenderTxtField.getText().trim();
    boolean isPersoGenderValid = fieldLevelValidation.checkPersonGenderField(personGender);
    if(isPersoGenderValid==true)
    {
        counter++;
    }
    else
        JOptionPane.showMessageDialog(null, "Person Gender Invalid");
    }
    if(personDirectory.getPersonList().isEmpty()&&counter == 4){
        Person person = personDirectory.addPerson();
        person.setPersonID(Integer.parseInt(personIDTxtField.getText()));
        person.setPersonName(personNameTxtField.getText());
        person.setPersonAge(Integer.parseInt(personAgeTxtField.getText()));
        person.setPersonGender(personGenderTxtField.getText());
        JOptionPane.showMessageDialog(null, "Person Profile Created Successfully");
        resetFields();
    }
    else if(personDirectory.searchAccount(String.valueOf(personIDTxtField.getText()))==null&&counter == 4){
        Person person = personDirectory.addPerson();
        person.setPersonID(Integer.parseInt(personIDTxtField.getText()));
        person.setPersonName(personNameTxtField.getText());
        person.setPersonAge(Integer.parseInt(personAgeTxtField.getText()));
        person.setPersonGender(personGenderTxtField.getText());
        JOptionPane.showMessageDialog(null, "Person Profile Created Successfully");
        resetFields();    
    }
    else{
    JOptionPane.showMessageDialog(null, "Person Already Exists");  
    
    }
    
    }//GEN-LAST:event_createPersonBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
    userProcessContainer.remove(this);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBTN;
    private javax.swing.JButton createPersonBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField personAgeTxtField;
    private javax.swing.JTextField personGenderTxtField;
    private javax.swing.JTextField personIDTxtField;
    private javax.swing.JTextField personNameTxtField;
    // End of variables declaration//GEN-END:variables

    private void resetFields() {
    personIDTxtField.setText("");
    personNameTxtField.setText("");
    personAgeTxtField.setText("");
    personGenderTxtField.setText("");
    }
}