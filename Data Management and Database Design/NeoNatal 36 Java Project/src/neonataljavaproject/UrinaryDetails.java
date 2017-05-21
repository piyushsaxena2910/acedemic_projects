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
public class UrinaryDetails extends TimerTask{
    String param;
    int childID;
    public UrinaryDetails(String param,int childID){
     this.param = param;
     this.childID = childID;
   }

   @Override
   public void run() {
     try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","piyush","1234");
         
         Statement stmnt = (Statement)conn.createStatement();
         
         GenerateRandomNumbers gnr = new GenerateRandomNumbers();
         float urochrome = (float)gnr.genrateRandomNumber(1005, 1035)/1000;   
         
         String[] VCUG_Status = {"Yes","No"};
         int idxVCUG_Status = new Random().nextInt(VCUG_Status.length);
         String randomVCUG_Status = (VCUG_Status[idxVCUG_Status]);
         
         String insertInProbableDisease = "INSERT INTO UrinaryDetails VALUES(NOW(),'" + childID + "','" 
                 + urochrome + "','" + randomVCUG_Status + "')";
         stmnt.executeUpdate(insertInProbableDisease);
         stmnt.close();
     }
     catch(Exception e){
         
     }
   }
}
