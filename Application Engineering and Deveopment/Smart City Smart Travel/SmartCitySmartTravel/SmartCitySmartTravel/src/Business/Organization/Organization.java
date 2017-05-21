/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Traveller.TravellerDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author Piyush
 */
public abstract class Organization {
    private String name;
  private WorkQueue workQueue;
  private TravellerDirectory travellerDirectory;
  private UserAccountDirectory userAccountDirectory;
  private int organizationID;
  private static int counter = 1;
  protected ArrayList<Role> roles = null;
  
  public static enum Type
  {
    Admin("Admin Organization"),  CarOwner("Car Owner Organization"), 
    TravelSeeker("Travel Seeker Organization");
    
    private String value;
    
    private Type(String value)
    {
      this.value = value;
    }
    
    public String getValue()
    {
      return this.value;
    }
  }
  
  public Organization(String name)
  {
    this.name = name;
    this.workQueue = new WorkQueue();
    this.travellerDirectory = new TravellerDirectory();
    this.userAccountDirectory = new UserAccountDirectory();
    this.organizationID = counter;
    counter ++;
    this.roles = new ArrayList();
  }
  
  public abstract ArrayList<Role> getSupportedRole();
  
  public UserAccountDirectory getUserAccountDirectory()
  {
    return this.userAccountDirectory;
  }
  
  public int getOrganizationID()
  {
    return this.organizationID;
  }
  
  public TravellerDirectory getTravellerDirectory()
  {
    return this.travellerDirectory;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public WorkQueue getWorkQueue()
  {
    return this.workQueue;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setWorkQueue(WorkQueue workQueue)
  {
    this.workQueue = workQueue;
  }
  
  public String toString()
  {
    return this.name;
  }
}
