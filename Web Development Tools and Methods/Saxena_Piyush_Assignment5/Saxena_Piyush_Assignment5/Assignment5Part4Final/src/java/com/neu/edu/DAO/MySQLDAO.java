/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Piyush
 */
public class MySQLDAO {
    private String driver;
    private String dburl;
    private String dbuser;
    private String dbpassword;
    
    public MySQLDAO(){
        driver = "com.mysql.jdbc.Driver";
        dburl = "jdbc:mysql://localhost:3306/SalesOrderWeb";
        dbuser = "root";
        dbpassword="root";
        
        DbUtils.loadDriver(driver);
    }
    
    public Connection getConnection(){
        Connection conn =null;
        try{
            conn = DriverManager.getConnection(dburl,dbuser,dbpassword);
            
            
        }catch(SQLException ex){
            Logger.getLogger(MySQLDAO.class.getName()).log(Level.SEVERE,null,ex);
        }
        return conn;
    }
    public void close(Connection connection){
        if(connection != null){
            try{
                DbUtils.close(connection);
            }catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    } 
    
}
