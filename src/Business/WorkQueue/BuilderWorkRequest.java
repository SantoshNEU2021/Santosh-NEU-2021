/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author santo
 */
public class BuilderWorkRequest  extends WorkRequest{
    
    private UserAccount reciver;
    private UserAccount sender;
    private String gpuName;
    private Date requestDate;
    private String status;
    private String storeName;
    private String buildName;
    private String test;
    private int quantity;
    private String sex;

    public UserAccount getReciver() {
        return reciver;
    }

    public void setReciver(UserAccount reciver) {
        this.reciver = reciver;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public String getGPUname() {
        return gpuName;
    }

    public void setGPUname(String gpuName) {
        this.gpuName = gpuName;
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

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setPaitentName(String buildName) {
        this.buildName = buildName;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
    
}
