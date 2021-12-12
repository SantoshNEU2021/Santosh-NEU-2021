/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.RawMaterial.RawMaterial;
import Business.Builder.FinalConfig;
import Business.Supplier.Supplier;
import Business.Supplier.SupplierList;
import Business.OS.OS;
import java.util.List;
import java.util.Map;

/**
 *
 * @author santo
 */
public class SupplierWorkRequest extends WorkRequest{
    
    private String supplierName;
    private int Quantity;
    private String deliveryTime;
    private FinalConfig build;
    private Map<OS,RawMaterial>OSRaw;
    private Map<Supplier,List<RawMaterial>>SupplierRaw;
   
    
   
   
    

    public FinalConfig getBuild() {
        return build;
    }

    public void setBuild(FinalConfig build) {
        this.build = build;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Map<OS, RawMaterial> getOSRaw() {
        return OSRaw;
    }

    public void setOSRaw(Map<OS, RawMaterial> OSRaw) {
        this.OSRaw = OSRaw;
    }

    public Map<Supplier, List<RawMaterial>> getSupplierRaw() {
        return SupplierRaw;
    }

    public void setDrugChemical(Map<Supplier, List<RawMaterial>> SupplierRaw) {
        this.SupplierRaw = SupplierRaw;
    }

    
    @Override
     public String toString(){
       return this.supplierName;
        }  
    
   
    
}
