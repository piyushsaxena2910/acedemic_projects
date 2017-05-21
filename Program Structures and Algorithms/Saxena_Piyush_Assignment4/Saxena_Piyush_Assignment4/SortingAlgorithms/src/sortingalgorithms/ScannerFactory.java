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
public class ScannerFactory {
    
    public static IScanner getScanner(EnumInputType type)
    {
        Scanner scanner = new Scanner(InputStreamer.getInputStream(type));
        if(type == EnumInputType.Console)
        {
            return new ConsoleInputScanner(scanner,type);
        }
        else if(type == EnumInputType.File)
        {
            return new FileInputScanner(scanner,type);
        }
        return null;
    }
    
}
