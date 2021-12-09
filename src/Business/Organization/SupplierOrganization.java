/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.RawMaterialInventoryManagement.RawCompound;
import Business.Role.SupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class SupplierOrganization extends Organization{
    
  private ArrayList<RawCompound> rawCompoundList;

    public SupplierOrganization() {
        
        super(Organization.Type.Supplier.getValue());
        rawCompoundList =  new ArrayList<RawCompound>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }

    
    public ArrayList<RawCompound> getRawCompoundListList() {
        return rawCompoundList;
    }

    public void setChemList(ArrayList<RawCompound> rawCompoundListList) {
        this.rawCompoundList = rawCompoundList;
    }

    
    
    public void addChemical(RawCompound cdi)
    {
       
       rawCompoundList.add(cdi);
        
    }
    
   
    
}
