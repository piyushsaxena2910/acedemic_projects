/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Role.Role;

/**
 *
 * @author Piyush
 */
public class SmartTravelEnterprise extends Enterprise{
    public SmartTravelEnterprise(String name)
  {
    super(name, Enterprise.EnterpriseType.SmartTravel);
  }
  
  public ArrayList<Role> getSupportedRole()
  {
    return this.roles;
  }
}
