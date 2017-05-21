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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muddassar
 */
public class InputStreamer {
    
    
    public static InputStream getInputStream(EnumInputType inputType)
    {
        switch(inputType)
        {
            case File:
            {
                String FILENAME = System.getProperty("user.dir") + "/data.txt";
                File f = new File(FILENAME);
                InputStream inStream = null;
                try {
                     inStream = new FileInputStream(f);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(InputStreamer.class.getName()).log(Level.SEVERE, null, ex);
                }
                return inStream;
            }
            default:
            {
                return System.in;
            }
        }
        
    }
}
