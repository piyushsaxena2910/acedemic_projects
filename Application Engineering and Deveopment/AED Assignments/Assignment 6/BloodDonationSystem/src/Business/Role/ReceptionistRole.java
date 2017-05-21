/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import UserInterface.ReceptionistRole.ReceptionistWorkAreaJPanel;
/**
 *
 * @author Piyush
 */
public class ReceptionistRole extends Role{
    public JPanel createWorkArea(JPanel paramJPanel, UserAccount paramUserAccount, Organization paramOrganization, Enterprise paramEnterprise, EcoSystem paramEcosystem){
        return new ReceptionistWorkAreaJPanel(paramJPanel,paramUserAccount,(ReceptionistOrganization)paramOrganization,paramEnterprise);
    }
}
