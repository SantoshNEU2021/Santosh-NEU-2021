/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Builder.getValue())){
            organization = new BuilderOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Wholesaler.getValue())){
            organization=new WholesaleOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Software.getValue())){
            organization = new SoftwareOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Supplier.getValue())){
            organization=new SupplierOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Type.RawMaterials.getValue())){
            organization=new RawMaterialOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}