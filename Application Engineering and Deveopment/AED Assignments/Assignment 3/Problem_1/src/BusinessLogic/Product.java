/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author Piyush
 */
class Product {
    
    private String name;
    private double price;
    private String operatingSystem;
    private String RAM;
    
    public Product(String name,int price,String operatingSystem,String RAM)
    {
        this.name = name;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.RAM = RAM;
        
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getRam() {
        return RAM;
    }

    public void setRam(String RAM) {
        this.RAM = RAM;
    }
    
    
    @Override
    public String toString()
    {
        return "Model Name :" + name + "\n" + "Price: " + price + "\n" + "Operating System: " + operatingSystem + "\n" + "RAM: " + RAM +"\n" + "\n";
    }

    
}
