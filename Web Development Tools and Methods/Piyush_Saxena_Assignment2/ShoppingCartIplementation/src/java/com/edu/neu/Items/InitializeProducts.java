/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.neu.Items;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Piyush
 */
public class InitializeProducts {
    
    public static List<Products>getAvailableProducts(){
        List<Products>productList = new ArrayList<>();
        Products p1 = new Products();
        p1.setCategory("Laptop");
        p1.setPrice((float) 400.00);
        p1.setProductName("Lenovo G50 [$400.00]");
        
        Products p2 = new Products();
        p2.setCategory("Laptop");
        p2.setPrice((float) 250.00);
        p2.setProductName("Lenovo C20 [$250.00]");
        
        Products p3 = new Products();
        p3.setCategory("Laptop");
        p3.setPrice((float) 450.00);
        p3.setProductName("Lenovo M10 [$450.00]");
        
        Products p4 = new Products();
        p4.setCategory("Books");
        p4.setPrice((float) 10.00);
        p4.setProductName("Book 1 [$10.00]");
        
        Products p5 = new Products();
        p5.setCategory("Books");
        p5.setPrice((float) 70.00);
        p5.setProductName("Book 2 [$70.00]");
        
        Products p6 = new Products();
        p6.setCategory("Books");
        p6.setPrice((float) 12.50);
        p6.setProductName("Book 3 [$12.50]");
        
        Products p7 = new Products();
        p7.setCategory("Music");
        p7.setPrice((float) 80.00);
        p7.setProductName("Music 1 [$80.00]");
        
        Products p8 = new Products();
        p8.setCategory("Music");
        p8.setPrice((float) 25.00);
        p8.setProductName("Music 2 [$25.00]");
        
        Products p9 = new Products();
        p9.setCategory("Music");
        p9.setPrice((float) 5.50);
        p9.setProductName("Music 3 [$5.50]");
        
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);
        productList.add(p8);
        productList.add(p9);
        
        return productList;
}
}
