/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Builder;

import java.util.Date;

/**
 *
 * @author santo
 */
public class Parts {
    private int NoofTimesInaday;
    private int totalDays;
    private String CPU;
    private String GPU;

    private Date PartsDeliveryDate;
    private String networkName;

    public int getNoofTimesInaday() {
        return NoofTimesInaday;
    }

    public void setNoofTimesInaday(int NoofTimesInaday) {
        this.NoofTimesInaday = NoofTimesInaday;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public Date getPartsDeliveryDate() {
        return PartsDeliveryDate;
    }

    public void setPartsDeliveryDate(Date PartsDeliveryDate) {
        this.PartsDeliveryDate = PartsDeliveryDate;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
}
