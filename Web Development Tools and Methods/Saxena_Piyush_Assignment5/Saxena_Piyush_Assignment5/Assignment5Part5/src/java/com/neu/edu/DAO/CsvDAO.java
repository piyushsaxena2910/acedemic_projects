/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.DAO;

import com.neu.edu.pojo.SalesOrder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class CsvDAO {
    
    SalesOrder so;
    String query=null;
    int pages=0;
    static int count=0;
    
    public ArrayList<SalesOrder> getConnection(String csvName) throws SQLException, ClassNotFoundException
    {
        
         Class.forName("org.relique.jdbc.csv.CsvDriver");

      // Create a connection. The first command line parameter is
      // the directory containing the .csv files.
      // A single connection is thread-safe for use by several threads.
      String filename="C:\\WebTools";
      Connection conn = DriverManager.getConnection("jdbc:relique:csv:"+filename);

      // Create a Statement object to execute the query with.
      // A Statement is not thread-safe.
      
//
//      List<SalesOrder> salesResults = null;
//      
//      
//            QueryRunner runner = new QueryRunner();//class in dbutils
//            ResultSetHandler<List<SalesOrder>> resultSetHandler = new BeanListHandler<>(SalesOrder.class);
//            String q = ("SELECT * from "+csvName);
//            salesResults = runner.query(conn, q, resultSetHandler);
      // Select the ID and NAME columns from sample.csv
       
//       query="SELECT * from "+csvName+ " limit 100 offset ?";
//       PreparedStatement msgStmt = conn.prepareStatement(query);

       pages=100*count;
       Statement stmt = conn.createStatement();
       ResultSet results = stmt.executeQuery("SELECT * from "+csvName+" limit 100 offset "+pages+";");
       ResultSetMetaData rsmd = results.getMetaData();
       int numberOfColumns = rsmd.getColumnCount();
      
       ArrayList resultArray=new ArrayList();
       
       ArrayList columnNameArray=new ArrayList();
       
       for(int i=1;i<=numberOfColumns;i++)
       {
           columnNameArray.add(rsmd.getColumnName(i));
                   
       }
       resultArray.add(columnNameArray);
       ArrayList<SalesOrder> columnContent=new ArrayList();
       while(results.next())
       {
           
               so=new SalesOrder();
               
               so.setSalesOrderID(String.valueOf(results.getString(1)));
               so.setShipMethodID(results.getString(2));
               so.setCurrencyRateID(results.getString(3));
               so.setSalesOrderNumber(results.getString(4));
               so.setRevisionNumber(results.getString(5));
               so.setOrderDate(results.getString(6));
               so.setDueDate(results.getString(7));
               so.setShipDate(results.getString(8));
               so.setStatus(results.getString(9));
               so.setOnlineOrderFlag(results.getString(10));
               so.setPurchaseOrderNumber(results.getString(11));
               so.setAccountNumber(results.getString(12));
               so.setCustomerID(results.getString(13));
               so.setSalesPersonID(results.getString(14));
               so.setTerritoryID(results.getString(15));
               so.setBillToAddressID(results.getString(16));
               so.setShipToAddressID(results.getString(17));
               so.setCreditCardID(results.getString(18));
               so.setCreditCardApprovalCode(results.getString(19));
               so.setSubTotal(results.getString(20));
               so.setTaxAmt(results.getString(21));
               so.setFreight(results.getString(22));
               so.setTotalDue(results.getString(23));
               so.setComment(results.getString(24));
               so.setModifiedDate(results.getString(25));    
               
               //columnContent.add(results.getString(i));
               
               columnContent.add(so);
           
           resultArray.add(columnContent);
           //System.out.println(resultArray);
       }
       count++;
       return columnContent;
       
    }
}
