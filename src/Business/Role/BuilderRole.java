package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.BuilderOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.BuilderRole.BuilderWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class BuilderRole extends Role{

    @Override

   
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new BuilderWorkAreaJPanel(userProcessContainer,account,(BuilderOrganization)organization,enterprise,business,network);

    }
    
    
}