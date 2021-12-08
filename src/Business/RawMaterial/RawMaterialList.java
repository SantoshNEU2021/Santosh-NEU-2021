/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RawMaterial;

import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class RawMaterialList {
    private ArrayList<RawMaterial> materialList;

    public RawMaterialList() {
         this.materialList = new ArrayList<RawMaterial>();
    }

    public ArrayList<RawMaterial> getRawMaterialList() {
        return materialList;
    }

    public void setChemicalList(ArrayList<RawMaterial> rawMaterial) {
        this.materialList = materialList;
    }
      public RawMaterial addRawMaterialList()
   {
       RawMaterial c = new RawMaterial();
       materialList.add(c);
       return c;
       
   }
}