/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.GPUInventory.GPUInventory;
import Business.Role.WholesaleRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class WholesaleOrganization extends Organization{

    private ArrayList<GPUInventory> GPUList;
    public WholesaleOrganization() {
     
       super(Organization.Type.Wholesaler.getValue());
        GPUList=new ArrayList<GPUInventory>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WholesaleRole());
        return roles;
    }

    public ArrayList<GPUInventory> getGPUList() {
        return GPUList;
    }

    public void setGPUList(ArrayList<GPUInventory> GPUList) {
        this.GPUList = GPUList;
    }
    
     public void addGPU(GPUInventory g)
    {
       
        GPUList.add(g);
        
    }   
    
}
