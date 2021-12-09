/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Builder;

/**
 *
 * @author santo
 */
public class Builder {
    private String builderName;
    private PartsList partsList;

    public Builder() {
        partsList = new PartsList();
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public PartsList getPartsList() {
        return partsList;
    }

    public void setPrescriptionList(PartsList partsList) {
        this.partsList = partsList;
    }
    
    
    
    
}