/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SoftwareEngineerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class SoftwareOrganization extends Organization{

    public SoftwareOrganization() {
        super(Organization.Type.Software.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SoftwareEngineerRole());
        return roles;
    }
     
   
    
    
}
