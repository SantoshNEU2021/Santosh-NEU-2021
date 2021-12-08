/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Builder;

import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class PartsList {
    
    private ArrayList<Parts> partsList;
    
    public PartsList(){
        partsList=new ArrayList<Parts>();
    }

    public ArrayList<Parts> getPartsList() {
        return partsList;
    }

    public void setPrescriptionList(ArrayList<Parts> partsList) {
        this.partsList = partsList;
    }
    
    public Parts addParts(){
        Parts parts = new Parts();
        partsList.add(parts);
        return parts;
    }
    
}