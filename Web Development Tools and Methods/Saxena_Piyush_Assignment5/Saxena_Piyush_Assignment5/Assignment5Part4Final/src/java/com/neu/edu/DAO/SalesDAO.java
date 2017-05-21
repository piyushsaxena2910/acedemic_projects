/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.DAO;

import com.neu.edu.pojo.SalesOrder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class SalesDAO extends MySQLDAO{
    
    Connection conn;
    public int insertIntoDB(String[] sOrder) throws SQLException
    {
        
final int batchSize = 1000;
int count = 0;
int counter=0;
        int number[]=null;
        conn = getConnection();
        String sql = "insert into SalesOrderWebTools (SalesOrderID, RevisionNumber, OrderDate, DueDate, ShipDate, Status, OnlineOrderFlag, SalesOrderNumber, PurchaseOrderNumber, AccountNumber, CustomerID, SalesPersonID , TerritoryID, BillToAddressID, ShipToAddressID, ShipMethodID, CreditCardID, CreditCardApprovalCode, CurrencyRateID, SubTotal, TaxAmt, Freight, TotalDue, Comment, ModifiedDate) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        
 
            counter++;
    ps.setString(1, sOrder[1]);
    ps.setString(2, sOrder[2]);
    ps.setString(3, sOrder[3]);
    
    ps.setString(4, sOrder[4]);
    ps.setString(5, sOrder[5]);
    ps.setString(6, sOrder[6]);
    
    
    ps.setString(7, sOrder[7]);
    ps.setString(8, sOrder[8]);
    ps.setString(9, sOrder[9]);
    
    
    ps.setString(10, sOrder[10]);
    ps.setString(11, sOrder[11]);
    ps.setString(12, sOrder[12]);
    
    
    ps.setString(13, sOrder[13]);
    ps.setString(14, sOrder[14]);
    ps.setString(15, sOrder[15]);
    
    
    ps.setString(16, sOrder[16]);
    ps.setString(17, sOrder[17]);
    ps.setString(18, sOrder[18]);
    
    
    ps.setString(19, sOrder[19]);
    ps.setString(20, sOrder[20]);
    ps.setString(21, sOrder[21]);
    
    
    ps.setString(22, sOrder[22]);
    ps.setString(23, sOrder[23]);
    ps.setString(24, sOrder[24]);
    ps.setString(25, sOrder[25]);
    
  ps.addBatch();

number=ps.executeBatch();
int no=number.length;
ps.close();
conn.close(); 
        return counter;
    }


     public int insertIntoDBNext100(String[] sOrder) throws SQLException
    {
        
final int batchSize = 1000;
int count = 0;
int counter=0;
        int number[]=null;
        conn = getConnection();
        String sql = "insert into SalesOrderWebTools (SalesOrderID, RevisionNumber, OrderDate, DueDate, ShipDate, Status, OnlineOrderFlag, SalesOrderNumber, PurchaseOrderNumber, AccountNumber, CustomerID, SalesPersonID , TerritoryID, BillToAddressID, ShipToAddressID, ShipMethodID, CreditCardID, CreditCardApprovalCode, CurrencyRateID, SubTotal, TaxAmt, Freight, TotalDue, Comment, ModifiedDate) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        
 
            counter++;
    ps.setString(1, sOrder[0]);
    ps.setString(2, sOrder[1]);
    ps.setString(3, sOrder[2]);
  
    ps.setString(4, sOrder[3]);
    ps.setString(5, sOrder[4]);
    ps.setString(6, sOrder[5]);
    
    
    ps.setString(7, sOrder[6]);
    ps.setString(8, sOrder[7]);
    ps.setString(9, sOrder[8]);
    
    
    ps.setString(10, sOrder[9]);
    ps.setString(11, sOrder[10]);
    ps.setString(12, sOrder[11]);
    
    
    ps.setString(13, sOrder[12]);
    ps.setString(14, sOrder[13]);
    ps.setString(15, sOrder[14]);
    
    
    ps.setString(16, sOrder[15]);
    ps.setString(17, sOrder[16]);
    ps.setString(18, sOrder[17]);
    
    
    ps.setString(19, sOrder[18]);
    ps.setString(20, sOrder[19]);
    ps.setString(21, sOrder[20]);
    
    
    ps.setString(22, sOrder[21]);
    ps.setString(23, sOrder[22]);
    ps.setString(24, sOrder[23]);
    ps.setString(25, sOrder[24]);
    
  ps.addBatch();

number=ps.executeBatch();
int no=number.length;
ps.close();
conn.close(); 
        return counter;
    }
    
}
