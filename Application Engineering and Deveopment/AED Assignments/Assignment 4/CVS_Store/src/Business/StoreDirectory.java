/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class StoreDirectory {
    private ArrayList<CVSStore> storeList;
    
    public StoreDirectory(){
        storeList=new ArrayList<CVSStore>();
    }

    public ArrayList<CVSStore> getStoreList() {
        return storeList;
    }

    public void setStoreList(ArrayList<CVSStore> storeList) {
        this.storeList = storeList;
    }
    
    public CVSStore addStore(){
        CVSStore cvsStore = new CVSStore();
        storeList.add(cvsStore);
        return cvsStore;
    }
    
    public CVSStore searchStore(int storeID){
        for(CVSStore cvsStore : storeList){
            if(cvsStore.getStoreID()==storeID){
                return cvsStore;
            }
        }
        return null;
    }
}
