/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import BusinessLogic.Patient;
import BusinessLogic.Person;
import BusinessLogic.PersonDirectory;
import BusinessLogic.VerifyLevel;
import BusinessLogic.VitalSign;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Piyush
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

    private Person person;
    private JPanel userProcessContainer;
    private Patient patient;
    private PersonDirectory personDirectory;
    private VitalSign vs;
    public ManagePatientJPanel(Patient patient,PersonDirectory personDirectory,VitalSign vs,JPanel userProcessContainer) {
        initComponents();
        this.person = person;
        this.patient = patient;
        this.vs = vs;
        this.personDirectory = personDirectory;
        this.userProcessContainer = userProcessContainer;
        personListComboBox.removeAllItems();
        for(Person person : personDirectory.getPersonList())
        personListComboBox.addItem(person);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        vitalSignTable = new javax.swing.JTable();
        openEntryBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        personListComboBox = new javax.swing.JComboBox();
        openVSDetails = new javax.swing.JButton();
        viewGraphBtn = new javax.swing.JButton();
        viewBloodPressureGraph = new javax.swing.JButton();
        viewHeartRateGraph = new javax.swing.JButton();
        viewRespiratoryRateGraph = new javax.swing.JButton();
        viewWeightInPoundsGraph = new javax.swing.JButton();

        vitalSignTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Respiratory Rate", "Heart Rate", "Blood Pressure", "Weight in Pounds", "Timestamp", "Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalSignTable);

        openEntryBtn.setText("Open Entry");
        openEntryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openEntryBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        personListComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        openVSDetails.setText("Select Person ID");
        openVSDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openVSDetailsActionPerformed(evt);
            }
        });

        viewGraphBtn.setText("Select Row and View Graph");
        viewGraphBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGraphBtnActionPerformed(evt);
            }
        });

        viewBloodPressureGraph.setText("View Blood Pressure Graph");
        viewBloodPressureGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBloodPressureGraphActionPerformed(evt);
            }
        });

        viewHeartRateGraph.setText("View Heart Rate Graph");
        viewHeartRateGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHeartRateGraphActionPerformed(evt);
            }
        });

        viewRespiratoryRateGraph.setText("View Respiratory Rate Graph");
        viewRespiratoryRateGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRespiratoryRateGraphActionPerformed(evt);
            }
        });

        viewWeightInPoundsGraph.setText("View Weight In Pounds Graph");
        viewWeightInPoundsGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWeightInPoundsGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(openVSDetails)
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(viewHeartRateGraph)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewWeightInPoundsGraph))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(viewBloodPressureGraph)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewRespiratoryRateGraph)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(viewGraphBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(openEntryBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openVSDetails))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(openEntryBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewGraphBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBloodPressureGraph)
                    .addComponent(viewRespiratoryRateGraph))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewWeightInPoundsGraph)
                    .addComponent(viewHeartRateGraph))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
    userProcessContainer.remove(this);
    CardLayout layout = (CardLayout)userProcessContainer.getLayout();
    layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void openEntryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openEntryBtnActionPerformed
    int selectedRow = vitalSignTable.getSelectedRow();
    if(selectedRow>=0){
        VitalSign vitalSign = (VitalSign)vitalSignTable.getValueAt(selectedRow, 0);
        ViewVitalSignDetailsJPanel pane1 = new ViewVitalSignDetailsJPanel(person,patient,userProcessContainer,vitalSign,this);
        userProcessContainer.add("managePerson",pane1);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }
    else{
        JOptionPane.showMessageDialog(null, "Kindly select a row");
    }    
    }//GEN-LAST:event_openEntryBtnActionPerformed

    private void openVSDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openVSDetailsActionPerformed
        populateTable();
    }//GEN-LAST:event_openVSDetailsActionPerformed

    private void viewGraphBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGraphBtnActionPerformed
        
            int selectedRow = vitalSignTable.getSelectedRow();
            if(selectedRow>=0){
                VitalSign vitalSign = (VitalSign)vitalSignTable.getValueAt(selectedRow, 0);

                String symbollicBloodPressure = String.valueOf(vitalSign.getSymbolicBloodPressure());
                String heartRate = String.valueOf(vitalSign.getHeartRate());
                String respiratoryRate = String.valueOf(vitalSign.getRespiratoryRate());
                String weightInPounds = String.valueOf(vitalSign.getWeightInpounds());
                String date = String.valueOf(vitalSign.getDateTimeStamp());

                DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                dataset.setValue(Integer.parseInt(symbollicBloodPressure), "Values", "Blood Pressure");
                dataset.setValue(Integer.parseInt(heartRate), "Values", "Heart Rate");
                dataset.setValue(Integer.parseInt(respiratoryRate), "Values", "Respiratory Rate");
                dataset.setValue(Float.parseFloat(weightInPounds), "Values", "Weight In Pounds");

                JFreeChart chart = ChartFactory.createBarChart3D("Vital Sign Graph","Parameters","Values",dataset,PlotOrientation.VERTICAL, false, true, false);
                chart.setBackgroundPaint(Color.YELLOW);
                chart.getTitle().setPaint(Color.RED);
                CategoryPlot p = chart.getCategoryPlot();
                p.setRangeGridlinePaint(Color.BLUE);
                ChartFrame frame = new ChartFrame("Chart for displaying Vital Signs", chart);
                frame.setVisible(true);
                frame.setSize(750,750);
            }
            else{
                JOptionPane.showMessageDialog(null, "Kindly select a row");
            }
        
    }//GEN-LAST:event_viewGraphBtnActionPerformed

    private void viewBloodPressureGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBloodPressureGraphActionPerformed
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int rowCount = vitalSignTable.getRowCount();
        String[] bloodPressureArray = new String[rowCount];
        String[] timeStamp = new String[rowCount];
        for(int i=0;i<vitalSignTable.getRowCount();i++){
            bloodPressureArray[i] = String.valueOf(vitalSignTable.getValueAt(i,1));
            timeStamp[i] = String.valueOf(vitalSignTable.getValueAt(i,5));
        }
        
        for(int k=0;k<bloodPressureArray.length;k++){
        dataset.setValue(Integer.parseInt(bloodPressureArray[k]), "Values", timeStamp[k]);
    }
       
//        final CategoryPlot p = chart.getCategoryPlot();
//        BarRenderer renderer = (BarRenderer) p.getRenderer(); 
//        CustomRenderer customrenderer = new CustomRenderer(new Paint[] {Color.red, Color.blue, Color.green, Color.yellow });
//        
        //CategoryPlot plot = chart.getCategoryPlot(); 
//        p.setRenderer(customrenderer);
//         
        
        
        
        JFreeChart chart = ChartFactory.createBarChart3D("Vital Sign Graph","Parameters","Values",dataset,PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.YELLOW);
        chart.getTitle().setPaint(Color.RED);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Chart for displaying Vital Signs", chart);
        frame.setVisible(true);
        frame.setSize(900,900);
    
    

    }//GEN-LAST:event_viewBloodPressureGraphActionPerformed

    private void viewHeartRateGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHeartRateGraphActionPerformed
        
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int rowCount = vitalSignTable.getRowCount();
        String[] heartRateArray = new String[rowCount];
        String[] timeStamp = new String[rowCount];
        for(int i=0;i<vitalSignTable.getRowCount();i++){
            heartRateArray[i] = String.valueOf(vitalSignTable.getValueAt(i,2));
            timeStamp[i] = String.valueOf(vitalSignTable.getValueAt(i,5));
        }
        
        for(int k=0;k<heartRateArray.length;k++){
        dataset.setValue(Integer.parseInt(heartRateArray[k]), "Values", timeStamp[k]);
    }
        JFreeChart chart = ChartFactory.createBarChart3D("Vital Sign Graph","Parameters","Values",dataset,PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.YELLOW);
        chart.getTitle().setPaint(Color.RED);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Chart for displaying Vital Signs", chart);
        frame.setVisible(true);
        frame.setSize(900,900);

        
    }//GEN-LAST:event_viewHeartRateGraphActionPerformed

    private void viewRespiratoryRateGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRespiratoryRateGraphActionPerformed
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int rowCount = vitalSignTable.getRowCount();
        String[] respiratoryRateArray = new String[rowCount];
        String[] timeStamp = new String[rowCount];
        for(int i=0;i<vitalSignTable.getRowCount();i++){
            respiratoryRateArray[i] = String.valueOf(vitalSignTable.getValueAt(i,3));
            timeStamp[i] = String.valueOf(vitalSignTable.getValueAt(i,5));
        }
        
        for(int k=0;k<respiratoryRateArray.length;k++){
        dataset.setValue(Integer.parseInt(respiratoryRateArray[k]), "Values", timeStamp[k]);
    }
        JFreeChart chart = ChartFactory.createLineChart3D("Vital Sign Graph","Parameters","Values",dataset,PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.YELLOW);
        chart.getTitle().setPaint(Color.RED);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Chart for displaying Vital Signs", chart);
        frame.setVisible(true);
        frame.setSize(900,900);
    
    }//GEN-LAST:event_viewRespiratoryRateGraphActionPerformed

    private void viewWeightInPoundsGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWeightInPoundsGraphActionPerformed
        

            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        int rowCount = vitalSignTable.getRowCount();
        String[] weightInPounds = new String[rowCount];
        String[] timeStamp = new String[rowCount];
        for(int i=0;i<vitalSignTable.getRowCount();i++){
            weightInPounds[i] = String.valueOf(vitalSignTable.getValueAt(i,4));
            timeStamp[i] = String.valueOf(vitalSignTable.getValueAt(i,5));
        }
        
        for(int k=0;k<weightInPounds.length;k++){
        dataset.setValue(Float.parseFloat(weightInPounds[k]), "Values", timeStamp[k]);
    }
        JFreeChart chart = ChartFactory.createBarChart3D("Vital Sign Graph","Parameters","Values",dataset,PlotOrientation.VERTICAL, false, true, false);
        chart.setBackgroundPaint(Color.YELLOW);
        chart.getTitle().setPaint(Color.RED);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.BLUE);
        ChartFrame frame = new ChartFrame("Chart for displaying Vital Signs", chart);
        frame.setVisible(true);
        frame.setSize(900,900);
    
        
    }//GEN-LAST:event_viewWeightInPoundsGraphActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openEntryBtn;
    private javax.swing.JButton openVSDetails;
    private javax.swing.JComboBox personListComboBox;
    private javax.swing.JButton viewBloodPressureGraph;
    private javax.swing.JButton viewGraphBtn;
    private javax.swing.JButton viewHeartRateGraph;
    private javax.swing.JButton viewRespiratoryRateGraph;
    private javax.swing.JButton viewWeightInPoundsGraph;
    private javax.swing.JTable vitalSignTable;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
    Person person = (Person) personListComboBox.getSelectedItem();
    DefaultTableModel dtm = (DefaultTableModel)vitalSignTable.getModel();    
    dtm.setRowCount(0);
    
    if(person.getPatient()==null){
    
    Object row[] = new Object[7];
    
    row[0]="No Patient created yet.";
    row[1]="No Patient created yet.";
    row[2]="No Patient created yet.";
    row[3]="No Patient created yet.";
    row[4]="No Patient created yet.";
    row[5]="No Patient created yet.";
    row[6]="No Patient created yet.";
    dtm.addRow(row);
    }
    else{
    for(VitalSign vs : person.getPatient().getVitalSignHistory()){
     Object row[] = new Object[7];
     
        row[0]=vs;
        row[3]=vs.getSymbolicBloodPressure();
        row[2]=vs.getHeartRate();
        row[1]=vs.getRespiratoryRate();
        row[4]=vs.getWeightInpounds();
        row[5]=vs.getDateTimeStamp();
        VerifyLevel verifyLevel = new VerifyLevel(vs,person);
        row[6]=verifyLevel.verifyLevelNormalOrAbnormal();
         dtm.addRow(row);
        }
       
    }    
    }    
    }
