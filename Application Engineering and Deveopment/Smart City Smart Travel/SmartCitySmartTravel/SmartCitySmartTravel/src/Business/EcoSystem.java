/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
  private ArrayList<Network> networkList;
  
  public static EcoSystem getInstance()
  {
    if (business == null) {
      business = new EcoSystem();
    }
    return business;
  }
  
  private EcoSystem()
  {
    super(null);
    this.networkList = new ArrayList();
  }
  
  public ArrayList<Network> getNetworkList()
  {
    return this.networkList;
  }
  
  public Network createAndAddNetwork()
  {
    Network network = new Network();
    this.networkList.add(network);
    return network;
  }
  
  public ArrayList<Role> getSupportedRole()
  {
    return this.roles;
  }
  
  public boolean checkIfUsernameIsUnique(String username)
  {
    if (!getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
      return false;
    }
    return true;
  }
}
