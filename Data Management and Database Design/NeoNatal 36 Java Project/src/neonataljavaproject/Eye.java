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
public class Eye extends TimerTask{
    
    String param;
    int childID;
    public Eye(String param,int childID){
     this.param = param;
     this.childID = childID;
    }

    @Override
    public void run() {
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","piyush","1234");
         
        Statement stmnt = (Statement)conn.createStatement();
         
        GenerateRandomNumbers gnr = new GenerateRandomNumbers();
        String[] eyeColor = {"Black" , "Blue"};
        String[] blockedTearDuct = {"Yes", "No"};
        
         int idx = new Random().nextInt(eyeColor.length);
         String eyeColorRandom = (eyeColor[idx]);
         
         int idx2 = new Random().nextInt(blockedTearDuct.length);
         String blockedTearDuctRandom  = (blockedTearDuct[idx2]);
        
        String treatment = param;
         
        String insertInEye = "INSERT INTO Eye VALUES(NOW() ,'" + childID + "','" + eyeColorRandom + "','" 
                + blockedTearDuctRandom + "')";
        
        stmnt.executeUpdate(insertInEye);
        stmnt.close();
    }
    catch(Exception e){
    }
    
    }
         
}