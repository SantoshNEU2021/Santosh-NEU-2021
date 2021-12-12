/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Builder.Parts;
import Business.Organization.AdminOrganization;
import Business.WorkQueue.BuilderWorkRequest;
import java.util.Random;

/**
 *
 * @author krish
 */
public class DataGenerator {
    
    private static Random rand = new Random();
    private static String[] network = {"Canada", "England", "Australia"};

//    private static String[] beginning = {"kr", "ca", "Ra", "Ho", "Lj", "pg", "kre", "lop", "mat"};
//    private static String[] middle = {"air", "cal", "Pla", "ghdo", "kal", "hkg", "pokre", "lojop", "mploat"};

    private static String[] storeName = {"IE Tech","Arknemesis","League of PCs","The IT Depot"};

    private static String[] organisationName = {"PC Builder", "Software Engineer", "Wholesaler", "Supplier", "Raw Materials"};

    private static String[] gpuName = {"RTX 3080", "RTX 3070", "RTX 3060", "GTX 1080ti", "Radeon RX 6900XT", "RTX Titan", "Radeon RX6800"};
    
    private static String[] cpuName = {"Intel i7 11700K","Intel i7 10700K","Intel i5 11500","AMD Ryzen 5 5800X","AMD Ryzen 9 5900X","AMD Ryzen 7 5700X"};
    
    private static String[] softwareName = {"Windows 11 Home","Windows 11 Pro","Windows 10 Home","Windows 10 Pro","McAfee","Norton"};
    
    public static String generateNetwork() {
        return network[rand.nextInt(network.length)];
    }
    
     public static String generateStoreName() {
        return storeName[rand.nextInt(storeName.length)];
    }
     
      public static String generationOrganisationName() {
        return organisationName[rand.nextInt(organisationName.length)];
    }
      
    public static String generateGPU() {

        return gpuName[rand.nextInt(gpuName.length)];

    }
    
     public static String generateCPU() {

        return cpuName[rand.nextInt(cpuName.length)];

    }
     
    public static String generateSoftware() {

        return softwareName[rand.nextInt(softwareName.length)];

    }
     
     public static Parts InitGPU() {

        Parts part = new Parts();
        part.setGPU(generateGPU());
        part.setNetworkName(generateNetwork());
        
        return part;

    }
     
     public static AdminOrganization InitOrgName() {

        AdminOrganization admin = new AdminOrganization();

        admin.setOrganizationName(generationOrganisationName());
        return admin;

    }
    
     public static Parts InitCPU() {

        Parts parts = new Parts();
        parts.setNetworkName(generateNetwork());
        parts.setCPU(generateCPU());
        
        return parts;

    }
    
    
}
