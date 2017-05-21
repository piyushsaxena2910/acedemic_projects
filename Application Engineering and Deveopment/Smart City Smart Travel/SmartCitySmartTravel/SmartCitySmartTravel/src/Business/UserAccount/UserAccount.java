/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Traveller.Traveller;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
/**
 *
 * @author Piyush
 */
public class UserAccount {
  private String username;
  private String password;
  private Traveller traveller;
  private Role role;
  private WorkQueue workQueue;
  
  public UserAccount()
  {
    this.workQueue = new WorkQueue();
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setUsername(String username)
  {
    this.username = username;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
  
  public Role getRole()
  {
    return this.role;
  }
  
  public void setTraveller(Traveller traveller)
  {
    this.traveller = traveller;
  }
  
  public void setRole(Role role)
  {
    this.role = role;
  }
  
  public Traveller getTraveller()
  {
    return this.traveller;
  }
  
  public WorkQueue getWorkQueue()
  {
    return this.workQueue;
  }
  
  public String toString()
  {
    return this.username;
  }
}
