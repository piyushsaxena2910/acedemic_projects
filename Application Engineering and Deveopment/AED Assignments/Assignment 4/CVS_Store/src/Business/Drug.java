/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Piyush
 */
public class Drug {

    private String drugName;
    private int drugSerialNumber;
    private String drugMnufacturer;
    private int weight;
    private int quantity;
    private String dateManufactured;
    private String expirationDate;
    private String patientFactor;
    private Float listPrice;
    private String dosageForm;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getDrugSerialNumber() {
        return drugSerialNumber;
    }

    public void setDrugSerialNumber(int drugID) {
        this.drugSerialNumber = drugID;
    }

    public String getDrugMnufacturer() {
        return drugMnufacturer;
    }

    public void setDrugMnufacturer(String drugMnufacturer) {
        this.drugMnufacturer = drugMnufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDateManufactured() {
        return dateManufactured;
    }

    public void setDateManufactured(String dateManufactured) {
        this.dateManufactured = dateManufactured;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPatientFactor() {
        return patientFactor;
    }

    public void setPatientFactor(String patientFactor) {
        this.patientFactor = patientFactor;
    }

    public Float getListPrice() {
        return listPrice;
    }

    public void setListPrice(Float listPrice) {
        this.listPrice = listPrice;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    @Override
    public String toString() {
        return  drugName;
    }
    
    
}
