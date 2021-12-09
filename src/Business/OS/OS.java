/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OS;

/**
 *

 * @author santo
 */
public class OS {
    private String operatingSystemName;
    private int id;
    private static int count =1;

    public OS() {
        id=count;
        count++;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "OS{" + "OSName=" + operatingSystemName + ", id=" + id + '}';
    }


    
}