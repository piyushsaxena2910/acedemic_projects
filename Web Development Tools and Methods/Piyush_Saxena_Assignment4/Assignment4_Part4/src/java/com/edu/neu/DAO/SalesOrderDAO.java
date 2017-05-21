/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.neu.DAO;
import com.edu.neu.POJO.SalesOrder;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.relique.jdbc.csv.CsvDriver;

/**
 *
 * @author Piyush
 */
public class SalesOrderDAO {

        
        PreparedStatement ps;
        int result;
       // QueryRunner queryRunner;
        
//    public SalesOrderDAO(DataSource dataSource) {
//        queryRunner = new QueryRunner(dataSource);
//    }
//    
    
  public ArrayList<Object> establishConnection(String fileName){
    try
    {
      Class.forName("org.relique.jdbc.csv.CsvDriver");

      String path = "D:\\Web Tools";
      Connection conn = DriverManager.getConnection("jdbc:relique:csv:"+path);
      Statement stmt = conn.createStatement();
      
      ResultSet results = stmt.executeQuery("SELECT * FROM " + fileName.substring(0,fileName.length()-4));
      ResultSetMetaData rsmd = results.getMetaData();
      
      ArrayList<Object> data = new ArrayList<>();
      
      String[] columnNames = new String[rsmd.getColumnCount()];
      for(int i = 0; i < rsmd.getColumnCount(); i++){
          columnNames[i] = rsmd.getColumnName(i+1);
      }
      data.add(columnNames);
      
      ArrayList<SalesOrder> orders = new ArrayList<>();
      while(results.next()){
          SalesOrder so = new SalesOrder();
          
          so.setSalesOrderID(results.getString(1));
          so.setRevisionNumber(results.getString(2));
          so.setOrderDate(results.getString(3));
          so.setDueDate(results.getString(4));
          so.setShipDate(results.getString(5));
          so.setStatus(results.getString(6));
          so.setOnlineOrderFlag(results.getString(7));
          so.setSalesOrderNumber(results.getString(8));
          so.setPurchaseOrderNumber(results.getString(9));
          so.setAccountNumber(results.getString(10));
          so.setCustomerID(results.getString(11));
          so.setSalesPersonID(results.getString(12));
          so.setTerritoryID(results.getString(13));
          so.setBillToAddressID(results.getString(14));
          so.setShipToAddressID(results.getString(15));
          so.setShipMethodID(results.getString(16));
          so.setCreditCardID(results.getString(17));
          so.setCreditCardApprovalCode(results.getString(18));
          so.setCurrencyRateID(results.getString(19));
          so.setSubTotal(results.getString(20));
          so.setTaxAmt(results.getString(21));
          so.setFreight(results.getString(22));
          so.setTotalDue(results.getString(23));
          so.setComment(results.getString(24));
          so.setModifiedDate(results.getString(25));     
          
          orders.add(so);
      }
      
      data.add(orders);
      boolean append = true;
      CsvDriver.writeToCsv(results, System.out, append);
      conn.close();
      
    return data;
    }
    catch(Exception e)
    {
      e.printStackTrace();
      return null;
    }
  }
}
