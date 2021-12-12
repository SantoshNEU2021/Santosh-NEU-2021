/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Builder.Parts;
import Business.Role.BuilderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class BuilderOrganization extends Organization{
    private ArrayList<Parts> partsList;
    public BuilderOrganization() {
        super(Organization.Type.Builder.getValue());
        partsList = new ArrayList<Parts>();
    }

    public ArrayList<Parts> getPartslist() {
        return  partsList;
    }

    public void setPartslist(ArrayList<Parts>  partsList) {
        this. partsList =  partsList;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BuilderRole());
        return roles;
    }
     
    public void addParts(Parts parts){
        
          partsList.add(parts);
         
        
    }
}