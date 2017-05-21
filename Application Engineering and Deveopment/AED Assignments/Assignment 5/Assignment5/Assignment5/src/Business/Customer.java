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
public class Customer extends Person{
    private int customerID;
    private static int count =0;
    
    public Customer(){
        customerID = ++count;
    }
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
    @Override
    public String toString(){
        return String.valueOf(customerID);
    }
}
