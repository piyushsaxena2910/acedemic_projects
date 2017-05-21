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
public class Business {
    
    private SupplierDirectory supplierDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private CustomerCatalog customerCatalog;
    private SalesPersonDirectory salesPersonDirectory;
    
    public Business(){
        supplierDirectory = new SupplierDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        customerCatalog = new CustomerCatalog();
        salesPersonDirectory = new SalesPersonDirectory();
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public CustomerCatalog getCustomerCatalog() {
        return customerCatalog;
    }

    public void setCustomerCatalog(CustomerCatalog customerCatalog) {
        this.customerCatalog = customerCatalog;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }
    
    
    
}
