package Business;

import Business.Organization.Organization;
import Business.Role.SystemAdminRole;
import Business.Traveller.Traveller;
import Business.UserAccount.UserAccount;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piyush
 */
public class ConfigureASystem {
    public static EcoSystem configure()
  {
    EcoSystem system = EcoSystem.getInstance();
    Organization org = (Organization)system;
    Traveller traveller = system.getTravellerDirectory().createTraveller("RRH",org);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", traveller, new SystemAdminRole());
    return system;
  }
}
