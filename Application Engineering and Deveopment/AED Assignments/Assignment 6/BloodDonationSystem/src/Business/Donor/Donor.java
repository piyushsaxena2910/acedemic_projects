/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import Business.Employee.Employee;
import Business.WorkQueue.LabTestWorkRequest;

/**
 *
 * @author Piyush
 */
public class Donor{
    private String firstName;
    private int heartRate;
    private int bloodPressure;
    private String alcoholConsumption;
    private String drugsConsumption;
    private String bloodType;
    private int barcode;
    private int pintOfBlood;
    //private Employee employee;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getAlcoholConsumption() {
        return alcoholConsumption;
    }

    public void setAlcoholConsumption(String alcoholConsumption) {
        this.alcoholConsumption = alcoholConsumption;
    }

    public String getDrugsConsumption() {
        return drugsConsumption;
    }

    public void setDrugsConsumption(String drugsConsumption) {
        this.drugsConsumption = drugsConsumption;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getPintOfBlood() {
        return pintOfBlood;
    }

    public void setPintOfBlood(int pintOfBlood) {
        this.pintOfBlood = pintOfBlood;
    }

    
}
