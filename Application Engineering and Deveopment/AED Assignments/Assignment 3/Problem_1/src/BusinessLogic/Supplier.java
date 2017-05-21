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
public class Supplier {
   
    private String supplierName;
    private ProductCatalog productCatalog;
    
    public Supplier(String supplierName){
        this.supplierName = supplierName;
    }
    
    public Supplier(String supplierName, ProductCatalog productCatalog){
        this.supplierName = supplierName;
        this.productCatalog = productCatalog;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    
    
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    @Override
    public String toString()
    {
        return "\n"+supplierName + "\n" + productCatalog;
        
    }
    
}

    
    
 
