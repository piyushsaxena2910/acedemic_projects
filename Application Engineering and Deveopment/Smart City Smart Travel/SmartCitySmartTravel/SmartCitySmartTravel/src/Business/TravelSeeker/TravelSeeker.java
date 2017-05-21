/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TravelSeeker;

import Business.Car.Car;
import Business.Traveller.Traveller;

/**
 *
 * @author Piyush
 */
public class TravelSeeker extends Traveller{
    private String location;
    private Car car;
    private int carNeededFrom;
    private int carNeededUntil;
    private String destinationLocation;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getCarNeededFrom() {
        return carNeededFrom;
    }

    public void setCarNeededFrom(int carNeededFrom) {
        this.carNeededFrom = carNeededFrom;
    }

    public int getCarNeededUntil() {
        return carNeededUntil;
    }

    public void setCarNeededUntil(int carNeededUntil) {
        this.carNeededUntil = carNeededUntil;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
    
    
}
