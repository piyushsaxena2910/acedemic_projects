/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SmartTravelEnterprise;
import Business.Network.Network;
import Business.Organization.CarOwnerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CarOwnerRole.CarOwnerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Piyush
 */
public class CarOwnerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es, Network network) {
        return new CarOwnerWorkAreaJPanel(pnl, ua, (CarOwnerOrganization)o, e);
    }
}
