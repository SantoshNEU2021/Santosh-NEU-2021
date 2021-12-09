/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GPUInventory;

import java.util.Date;

/**
 *
 * @author santo
 */
public class GPUInventory {
    
    private String GPUName;
    private int reorderLevel;
    private int minimumStock;
    private int maximumStock;
//    private Date expiryDate;
    private String wholesaleCategory;
    private int availQuantity;
    private double purchasePrice;
    private double sellingPrice;
    private int productId;
    private int serialNumber;
    private int requiredQuantity;
    private String reorderStatus="N";

    public String getGPUName() {
        return GPUName;
    }

    public void setGPUName(String GPUName) {
        this.GPUName = GPUName;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public int getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(int minimumStock) {
        this.minimumStock = minimumStock;
    }

    public int getMaximumStock() {
        return maximumStock;
    }

    public void setMaximumStock(int maximumStock) {
        this.maximumStock = maximumStock;
    }

//    public Date getExpiryDate() {
//        return expiryDate;
//    }
//
//    public void setExpiryDate(Date expiryDate) {
//        this.expiryDate = expiryDate;
//    }

    public String getWholesaleCategory() {
        return wholesaleCategory;
    }

    public void setWholesaleCategory(String WholesaleCategory) {
        this.wholesaleCategory = wholesaleCategory;
    }

    public int getAvailQuantity() {
        return availQuantity;
    }

    public void setAvailQuantity(int availQuantity) {
        this.availQuantity = availQuantity;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getRequiredQuantity() {
        return requiredQuantity;
    }

    public void setRequiredQuantity(int requiredQuantity) {
        this.requiredQuantity = requiredQuantity;
    }

    public String getReorderStatus() {
        return reorderStatus;
    }

    public void setReorderStatus(String reorderStatus) {
        this.reorderStatus = reorderStatus;
    }
    
     @Override
 public String toString(){
   return this.GPUName;
    }   
}
