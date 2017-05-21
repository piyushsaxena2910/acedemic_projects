/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BusinessLogic;
import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignHistory;

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSignHistory(){
    vitalSignHistory = new ArrayList<>();
}
    public VitalSign addVitalSign(){
        VitalSign va = new VitalSign();
        vitalSignHistory.add(va);
        return va;
    }
    
    public void deleteVitalSign(VitalSign vs){
        vitalSignHistory.remove(vs);
    }   
    
}
