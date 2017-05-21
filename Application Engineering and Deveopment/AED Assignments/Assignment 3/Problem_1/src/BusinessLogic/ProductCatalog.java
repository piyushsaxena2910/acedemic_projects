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
class ProductCatalog {
    
    private ArrayList<Product> productList = new ArrayList<>();

    
    
    public ProductCatalog(ArrayList<Product> productList){
        
        this.productList = productList;
    }

    @Override
    public String toString()
    {
        return "Product List - " + productList;
    }
    
}


    
