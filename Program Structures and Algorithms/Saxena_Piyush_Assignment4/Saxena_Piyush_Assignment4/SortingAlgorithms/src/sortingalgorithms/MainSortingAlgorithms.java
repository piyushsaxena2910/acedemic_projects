/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sorting.ISortStrategy;
import sorting.InsertionSort;
import sorting.QuickSort;

/**
 *
 * @author Muddassar
 */
public class MainSortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Solution sol = new Solution();
        sol.solve();
        
    }
    
}
