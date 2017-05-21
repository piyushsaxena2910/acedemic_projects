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
public class BloodPressure extends TimerTask{
    String param;
    int childID;
    public BloodPressure(String param,int childID){
     this.param = param;
     this.childID = childID;
   }

   @Override
   public void run() {
     try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","piyush","1234");
         
         Statement stmnt = (Statement)conn.createStatement();
         
         GenerateRandomNumbers gnr = new GenerateRandomNumbers();

         int systolic = gnr.genrateRandomNumber(100, 120);
         int diastolic = gnr.genrateRandomNumber(75, 80);
         
         
         String insertInProbableDisease = "INSERT INTO BloodPressure VALUES(NOW(),'" + childID + "','" 
                 + systolic + "','" + diastolic + "')";
         stmnt.executeUpdate(insertInProbableDisease);
         stmnt.close();
     }
     catch(Exception e){
         
     }
   }
}
