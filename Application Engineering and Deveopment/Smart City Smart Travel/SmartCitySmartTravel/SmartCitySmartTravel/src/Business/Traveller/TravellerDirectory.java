/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Traveller;
import Business.CarOwner.CarOwner;
import Business.Organization.CarOwnerOrganization;
import Business.Organization.Organization;
import Business.Organization.TravelSeekerOrganization;
import Business.TravelSeeker.TravelSeeker;
import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class TravellerDirectory {
    private ArrayList<Traveller> travellerList;
  
  public TravellerDirectory()
  {
    this.travellerList = new ArrayList();
  }
  
  public ArrayList<Traveller> getTravellerList()
  {
    return this.travellerList;
  }
  
  public Traveller createTraveller(String name, Organization organization)
  {
    if(organization instanceof CarOwnerOrganization){
        Traveller traveller = new CarOwner();
        traveller.setName(name);
        this.travellerList.add(traveller);
        return traveller;
    }
    else if(organization instanceof TravelSeekerOrganization){
        Traveller traveller = new TravelSeeker();
        traveller.setName(name);
        this.travellerList.add(traveller);
        return traveller;
  }
    return null;
}
}