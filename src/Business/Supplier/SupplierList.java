/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class SupplierList {
    
    private ArrayList<Supplier> supplierList;
     
    public SupplierList() {
       this.supplierList = new ArrayList<Supplier>();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> drugList) {
        this.supplierList = supplierList;
    }
    
    public Supplier addSupplierList() {
       Supplier supplier = new Supplier();
       supplierList.add(supplier);
       return supplier;
       
   }
}