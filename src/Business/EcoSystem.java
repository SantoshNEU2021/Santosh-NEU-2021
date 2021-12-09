/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.RawMaterial.RawMaterialList;
import Business.Supplier.SupplierList;
//import Business.Gene.GeneHistory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private RawMaterialList rawMaterialList;
    private SupplierList supplierList;
//    private GeneHistory geneList;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        supplierList = new SupplierList(); 
        rawMaterialList = new RawMaterialList();
//        geneList = new GeneHistory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }

    public SupplierList getSupplierList() {
        return supplierList;
    }

    public void setDrugList(SupplierList supplierList) {
        this.supplierList = supplierList;
    }

    public RawMaterialList getRawMaterialList() {
        return rawMaterialList;
    }

    public void setRawMaterialList(RawMaterialList rawMaterialList) {
        this.rawMaterialList = rawMaterialList;
    }

//    public GeneHistory getGeneList() {
//        return geneList;
//    }
//
//    public void setGeneList(GeneHistory geneList) {
//        this.geneList = geneList;
//    }
    
}
