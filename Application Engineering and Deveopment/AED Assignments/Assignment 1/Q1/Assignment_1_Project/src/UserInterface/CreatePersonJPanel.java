/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import BusinessLogic.PersonProfile;
import javax.swing.JOptionPane;

/**
 *
 * @author Piyush
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    private PersonProfile person;
    public CreatePersonJPanel(PersonProfile person) {
        initComponents();
        this.person = person;
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        personFirstNameTxtField = new javax.swing.JTextField();
        personLastNameTxtField = new javax.swing.JTextField();
        personMiddleNameTxtField = new javax.swing.JTextField();
        personDOBYearTxtField = new javax.swing.JTextField();
        personStreetAddressTxtField = new javax.swing.JTextField();
        personTownTxtField = new javax.swing.JTextField();
        personZIPCodeTxtField = new javax.swing.JTextField();
        personOccupationTxtField = new javax.swing.JTextField();
        personEmailTxtField = new javax.swing.JTextField();
        personAreaCodeTxtField = new javax.swing.JTextField();
        personPhoneNumberTxtField = new javax.swing.JTextField();
        createPerson = new javax.swing.JButton();
        personDOBDateTxtField = new javax.swing.JTextField();
        personDOBMonthTxtField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(503, 450));

        jLabel1.setText("Create Person Profile");

        jLabel2.setText("First Name");

        jLabel3.setText("Phone Number");

        jLabel4.setText("Last Name");

        jLabel5.setText("Middle Name");

        jLabel6.setText("Date Of Birth(YYYY/MM/DD)");

        jLabel7.setText("Street Address");

        jLabel8.setText("Town");

        jLabel9.setText("ZIP Code");

        jLabel10.setText("Occupation");

        jLabel11.setText("Email Address");

        jLabel12.setText("Area Code of Phone Number");

        personFirstNameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personFirstNameTxtFieldFocusLost(evt);
            }
        });
        personFirstNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personFirstNameTxtFieldActionPerformed(evt);
            }
        });

        personLastNameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personLastNameTxtFieldFocusLost(evt);
            }
        });

        personMiddleNameTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personMiddleNameTxtFieldFocusLost(evt);
            }
        });

        personDOBYearTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personDOBYearTxtFieldFocusLost(evt);
            }
        });

        personStreetAddressTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personStreetAddressTxtFieldFocusLost(evt);
            }
        });

        personTownTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personTownTxtFieldFocusLost(evt);
            }
        });

        personZIPCodeTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personZIPCodeTxtFieldFocusLost(evt);
            }
        });

        personOccupationTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personOccupationTxtFieldFocusLost(evt);
            }
        });

        personEmailTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personEmailTxtFieldFocusLost(evt);
            }
        });

        personAreaCodeTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personAreaCodeTxtFieldFocusLost(evt);
            }
        });

        personPhoneNumberTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personPhoneNumberTxtFieldFocusLost(evt);
            }
        });
        personPhoneNumberTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personPhoneNumberTxtFieldActionPerformed(evt);
            }
        });

        createPerson.setText("Create");
        createPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonActionPerformed(evt);
            }
        });

        personDOBDateTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personDOBDateTxtFieldFocusLost(evt);
            }
        });

        personDOBMonthTxtField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personDOBMonthTxtFieldFocusLost(evt);
            }
        });

        jLabel13.setText("/");

        jLabel14.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createPerson)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(personEmailTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personOccupationTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personZIPCodeTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personTownTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personStreetAddressTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personFirstNameTxtField)
                            .addComponent(personLastNameTxtField)
                            .addComponent(personMiddleNameTxtField)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(personDOBYearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(personDOBMonthTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(personDOBDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(personAreaCodeTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personPhoneNumberTxtField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(personFirstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(personLastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(personMiddleNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(personDOBYearTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(personDOBDateTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(personDOBMonthTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(personStreetAddressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(personTownTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(personZIPCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(personOccupationTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(personEmailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personAreaCodeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personPhoneNumberTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void personFirstNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personFirstNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personFirstNameTxtFieldActionPerformed

    private void personPhoneNumberTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personPhoneNumberTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personPhoneNumberTxtFieldActionPerformed

    private void createPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonActionPerformed
        
        person.setFirstName(personFirstNameTxtField.getText());
        
        if (personFirstNameTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The First Name cannot be Empty !!"); 
        }
        person.setLastName(personLastNameTxtField.getText());   
        if (personLastNameTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Last Name cannot be Empty !!");
        }
        person.setMiddleName(personMiddleNameTxtField.getText());
        if (personMiddleNameTxtField.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "The Middle Name cannot be Empty !!"); 
        }
        try
        {
            person.setDateOfBirthDay(Integer.parseInt(personDOBDateTxtField.getText()));
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "The DOB Date cannot be Empty !!");
        }
        
        try
        {
            person.setDateOfBirthMonth(Integer.parseInt(personDOBMonthTxtField.getText()));
        }
         catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "The DOB Month cannot be Empty !!");
        }
        
        try
        {
            person.setDateOfBirthYear(Integer.parseInt(personDOBYearTxtField.getText()));
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "The DOB Year cannot be Empty !!");
        }
        
        person.setStreetAdddress(personStreetAddressTxtField.getText());
        if (personStreetAddressTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Street Address cannot be Empty !!");
        }
        person.setTown(personTownTxtField.getText());
        if (personTownTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Address Town cannot be Empty !!");
        }
        person.setZipCode(personZIPCodeTxtField.getText());
        if (personZIPCodeTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Zip Code cannot be Empty !!");
        }
        person.setOccupation(personOccupationTxtField.getText());
        if (personOccupationTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Occupation cannot be Empty !!");
        }
        person.setEmailAddress(personEmailTxtField.getText());
        if (personEmailTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Email Address cannot be Empty !!");
        }
        person.setAreaCode(personAreaCodeTxtField.getText());
        if (personAreaCodeTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Area Code cannot be Empty !!");
        }
        person.setPhoneNumber(personPhoneNumberTxtField.getText());
        if (personPhoneNumberTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Phone Number cannot be Empty !!");
        }
    }//GEN-LAST:event_createPersonActionPerformed

    private void personFirstNameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personFirstNameTxtFieldFocusLost
        if(personFirstNameTxtField.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "The First Name cannot be Empty !!"); 
        }
        
    }//GEN-LAST:event_personFirstNameTxtFieldFocusLost

    private void personLastNameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personLastNameTxtFieldFocusLost
        if(personLastNameTxtField.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "The Last Name cannot be Empty !!"); 
        }
    }//GEN-LAST:event_personLastNameTxtFieldFocusLost

    private void personMiddleNameTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personMiddleNameTxtFieldFocusLost
        if(personMiddleNameTxtField.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "The Middle Name cannot be Empty !!"); 
        }
    }//GEN-LAST:event_personMiddleNameTxtFieldFocusLost

    private void personDOBYearTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personDOBYearTxtFieldFocusLost
        if(personDOBYearTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The DOB Year cannot be Empty !!"); 
            personDOBYearTxtField.setText("");
        }
        else if(1==1)
        {
        try
        {
            int DOBYearIntegerOnlyCheck = Integer.parseInt(personDOBYearTxtField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter only Numbers");
        }
        }
        else if(Integer.parseInt(personDOBYearTxtField.getText())>2015)
        {
           JOptionPane.showMessageDialog(null, "Invalid Year - Year should be less than or equal to 2015 !!"); 
           personDOBYearTxtField.setText("");
        }
        else if(Integer.parseInt(personDOBYearTxtField.getText())<1905)
        {
            JOptionPane.showMessageDialog(null, "Invalid Year - Year should be greater than or equal to 1905 !!"); 
            personDOBYearTxtField.setText("");
        }
        
    }//GEN-LAST:event_personDOBYearTxtFieldFocusLost

    private void personDOBMonthTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personDOBMonthTxtFieldFocusLost
        if(personDOBMonthTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The DOB Month cannot be Empty !!"); 
        }
        else if(1==1)
        {
        try
        {
            int DOBMonthIntegerOnlyCheck = Integer.parseInt(personDOBMonthTxtField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter only Numbers");
        }
        }
        else if(Integer.parseInt(personDOBMonthTxtField.getText())>12)
        {
           JOptionPane.showMessageDialog(null, "Invalid Month - Month should be less than or equal to 12 !!"); 
        }
        else if(Integer.parseInt(personDOBMonthTxtField.getText())<1)
        {
            JOptionPane.showMessageDialog(null, "Invalid Month - Month should be greater than or equal to 1 !!"); 
        }
        
    }//GEN-LAST:event_personDOBMonthTxtFieldFocusLost

    private void personDOBDateTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personDOBDateTxtFieldFocusLost
        if(personDOBDateTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The DOB Date cannot be Empty !!"); 
            personDOBDateTxtField.setText("");
        } 
        else if(1==1)
        {
            try
        {
            int DOBDateIntegerOnlyCheck = Integer.parseInt(personDOBDateTxtField.getText());
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please Enter only Numbers");
        }
        }
        else if(Integer.parseInt(personDOBDateTxtField.getText())>31)
        {
           JOptionPane.showMessageDialog(null, "Invalid Date - Date should be less than or Equal to 31 !!"); 
           personDOBDateTxtField.setText("");
        }
        else if(Integer.parseInt(personDOBDateTxtField.getText())<1)
        {
            JOptionPane.showMessageDialog(null, "Invalid Date - Date should be greater than or Equal to 1 !!"); 
            personDOBDateTxtField.setText("");
        }
           
    }//GEN-LAST:event_personDOBDateTxtFieldFocusLost

    private void personStreetAddressTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personStreetAddressTxtFieldFocusLost
       if(personStreetAddressTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Street Address cannot be Empty !!"); 
            personStreetAddressTxtField.setText("");
        }
    }//GEN-LAST:event_personStreetAddressTxtFieldFocusLost

    private void personTownTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personTownTxtFieldFocusLost
        if(personTownTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Town cannot be Empty !!"); 
            personTownTxtField.setText("");
        }
    }//GEN-LAST:event_personTownTxtFieldFocusLost

    private void personZIPCodeTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personZIPCodeTxtFieldFocusLost
        if(personZIPCodeTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The ZIP Code cannot be Empty !!"); 
            personZIPCodeTxtField.setText("");
        }
        else if(personZIPCodeTxtField.getText().length()!=5)
        {
            JOptionPane.showMessageDialog(null, "The ZIP Code should be of 5 numbers only!!"); 
            personZIPCodeTxtField.setText("");
        }
   
    }//GEN-LAST:event_personZIPCodeTxtFieldFocusLost

    private void personOccupationTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personOccupationTxtFieldFocusLost
        if(personOccupationTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Occupation cannot be Empty !!"); 
            personOccupationTxtField.setText("");
        }
    }//GEN-LAST:event_personOccupationTxtFieldFocusLost

    private void personEmailTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personEmailTxtFieldFocusLost
        if(personEmailTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Email ID cannot be Empty !!"); 
            personEmailTxtField.setText("");
        }
        else if(personEmailTxtField.getText().indexOf("@")<0 || personEmailTxtField.getText().indexOf(".")<0)
        {
            JOptionPane.showMessageDialog(null, "The Email ID is Invalid !!"); 
            personEmailTxtField.setText("");
        }
        
    }//GEN-LAST:event_personEmailTxtFieldFocusLost

    private void personAreaCodeTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personAreaCodeTxtFieldFocusLost
        if(personAreaCodeTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Area Code cannot be Empty !!"); 
            personAreaCodeTxtField.setText("");
        }
        
    }//GEN-LAST:event_personAreaCodeTxtFieldFocusLost

    private void personPhoneNumberTxtFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personPhoneNumberTxtFieldFocusLost
        if(personPhoneNumberTxtField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "The Phone Number cannot be Empty !!"); 
            personPhoneNumberTxtField.setText("");
        }
    }//GEN-LAST:event_personPhoneNumberTxtFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField personAreaCodeTxtField;
    private javax.swing.JTextField personDOBDateTxtField;
    private javax.swing.JTextField personDOBMonthTxtField;
    private javax.swing.JTextField personDOBYearTxtField;
    private javax.swing.JTextField personEmailTxtField;
    private javax.swing.JTextField personFirstNameTxtField;
    private javax.swing.JTextField personLastNameTxtField;
    private javax.swing.JTextField personMiddleNameTxtField;
    private javax.swing.JTextField personOccupationTxtField;
    private javax.swing.JTextField personPhoneNumberTxtField;
    private javax.swing.JTextField personStreetAddressTxtField;
    private javax.swing.JTextField personTownTxtField;
    private javax.swing.JTextField personZIPCodeTxtField;
    // End of variables declaration//GEN-END:variables
}
