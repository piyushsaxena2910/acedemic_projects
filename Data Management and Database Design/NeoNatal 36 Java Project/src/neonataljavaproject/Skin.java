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
public class Skin extends TimerTask{
    String param;
    int childID;
    public Skin(String param,int childID){
     this.param = param;
     this.childID = childID;
   }

   @Override
   public void run() {
     try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal","admin","password");
         
         Statement stmnt = (Statement)conn.createStatement();
         
         GenerateRandomNumbers gnr = new GenerateRandomNumbers();

         float temperature = (float)gnr.genrateRandomNumber(9600, 10030)/100;
         String[] skinType = {"Yellow"};
         int idx = new Random().nextInt(skinType.length);
         String random = (skinType[idx]);
         
         String[] rashes = {"Yes","No"};
         int idxrashes = new Random().nextInt(rashes.length);
         String randomrashes = (rashes[idxrashes]);
         
         String insertInProbableDisease = "INSERT INTO Skin VALUES('" + random + "','" + 
                 temperature + "',NOW(),'" + childID + "','" + randomrashes + "');";
         System.out.println(insertInProbableDisease);
         stmnt.executeUpdate(insertInProbableDisease);
         stmnt.close();
     }
     catch(Exception e){
         
     }
   }
}
