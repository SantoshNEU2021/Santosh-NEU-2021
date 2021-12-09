/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author santo
 */
public class WholesalerWorkRequest extends WorkRequest{
    private String GPUnitName;
    private int quantity;
    private Date requestDate;
    private String status;
    private String supplierName;
    private String buildName;
    private String network;

    public String getGPUnitName() {
        return GPUnitName;
    }

    public void setGPUnitName(String GPUnitName) {
        this.GPUnitName = GPUnitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setPatientName(String buildName) {
        this.buildName = buildName;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    
    @Override
    public String toString(){
        return this.GPUnitName;
    }
    
}
