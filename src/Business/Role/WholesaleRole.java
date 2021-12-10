/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.WholesaleOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.WholesaleRole.WholesaleWorkAreaJPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santo
 */
public class WholesaleRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
      return new WholesaleWorkAreaJPanel(userProcessContainer, account, (WholesaleOrganization)organization,enterprise,network);
    }
}
