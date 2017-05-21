    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class CarOwnerOrganization extends Organization{
  public CarOwnerOrganization()
  {
    super(Organization.Type.CarOwner.getValue());
  }
  
  public ArrayList<Role> getSupportedRole()
  {
    return this.roles;
  }   
}
