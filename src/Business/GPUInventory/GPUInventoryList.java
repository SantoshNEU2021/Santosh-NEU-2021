/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GPUInventory;

import java.util.ArrayList;

/**
 *
 * @author santo
 */
public class GPUInventoryList {
    
     private ArrayList<GPUInventory> GPUList;

    public GPUInventoryList() {
        GPUList=new ArrayList<>();
        }

    public ArrayList<GPUInventory> getGPUList() {
        return GPUList;
    }

    public void setGPUList(ArrayList<GPUInventory> GPUList) {
        this.GPUList = GPUList;
    }
    
     public GPUInventory addGPU()
    {
        GPUInventory gpu = new GPUInventory();
        GPUList.add(gpu);
        return gpu;
    }
    
    public void deleteGPU(GPUInventory gpu){
     GPUList.remove(gpu);
    }
}
