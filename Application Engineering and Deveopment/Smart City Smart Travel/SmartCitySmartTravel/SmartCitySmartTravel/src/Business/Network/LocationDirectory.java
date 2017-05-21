/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class LocationDirectory {
    private ArrayList<Location> locationList;

    public LocationDirectory() {
    locationList = new ArrayList<>();
    }
    
    public Location addLocation(){
        Location location = new Location();
        locationList.add(location);
        return location;
    }

    public ArrayList<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(ArrayList<Location> locationList) {
        this.locationList = locationList;
    }
    
    
}
