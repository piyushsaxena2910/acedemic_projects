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
public class ExecuteMain {
    
    public static void main(String args[])
    {
        SupplierDirectory sDirectory = new SupplierDirectory();      
        Supplier dell = new Supplier("Dell");
        Supplier lenovo = new Supplier("Lenovo");
        Supplier toshiba = new Supplier("Toshiba");
        Supplier hp = new Supplier("HP");
        Supplier apple = new Supplier("Apple");
        
        ArrayList<Product> dellProducts = new ArrayList<>();
        dellProducts.add(new Product("Dell Laptop 1",750,"Windows","8GB"));
        dellProducts.add(new Product("Dell Laptop 2",850,"Windows","16GB"));
        dellProducts.add(new Product("Dell Laptop 3",550,"Windows","8GB"));
        dellProducts.add(new Product("Dell Laptop 4",650,"Windows","32GB"));
        dellProducts.add(new Product("Dell Laptop 5",750,"Windows","16GB"));
        dellProducts.add(new Product("Dell Laptop 6",750,"Windows","8GB"));
        dellProducts.add(new Product("Dell Laptop 7",550,"Windows","32GB"));
        dellProducts.add(new Product("Dell Laptop 8",950,"Windows","16GB"));
        dellProducts.add(new Product("Dell Laptop 9",450,"Windows","8GB"));
        dellProducts.add(new Product("Dell Laptop 10",750,"Windows","8GB"));
        
        ProductCatalog dellCatalog = new ProductCatalog(dellProducts);
        dell.setProductCatalog(dellCatalog);
        
        ArrayList<Product> appleProducts = new ArrayList<>();
        appleProducts.add(new Product("Apple Laptop 1",750,"iOS","8GB"));
        appleProducts.add(new Product("Apple Laptop 2",850,"iOS","16GB"));
        appleProducts.add(new Product("Apple Laptop 3",550,"iOS","8GB"));
        appleProducts.add(new Product("Apple Laptop 4",650,"iOS","32GB"));
        appleProducts.add(new Product("Apple Laptop 5",750,"iOS","16GB"));
        appleProducts.add(new Product("Apple Laptop 6",750,"iOS","8GB"));
        appleProducts.add(new Product("Apple Laptop 7",550,"iOS","32GB"));
        appleProducts.add(new Product("Apple Laptop 8",950,"iOS","16GB"));
        appleProducts.add(new Product("Apple Laptop 9",450,"iOS","8GB"));
        appleProducts.add(new Product("Apple Laptop 10",750,"iOS","8GB"));
        
        ProductCatalog appleCatalog = new ProductCatalog((appleProducts));
        apple.setProductCatalog(appleCatalog);
        
        ArrayList<Product> lenovoProducts = new ArrayList<>();
        lenovoProducts.add(new Product("Lenovo Laptop 1",750,"Windows","8GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 2",850,"Windows","16GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 3",550,"Windows","8GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 4",650,"Windows","32GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 5",750,"Windows","16GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 6",750,"Windows","8GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 7",550,"Windows","32GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 8",950,"Windows","16GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 9",450,"Windows","8GB"));
        lenovoProducts.add(new Product("Lenovo Laptop 10",750,"Windows","8GB"));
        
        ProductCatalog lenovoCatalog = new ProductCatalog(lenovoProducts);
        lenovo.setProductCatalog(lenovoCatalog);
        
        ArrayList<Product> toshibaProducts = new ArrayList<>();
        toshibaProducts.add(new Product("Toshiba Laptop 1",750,"Windows","8GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 2",850,"Windows","16GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 3",550,"Windows","8GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 4",650,"Windows","32GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 5",750,"Windows","16GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 6",750,"Windows","8GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 7",550,"Windows","32GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 8",950,"Windows","16GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 9",450,"Windows","8GB"));
        toshibaProducts.add(new Product("Toshiba Laptop 10",750,"Windows","8GB"));
        
        ProductCatalog toshibaCatalog = new ProductCatalog(toshibaProducts);
        toshiba.setProductCatalog(toshibaCatalog);
        
        
        ArrayList<Product> hpProducts = new ArrayList<>();
        hpProducts.add(new Product("HP Laptop 1",750,"Windows","8GB"));
        hpProducts.add(new Product("HP Laptop 2",850,"Windows","16GB"));
        hpProducts.add(new Product("HP Laptop 3",550,"Windows","8GB"));
        hpProducts.add(new Product("HP Laptop 4",650,"Windows","32GB"));
        hpProducts.add(new Product("HP Laptop 5",750,"Windows","16GB"));
        hpProducts.add(new Product("HP Laptop 6",750,"Windows","8GB"));
        hpProducts.add(new Product("HP Laptop 7",550,"Windows","32GB"));
        hpProducts.add(new Product("HP Laptop 8",950,"Windows","16GB"));
        hpProducts.add(new Product("HP Laptop 9",450,"Windows","8GB"));
        hpProducts.add(new Product("HP Laptop 10",750,"Windows","8GB"));
        
        ProductCatalog hpCatalog = new ProductCatalog(hpProducts);
        
        hp.setProductCatalog(hpCatalog);
        
        sDirectory.getSupplierList().add(dell);
        sDirectory.getSupplierList().add(lenovo);
        sDirectory.getSupplierList().add(toshiba);
        sDirectory.getSupplierList().add(hp);
        sDirectory.getSupplierList().add(apple);
             
        System.out.println(sDirectory.toString().replace(",","").replace("[","").replace("]",""));
    }
     
    
    }