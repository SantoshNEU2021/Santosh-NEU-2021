/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.SystemSoftware;
import Business.Builder.FinalConfig;
import Business.OS.OS;
import java.util.List;
import java.util.Map;

/**
 *
 * @author santo
 */
public class SoftwareWorkRequest extends WorkRequest{
    
    private String testResult;
    private Map<SystemSoftware, List<OS>> systemSoftwareList;
    private String buildName;
    private FinalConfig build;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public Map<SystemSoftware, List<OS>> getSystemSoftwareList() {
        return systemSoftwareList;
    }

    public void setSystemSoftwareList(Map<SystemSoftware, List<OS>> systemSoftwareList) {
        this.systemSoftwareList = systemSoftwareList;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public FinalConfig getBuild() {
        return build;
    }

    public void setBuild(FinalConfig build) {
        this.build = build;
    }
    
    @Override
    public String toString(){
        return this.buildName;
    }
    
}
