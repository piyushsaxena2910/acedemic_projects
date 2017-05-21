/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neonataljavaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;
import java.util.TimerTask;

/**
 *
 * @author Vivek
 */
public class Abdomen extends TimerTask{
    
    String param;
    int childID;
    public Abdomen(String param,int childID){
     this.param = param;
     this.childID = childID;
    }

    @Override
    public void run() {
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","piyush","1234");
         
        Statement stmnt = (Statement)conn.createStatement();
         
        GenerateRandomNumbers gnr = new GenerateRandomNumbers();
        String[] feverStatus = {"Yes" , "No"};
        String[] vomittingStatus = {"Yes" , "No"};
        String[] inflationStatus = {"Yes", "No"};
        
         int idx = new Random().nextInt(feverStatus.length);
         String feverStatusRandom = (feverStatus[idx]);
         
         int idx2 = new Random().nextInt(vomittingStatus.length);
         String vomittingStatusRandom  = (vomittingStatus[idx2]);
         
         int idx3 = new Random().nextInt(inflationStatus.length);
         String inflationStatusRandom  = (inflationStatus[idx3]);
        
        String treatment = param;
         
        String insertInAbdomen = "INSERT INTO Abdomen VALUES(NOW() ,'" + childID + "','" + vomittingStatusRandom + "','" + 
                feverStatusRandom + "','" + inflationStatusRandom + "')";
        stmnt.executeUpdate(insertInAbdomen);
        stmnt.close();
    }
    catch(Exception e){
    }
    
    }
    
}
