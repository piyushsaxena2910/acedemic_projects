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
public class InitializationFile {
    private CVSStore cvsStore;

    public InitializationFile(CVSStore cvsStore) {
    this.cvsStore = cvsStore;
    
    Drug crocinDrug = cvsStore.getDrugCatalog().addDrug();
    crocinDrug.setDateManufactured("10-12-2015");
    crocinDrug.setDosageForm("Oral");
    crocinDrug.setDrugMnufacturer("GlaxoSmithKline");
    crocinDrug.setDrugName("Crocin");
    crocinDrug.setDrugSerialNumber(100001);
    crocinDrug.setExpirationDate("10-12-2017");
    crocinDrug.setListPrice(Float.parseFloat("15.0"));
    crocinDrug.setPatientFactor("Fever");
    crocinDrug.setQuantity(10);
    crocinDrug.setWeight(2);
    
    Drug disprinDrug = cvsStore.getDrugCatalog().addDrug();
    disprinDrug.setDateManufactured("11-12-2015");
    disprinDrug.setDosageForm("Oral");
    disprinDrug.setDrugMnufacturer("Reckitt Benckiser");
    disprinDrug.setDrugName("Disprin");
    disprinDrug.setDrugSerialNumber(100002);
    disprinDrug.setExpirationDate("11-12-2017");
    disprinDrug.setListPrice(Float.parseFloat("25.0"));
    disprinDrug.setPatientFactor("Headache");
    disprinDrug.setQuantity(12);
    disprinDrug.setWeight(3);
    
    Drug allegraDrug = cvsStore.getDrugCatalog().addDrug();
    allegraDrug.setDateManufactured("12-12-2015");
    allegraDrug.setDosageForm("Oral");
    allegraDrug.setDrugMnufacturer("Sanofi Aventis");
    allegraDrug.setDrugName("Allegra");
    allegraDrug.setDrugSerialNumber(100003);
    allegraDrug.setExpirationDate("11-10-2017");
    allegraDrug.setListPrice(Float.parseFloat("7.0"));
    allegraDrug.setPatientFactor("Allergy");
    allegraDrug.setQuantity(15);
    allegraDrug.setWeight(4);
    
    Drug cetirizineDrug = cvsStore.getDrugCatalog().addDrug();
    cetirizineDrug.setDateManufactured("12-08-2015");
    cetirizineDrug.setDosageForm("Oral");
    cetirizineDrug.setDrugMnufacturer("Pfizer");
    cetirizineDrug.setDrugName("Cetirizine");
    cetirizineDrug.setDrugSerialNumber(100004);
    cetirizineDrug.setExpirationDate("11-01-2017");
    cetirizineDrug.setListPrice(Float.parseFloat("12.0"));
    cetirizineDrug.setPatientFactor("Itching");
    cetirizineDrug.setQuantity(20);
    cetirizineDrug.setWeight(10);
    
    Drug cepacolDrug = cvsStore.getDrugCatalog().addDrug();
    cepacolDrug.setDateManufactured("01-08-2015");
    cepacolDrug.setDosageForm("Oral");
    cepacolDrug.setDrugMnufacturer("Reckitt Benckiser");
    cepacolDrug.setDrugName("Cepacol");
    cepacolDrug.setDrugSerialNumber(100005);
    cepacolDrug.setExpirationDate("08-01-2017");
    cepacolDrug.setListPrice(Float.parseFloat("25.0"));
    cepacolDrug.setPatientFactor("Soar Throat");
    cepacolDrug.setQuantity(25);
    cepacolDrug.setWeight(2);
    }
}
