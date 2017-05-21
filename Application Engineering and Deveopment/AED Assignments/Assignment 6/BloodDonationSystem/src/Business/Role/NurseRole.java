/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import UserInterface.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author Piyush
 */
public class NurseRole extends Role{
    public JPanel createWorkArea(JPanel paramJPanel, UserAccount paramUserAccount, Organization paramOrganization, Enterprise paramEnterprise, EcoSystem paramEcosystem){
        return new NurseWorkAreaJPanel(paramJPanel,paramUserAccount,paramEnterprise,paramOrganization,paramEcosystem);
    }
}
