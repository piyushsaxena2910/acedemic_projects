/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Piyush
 */
public class VerifyLevel {
    private VitalSign vitalSign;
    private Patient patient;
    public VerifyLevel(VitalSign vitalSign, Patient patient)
    {
        this.vitalSign = vitalSign;
        this.patient = patient;
    }
    public String verifyLevelNormalOrAbnormal()
    {
        int respiratoryRate = vitalSign.getRespiratoryRate();
        int heartRate = vitalSign.getHeartRate();
        int bloodPressure = vitalSign.getSymbolicBloodPressure();
        Float weightInPounds = vitalSign.getWeightInpounds();
        int age = patient.getPatientAge();
        
        if(age>=1 && age<=3)
        {
        if(respiratoryRate>=20 && respiratoryRate<=30 && heartRate>=80 && heartRate<=130 && bloodPressure>=80 && bloodPressure<=110 && weightInPounds>=22 && weightInPounds<=31)
            return "Normal";
        else
            return "Abnormal";
        }
        else if(age>=4 && age<=5)
        {
        if(respiratoryRate>=20 && respiratoryRate<=30 && heartRate>=80 && heartRate<=120 && bloodPressure>=80 && bloodPressure<=110 && weightInPounds>=31 && weightInPounds<=40)
            return "Normal";
        else
            return "Abnormal";
        }
        else if(age>=6 && age<=12)
        {
        if(respiratoryRate>=20 && respiratoryRate<=30 && heartRate>=70 && heartRate<=110 && bloodPressure>=80 && bloodPressure<=120 && weightInPounds>=41 && weightInPounds<=92)
            return "Normal";
        else
            return "Abnormal";
        }
        else
        {
        if(respiratoryRate>=12 && respiratoryRate<=20 && heartRate>=55 && heartRate<=105 && bloodPressure>=110 && bloodPressure<=120 && weightInPounds>=110)
            return "Normal";
        else
            return "Abnormal";
        }
    }
}
