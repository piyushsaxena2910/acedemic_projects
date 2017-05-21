/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class CustomerCatalog {
    private ArrayList<Customer> customerList;

    public CustomerCatalog() {
    customerList = new ArrayList<Customer>();
    }
    
    public Customer addCustomer(){
        Customer c = new Customer();
        customerList.add(c);
        return c;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

     
    
}
