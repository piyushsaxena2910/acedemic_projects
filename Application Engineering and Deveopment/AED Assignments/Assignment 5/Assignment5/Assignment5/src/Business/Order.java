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
public class Order {
    
    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private SalesPerson salesPerson;
    private Customer customer;
    public Order(){
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
        customer = new Customer();
    }

    public int getOrderNumber() {
        return orderNumber;
    }
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem(Product p, int q, int price){
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }
    
    public ArrayList<OrderItem> getOrderItemList(){
        return orderItemList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        
       //private Customer customer;
        this.customer = customer;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

public Integer fetchOrder(int j)
    {
        int size = orderItemList.size();
       for(int i=j;i<=size;i++)
       {
           OrderItem items = (OrderItem) orderItemList.get(i);
           int s = items.getSalesPrice();
           return s;
       }
       return 0;
    }
}
