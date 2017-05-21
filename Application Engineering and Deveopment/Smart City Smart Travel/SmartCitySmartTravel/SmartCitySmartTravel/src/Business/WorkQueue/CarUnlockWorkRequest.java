/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.TravelSeeker.TravelSeeker;
import Business.Traveller.Traveller;
/**
 *
 * @author Piyush
 */
public class CarUnlockWorkRequest extends WorkRequest{
  private String testResult;
  private Traveller carOwner;
  
  public String getTestResult()
  {
    return this.testResult;
  }
  
  public void setTestResult(String testResult)
  {
    this.testResult = testResult;
  }

    public Traveller getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(Traveller carOwner) {
        this.carOwner = carOwner;
    }
  
  
}
