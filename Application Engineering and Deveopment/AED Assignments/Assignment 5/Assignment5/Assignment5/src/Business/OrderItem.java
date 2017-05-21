/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Comparator;

/**
 *
 * @author Piyush
 */

public class OrderItem implements Comparable<OrderItem>{
    
    private Product product;
    private int quantity;
    private int salesPrice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        return product.getProdName(); 
    }

    @Override
    public int compareTo(OrderItem o) {
         if(this.getQuantity()>o.getQuantity())
    
       return -1;
   else if(this.getQuantity()<o.getQuantity())
       return 1;
   else 
       return 0;
    }


}