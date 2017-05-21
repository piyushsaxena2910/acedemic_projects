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
public class ConsoleInputScanner implements IScanner {
    
    private Scanner scanner;
    private String line;
    public ConsoleInputScanner(Scanner scan, EnumInputType type)
    {
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
    }
    
    public String next()
    {
        return line;
    }
    
    public boolean hasNext()
    {
        line = scanner.nextLine();
        return !line.equals("");
    }
    
}
