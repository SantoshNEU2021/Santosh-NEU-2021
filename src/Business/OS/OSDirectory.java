/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OS;


import java.util.ArrayList;

/**
 *
 * @author krish
 */
public class OSDirectory {
    private ArrayList<OS> operatingSystemList;

    public OSDirectory() {
        
        operatingSystemList = new  ArrayList<OS>();
    }

    public ArrayList<OS> getOSList() {
        return operatingSystemList;
    }

    public void setOSList(ArrayList<OS> operatingSystemList) {
        this.operatingSystemList = operatingSystemList;
    }
    
    public OS addOS(){
        OS os = new OS();
        operatingSystemList.add(os);
        return os;
    }


    

}