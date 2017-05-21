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
public class Patient {
    private ArrayList<VitalSign> vitalSignHistory;
    
    public Patient(){
    vitalSignHistory = new ArrayList<VitalSign>();
}

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
      
    public VitalSign addVitalSign(){
        VitalSign vs = new VitalSign();
        vitalSignHistory.add(vs);
        return vs;
    }
    public VitalSign searchPatient(String patientID)
    {
        for(VitalSign vs : vitalSignHistory){
            if(patientID.equals(vs.getPatientID())){
                return vs;
    }
    }
    return null;
}
    public void deleteVitalSign(VitalSign vs){
        vitalSignHistory.remove(vs);
    }   
    
}
