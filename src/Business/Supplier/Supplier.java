/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;
import Business.RawMaterial.RawMaterialList;

/**
 *
 * @author santo
 */
public class Supplier {
    
    private int supplierId;
    private String supplyName;
    private RawMaterialList materialList;
//    private GeneHistory geneHistory;
    private static int counter=0;    
    
    public Supplier(){
        materialList = new RawMaterialList();
//        geneHistory = new GeneHistory();
        supplierId = counter;
        ++counter;
    }

    public int getDrugId() {
        return supplierId;
    }   

    public String getDrugName() {
        return supplyName;
    }

    public void setDrugName(String drugName) {
        this.supplyName = drugName;
    }

    public RawMaterialList getRawMaterialList() {
        return materialList;
    }

    public void setRawMaterialList(RawMaterialList materialList) {
        this.materialList = materialList;
    }

//    public GeneHistory getGeneHistory() {
//        return geneHistory;
//    }

//    public void setGeneHistory(GeneHistory geneHistory) {
//        this.geneHistory = geneHistory;
//    }   
    
    @Override
     public String toString(){
       return this.supplyName;
        }
    
}
