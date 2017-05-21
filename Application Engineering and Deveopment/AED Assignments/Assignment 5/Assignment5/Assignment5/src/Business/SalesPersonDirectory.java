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
public class SalesPersonDirectory {
    private ArrayList<SalesPerson> salesPersonList;
    
    public SalesPersonDirectory(){
        salesPersonList = new ArrayList<SalesPerson>();
    }

    public ArrayList<SalesPerson> getSalesPersonList() {
        return salesPersonList;
    }

    public void setSalesPersonList(ArrayList<SalesPerson> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }
    
    public SalesPerson addSalesPerson(){
        SalesPerson sp = new SalesPerson();
        salesPersonList.add(sp);
        return sp;
    }
}
