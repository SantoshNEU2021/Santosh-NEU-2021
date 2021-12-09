/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RawMaterialRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class RawMaterialOrganization extends Organization{

    public RawMaterialOrganization() {
        super(Organization.Type.RawMaterials.getValue());
    }
    
      @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RawMaterialRole());
        return roles;
    }

}
