/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RawMaterialInventoryManagement;

import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class RawCompoundDirectory {
      private ArrayList<RawCompound>rawCompoundDirectory;

    public RawCompoundDirectory() {
        rawCompoundDirectory =  new ArrayList<RawCompound>();
    }

    public ArrayList<RawCompound> getChemicalDirectory() {
        return rawCompoundDirectory;
    }

    public void setRawCompoundDirectory(ArrayList<RawCompound> rawCompoundDirectory) {
        this.rawCompoundDirectory = rawCompoundDirectory;
    }
    
    public RawCompound addRawCompound()
    {
        RawCompound ci = new RawCompound();
        rawCompoundDirectory.add(ci);
        return ci;
    }
    
    public void deleteRawCompound(RawCompound cid){
     rawCompoundDirectory.remove(cid);
    }

    
}
