/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.GPUInventory.GPUInventory;
import Business.Role.PharmacyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class PharmacyOrganization extends Organization{

    private ArrayList<GPUInventory> medList;
    public PharmacyOrganization() {
     
       super(Organization.Type.Pharmacy.getValue());
        medList=new ArrayList<GPUInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }

    public ArrayList<GPUInventory> getMedList() {
        return medList;
    }

    public void setMedList(ArrayList<GPUInventory> medList) {
        this.medList = medList;
    }
    
     public void addMedicine(GPUInventory mi)
    {
       
        medList.add(mi);
        
    }   
    
}
