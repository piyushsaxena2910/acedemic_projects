/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CarOwner;

import Business.Car.Car;
import Business.Traveller.Traveller;

/**
 *
 * @author Piyush
 */
public class CarOwner extends Traveller{
    private Car car;
    private String location;
    private int fromTime;
    private int toTime;
    private int basePricePerHour;
    private int raisedPricePerHour;
    private int raisePriceAferHours;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getFromTime() {
        return fromTime;
    }

    public void setFromTime(int fromTime) {
        this.fromTime = fromTime;
    }

    public int getToTime() {
        return toTime;
    }

    public void setToTime(int toTime) {
        this.toTime = toTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBasePricePerHour() {
        return basePricePerHour;
    }

    public void setBasePricePerHour(int basePricePerHour) {
        this.basePricePerHour = basePricePerHour;
    }

    public int getRaisedPricePerHour() {
        return raisedPricePerHour;
    }

    public void setRaisedPricePerHour(int raisedPricePerHour) {
        this.raisedPricePerHour = raisedPricePerHour;
    }

    public int getRaisePriceAferHours() {
        return raisePriceAferHours;
    }

    public void setRaisePriceAferHours(int raisePriceAferHours) {
        this.raisePriceAferHours = raisePriceAferHours;
    }
    
}
