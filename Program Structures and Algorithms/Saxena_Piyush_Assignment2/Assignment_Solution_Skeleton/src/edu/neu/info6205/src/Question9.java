/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.info6205.src;

import java.util.Scanner;

/**
 *
 * @author Muddassar
 */
public class Question9 {
    
    public boolean solve(String input)
    {
        String stringToValidate = input;
        int checker = 0;
        for (int i = 0; i < stringToValidate.length(); i++) {
        int value = stringToValidate.charAt(i) - 'a';
        if ((checker & (1 << value)) > 0) {
            System.out.println("Not unique!");
        return false;
        }
        checker |= (1 << value);
    }
    System.out.println("Unique!");
    return true;
    }
    
}
