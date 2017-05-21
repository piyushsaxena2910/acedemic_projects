/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class SupplierDirectory {
    
   private ArrayList<Supplier> supplierList = new ArrayList<>();
   private Supplier supplier;
   
   public SupplierDirectory(){
        
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public SupplierDirectory(ArrayList<Supplier> supplierList/*ProductCatalog productCatalog*/){
        this.supplierList = supplierList;
    }
    
    @Override
    public String toString() {
        return "SupplierDirectory " + "supplierList: " + supplierList ;
    }
}