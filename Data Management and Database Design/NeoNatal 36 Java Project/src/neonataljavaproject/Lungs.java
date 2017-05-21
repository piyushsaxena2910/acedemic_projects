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
 * @author Piyush
 */
public class Lungs extends TimerTask{
    String param;
    int childID;
    
    public Lungs(String param,int childID){
     this.param = param;
     this.childID = childID;
    }
     @Override
   public void run() {
     try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","piyush","1234");
         
         Statement stmnt = (Statement)conn.createStatement();
         
         GenerateRandomNumbers gnr = new GenerateRandomNumbers();

         int respiratoryRate = gnr.genrateRandomNumber(12, 25);         
         
         String insertInProbableDisease = "INSERT INTO CardiacDetails VALUES(NOW(),'" + childID + "','" 
                 + respiratoryRate + "')";
         stmnt.executeUpdate(insertInProbableDisease);
         stmnt.close();
     }
     catch(Exception e){
         
     }
   
    }
}
