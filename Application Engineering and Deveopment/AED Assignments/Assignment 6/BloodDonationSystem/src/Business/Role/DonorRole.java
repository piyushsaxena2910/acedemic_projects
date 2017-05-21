/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import UserInterface.DonorRole.DonorWorkAreaJPanel;

/**
 *
 * @author Piyush
 */
public class DonorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
        return new DonorWorkAreaJPanel(pnl, ua, (DonorOrganization)o, e);
    }
   
}
