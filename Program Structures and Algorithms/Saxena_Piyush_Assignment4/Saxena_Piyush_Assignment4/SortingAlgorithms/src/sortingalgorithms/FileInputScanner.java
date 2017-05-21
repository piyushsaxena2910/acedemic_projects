/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Scanner;

/**
 *
 * @author Muddassar
 */
public class FileInputScanner implements IScanner {
    
    private Scanner scanner;
    
    public FileInputScanner(Scanner scan, EnumInputType type)
    {
        scanner = new Scanner(InputStreamer.getInputStream(type));
    }
    
    public String next()
    {
        return scanner.nextLine();
    }
    
    public boolean hasNext()
    {
        return scanner.hasNext();
    }
    
}
