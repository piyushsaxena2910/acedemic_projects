/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import BusinessLogic.Patient;
import BusinessLogic.Person;
import BusinessLogic.PersonDirectory;
import BusinessLogic.VitalSign;
import java.awt.CardLayout;

/**
 *
 * @author Piyush
 */
public class MainJFrame extends javax.swing.JFrame {

    private PersonDirectory personDirectory;
    private Patient patient;
    private Person person;
    private VitalSign vs;
    
    public MainJFrame() {
        initComponents();
        patient = new Patient();
        personDirectory = new PersonDirectory();
        person = new Person();
        vs = new VitalSign();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        personManagerBtn = new javax.swing.JButton();
        patientManagerBtn = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personManagerBtn.setText("Person Manager");
        personManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personManagerBtnActionPerformed(evt);
            }
        });

        patientManagerBtn.setText("Patient Manager");
        patientManagerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientManagerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personManagerBtn)
                    .addComponent(patientManagerBtn))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(personManagerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(patientManagerBtn)
                .addGap(74, 74, 74))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void personManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personManagerBtnActionPerformed
    ManagePersonWorkAreaJPanel mp = new ManagePersonWorkAreaJPanel(personDirectory,patient,vs,userProcessContainer);
    userProcessContainer.add("personMgrPane1",mp);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_personManagerBtnActionPerformed

    private void patientManagerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientManagerBtnActionPerformed
    ManagePatientWorkAreaJPanel mp = new ManagePatientWorkAreaJPanel(patient,personDirectory,vs,userProcessContainer);
    userProcessContainer.add("patientMgrPane1",mp);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_patientManagerBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton patientManagerBtn;
    private javax.swing.JButton personManagerBtn;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
