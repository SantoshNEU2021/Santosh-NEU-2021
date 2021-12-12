/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;
import Business.OS.OSDirectory;
import Business.RawMaterial.RawMaterialList;

/**
 *
 * @author santo
 */
public class Supplier {
    
    private int supplierId;
    private String supplyName;
    private RawMaterialList materialList;
    private OSDirectory osDirectory;
    private static int counter=0;    
    
    public Supplier(){
        materialList = new RawMaterialList();
        osDirectory = new OSDirectory();
        supplierId = counter;
        ++counter;
    }

    public int getGPUId() {
        return supplierId;
    }   

    public String getGPUName() {
        return supplyName;
    }

    public void setGPUName(String drugName) {
        this.supplyName = drugName;
    }

    public RawMaterialList getRawMaterialList() {
        return materialList;
    }

    public void setRawMaterialList(RawMaterialList materialList) {
        this.materialList = materialList;
    }
    
    public OSDirectory getOSDirectory() {
        return osDirectory;
   }

   public void setOSDirectory(OSDirectory osDirectory) {
        this.osDirectory = osDirectory;
   }   
    
    @Override
     public String toString(){
       return this.supplyName;
        }
    
}
