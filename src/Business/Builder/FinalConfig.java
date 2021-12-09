/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Builder;

/**
 *
 * @author harold
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;


/**
 *
 * @author santo
 */
public class FinalConfig {
    private int buildID;
    private String buildName;
    private int cores;
    private String cpuType;
    private String softwareType;
//    private GeneHistory geneHistory;
    private String gpuType;
    private String newSupply;
//    private String clinicalStatus;

//    public Patient() {
//        geneHistory = new GeneHistory();
//    }
    
    

    public int getBuildId() {
        return buildID;
    }

    public void setBuildId(int buildID) {
        this.buildID = buildID;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getCPUType() {
        return cpuType;
    }

    public void setCPUType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getSoftwareType() {
        return softwareType;
    }

    public void setSoftwareType(String softwareType) {
        this.softwareType = softwareType;
    }

//    public GeneHistory getGeneHistory() {
//        return geneHistory;
//    }

//    public void setGeneHistory(GeneHistory geneHistory) {
//        this.geneHistory = geneHistory;
//    }

    public String getGPUType() {
        return gpuType;
    }

    public void setGPUType(String gpuType) {
        this.gpuType = gpuType;
    }

    public String getNewSupply() {
        return newSupply;
    }

    public void setNewSupply(String newSupply) {
        this.newSupply = newSupply;
    }

//    public String getClinicalStatus() {
//        return clinicalStatus;
//    }

//    public void setClinicalStatus(String clinicalStatus) {
//        this.clinicalStatus = clinicalStatus;
//    }
    
    @Override
    public String toString(){
        return this.buildName;
    }
}

