/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Traveller.Traveller;

/**
 *
 * @author Piyush
 */
public class CarPoolWorkRequest extends WorkRequest{
    
    private String testResult;
    private Traveller travellerWithCar;
    private Traveller travellerWithoutCar;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Traveller getTravellerWithCar() {
        return travellerWithCar;
    }

    public void setTravellerWithCar(Traveller travellerWithCar) {
        this.travellerWithCar = travellerWithCar;
    }

    public Traveller getTravellerWithoutCar() {
        return travellerWithoutCar;
    }

    public void setTravellerWithoutCar(Traveller travellerWithoutCar) {
        this.travellerWithoutCar = travellerWithoutCar;
    }

}
