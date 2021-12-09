/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.OS.OS;
import java.util.List;

/**
 *
 * @author santo
 */
public class SystemSoftware {
    private int systemSoftwareId;
    private String systemSoftwareName;
    private List<OS> operatingSystem;

    public int getSystemSoftwareId() {
        return systemSoftwareId;
    }

    public void setSystemSoftwareId(int systemSoftwareId) {
        this.systemSoftwareId = systemSoftwareId;
    }

    public String getSystemSoftwareName() {
        return systemSoftwareName;
    }

    public void setSystemSoftwareName(String systemSoftwareName) {
        this.systemSoftwareName = systemSoftwareName;
    }

    public List<OS> getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(List<OS> operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    
    
}
