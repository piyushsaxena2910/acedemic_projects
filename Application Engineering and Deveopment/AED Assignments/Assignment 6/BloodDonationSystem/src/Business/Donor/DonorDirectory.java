/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Piyush
 */
public class DonorDirectory extends Employee{
    public ArrayList<Donor> donorList;

    public DonorDirectory(){
        donorList = new ArrayList<>();
    }
    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    
    public Donor addDonor(){
        Donor donor = new Donor();
        donorList.add(donor);
        return donor;
    }
    
}
