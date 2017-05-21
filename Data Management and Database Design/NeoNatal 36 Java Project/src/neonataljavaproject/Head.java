/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neonataljavaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.TimerTask;

/**
 *
 * @author Vivek
 */
public class Head extends TimerTask{
    
    String param;
    int childID;
    public Head(String param,int childID){
     this.param = param;
     this.childID = childID;
   }

    @Override
    public void run() {
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","piyush","1234");
         
        Statement stmnt = (Statement)conn.createStatement();
         
        GenerateRandomNumbers gnr = new GenerateRandomNumbers();
        
        float circumference = (float)gnr.genrateRandomNumber(3500, 3800)/100;
        String treatment = param;
         
       // String insertInHead = "INSERT INTO Head VALUES(NOW() ,'" + childID + "','" + circumference + "')";
        String insertInHead = "INSERT INTO Head VALUES(NOW() ,'" + childID + "','" + circumference + "')";
        stmnt.executeUpdate(insertInHead);
        stmnt.close();
    }
    catch(Exception e){
    }
    
    }
         
}

