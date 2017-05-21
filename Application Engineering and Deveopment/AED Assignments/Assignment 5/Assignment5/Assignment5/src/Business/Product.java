/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author piyush
 */
public class Product {
    
    private String prodName;
    private int targetPrice;
    private int modelNumber;
    private int ceilPrice;
    private int floorPrice;
    private int avail;
    
    private static int count =0;

    

    
    public Product() {
    count++;
    modelNumber = count;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getCeilPrice() {
        return ceilPrice;
    }

    public void setCeilPrice(int ceilPrice) {
        this.ceilPrice = ceilPrice;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }
    
       
    
    @Override
    public String toString() {
        return prodName;
    } 
    
}
