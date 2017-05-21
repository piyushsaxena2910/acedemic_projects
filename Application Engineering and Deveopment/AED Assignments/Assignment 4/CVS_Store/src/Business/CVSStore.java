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
public class CVSStore {
    
 private int storeID;   
 private String storeLocation;
 private DrugCatalog drugCatalog;
 
 public CVSStore(){
     drugCatalog = new DrugCatalog();
 }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }
 
    @Override
    public String toString(){
        return "Store ID : " + storeID;
    }
}
