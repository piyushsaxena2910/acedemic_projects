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
public class SalesPerson extends Person implements Comparable<SalesPerson>{
    private int salesPersonID;
    private static int count =0;
    private CustomerCatalog customerCatalog;
    private int numberOfProductsSold;
    
    public SalesPerson(){
        salesPersonID = ++count;
        customerCatalog = new CustomerCatalog();
    }

    public int getSalesPersonID() {
        return salesPersonID;
    }

    public void setSalesPersonID(int salesPersonID) {
        this.salesPersonID = salesPersonID;
    }

    public CustomerCatalog getCustomerCatalog() {
        return customerCatalog;
    }

    public void setCustomerCatalog(CustomerCatalog customerCatalog) {
        this.customerCatalog = customerCatalog;
    }

    public int getNumberOfProductsSold() {
        return numberOfProductsSold;
    }

    public void setNumberOfProductsSold(int numberOfProductsSold) {
        this.numberOfProductsSold = numberOfProductsSold;
    }

    
    
    
    @Override
    public String toString() {
        return String.valueOf(salesPersonID);
    } 

    @Override
    public int compareTo(SalesPerson sp) {
         if(this.getNumberOfProductsSold()>sp.getNumberOfProductsSold())
    
       return 1;
   else if(this.getNumberOfProductsSold()<sp.getNumberOfProductsSold())
       return -1;
   else 
       return 0;
    }
}
