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
public class Blood extends TimerTask{
    String param;
    int childID;
    public Blood(String param,int childID){
     this.param = param;
     this.childID = childID;
   }

   @Override
   public void run() {
     try{
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/neonatal_demo","root","1234");
         
         Statement stmnt = (Statement)conn.createStatement();
         
         GenerateRandomNumbers gnr = new GenerateRandomNumbers();
         
         String[] bloodGroup = {"A+","A-","B+","B-","O+","O-","AB+"};
         int idx = new Random().nextInt(bloodGroup.length);
         String random = (bloodGroup[idx]);

         int wbc = gnr.genrateRandomNumber(1700, 2500);
         int rbc = gnr.genrateRandomNumber(4700, 5400);
         float bilurubin = (float)gnr.genrateRandomNumber(3,12)/10;
         
         
         String insertInProbableDisease = "INSERT INTO Blood VALUES(NOW(),'" + random + "','" + childID + "','" 
                 + wbc + "','" + rbc + "','" + bilurubin + "')";
         
         
         stmnt.executeUpdate(insertInProbableDisease);
         stmnt.close();
     }
     catch(Exception e){
         
     }
   }
}
