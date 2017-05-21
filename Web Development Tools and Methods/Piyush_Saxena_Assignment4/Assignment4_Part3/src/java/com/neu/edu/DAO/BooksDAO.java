/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.edu.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.commons.dbutils.DbUtils.close;

/**
 *
 * @author Piyush
 */
public class BooksDAO extends DAO {
    Connection conn;
    PreparedStatement ps;
    int result;
    
    public int addBooks(String[] books) throws SQLException {
        try {
            
                conn = getConnection();
                
                String query = "insert into books(isbn,title,author,price) values(?,?,?,?)";
                ps = conn.prepareStatement(query);
                ps.setString(1,books[0]);
                ps.setString(2,books[1]);
                ps.setString(3,books[2]);
                ps.setFloat(4,Float.parseFloat(books[3]));
                result = ps.executeUpdate();
           
                if(result>0)
                {
                    return result;
                }
                } catch (SQLException ex) {
                    Logger.getLogger(BooksDAO.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    close(conn);
                    ps.close();
                }
        return result;
    }
}
