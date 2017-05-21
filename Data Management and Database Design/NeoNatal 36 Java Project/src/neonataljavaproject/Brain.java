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
public class Brain extends TimerTask{
    
    String param;
    int childID;
    public Brain(String param,int childID){
     this.param = param;
     this.childID = childID;
   }

    @Override
    public void run() {
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","piyush","1234");
         
        Statement stmnt = (Statement)conn.createStatement();
         
        GenerateRandomNumbers gnr = new GenerateRandomNumbers();
        
        float voltageFluctuation = (float)gnr.genrateRandomNumber(100,1000 )/100;
        float frequency = (float)gnr.genrateRandomNumber(1000, 4000)/100;
        String treatment = param;
         
        String insertInBrain = "INSERT INTO Brain VALUES(NOW() ,'" + childID + "','" + voltageFluctuation 
                + "','" + frequency +  "')";
        stmnt.executeUpdate(insertInBrain);
        stmnt.close();
    }
    catch(Exception e){
    }
    
    }
         
    
}
