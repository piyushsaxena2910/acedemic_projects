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
public class VitalSign{
    private int patientID;
    private int respiratoryRate;
    private int heartRate;
    private int symbolicBloodPressure;
    private Float weightInpounds;
    private String dateTimeStamp;

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSymbolicBloodPressure() {
        return symbolicBloodPressure;
    }

    public void setSymbolicBloodPressure(int symbolicBloodPressure) {
        this.symbolicBloodPressure = symbolicBloodPressure;
    }

    public Float getWeightInpounds() {
        return weightInpounds;
    }

    public void setWeightInpounds(Float weightInpounds) {
        this.weightInpounds = weightInpounds;
    }

    public String getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(String dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }
    
    @Override
    public String toString() {
        return String.valueOf(patientID);
    }

}
