/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.neu.DAO;

import com.edu.neu.POJO.SalesOrder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Piyush
 */
public class SalesOrderSQLDAO extends DAO{
    Connection conn;
    
    public int addBooks(ArrayList<SalesOrder> salesOrder) throws SQLException {
        
            int number[]=null;
            
                conn = getConnection();
                
                String query = "insert into SalesOrder (SalesOrderID, RevisionNumber, OrderDate, DueDate, ShipDate, Status, OnlineOrderFlag, SalesOrderNumber, PurchaseOrderNumber, AccountNumber, CustomerID, SalesPersonID , TerritoryID, BillToAddressID, ShipToAddressID, ShipMethodID, CreditCardID, CreditCardApprovalCode, CurrencyRateID, SubTotal, TaxAmt, Freight, TotalDue, Comment, ModifiedDate) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement ps = conn.prepareStatement(query);

                for(SalesOrder order : salesOrder){
                    ps.setString(1, order.getSalesOrderID());
                    ps.setString(2, order.getRevisionNumber());
                    ps.setString(3, order.getOrderDate());
                    ps.setString(4, order.getDueDate());
                    ps.setString(5, order.getShipDate());
                    ps.setString(6, order.getStatus());
                    ps.setString(7, order.getOnlineOrderFlag());
                    ps.setString(8, order.getSalesOrderNumber());
                    ps.setString(9, order.getPurchaseOrderNumber());
                    ps.setString(10, order.getAccountNumber());
                    ps.setString(11, order.getCustomerID());
                    ps.setString(12, order.getSalesPersonID());
                    ps.setString(13, order.getTerritoryID());
                    ps.setString(14, order.getBillToAddressID());
                    ps.setString(15, order.getShipToAddressID());
                    ps.setString(16, order.getShipMethodID());
                    ps.setString(17, order.getCreditCardID());
                    ps.setString(18, order.getCreditCardApprovalCode());
                    ps.setString(19, order.getCurrencyRateID());
                    ps.setString(20, order.getSubTotal());
                    ps.setString(21, order.getTaxAmt());
                    ps.setString(22, order.getFreight());
                    ps.setString(23, order.getTotalDue());
                    ps.setString(24, order.getComment());
                    ps.setString(25, order.getModifiedDate());

                    ps.addBatch();
                                }
                    number=ps.executeBatch();
                    int no=number.length;
                    ps.close();
                    conn.close(); 
                    return no;
    
}
    }
